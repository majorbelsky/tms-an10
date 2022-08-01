package io.devmartynov.tmsAn10Java.l6.additionalPart1;

/**
 * RAM of computer
 */
public class RAM {
    private String label;
    private int volume;

    /**
     * Ctor.
     * Sets default label and volume.
     */
    public RAM() {}

    /**
     * Ctor.
     *
     * @param label  label
     * @param volume volume
     */
    public RAM(String label, int volume) {
        this.label = label;
        this.volume = volume;
    }

    /**
     * Sets label
     * @param label string
     * @return true if operations is successful otherwise false
     */
    public boolean setLabel(String label) {
        if (label.length() == 0) {
            return false;
        }
        this.label = label;
        return true;
    }

    /**
     * Sets volume
     * @param volume number
     * @return true if operations is successful otherwise false
     */
    public boolean setVolume(int volume) {
        if (volume == 0 || volume % 8 != 0) {
            return false;
        }
        this.volume = volume;
        return true;
    }

    /**
     * Displays info about RAM
     */
    public void displaysInfo() {
        System.out.println("RAM " + label + ", volume: " + volume + ".");
    }
}
