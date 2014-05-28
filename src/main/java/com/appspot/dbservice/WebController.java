package com.appspot.dbservice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appspot.dbservice.layouts.DefaultLayout;
@Controller
public class WebController extends BaseWebController{

  public WebController() {
  	setLayout(new DefaultLayout());
  }

	@RequestMapping("/")
  public String list(ModelMap model) {
    return "list";
  }


}