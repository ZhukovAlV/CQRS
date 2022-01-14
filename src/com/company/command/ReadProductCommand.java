package com.company.command;

import com.company.entity.Product;

public class ReadProductCommand implements Command {

    Product product;

    public ReadProductCommand(Product product) {
        this.product = product;
    }

    @Override
    public void execute() {
        System.out.println("Товар " + product.getName() + " прочитан. Его цена составляет " + product.getPrice());
    }
}