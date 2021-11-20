package com.asgarov.notificationservice.domain;

import lombok.Data;

@Data
public class SubscriptionRequest {
    private String subscriber;
    private String topic;
}
