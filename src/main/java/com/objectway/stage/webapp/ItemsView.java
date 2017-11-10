package com.objectway.stage.webapp;

import com.objectway.stage.controller.ItemsController;
import com.objectway.stage.repo.model.Item;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class ItemsView implements ApplicationContextAware {

	private ApplicationContext applicationContext;


	public final static String SESSION_CUSTOMERS_PARAM = "items";



	@RequestMapping("/items.html")
	public String viewItems(Model model) {

		return "itemsTiles";
	}

	@ModelAttribute(SESSION_CUSTOMERS_PARAM)
	public List<Item> items() {
		return this.applicationContext.getBean(ItemsController.class).getAllItems();
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

}
