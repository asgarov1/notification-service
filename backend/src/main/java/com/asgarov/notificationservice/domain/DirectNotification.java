package com.asgarov.notificationservice.domain;

import lombok.Data;

@Data
public class DirectNotification extends AppNotification{
    private String target;
}
