package com.example.demo.controller;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {



    private final RabbitTemplate rabbitTemplate;

    public ProductController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @GetMapping("/{productId}")
    public String getProductId(@PathVariable String productId){

        System.out.println("Sending message...");
        rabbitTemplate.convertAndSend(productId, "foo.bar.baz", productId+"가 동영상을 업로드 했습니다.");

        return productId+"를 가진 유튜버의 푸시 알람 : 구독자들에게 전송하기";
    }

    /*
    * System.out.println("Sending message...");
        rabbitTemplate.convertAndSend(topicExchange, "foo.bar.baz", "Hello Message!");
    * */
}
