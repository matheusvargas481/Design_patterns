package com.matheussoilegra.coreengineering.tema16;

public class SmsNotificationHandler extends NotificationHandler {

    public SmsNotificationHandler (NotificationHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request request) {
        if (RequestType.SMS.equals(request.getType())) {
            System.out.println("Mensagem enviada por SMS: "+ request.getMessage());
        }
        dispatchToNext(request);
    }

}
