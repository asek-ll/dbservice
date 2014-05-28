package com.appspot.dbservice.layouts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.appspot.dbservice.bloks.Block;

abstract public class Layout {

	protected HashMap<String,ArrayList<Block>> regions = new HashMap<String, ArrayList<Block>>();

	public Layout() {
		// TODO Auto-generated constructor stub
	}
	
	public void fillModel(HttpServletRequest request, HttpServletResponse response, ModelAndView modelAndView){
		for (Entry<String, ArrayList<Block>> entry : regions.entrySet()) {
			String regionName = entry.getKey();
			String content = "";
			for (Block block : entry.getValue()) {
				content += block.render(request, response);
      }
			modelAndView.getModel().put(regionName, content);
    }
	}

}
