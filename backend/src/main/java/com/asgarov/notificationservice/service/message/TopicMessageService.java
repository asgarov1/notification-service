package com.asgarov.notificationservice.service.message;

import com.asgarov.notificationservice.domain.TopicNotification;
import com.google.firebase.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class TopicMessageService extends MessageService {

    public static final String ICON_URL = "https://assets.mapquestapi.com/icon/v2/incident@2x.png";

    public Message createMessage(TopicNotification notification) {
        return Message.builder()
                .setWebpushConfig(buildWebPushConfig(notification))
                .setTopic(notification.getTopic())
                .build();
    }

    @Override
    protected String getIconUrl() {
        return ICON_URL;
    }
}
