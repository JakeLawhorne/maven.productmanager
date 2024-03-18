package com.github.curriculeon;

/**
 * Created by leon on 12/16/2019.
 */
public class Item {
    private String itemName;
    public Item(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
