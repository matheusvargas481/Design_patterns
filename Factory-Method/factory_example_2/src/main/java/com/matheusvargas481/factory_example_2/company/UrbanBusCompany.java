package com.matheusvargas481.factory_example_2.company;

import com.matheusvargas481.factory_example_2.factory.Company;
import com.matheusvargas481.factory_example_2.factory.Ticket;
import com.matheusvargas481.factory_example_2.ticket.UrbanBusTicket;

import java.util.Calendar;

public class UrbanBusCompany extends Company {
    @Override
    public Ticket insueTicket(String source, String destiny, Calendar dataTimeDeparture) {
        return new UrbanBusTicket(source, destiny, dataTimeDeparture);
    }
}
