package com.example.homework.homeworkSix;

import java.util.ArrayList;
import java.util.List;
public class Goods {
    private String goods;
    private String color;
    private int price;

    public Goods(String goods, String color, int price) {
        this.goods = goods;
        this.color = color;
        this.price = price;
    }

    public String getGoods() {
        return goods;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goods='" + goods + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Goods item1 = new Goods("Apple", "red", 45);
        Goods item2 = new Goods("Oranges", "orange", 30);
        Goods item3 = new Goods("Pepper", "green", 40);
        Goods item4 = new Goods("Apple", "green", 35);
        Goods item5 = new Goods("Tomato", "red", 55);
        Goods item6 = new Goods("Lemon", "yellow", 38);

        List<Goods> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.forEach(System.out::println);
        items.stream().filter(el -> el.getColor().equals("red")).forEach(System.out::println);
        items.stream().filter(el -> el.getPrice() > 40).forEach(System.out::println);
    }
}
