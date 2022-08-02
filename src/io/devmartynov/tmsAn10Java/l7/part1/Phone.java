package io.devmartynov.tmsAn10Java.l7.part1;

public class Phone {
    private int number;
    private int weight;
    private String model;

    /**
     * Ctor.
     */
    public Phone() {
    }

    /**
     * Ctor.
     *
     * @param number number
     * @param model  model
     */
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    /**
     * Ctor.
     *
     * @param number number
     * @param weight weight
     * @param model  model
     */
    public Phone(int number, int weight, String model) {
        this(number, model);
        this.weight = weight;
    }

    /**
     * Sets number
     *
     * @param number phone number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Sets weight
     *
     * @param weight phone weight in grams
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Sets model
     *
     * @param model phone model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Phone number
     *
     * @return phone number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Phone weight
     *
     * @return phone weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Phone model
     *
     * @return phone model
     */
    public String getModel() {
        return model;
    }

    /**
     * Receives call. Print caller name
     *
     * @param callerName caller name
     */
    public void receiveCall(String callerName) {
        System.out.println(callerName + " is calling.");
    }

    /**
     * Receives call. Print caller name and its phone number
     *
     * @param callerName        caller name
     * @param callerPhoneNumber caller phone number
     */
    public void receiveCall(String callerName, int callerPhoneNumber) {
        System.out.println(callerName + "is calling" + " from number: " + callerPhoneNumber);
    }

    /**
     * Sends message. Prints phone numbers
     *
     * @param numbers phone numbers
     */
    public void sendMessage(int... numbers) {
        for (int number : numbers) {
            System.out.println("Sending message to " + number);
        }
    }
}
