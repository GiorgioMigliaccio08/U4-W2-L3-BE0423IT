package entities;

import java.util.Random;

public class Product {
    private Double price;

    public Product (String name, String category, double price ) {
        this.name = name;
        this.category= category;
        this.price = price;
        Random rdm = new Random();
        this.id = rdm.nextLong();
    }

    @Override
    public String toString(){
        return "Product [id=" + id+ "name"+ name + "category"+ category + "price"+price ];

    }

    public Double getPrice() {
        return price;
    }
}


