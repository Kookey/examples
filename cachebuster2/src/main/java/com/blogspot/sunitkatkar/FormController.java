package com.blogspot.sunitkatkar;

import com.blogspot.model.User;
import com.blogspot.validator.UserValidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import lombok.extern.slf4j.Slf4j;

/**
 * @InitBinder,
 * @ModelAttribute,
 * @ControllerAdvice
 *
 * @author 王兴岭
 * @create 2017-02-24 13:39
 */
@RequestMapping("/form")
@Controller
@Slf4j
public class FormController {

  @Autowired
  private UserValidator userValidator;

  @InitBinder
  public void initBinder(WebDataBinder binder){
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    dateFormat.setLenient(false);
    binder.registerCustomEditor(Date.class,new CustomDateEditor(dateFormat,false));

    binder.addValidators(userValidator);
  }

  @ResponseBody
  @RequestMapping("/date")
  public String date(Date date){
    log.error(date.toString());
    return date.toString();
  }

  @RequestMapping("/index")
  public String index(ModelMap modelMap){
    modelMap.put("user",new User());
    return "user";
  }

  @RequestMapping(value = "/signup",method = RequestMethod.POST)
  public String signup(@Valid User u, BindingResult bind,RedirectAttributes attributes){
    attributes.addFlashAttribute("user",u);
    return "user";
  }

}
