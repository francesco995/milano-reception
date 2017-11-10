package com.objectway.stage.webapp;


import com.objectway.stage.controller.ItemsController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ItemView {

    @Autowired
    @Qualifier("itemsController")
    private ItemsController itemsController;


    @RequestMapping(value="/item")
    public String viewItem(@RequestParam("id") String id) {

        itemsController.getItemById();
        //TODO:save in session and return view
    }




}
