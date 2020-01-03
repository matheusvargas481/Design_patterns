package com.matheussoilegra.coreengineering.tema16;

public class EmailNotificationHandler extends NotificationHandler {

    public EmailNotificationHandler(NotificationHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request request) {
        if (RequestType.EMAIL.equals(request.getType())) {
            System.out.println("Mensagem enviada por e-mail: " + request.getMessage());
        }
        dispatchToNext(request);
    }

}
