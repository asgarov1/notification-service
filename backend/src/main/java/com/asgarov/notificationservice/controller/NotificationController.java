package com.asgarov.notificationservice.controller;

import com.asgarov.notificationservice.domain.DirectNotification;
import com.asgarov.notificationservice.domain.SubscriptionRequest;
import com.asgarov.notificationservice.domain.TopicNotification;
import com.asgarov.notificationservice.service.FCMService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@AllArgsConstructor
@RestController
class NotificationController {

    private final FCMService fcmService;

    @PostMapping("/notification")
    public ResponseEntity<HttpStatus> sendTargetedNotification(@RequestBody DirectNotification notification) {
        fcmService.sendNotificationToTarget(notification);
        return ResponseEntity.of(Optional.of(HttpStatus.NO_CONTENT));
    }

    @PostMapping("/topic/notification")
    public ResponseEntity<HttpStatus> sendNotificationToTopic(@RequestBody TopicNotification notification) {
        fcmService.sendNotificationToTopic(notification);
        return ResponseEntity.of(Optional.of(HttpStatus.NO_CONTENT));
    }

    @PostMapping("/topic/subscription")
    public ResponseEntity<HttpStatus> subscribeToTopic(@RequestBody SubscriptionRequest subscription) {
        fcmService.subscribeToTopic(subscription);
        return ResponseEntity.of(Optional.of(HttpStatus.NO_CONTENT));
    }
}
