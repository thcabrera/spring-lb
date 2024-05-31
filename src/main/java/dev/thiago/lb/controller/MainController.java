package dev.thiago.lb.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private Logger logger = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/helloworld")
    String helloWorld(HttpServletRequest httpReq){
        logger.info(String.format("Client remote address: %s", httpReq.getRemoteAddr()));
        return "Hello world!";
    }


}
