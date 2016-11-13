package com.example.rajendra.devfest.model;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by rajendra on 13/11/16.
 */

@Root(name = "breakfast_menu")
public class BreakFastMenu {
    @ElementList(inline = true)
    List<Food> foodList;

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

}
