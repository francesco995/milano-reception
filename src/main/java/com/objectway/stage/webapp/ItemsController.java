package com.objectway.stage.webapp;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ItemsController implements ApplicationContextAware {

	private ApplicationContext applicationContext;


	public final static String SESSION_CUSTOMERS_PARAM = "items";



	@RequestMapping("/items.html")
	public String viewItems(Model model) {
		return "itemsTiles";
	}


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

}
