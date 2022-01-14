package com.company.command;

import com.company.entity.Product;
import com.company.storage.Basket;

public class AddProductCommand implements Command {

    Product product;
    int amount;

    public AddProductCommand(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    @Override
    public void execute() {
        product.setPrice(amount);
        Basket.getStorage().put(product, amount);
        System.out.println("Товар " + product.getName() + " добавлен");
    }
}
