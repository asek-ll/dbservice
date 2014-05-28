package com.appspot.dbservice.bloks;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MenuBlock extends Block {

	public MenuBlock() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String render(HttpServletRequest request, HttpServletResponse response) {
		String content = "<ul class='nav navbar-nav'>"+
				"<li class='active'><a href='#'>Link</a></li>"+
				"<li><a href='/browsepass'>BrowsePass</a></li>"+
				"<li><a href='#'>Link</a></li>"+
				"<li class='dropdown'>"+
				"<a href='#' class='dropdown-toggle' data-toggle='dropdown'>Dropdown <b class='caret'></b></a>" +
				"<ul class='dropdown-menu'>"+
				"<li><a href='#'>Action</a></li>"+
				"<li><a href='#'>Another action</a></li>"+
				"<li><a href='#'>Something else here</a></li>"+
				"<li class='divider'></li>"+
				"<li class='dropdown-header'>Nav header</li>"+
				"<li><a href='#'>Separated link</a></li>"+
				"<li><a href='#'>One more separated link</a></li>"+
				"</ul>"+
				"</li>"+
				"</ul>";
		return content;
	}

}
