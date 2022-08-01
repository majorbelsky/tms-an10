package io.devmartynov.tmsAn10Java.l6.additionalPart1;

public class Computer {
    private float price;
    private final String model;
    private RAM ram;
    private HDD hdd;

    /**
     * Ctor.
     * You must set hdd and ram info by using setters.
     *
     * @param price price
     * @param model model
     */
    public Computer(float price, String model) {
        this.price = price;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    /**
     * Ctor.
     *
     * @param price price
     * @param model model
     * @param ram   ram
     * @param hdd   hdd
     */
    public Computer(float price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    /**
     * Displays computer info.
     */
    public void displayInfo() {
        System.out.println("Computer info: ");
        hdd.displaysInfo();
        ram.displaysInfo();
    }

    /**
     * Gets hdd object
     *
     * @return HDD
     */
    public HDD hdd() {
        return hdd;
    }

    /**
     * Gets ram object
     *
     * @return RAM
     */
    public RAM ram() {
        return ram;
    }
}
