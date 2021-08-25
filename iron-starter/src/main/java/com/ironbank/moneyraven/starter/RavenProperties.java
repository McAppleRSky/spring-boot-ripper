package com.ironbank.moneyraven.starter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author tolkv
 * @version 03/11/2017
 */

//@Data
@Configuration
@ConfigurationProperties("ворон")
public class RavenProperties {
  public boolean isВкл() {
    return вкл;
  }

  public void setВкл(boolean вкл) {
    this.вкл = вкл;
  }

  public List<String> getКудаЛететь() {
    return кудаЛететь;
  }

  public void setКудаЛететь(List<String> кудаЛететь) {
    this.кудаЛететь = кудаЛететь;
  }

  boolean вкл;
  List<String> кудаЛететь;

}
