package com.github.hasanyelaldi.rabbitmq.service;

import com.github.hasanyelaldi.rabbitmq.model.Message;
import com.github.hasanyelaldi.rabbitmq.producer.NotificationProducer;
import java.util.Date;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

  @Autowired
  NotificationProducer producer;

  public String send(Message producerMessage) {
    Message message = new Message();
    message.setId(UUID.randomUUID().toString());
    message.setCreateDate(new Date());
    message.setMessageInfo(producerMessage.getMessageInfo());
    message.setSeen(Boolean.FALSE);
    message.setUserId(producerMessage.getUserId());
    message.setReceiverId(producerMessage.getReceiverId());

    producer.sendToQueue(message);
    return message.getId() + " Send";
  }
}
