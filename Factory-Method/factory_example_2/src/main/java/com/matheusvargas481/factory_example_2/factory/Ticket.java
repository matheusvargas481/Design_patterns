package com.matheusvargas481.factory_example_2.factory;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Ticket {
    private String source;
    private String destiny;
    private Calendar dataTimeDeparture;

    protected SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy HH:mm");

    public Ticket(String source, String destiny, Calendar dataTimeDeparture) {
        this.source = source;
        this.destiny = destiny;
        this.dataTimeDeparture = dataTimeDeparture;
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

    public Calendar getDataTimeDeparture() {
        return dataTimeDeparture;
    }

    public void setDataTimeDeparture(Calendar dataTimeDeparture) {
        this.dataTimeDeparture = dataTimeDeparture;
    }

    public abstract void displayTicket();
}
