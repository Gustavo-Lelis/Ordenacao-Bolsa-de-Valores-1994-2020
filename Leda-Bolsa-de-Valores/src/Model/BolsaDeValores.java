package Model;

import java.time.LocalDate;
import java.util.Date;

public class BolsaDeValores {

    private String data;
    private String ticket;
    private double open;
    private double close;
    private double high;
    private double low;
    private double volume;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String toCSV() {
        return data + "," + ticket + "," + open + "," + close + "," + high + "," + low + "," + volume;
    }
}
