package com.company;

import com.company.command.*;
import com.company.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product milk = new Product(1,"Молоко");
        Product bread = new Product(2,"Хлеб");

        // В соответствии с шаблоном команды create, delete и update делаются отдельно от read (например на разных серверах)
        List<Command> listCommandCUD = new ArrayList<>();
        listCommandCUD.add(new AddProductCommand(milk, 50));
        listCommandCUD.add(new AddProductCommand(bread, 40));
        listCommandCUD.add(new UpdateProductCommand(bread, 45));
        listCommandCUD.add(new DeleteProductCommand(milk));

        for (Command command : listCommandCUD) {
            command.execute();
        }

        // Соответственно для read выделяем отдельный массив, например чтение будет происходит на копии БД
        List<Command> listCommandR = new ArrayList<>();
        listCommandR.add(new ReadProductCommand(milk));
        listCommandR.add(new ReadProductCommand(bread));

        for (Command command : listCommandR) {
            command.execute();
        }
    }
}
