package com.appspot.dbservice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.appspot.dbservice.layouts.Layout;

public class BaseInterceptor extends HandlerInterceptorAdapter {

	public BaseInterceptor() {
		// TODO Auto-generated constructor stub
	}

	@Override
  public boolean preHandle(HttpServletRequest request,
      HttpServletResponse response, Object handler) throws Exception {

		HandlerMethod bwc = (HandlerMethod) handler;
		BaseWebController o = (BaseWebController) bwc.getBean();
		
		o.clearResources();

	  return super.preHandle(request, response, handler);
  }

	@Override
  public void postHandle(HttpServletRequest request,
      HttpServletResponse response, Object handler, ModelAndView modelAndView)
      throws Exception {
	  // TODO Auto-generated method stub
		modelAndView.getModel().put("sitename", "custom sitename 2");
		
		HandlerMethod bwc = (HandlerMethod) handler;
		BaseWebController o = (BaseWebController) bwc.getBean();

		Layout layout = o.getLayout();
		
		if(layout != null){
			layout.fillModel(request, response, modelAndView);
		}
		
	  super.postHandle(request, response, handler, modelAndView);
  }
}
