package com.appspot.dbservice.html;

public class HTMLStyleLink extends HTMLResourceLink {

	public HTMLStyleLink(String content) {
		super(content);
		// TODO Auto-generated constructor stub
	}

	public HTMLStyleLink(String content, Integer type) {
		super(content, type);
		// TODO Auto-generated constructor stub
	}

	public HTMLStyleLink(String content, Integer type, Integer weight) {
		super(content, type, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String render(String basePath) {
		// TODO Auto-generated method stub
		switch (type) {
		case HTMLResourceLink.TYPE_INLINE:
			return "<style>"+ content + "</style>";
		case HTMLResourceLink.TYPE_EXTERNAL:
			return "<link rel=\"stylesheet\" href=\""+ content + "\" />";
		case HTMLResourceLink.TYPE_NORMAL:
		default:
			return "<link rel=\"stylesheet\" href=\""+ basePath + content + "\" />";
		}
	}

}
