package com.javatechie.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {

    @Value("${product.discount.update.topic}")
    private String topicName;


    @Bean
    public NewTopic createTopic() {
        return new NewTopic(topicName, 3, (short) 1);
    }

    /*
    @Configuration
    public class KafkaTopicConfig {

    @Bean
    public NewTopic productTopic() {
        return TopicBuilder.name("product")
                .partitions(3) // Adjust as needed
                .replicas(1)    // Adjust as needed
                .build();
    }

    @Bean
    public NewTopic orderTopic() {
        return TopicBuilder.name("order")
                .partitions(3)
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic orderItemTopic() {
        return TopicBuilder.name("order-item")
                .partitions(3)
                .replicas(1)
                .build();
    }
    }
     */
}
