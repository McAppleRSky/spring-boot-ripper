package com.ironbank.moneyraven.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author tolkv
 * @since 9/17/2017
 */
@ConfigurationProperties("ironbank")
public class ProphetProperties {
  List<String> теКтоВозвращаютДолги;

  public List<String> getТеКтоВозвращаютДолги() {
    return теКтоВозвращаютДолги;
  }

  public void setТеКтоВозвращаютДолги(List<String> теКтоВозвращаютДолги) {
    this.теКтоВозвращаютДолги = теКтоВозвращаютДолги;
  }
}
