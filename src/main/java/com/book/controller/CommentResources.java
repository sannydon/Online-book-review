package com.book.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	    
	    @RequestMapping(value = "/add/{productId}", method = RequestMethod.POST)
	    @ResponseStatus(value = HttpStatus.NO_CONTENT)
	    public void addItem (@PathVariable(value ="productId") int productId,  HttpServletRequest request) {
	       // Customer customer = customerService.getCustomerByUsername(activeUser.getUsername());	      
	        Product product = productService.getProductById(productId);
	        String comm = request.getParameter("newRule");
	        System.out.println(comm);
	        Comments comment=new Comments();
	        
	    }

}
