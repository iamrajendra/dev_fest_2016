package com.example.rajendra.devfest.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by rajendra on 13/11/16.
 */

@Root(name="food")
public class Food {
    @Element(name = "name")
    String name;

    @Element(name = "price")
    String price;

    @Element(name = "description")
    String description;

    @Element(name = "calories")
    String calories;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }
}