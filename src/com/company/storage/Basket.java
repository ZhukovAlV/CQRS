package com.company.storage;

import com.company.command.*;
import com.company.entity.Product;

import java.util.HashMap;

public class Basket implements Storage {
    private static HashMap<Product, Integer> storage = new HashMap<>();

    @Override
    public void addProduct(Product product, int amount) {
        new AddProductCommand(product, amount);
    }

    @Override
    public void deleteProduct(Product product) {
        new DeleteProductCommand(product);
    }

    @Override
    public void updateProduct(Product product, int amount) {
        new UpdateProductCommand(product, amount);
    }

    @Override
    public void readProduct(Product product) {
        new ReadProductCommand(product);
    }

    public static HashMap<Product, Integer> getStorage() {
        return storage;
    }
}
