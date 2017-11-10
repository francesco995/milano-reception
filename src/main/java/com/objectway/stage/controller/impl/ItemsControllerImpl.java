package com.objectway.stage.controller.impl;

import com.objectway.stage.controller.ItemsController;
import com.objectway.stage.repo.ItemsRepository;
import com.objectway.stage.repo.model.Item;

import java.util.List;

public class ItemsControllerImpl implements ItemsController {

    private ItemsRepository itemsRepository;

    public List<Item> getAllItems() {
        return null;
    }

    public Item getItemByName(String name) {
        return null;
    }

    public void addItem(Item item) {

    }

    public boolean removeItem(String id) {
        return false;
    }
}
