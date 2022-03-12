package co.id.ant.spring.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopics {
	
	@Bean
	public NewTopic topic() {
		return TopicBuilder.name("handsome")
                .partitions(10)
                .replicas(2)
                .build();
	}
	
}
