package com.ryana.k8sdekoratedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.dekorate.kubernetes.annotation.KubernetesApplication;
import io.dekorate.kubernetes.annotation.Label;
import io.dekorate.kubernetes.annotation.Port;

@KubernetesApplication(ports = @Port(name = "http", containerPort = 8080),
                       labels = @Label(key = "version", value = "v1"),
                       expose = false)
@RestController
public class HelloController {

    @GetMapping("/message")
    public String getMessage() {
        return String.format("Spring Boot K8s dekorate demo!!!");
    }
    
    
}
