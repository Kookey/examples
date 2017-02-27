package com.blogspot.sunitkatkar;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ResponseBody
 *
 * @author 王兴岭
 * @create 2017-02-24 15:56
 */
@Controller
@RequestMapping("/response")
public class ResponseBodyController {

  @ResponseBody
  @RequestMapping("/edit")
  public String edit(){
    return "edit";
  }

  @RequestMapping("/edit2")
  public HttpEntity edit2(){
    HttpEntity<String> entity = new HttpEntity("edit");
    return entity;
  }
}
