package com.company.command;

import com.company.entity.Product;

public class DeleteProductCommand implements Command {

    Product product;

    public DeleteProductCommand(Product product) {
        this.product = product;
    }

    @Override
    public void execute() {
        System.out.println("Товар " + product.getName() + " удален");
    }
}
