package co.develhope.Interceptor.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class BasicController {

    @GetMapping("/time")
    public String loadCurrentTime() {
        return LocalDateTime.now().toString();
    }
}