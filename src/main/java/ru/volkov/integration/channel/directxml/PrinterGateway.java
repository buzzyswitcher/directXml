package ru.volkov.integration.channel.directxml;

import org.springframework.messaging.Message;

import java.util.concurrent.Future;

public interface PrinterGateway {

    Future<Message<String>> print(Message<?> message);
}
