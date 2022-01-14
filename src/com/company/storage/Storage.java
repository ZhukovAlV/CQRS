package com.company.storage;

import com.company.entity.Product;

public interface Storage {

    void addProduct(Product product, int amount);
    void deleteProduct(Product product);
    void updateProduct(Product product, int amount);
    void readProduct(Product product);
}
