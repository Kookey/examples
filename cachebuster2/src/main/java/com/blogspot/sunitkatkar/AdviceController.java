package com.blogspot.sunitkatkar;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * AdviceController
 *
 * @author 王兴岭
 * @create 2017-02-24 15:50
 */
@ControllerAdvice
public class AdviceController {

  @ModelAttribute("className")
  public String setModel(){
    return this.getClass().getName();
  }

  @ModelAttribute
  public void setModel1(Model model){
    model.addAttribute("teacher","王兴岭");
  }

  @ModelAttribute
  public String setModel2(){
    return "excelib";
  }
}
