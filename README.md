# spring-kafka
This is just a simple example of how the spring boot simplify kafka integration between producer and consumer.

## Producer
Producer will put a new message with topic name defined from the rest api request:
```localhost:9090/{topicName}/{message}```

for this case, use `handsome` as topic name as the consumer only set to listen to the ```handsome``` topic.

## Consumer
Consumer will always listen to `handsome` topic. 
