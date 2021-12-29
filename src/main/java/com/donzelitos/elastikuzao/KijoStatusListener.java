package com.donzelitos.elastikuzao;

import com.donzelitos.elastikuzao.model.Kijo;
import com.donzelitos.elastikuzao.repository.KijoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class KijoStatusListener{

    private final static Logger logger = LoggerFactory.getLogger(KijoStatusListener.class);
    private final KijoRepository repository;

    public KijoStatusListener(KijoRepository repository) {
        this.repository = repository;
    }

    @KafkaListener(topics = "SRC_KIJO", containerFactory = "kijoConsumerFactory")
    public void consume(@Payload Kijo kijo, MessageHeaders messageHeader){
        System.out.println("Saving kijos" + kijo);
        repository.save(kijo);
    }

}
