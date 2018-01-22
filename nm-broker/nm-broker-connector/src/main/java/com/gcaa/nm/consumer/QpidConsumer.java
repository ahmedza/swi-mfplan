package com.gcaa.nm.consumer;

import java.util.Date;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.listener.SessionAwareMessageListener;
import org.springframework.stereotype.Component;

import com.gcaa.nm.entity.NmMessageEntity;
import com.gcaa.nm.repository.NmMessageRepository;
import com.gcaa.nm.types.NmMessageType;



@Component
public class QpidConsumer implements SessionAwareMessageListener<Message>{

	private static final Logger logger = (Logger) LoggerFactory.getLogger(QpidConsumer.class);
	@Autowired
	private NmMessageRepository msgRepo;
	
	@Override
	public void onMessage(Message message, Session session) throws JMSException {
		if(message instanceof TextMessage){
			logger.debug("New Message received= {}", ((TextMessage)message).getText().substring(0,200));
			
			NmMessageEntity msg = new NmMessageEntity();
			msg.setMessageType(((TextMessage) message).getText().substring(0,100).contains("TechnicalMessage") ? NmMessageType.TECHNICAL : NmMessageType.BUSINESS);
			msg.setReceivedDate(new Date());
			msg.setReceivedMessage(((TextMessage) message).getText());
			msgRepo.save(msg);
			return;
		}
	}
}