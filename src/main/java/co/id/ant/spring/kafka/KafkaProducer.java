package co.id.ant.spring.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
	
	@Autowired
	private KafkaTemplate<String, String> template;
	
	public void putToKafka(String topicName, String message) {
		template.send(topicName, message);
	}
}
