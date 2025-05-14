package org.testdeploy.testdeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestDeployApplication {
    // This is test change for jenkins
    public static void main(String[] args) {

        SpringApplication.run(TestDeployApplication.class, args);
        System.out.println("");

    }

}
