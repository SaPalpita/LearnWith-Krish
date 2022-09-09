package com.virtusa.kafka;

import org.springframework.kafka.annotation.KafkaListener;

public class ProcessPhoto {

    @KafkaListener(topics = "photoIn", groupId = "diary")
    public void PhotoProcessor(String path){
        System.out.println("Path is "+ path);

    }

}
