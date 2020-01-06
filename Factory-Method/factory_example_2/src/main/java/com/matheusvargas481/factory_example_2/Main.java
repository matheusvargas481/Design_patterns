package com.matheusvargas481.factory_example_2;

import com.matheusvargas481.factory_example_2.factory.Company;
import com.matheusvargas481.factory_example_2.company.InterstateBusCompany;
import com.matheusvargas481.factory_example_2.company.UrbanBusCompany;
import com.matheusvargas481.factory_example_2.factory.Ticket;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Company roadBusUrban = new UrbanBusCompany();
        Company roadBusInterstate = new InterstateBusCompany();

        Ticket ticketUrban = roadBusUrban.insueTicket("São Paulo", "Campinas", new GregorianCalendar(2020, Calendar.MARCH, 10, 11, 0));
        Ticket ticketInterstate = roadBusInterstate.insueTicket("São Paulo", "Rio de Janeiro", new GregorianCalendar(2020, Calendar.SEPTEMBER, 11, 12, 0));

        ticketUrban.displayTicket();
        ticketInterstate.displayTicket();
    }
}
