package com.example.zaglush.controller;

import com.example.zaglush.pr.MessageReq;
import com.example.zaglush.pr.MessageResp;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("message")
public class Controller {

    @PostMapping
    public MessageResp create(@RequestBody MessageReq messageReq) {
        MessageResp messageResp = new MessageResp();
        messageResp.setId(messageReq.getId());
        messageResp.setText(messageReq.getText());
        messageResp.setText2(messageReq.getText2());
        return messageResp;
    }
}
