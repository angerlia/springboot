package com.anger.test_monday;

import java.math.BigDecimal;

public class Person {

    private String name;
    private int qty;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + qty +
                ",salary="+price+
                '}';
    }
    public Person(String name, int qty, BigDecimal price){
        this.setName(name);
        this.setPrice(price);
        this.setQty(qty);
    }

}
