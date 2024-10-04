package jwt.authorization.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class resourceController {

    @GetMapping("/hello")
    public String HelloWorld(){
        return "Hello World";
    }
}
