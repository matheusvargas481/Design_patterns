package com.matheusvargas481.abstract_factory_example.abstract_factory;

import java.util.Calendar;

public abstract class BusCompany {
	
	public abstract UrbanBusTicket inssueUrbanBusTicket(String source, String destiny, Calendar dateTimeDeparture);
	
	public abstract InterstateBusTicket issueInterstateBusTicket(String source, String destiny, Calendar dateTimeDeparture);
	
}
