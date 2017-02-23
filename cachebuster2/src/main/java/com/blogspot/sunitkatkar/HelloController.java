package com.blogspot.sunitkatkar;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * 简单控制器
 *
 * @author 王兴岭
 * @create 2017-02-23 13:09
 */
@Slf4j
public class HelloController implements Controller {

  @Override
  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    ModelAndView modelAndView = new ModelAndView();
    log.error("HelloController:{}","hello");
    modelAndView.setViewName("hello");
    return modelAndView;
  }
}
