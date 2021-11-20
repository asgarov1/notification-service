package com.asgarov.notificationservice.service;

import com.asgarov.notificationservice.domain.DirectNotification;
import com.asgarov.notificationservice.domain.SubscriptionRequest;
import com.asgarov.notificationservice.domain.TopicNotification;
import com.asgarov.notificationservice.service.message.DirectMessageService;
import com.asgarov.notificationservice.service.message.TopicMessageService;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FCMService {

    private final DirectMessageService directMessageService;
    private final TopicMessageService topicMessageService;
    private final FirebaseMessaging firebaseMessaging;

    public void sendNotificationToTarget(DirectNotification notification) {
        Message message = directMessageService.createMessage(notification);
        firebaseMessaging.sendAsync(message);
    }

    public void sendNotificationToTopic(TopicNotification notification) {
        Message message = topicMessageService.createMessage(notification);
        firebaseMessaging.sendAsync(message);
    }

    @SneakyThrows
    public void subscribeToTopic(SubscriptionRequest subscription) {
        firebaseMessaging.subscribeToTopic(
                List.of(subscription.getSubscriber()),
                subscription.getTopic());
    }
}
