package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by leon on 12/16/2019.
 */
public class GenericInventory<SomeType> implements InventoryInterface<SomeType>, Iterable<SomeType> {
    private List<SomeType> itemList = new ArrayList<>();

    @Override
    public void add(SomeType someObject) {
        itemList.add(someObject);
    }

    @Override
    public Boolean contains(SomeType someObject) {
        return itemList.contains(someObject);
    }

    @Override
    public SomeType get(int indexOfElement) {
        return itemList.get(indexOfElement);
    }

    @Override
    public SomeType remove(int indexOfElement) {
        SomeType item = itemList.get(indexOfElement);
        itemList.remove(item);
        return item;
    }

    @Override
    public SomeType[] toArray(SomeType[] objectsToBeAdded) {
        return itemList.stream().toArray((ho)-> objectsToBeAdded);
    }
    @Override
    public Iterator<SomeType> iterator() {
        return itemList.iterator();
    }
    public List<SomeType> getItemList() {
        return itemList;
    }

    public GenericInventory() {

    }
}

