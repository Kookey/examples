package com.blogspot.sunitkatkar;

import com.blogspot.model.User;
import com.blogspot.validator.UserValidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 王兴岭
 * @Valid
 * @create 2017-02-25 19:22
 */
@Controller
@Slf4j
@RequestMapping("/valid2")
public class ValidFormController {

  @Autowired
  private UserValidator userValidator;

  @InitBinder
  public void initBinder(WebDataBinder binder){
    binder.addValidators(userValidator);
  }


  @RequestMapping("/signup")
  public String signup(@Valid User user, BindingResult result, RedirectAttributes attrs){
    attrs.addFlashAttribute("user",user);
    return "redirect:show";
  }

  @RequestMapping("/show")
  public String show(@Valid User user,BindingResult br){
    return "user";
  }

  @RequestMapping("show2")
  @ResponseBody
  private String show2(){
    return "hahaha";
  }

}
