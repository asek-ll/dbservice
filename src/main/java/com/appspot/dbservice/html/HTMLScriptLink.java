package com.appspot.dbservice.html;

public class HTMLScriptLink extends HTMLResourceLink {

	public HTMLScriptLink(String content) {
		super(content);
		// TODO Auto-generated constructor stub
	}

	public HTMLScriptLink(String content, Integer type) {
		super(content, type);
		// TODO Auto-generated constructor stub
	}

	public HTMLScriptLink(String content, Integer type, Integer weight) {
		super(content, type, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String render(String basePath) {
		// TODO Auto-generated method stub
		switch (type) {
		case HTMLResourceLink.TYPE_INLINE:
			return "<script type=\"text/javascript\">"+ content + "</script>";
		case HTMLResourceLink.TYPE_EXTERNAL:
			return "<script src=\""+ content + "\"></script>";
		case HTMLResourceLink.TYPE_NORMAL:
		default:
			return "<script src=\""+ basePath + content + "\"></script>";
		}
	}

}
