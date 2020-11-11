package org.lyf.Handlers;

import org.lyf.bean.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

public class UserParserDefinitons extends AbstractSingleBeanDefinitionParser {

  @Override
  protected Class<?> getBeanClass(Element element) {
    return User.class;
  }

  @Override
  protected void doParse(Element element, BeanDefinitionBuilder builder) {
    builder.addPropertyValue("id", element.getAttribute("id"));
    builder.addPropertyValue("name", element.getAttribute("name"));
    builder.addPropertyValue("pass", element.getAttribute("pass"));
    builder.addPropertyValue("email", element.getAttribute("email"));
    builder.addPropertyValue("addr", element.getAttribute("addr"));
  }
}
