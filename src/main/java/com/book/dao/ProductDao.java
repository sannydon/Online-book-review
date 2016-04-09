package com.book.dao;



import java.util.List;

import com.book.model.Product;

/**
 * Created by Le on 1/6/2016.
 */
public interface ProductDao {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);
}
