package com.blogspot.sunitkatkar;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * ResponseAdvice
 *
 * @author 王兴岭
 * @create 2017-02-24 16:00
 */
@ControllerAdvice
public class ResponseBodyAdviceController  implements ResponseBodyAdvice{
  @Override
  public boolean supports(MethodParameter returnType, Class converterType) {
    return true;
  }

  @Override
  public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
    return body+"<br/>还好大手动阀手动阀手动阀";
  }
}
