package com.blogspot.sunitkatkar;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

import lombok.extern.slf4j.Slf4j;

/**
 * ModelAttribute
 *
 * @author 王兴岭
 * @create 2017-02-24 15:33
 */
@Controller
@RequestMapping("/attr")
@Slf4j
public class ModelAttributeController {

//  @ModelAttribute("className")
//  public String setModel(){
//    return this.getClass().getName();
//  }
//
  @ModelAttribute
  public void setModel1(Model model){
    model.addAttribute("teacher2","王兴岭");
  }
//
//  @ModelAttribute
//  public String setModel2(){
//    return "excelib";
//  }

  @RequestMapping("/show")
  private void show(Model model){
    Map<String, Object> map = model.asMap();
    Object className = map.get("className");
    Object teacher = map.get("teacher");
    Object a = map.get("string");
    log.error("className:{}",className);
    log.error("teacher:{}",teacher);
    log.error("string:{}",a);
  }

}
