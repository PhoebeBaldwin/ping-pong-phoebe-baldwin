package com.example.PingController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class PongController {

    @GetMapping(value = "Ping" )
    @ResponseBody
    
    public String Pong() {
    	return "Pong";
    }
    
}
