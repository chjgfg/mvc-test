package org.lyf.Handlers;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class UserHandlers extends NamespaceHandlerSupport {
  @Override
  public void init() {
    registerBeanDefinitionParser("user",new UserParserDefinitons());
  }
}
