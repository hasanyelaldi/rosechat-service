package com.github.hasanyelaldi.rabbitmq.listener;

import com.github.hasanyelaldi.rabbitmq.model.Message;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class NotificationListener {

  final static Logger logger = LoggerFactory.getLogger(NotificationListener.class);

  @RabbitListener(queues = "rabbit-queue")
  public void handleMessage(Message message){
    logger.info("1 Message to " + message.getArrivalUserId() + " from " + message.getUserId());
    logger.info("Message :" + message.getMessageInfo());
  }

}
