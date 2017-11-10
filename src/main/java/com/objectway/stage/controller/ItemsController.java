package com.objectway.stage.controller;

import com.objectway.stage.repo.model.Item;

import java.util.List;

public interface ItemsController {

    public List<Item> getAllItems();

    public Item getItemByName(String name);

    public Item getItemById(String id);

    public void addItem(Item item);

    public boolean removeItem(String id);

}
