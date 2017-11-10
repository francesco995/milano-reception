package com.objectway.stage.repo;

import com.objectway.stage.repo.model.Item;

import java.util.List;

public interface ItemsRepository {

    List<Item> getAllItems();
    boolean addItem(Item item);
    Item getItemById(String id);

    boolean saveDb();

}
