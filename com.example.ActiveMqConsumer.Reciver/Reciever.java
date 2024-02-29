package com.example.ActiveMqConsumer.Reciver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Reciever
{
  // private static final Logger log= LoggerFactory.getLogger(Reciever.class);
    @JmsListener(destination = "purabi")
    public void recieve(String message)
    {
      // log.info("This is recieved message="+message);
        System.out.println("This is recieved client message="+message);
    }
}
