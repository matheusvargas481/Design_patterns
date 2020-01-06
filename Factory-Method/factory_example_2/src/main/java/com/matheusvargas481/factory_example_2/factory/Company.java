package com.matheusvargas481.factory_example_2.factory;

import java.util.Calendar;

public abstract class Company {
    public abstract Ticket insueTicket(String source, String destiny, Calendar dataTimeDeparture);

}
