package com.appspot.dbservice;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.w3c.dom.html.HTMLStyleElement;

import com.appspot.dbservice.html.HTMLScriptLink;
import com.appspot.dbservice.html.HTMLStyleLink;
import com.appspot.dbservice.layouts.Layout;
@Controller
public class BaseWebController {
	
	//protected HashMap<String, String> scripts = new HashMap<String, String>();
	//protected HashMap<String, String> styles = new HashMap<String, String>();
	
	protected ArrayList<HTMLScriptLink> scripts = new ArrayList<HTMLScriptLink>();
	protected ArrayList<HTMLStyleLink> styles = new ArrayList<HTMLStyleLink>();
	protected Layout layout;
	
	public Layout getLayout() {
		return layout;
	}

	public void setLayout(Layout layout) {
		this.layout = layout;
	}

	@ModelAttribute("scripts")
  public ArrayList<HTMLScriptLink> getScripts() {
		return scripts;
  }
	
	@ModelAttribute("styles")
  public ArrayList<HTMLStyleLink> getStyles() {
      return styles;
  }
	
	public void addStyle(HTMLStyleLink style){
		styles.add(style);
	}

	public void addScript(HTMLScriptLink script){
		scripts.add(script);
	}

	public BaseWebController() {
		//addScript("bootstrap","js/bootstrap.min.js");
  }
	
	public void clearResources(){
		scripts = new ArrayList<HTMLScriptLink>();
		styles = new ArrayList<HTMLStyleLink>();
	}
	
}
