package com.blogspot.sunitkatkar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Map;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 王兴岭
 * @SessionAttributes 注解使用
 * @create 2017-02-24 17:44
 * 注意：如果是再相同的级别下跳转就不需要写完整的url了
 * 比如：redirect:complete
 * 而不是：redirect:/book/complete
 */
@Controller
@RequestMapping("/book")
@Slf4j
@SessionAttributes(value = {"book","description"},types = {Double.class})
public class BookController {

  @RequestMapping("/index")
  public String index(Model model){
    model.addAttribute("book","<<小李飞刀>>");
    model.addAttribute("description","李寻欢真厉害");
    model.addAttribute("price",999.99);
    return "redirect:get";
  }

  @RequestMapping("/get")
  public String get(@ModelAttribute("book") String book, @ModelAttribute("noth") String noth, ModelMap map, SessionStatus status){
    log.error("book:{}",book);
    log.error("description:{}",map.get("description"));
    log.error("price:{}",map.get("price"));
    status.setComplete();
    return "redirect:complete";
  }

  @RequestMapping("/complete")
  public String complete(Model model){
    Map<String, Object> map = model.asMap();
    log.error("book:{}",map.get("book"));
    log.error("description:{}",map.get("description"));
    log.error("price:{}",map.get("price"));
    return "complete";
  }
}
