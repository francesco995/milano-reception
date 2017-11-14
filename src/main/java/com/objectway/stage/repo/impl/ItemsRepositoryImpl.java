package com.objectway.stage.repo.impl;

import com.objectway.stage.repo.ItemsRepository;
import com.objectway.stage.repo.exceptions.DuplicateItemException;
import com.objectway.stage.repo.exceptions.ItemNotFoundException;
import com.objectway.stage.repo.model.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class ItemsRepositoryImpl implements ItemsRepository {

    private static ItemsRepositoryImpl instance = null;
    private ItemsRepositoryImpl() {
        // should load file or whatever here
        repository = new HashMap<String, Item>();
        // what follows is just a stub and will be removed upon actual persistency implementation
        Item lapis = new Item();
            lapis.setIdRef("LPS-01");
            lapis.setName("Matita HB");
            lapis.setDescription("Matita HB con gommino, dimensione 13cm");
            lapis.setAmount(10);
            lapis.setPrice(0.25f);
            repository.put(lapis.getIdRef(),lapis);
        Item band = new Item();
            band.setIdRef("BND-04");
            band.setName("Elastico grande");
            band.setDescription("Elastico ad alto spessore per faldoni, larghezza 0.8cm, lunghezza a riposo (2x)12cm, colore verde");
            band.setAmount(50);
            band.setPrice(0.05f);
            repository.put(band.getIdRef(),band);
    }

    public static ItemsRepositoryImpl getInstance() {
        if (instance == null) {
            instance = new ItemsRepositoryImpl();
        }
        return instance;
    }


    private HashMap<String, Item> repository;

    public List<Item> getAllItems() {
        List<Item> list = new ArrayList<Item>();
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
