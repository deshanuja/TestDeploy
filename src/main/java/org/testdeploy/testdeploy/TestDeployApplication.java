package org.testdeploy.testdeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("started")
@SpringBootApplication
public class TestDeployApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestDeployApplication.class, args);
        System.out.println("App Started and deployed");
    }

    @GetMapping("/get")
    public String getData(){
        return "App started via Jenkins";
    }

}
