package co.id.ant.spring.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class SimpleKafkaListener {

	@KafkaListener(topics = "handsome")
    public void listen(String in) {
		System.err.println("Message from kafka client " + in);
    }

}
