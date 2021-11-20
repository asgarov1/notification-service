package com.asgarov.notificationservice.service.message;

import com.asgarov.notificationservice.domain.AppNotification;
import com.google.firebase.messaging.WebpushConfig;
import com.google.firebase.messaging.WebpushNotification;

public abstract class MessageService {

    protected WebpushConfig buildWebPushConfig(AppNotification notification) {
        return WebpushConfig.builder()
                .setNotification(buildWebPushNotification(notification))
                .build();
    }

    private WebpushNotification buildWebPushNotification(AppNotification notification) {
        return WebpushNotification.builder()
                .setTitle(notification.getTitle())
                .setBody(notification.getMessage())
                .setIcon(getIconUrl())
                .build();
    }

    protected abstract String getIconUrl();
}
