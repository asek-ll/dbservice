package com.appspot.dbservice.bloks;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract public class Block {

	public Block() {
		// TODO Auto-generated constructor stub
	}
	
	abstract public String render(HttpServletRequest request, HttpServletResponse response);

}
