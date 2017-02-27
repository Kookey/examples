package com.blogspot.sunitkatkar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

import lombok.extern.slf4j.Slf4j;

/**
 * PathController
 *
 * @author 王兴岭
 * @create 2017-02-27 9:38
 */
@Controller
@RequestMapping("/path")
@Slf4j
public class PathController {


  @RequestMapping("/index/{num}")
  public String index(@PathVariable int num){
    return "user2";
  }

  @RequestMapping("/index/{num}/pageNo/{pageNo}")
  public String index(@PathVariable Map<String, Integer> maps) {
    log.error("maps->{}",maps);//maps->{num=2, pageNo=44}
    return "user2";
  }
}
