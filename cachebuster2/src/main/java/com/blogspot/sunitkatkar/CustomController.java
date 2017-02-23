package com.blogspot.sunitkatkar;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * 自定义拦截器
 *
 * @author 王兴岭
 * @create 2017-02-23 14:58
 */
@Slf4j
public class CustomController {

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    ModelAndView modelAndView = new ModelAndView();
    log.error("HelloController:{}","custom");
    modelAndView.setViewName("custom");
    return modelAndView;
  }
}
