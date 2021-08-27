/*
package com.mvc.mq;

import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.spring.annotation.MessageModel;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

@Component
@RocketMQMessageListener(
        consumerGroup ="${mq.order.consumer.group.name}" ,
        topic = "${mq.order.topic}",
        messageModel = MessageModel.BROADCASTING
)
public class plistener implements RocketMQListener<MessageExt> {
    @Override
    public void onMessage(MessageExt messageExt) {
        System.out.println("8003接收到消息");
    }
}
*/
