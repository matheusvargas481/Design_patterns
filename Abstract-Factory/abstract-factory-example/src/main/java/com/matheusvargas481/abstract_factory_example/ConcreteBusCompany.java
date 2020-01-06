package com.matheusvargas481.abstract_factory_example;

import com.matheusvargas481.abstract_factory_example.abstract_factory.BusCompany;
import com.matheusvargas481.abstract_factory_example.abstract_factory.InterstateBusTicket;
import com.matheusvargas481.abstract_factory_example.abstract_factory.UrbanBusTicket;

import java.util.Calendar;

public class ConcreteBusCompany extends BusCompany {

    public UrbanBusTicket inssueUrbanBusTicket(String source, String destiny, Calendar dateTimeDeparture) {
        return new ConcreteUrbanBusTicket(source, destiny, dateTimeDeparture);
    }

    public InterstateBusTicket issueInterstateBusTicket(String source, String destiny, Calendar dateTimeDeparture) {
        return new ConcreteInterstateBusTicket(source, destiny, dateTimeDeparture);
    }
}
