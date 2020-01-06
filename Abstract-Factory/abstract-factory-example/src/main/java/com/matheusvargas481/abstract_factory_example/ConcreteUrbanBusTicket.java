package com.matheusvargas481.abstract_factory_example;

import com.matheusvargas481.abstract_factory_example.abstract_factory.UrbanBusTicket;

import java.util.Calendar;

public class ConcreteUrbanBusTicket extends UrbanBusTicket {

	public ConcreteUrbanBusTicket(String source, String destiny, Calendar dateTimeDeparture) {
		
		super(source, destiny, dateTimeDeparture);
	}

	public void viewDetails() {
		System.out.println("Urban bus ticket: " + this.getSource() +
				" for " + this.getDestiny() +
				", Date/Hour: " + super.dateFormat.format(this.getDateTimeDeparture().getTime()));
	}

}
