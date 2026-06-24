/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : KafkaTopicsCreationExample.java
 *  * Created On : 2026-06-23 20:15
 *  * Author     : Wilson K Sam
 *  * Copyright  : (c) 2026 Wilson K Sam
 *  * =============================================================================
 *  *
 *  * Description:
 *  * This source file is part of a coding practice project created for learning,
 *  * experimentation, interview preparation, and demonstration of software
 *  * development concepts and best practices.
 *  *
 *   * Purpose:
 *   * -
 *  * Notes:
 *  * -
 *  *
 *  * =============================================================================
 *
 */

package org.wilsonks.spring_boot.kafka_integration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicsCreationExample {

    @Bean
    public NewTopic exampleTopic() {
        return TopicBuilder.name("example-topic")
                .partitions(3)
                .replicas(1)
                .build();
    }

    public static void main(String[] args) {

        // This main method is just for demonstration purposes.
        // In a real Spring Boot application, the topics would be created when the application context is initialized.
        KafkaTopicsCreationExample example = new KafkaTopicsCreationExample();
        NewTopic topic = example.exampleTopic();
        System.out.println("Created topic: " + topic.name() + " with partitions: " + topic.numPartitions() + " and replicas: " + topic.replicationFactor());
    }
}
