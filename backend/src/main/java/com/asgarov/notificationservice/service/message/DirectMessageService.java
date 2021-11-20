package com.asgarov.notificationservice.service.message;

import com.asgarov.notificationservice.domain.DirectNotification;
import com.google.firebase.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class DirectMessageService extends MessageService {
    public static final String ICON_URL = "https://assets.mapquestapi.com/icon/v2/circle@2x.png";

    public Message createMessage(DirectNotification notification) {
        return Message.builder()
                .setWebpushConfig(buildWebPushConfig(notification))
                .setToken(notification.getTarget())
                .build();
    }

    @Override
    protected String getIconUrl() {
        return ICON_URL;
    }
}
