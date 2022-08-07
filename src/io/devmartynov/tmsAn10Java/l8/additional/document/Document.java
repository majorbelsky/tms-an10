package io.devmartynov.tmsAn10Java.l8.additional.document;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Document {
    private static final String DATE_FORMAT = "dd.MM.yyyy";
    private int number;
    private Date date;
    protected final SimpleDateFormat dateFormatter = new SimpleDateFormat(DATE_FORMAT);

    /**
     * Ctor.
     */
    public Document() {
    }

    /**
     * Ctor.
     *
     * @param number number
     * @param date   date
     */
    public Document(int number, Date date) {
        this.number = number;
        this.date = date;
    }

    /**
     * Document number
     *
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets document number
     *
     * @param number number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Document date
     *
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets document date
     *
     * @param date date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Gets info about document
     *
     * @return info as string
     */
    public String getInfo() {
        return "number: " + number + ", date: " + dateFormatter.format(date);
    }

    /**
     * Displays info about document to console
     */
    public abstract void displayInfo();
}
