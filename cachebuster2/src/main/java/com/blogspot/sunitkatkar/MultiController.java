package com.blogspot.sunitkatkar;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * MultiController
 *
 * @author 王兴岭
 * @create 2017-02-23 19:11
 */
@Slf4j
public class MultiController extends MultiActionController {

  public ModelAndView one(HttpServletRequest request, HttpServletResponse response){
    ModelAndView modelAndView = new ModelAndView();
    log.error("HelloController:{}","hello");
    modelAndView.setViewName("hello");
    return modelAndView;
  }

  public ModelAndView two(HttpServletRequest request, HttpServletResponse response){
    ModelAndView modelAndView = new ModelAndView();
    log.error("HelloController:{}","hello");
    modelAndView.setViewName("hello");
    return modelAndView;
  }

  public ModelAndView three(HttpServletRequest request, HttpServletResponse response){
    ModelAndView modelAndView = new ModelAndView();
    log.error("HelloController:{}","hello");
    modelAndView.setViewName("hello");
    return modelAndView;
  }

}
