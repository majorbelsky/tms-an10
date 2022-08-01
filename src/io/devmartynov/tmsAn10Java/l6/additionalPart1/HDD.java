package io.devmartynov.tmsAn10Java.l6.additionalPart1;

/**
 * HDD
 */
public class HDD {
    private String label;
    private int volume;
    private HDDTypeEnum type;

    /**
     * Ctor.
     * Sets default label, volume, type
     */
    public HDD() {}

    /**
     * Ctor.
     *
     * @param label  label
     * @param volume volume
     * @param type   type
     */
    public HDD(String label, int volume, HDDTypeEnum type) {
        this.label = label;
        this.volume = volume;
        this.type = type;
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
     * Sets type
     * @param type HDDTypeEnum
     * @return true if operations is successful otherwise false
     */
    public boolean setType(HDDTypeEnum type) {
        this.type = type;
        return true;
    }

    /**
     * Displays info about HDD
     */
    public void displaysInfo() {
        System.out.println("HDD " + label + ", volume: " + volume + ", type: " + type);
    }
}
