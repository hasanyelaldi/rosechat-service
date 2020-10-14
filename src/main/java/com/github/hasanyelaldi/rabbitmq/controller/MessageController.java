package com.github.hasanyelaldi.rabbitmq.controller;

import com.github.hasanyelaldi.rabbitmq.model.Message;
import com.github.hasanyelaldi.rabbitmq.service.MessageService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    MessageService messageService;

    @PostMapping(value = "/send", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> sendMessage(@Valid @RequestBody Message message) {
        return ResponseEntity.ok(messageService.send(message));
    }
}
