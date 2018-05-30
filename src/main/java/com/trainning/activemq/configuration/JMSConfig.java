//package com.trainning.activemq.configuration;
//
//import org.apache.activemq.ActiveMQConnectionFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
//import org.springframework.jms.core.JmsTemplate;
//
//@Configuration
//public class JMSConfig {
//    @Value("${spring.activemq.broker-url}")
//    private String BROKER_URL;
//
//    @Value("${spring.activemq.user}")
//    private String BROKER_USERNAME;
//
//    @Value("${spring.activemq.password}")
//    private String BROKER_PASSWORD;
//
//    @Bean
//    public ActiveMQConnectionFactory connectionFactory(){
//        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
//        connectionFactory.setBrokerURL(BROKER_URL);
//        connectionFactory.setPassword(BROKER_PASSWORD);
//        connectionFactory.setUserName(BROKER_USERNAME);
//        return connectionFactory;
//    }
//
//    @Bean
//    public JmsTemplate jmsTemplate(){
//        JmsTemplate template = new JmsTemplate();
//        template.setConnectionFactory(connectionFactory());
//        template.setPubSubDomain(true);
//        return template;
//    }
//
//    @Bean
//    public DefaultJmsListenerContainerFactory jmsListenerContainerFactory() {
//        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
//        factory.setConnectionFactory(connectionFactory());
//        factory.setPubSubDomain(true);
//        factory.setConcurrency("1-1");
//        return factory;
//    }
//}
