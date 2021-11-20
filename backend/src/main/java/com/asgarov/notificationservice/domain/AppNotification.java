package com.asgarov.notificationservice.domain;

import lombok.Data;

@Data
public abstract class AppNotification {
    private String title;
    private String message;
}
