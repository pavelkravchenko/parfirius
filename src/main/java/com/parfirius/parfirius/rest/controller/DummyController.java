package com.parfirius.parfirius.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/controller")
public class DummyController {

  @GetMapping(path = "/hello", produces = "application/json")
  public String sayHello() {
    return "Hello Serafim!!!";
  }
}
