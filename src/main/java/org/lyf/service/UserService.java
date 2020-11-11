package org.lyf.service;

import org.lyf.bean.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserService {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    User one = (User) context.getBean("one");
    System.out.println(one);
  }

}
