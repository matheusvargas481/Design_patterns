package com.matheussoilegra.coreengineering.tema16;

import java.util.Objects;

public abstract class NotificationHandler {
    private NotificationHandler handler;

    public NotificationHandler(NotificationHandler handler) {
        this.handler = handler;
    }

    public abstract void handleRequest(Request request);

    protected void dispatchToNext(Request request) {
        if (Objects.nonNull(this.handler)) {
            this.handler.handleRequest(request);
        }
    }

}
