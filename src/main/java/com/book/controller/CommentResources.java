package com.book.controller;
import java.io.BufferedReader;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.book.model.Comments;
import com.book.model.Customer;
import com.book.model.Product;
import com.book.service.CommentService;
import com.book.service.CustomerService;
import com.book.service.ProductService;




@Controller
@RequestMapping("/rest/comment")
public class CommentResources {
	   @Autowired
	    private CommentService commentservice;
	 
	    @Autowired
	    private CustomerService customerService;

	    @Autowired
	    private ProductService productService;
	    
	   // @RequestMapping(value = "/{productId}", method = RequestMethod.GET,produces = "application/json; charset=utf-8")
	    @RequestMapping("/{productId}")
	    public @ResponseBody List<Comments> getCartById (@PathVariable(value = "productId") int productId) {
	    	System.out.println("inside web service");
	    	List<Comments> ll = commentservice.getComments(productId);
	    	for(int i=0;i<ll.size();i++){
	    		System.out.println(ll.get(i).getComment());
	    	}

	    	//System.out.println(commentservice.getComments(productId));
	    	//commentservice.getComments(productId);
	        return ll;
	    }

	    @RequestMapping(value = "/add/{productId}", method = RequestMethod.POST)
	    //@ResponseStatus(value = HttpStatus.NO_CONTENT)
	    public @ResponseBody List<Comments> addItem (@PathVariable(value ="productId") int productId,  HttpServletRequest request) {
	       // Customer customer = customerService.getCustomerByUsername(activeUser.getUsername());	      
	        Product product = productService.getProductById(productId);
	        StringBuffer jb = new StringBuffer();
			  String line = null;
			  try {
			    BufferedReader reader = request.getReader();
			    while ((line = reader.readLine()) != null)
			      jb.append(line);
			  } catch (Exception e) { /*report an error*/ }

			 // JSONParser p = new JSONParser();
			  System.out.println(jb);
			  JSONObject oo=null;
			try {
				oo = new JSONObject(jb.toString());
			} catch (JSONException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			  System.out.println(oo);
			  try {
				System.out.println(oo.get("newRule"));
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        Comments comment=new Comments();
	        comment.setComment(oo.get("newRule").toString());
	        comment.setProduct(product);
	        commentservice.addComment(comment);
	        System.out.println("database called");
	        List<Comments> ll = commentservice.getComments(productId);
	    	for(int i=0;i<ll.size();i++){
	    		System.out.println(ll.get(i).getComment());
	    	}

	    	//System.out.println(commentservice.getComments(productId));
	    	//commentservice.getComments(productId);
	        return ll;
	        
	    }

}
