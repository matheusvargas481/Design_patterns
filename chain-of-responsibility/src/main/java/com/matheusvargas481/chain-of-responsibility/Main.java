package com.matheussoilegra.coreengineering.tema16;

public class Main {
    public static void main(String[] args) {
        NotificationHandler smsNotificationHandler = new SmsNotificationHandler(null);
        NotificationHandler emailNotificationHandler = new EmailNotificationHandler(smsNotificationHandler);
        NotificationHandler whatsappNotificationHandler = new WhatsappNotificationHandler(emailNotificationHandler);

        Request request = new Request();
        request.setMessage("Compra realizada com sucesso!");
        request.setType(RequestType.WHATSAPP);
        whatsappNotificationHandler.handleRequest(request);
    }

}
