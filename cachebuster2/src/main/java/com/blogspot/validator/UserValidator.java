package com.blogspot.validator;

import com.blogspot.model.User;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author 王兴岭
 * @create 2017-02-24 13:57
 */

@Component
public class UserValidator implements Validator {
  @Override
  public boolean supports(Class<?> clazz) {
    return User.class.equals(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    User user = (User) target;
    if (user.getName().length()<8){
      errors.rejectValue("name","valid.nameLength",new Object[]{"minLength",8},"用户名不能少于{1}位");
    }
  }
}
