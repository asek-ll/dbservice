package com.appspot.dbservice.bloks;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

public class LoginBlock extends Block {

	public LoginBlock() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String render(HttpServletRequest request, HttpServletResponse response) {

		UserService userService = UserServiceFactory.getUserService();
		String content;

		String thisURL = request.getRequestURI();
		if (request.getUserPrincipal() != null) {
			content = "<p class='navbar-text'>Hello, " +
					request.getUserPrincipal().getName() +
					"!  You can <a href=\"" +
					userService.createLogoutURL(thisURL) +
					"\">sign out</a>.</p>";
		} else {
			content = "<p class='navbar-text'>Please <a href=\"" +
					userService.createLoginURL(thisURL) +
					"\">sign in</a>.</p>";
		}


		return "<ul class='nav navbar-nav navbar-right'><li>" + content + "</li></ul>";
	}

}
