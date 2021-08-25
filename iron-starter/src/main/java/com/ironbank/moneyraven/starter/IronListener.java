package com.ironbank.moneyraven.starter;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author tolkv
 * @version 03/11/2017
 */

public class IronListener implements ApplicationListener<ContextRefreshedEvent> {

  private final RavenProperties ravenProperties;

  public IronListener(RavenProperties ravenProperties) {
    this.ravenProperties = ravenProperties;
  }

  @Override
  public void onApplicationEvent(ContextRefreshedEvent event) {
    ravenProperties.getКудаЛететь().forEach(s -> System.out.println("посылаю ворона в " + s));
  }
}
