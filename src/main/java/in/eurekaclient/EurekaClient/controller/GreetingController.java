package in.eurekaclient.EurekaClient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/greeting")
    public String greet(){
        return "Hello,Good Evening!";
    }
}
