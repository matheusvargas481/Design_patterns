package com.matheusvargas481.abstract_factory_example.abstract_factory;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class InterstateBusTicket {

	private String source;
	private String destiny;
	private Calendar dateTimeDeparture;

	protected SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	public InterstateBusTicket(String source, String destiny, Calendar dateTimeDeparture) {
		this.source = source;
		this.destiny = destiny;
		this.dateTimeDeparture = dateTimeDeparture;
	}
	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestiny() {
		return destiny;
	}

	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}

	public Calendar getDateTimeDeparture() {
		return dateTimeDeparture;
	}

	public void setDateTimeDeparture(Calendar dateTimeDeparture) {
		this.dateTimeDeparture = dateTimeDeparture;
	}
	
	public abstract void viewDetails();

}
