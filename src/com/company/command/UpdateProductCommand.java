package com.company.command;

import com.company.entity.Product;

public class UpdateProductCommand implements Command {

    Product product;
    int amount;

    public UpdateProductCommand(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    @Override
    public void execute() {
        product.setPrice(amount);
        System.out.println("Товар " + product.getName() + " обновлен. Его новая цена:" + amount);
    }
}
