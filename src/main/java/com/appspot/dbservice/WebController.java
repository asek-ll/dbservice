package com.appspot.dbservice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class WebController{

  @RequestMapping("/")
  public String list(ModelMap model) {
    return "list";
  }


}