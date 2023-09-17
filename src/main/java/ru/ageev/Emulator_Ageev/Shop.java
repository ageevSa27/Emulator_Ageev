package ru.ageev.Emulator_Ageev;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private Integer countProd = 0;
    private List<Product> products = new ArrayList<Product>();

    public Integer getCountProd() {
        return countProd;
    }

    public void setCountProd(Integer countProd) {
        this.countProd = countProd;
    }

    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }



}
