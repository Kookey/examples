package com.blogspot.sunitkatkar;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * 简单的Controller
 *
 * @author 王兴岭
 * @create 2017-02-23 16:18
 */
@Slf4j
public class SimpleController implements Controller {
  @Override
  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    ModelAndView modelAndView = new ModelAndView();
    log.error("SimpleController:{}", "simple");
    modelAndView.setViewName("simple");
    return modelAndView;
  }
}
