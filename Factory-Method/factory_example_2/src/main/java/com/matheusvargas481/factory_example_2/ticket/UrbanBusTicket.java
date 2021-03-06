package com.matheusvargas481.factory_example_2.ticket;

import com.matheusvargas481.factory_example_2.factory.Ticket;

import java.util.Calendar;

public class UrbanBusTicket extends Ticket {
    public UrbanBusTicket(String source, String destiny, Calendar dataTimeDeparture) {
        super(source, destiny, dataTimeDeparture);
    }

    @Override
    public void displayTicket() {
        System.out.println("Urban bus ticket: " + this.getSource() + " for " + this.getDestiny() + " Date/Hour " + super.dateFormat.format(this.getDataTimeDeparture().getTime()));
    }
}
