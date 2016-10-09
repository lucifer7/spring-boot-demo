package com.yang;

import com.yang.mq.Receiver;
import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication  /* 该应用程序入口的标志 */    // or use below instead
@EnableAdminServer      /* Spring boot admin */

/* @SpringBootApplication includes the following four annotations */
//@ComponentScan    //组件扫描，自动发现和装配bean
//@Configuration    //使用Java文件配置，类似xml
//@EnableAutoConfiguration  //自动配置
//@EnableMvc                //necessary for web
public class MainApplication {
    /*@Bean
    public StartupRunner schedulerRunner() {
        return new StartupRunner();
    }*/
    private static final String queueName = "spring-boot";
    private static final String topic = "amq.topic";

    @Bean
    Queue queue() {
        return new Queue(queueName);
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange(topic);
    }

    @Bean
    Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(queueName);
    }

    @Bean
    Receiver receiver() {
        return new Receiver();
    }

    @Bean
    MessageListenerAdapter listenerAdapter(Receiver receiver) {
        return new MessageListenerAdapter(receiver, "receiveMsg");
    }

    @Bean
    SimpleMessageListenerContainer container(ConnectionFactory connectionFactory, MessageListenerAdapter listenerAdapter) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.setMessageListener(listenerAdapter);
        container.setQueueNames(queueName);
        return container;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
