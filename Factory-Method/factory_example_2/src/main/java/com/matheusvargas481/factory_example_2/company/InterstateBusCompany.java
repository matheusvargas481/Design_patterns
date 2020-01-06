package com.matheusvargas481.factory_example_2.company;

import com.matheusvargas481.factory_example_2.factory.Company;
import com.matheusvargas481.factory_example_2.factory.Ticket;
import com.matheusvargas481.factory_example_2.ticket.InterstateBusTicket;

import java.util.Calendar;

public class InterstateBusCompany extends Company {
    @Override
    public Ticket insueTicket(String source, String destiny, Calendar dataTimeDeparture) {
        return new InterstateBusTicket(source, destiny, dataTimeDeparture);
    }
}
