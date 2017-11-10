package com.objectway.stage.repo.impl;

import com.objectway.stage.repo.ItemsRepository;
import com.objectway.stage.repo.model.Item;

import java.util.HashMap;
import java.util.List;

public class ItemsRepositoryImpl implements ItemsRepository {

    private HashMap<String, Item> repository;

    public List<Item> getAllItems() {
        return null;
    }

    public boolean addItem(Item item) {
        return false;
    }

    public Item getItemById(String id) {
        return null;
    }

    public boolean saveDb() {
        return false;
    }
}
