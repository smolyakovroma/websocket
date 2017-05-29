package ru.smolyakov.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import ru.smolyakov.websocket.pojo.Greeting;
import ru.smolyakov.websocket.pojo.HelloMessage;

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws InterruptedException {
        Thread.sleep(3000);
        return new Greeting("Hello "+message.getName()+"!");
    }
}
