package co.id.ant.spring.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@Autowired
	private KafkaProducer producer;
	
	@GetMapping(path = "/{topic}/{message}")
	public String home(@PathVariable String topic, @PathVariable String message) {
		producer.putToKafka(topic, message);
		System.out.println("Add to kafka topic 1");
		return "Hello World";
	}
}