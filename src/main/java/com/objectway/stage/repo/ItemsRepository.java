package com.objectway.stage.repo;

import com.objectway.stage.repo.exceptions.DuplicateItemException;
import com.objectway.stage.repo.exceptions.ItemNotFoundException;
import com.objectway.stage.repo.model.Item;

import java.util.List;

public interface ItemsRepository {

    List<Item> getAllItems();
    boolean addItem(Item item) throws DuplicateItemException;
    Item getItemById(String id) throws ItemNotFoundException;
    boolean removeItemById(String id) throws ItemNotFoundException;
    boolean saveDb();

}
