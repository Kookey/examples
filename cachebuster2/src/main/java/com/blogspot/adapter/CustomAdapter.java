package com.blogspot.adapter;

import com.blogspot.sunitkatkar.CustomController;

import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义adapter
 *
 * @author 王兴岭
 * @create 2017-02-23 15:02
 */
public class CustomAdapter implements HandlerAdapter {
  @Override
  public boolean supports(Object handler) {
    return (handler instanceof CustomController);
  }

  @Override
  public ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    return ((CustomController)handler).handleRequest(request,response);
  }

  @Override
  public long getLastModified(HttpServletRequest request, Object handler) {
    return -1;
  }
}
