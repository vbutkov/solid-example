package ru.vbutkov.srp01.before;

import ru.vbutkov.srp01.Price;

public class Product {
    int stock;

    Price price;

    void replenishStock(int amount) {
        stock += amount;
    }

    void setPrice(Price newPrice) {
        price = newPrice;
    }
}
