package com.asgarov.notificationservice.domain;

import lombok.Data;

@Data
public class TopicNotification extends AppNotification{
    private String topic;
}
