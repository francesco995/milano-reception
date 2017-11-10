package com.objectway.stage.repo.impl;

import com.objectway.stage.repo.ItemsRepository;
import com.objectway.stage.repo.exceptions.DuplicateItemException;
import com.objectway.stage.repo.exceptions.ItemNotFoundException;
import com.objectway.stage.repo.model.Item;

import java.util.HashMap;
import java.util.List;

public class ItemsRepositoryImpl implements ItemsRepository {

    private HashMap<String, Item> repository;

    public List<Item> getAllItems() {
        List<Item> list = new List<Item>();
        for (String id : repository.keySet()) {
            list.add(repository.get(id));
        }
        return list;
    }

    public boolean addItem(Item item) throws DuplicateItemException {
        if (repository.get(item.getIdRef())!=null) {
            repository.put(item.getIdRef(),item);
            return true;
        }
        else throw new DuplicateItemException("Tried to add an item whose ID is already present in repository");
    }

    public Item getItemById(String id) throws ItemNotFoundException {
        if(repository.get(id)!=null) {
            return repository.get(id);
        }
        else throw new ItemNotFoundException("Tried to retrieve an item whose ID is not present in repository");
    }

    public boolean removeItemById(String id) throws ItemNotFoundException {
        if(repository.get(id)!=null) {
            repository.remove(id);
            return true;
        }
        else throw new ItemNotFoundException("Tried to remove an item whose ID is not present in repository");
    }

    public boolean saveDb() {
        return false;
    }
}
