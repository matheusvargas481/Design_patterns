package com.matheussoilegra.coreengineering.tema16;

public class WhatsappNotificationHandler extends NotificationHandler {

    public WhatsappNotificationHandler (NotificationHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request request) {
        if (RequestType.WHATSAPP.equals(request.getType())) {
            System.out.println("Mensagem enviada por WhatsApp: " + request.getMessage());
        }
        dispatchToNext(request);
    }

}
