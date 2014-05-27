package com.appspot.dbservice.html;

abstract public class  HTMLResourceLink{
	
	final static int TYPE_NORMAL = 0;
	final static int TYPE_INLINE = 1;
	final static int TYPE_EXTERNAL = 2;
	
	public String content;
	public Integer weight = 0;
	public Integer type = HTMLResourceLink.TYPE_NORMAL;
	
	
	public HTMLResourceLink(String content){
		this.content = content;
	}
	public HTMLResourceLink(String content, Integer type){
		this.content = content;
		this.type = type;
	}
	public HTMLResourceLink(String content, Integer type, Integer weight){
		this.content = content;
		this.type = type;
		this.weight = weight;
	}
	
	abstract public String render(String basePath);
	public String render(){
		return render("");
	}
}
