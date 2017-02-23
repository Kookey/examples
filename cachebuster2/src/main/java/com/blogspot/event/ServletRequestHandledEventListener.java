package com.blogspot.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationListenerMethodAdapter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.ServletRequestHandledEvent;

import java.lang.reflect.Method;

/**
 * 请求处理消息处理
 *
 * @author 王兴岭
 * @create 2017-02-23 10:34
 */
@Component
public class ServletRequestHandledEventListener implements ApplicationListener<ServletRequestHandledEvent> {

  private static final Logger LOG = LoggerFactory.getLogger(ServletRequestHandledEventListener.class);

  @Override
  public void onApplicationEvent(ServletRequestHandledEvent event) {
    LOG.error(event.getDescription());
  }
}
