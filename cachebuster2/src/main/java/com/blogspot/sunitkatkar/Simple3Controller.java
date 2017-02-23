package com.blogspot.sunitkatkar;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 王兴岭
 * @create 2017-02-23 16:24
 */
@Slf4j
public class Simple3Controller implements Controller{
  @Override
  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    ModelAndView modelAndView = new ModelAndView();
    log.error("Simple3Controller:{}", "simple3");
    modelAndView.setViewName("simpl3");
    return modelAndView;
  }
}
