package com.matheusvargas481.abstract_factory_example;

import com.matheusvargas481.abstract_factory_example.abstract_factory.BusCompany;
import com.matheusvargas481.abstract_factory_example.abstract_factory.InterstateBusTicket;
import com.matheusvargas481.abstract_factory_example.abstract_factory.UrbanBusTicket;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        BusCompany busCompany = new ConcreteBusCompany();

        UrbanBusTicket urbanBusTicket = busCompany.inssueUrbanBusTicket("Porto Alegre", "Balneário Pinhal", new GregorianCalendar(2020, Calendar.JUNE, 10, 11, 0));

        InterstateBusTicket interstateBusTicket = busCompany.issueInterstateBusTicket("Porto Alegre", "Rio de Janeiro", new GregorianCalendar(2020, Calendar.SEPTEMBER, 20, 8, 30));

        urbanBusTicket.viewDetails();

        interstateBusTicket.viewDetails();
    }
}
