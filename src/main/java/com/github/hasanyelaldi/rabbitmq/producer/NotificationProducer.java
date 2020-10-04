package com.github.hasanyelaldi.rabbitmq.producer;

import com.github.hasanyelaldi.rabbitmq.model.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NotificationProducer {

  @Autowired
  private RabbitTemplate rabbitTemplate;

  @Value("${sr.rabbit.routing.name}")
  private String routingName;

  @Value("${sr.rabbit.exchange.name}")
  private String exchangeName;

  public void sendToQueue(Message message){
    rabbitTemplate.convertAndSend(exchangeName, routingName, message);
  }

}
