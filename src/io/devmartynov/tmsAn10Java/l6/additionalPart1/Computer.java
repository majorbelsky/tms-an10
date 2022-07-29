package io.devmartynov.tmsAn10Java.l6.additionalPart1;

public class Computer {
    private float price;
    private final String model;
    private RAM ram;
    private HDD hdd;

    public Computer(float price, String model) {
        this.price = price;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(float price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer{" +
            "price=" + price +
            ", model='" + model + '\'' +
            ", ram=" + ram +
            ", hdd=" + hdd +
            '}';
    }
}
