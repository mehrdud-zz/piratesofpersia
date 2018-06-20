package com.mehrdud.piratesofpersia;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


@RestController
public class HelloWorldController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public String sayHello(){
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        String message = "Hello on " +dateFormat.format(date);

        logger.warn(message);
        return message;
    }
}
