package com.psw.todo_service.boundedContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {

  @GetMapping("/home")
  public String showHome() {
    return "Hello World";
  }
}
