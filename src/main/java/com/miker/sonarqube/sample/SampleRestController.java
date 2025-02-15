/**
 * 
 */
package com.miker.sonarqube.sample;

import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
public class SampleRestController {
  public static void main(String[] args) {
    System.out.println("Hello");
    var sql = "SELECT * FROM TABLE1 WHERE NAME=" + args[0];
  }
}
