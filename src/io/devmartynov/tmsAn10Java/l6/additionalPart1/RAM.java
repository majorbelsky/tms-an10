package io.devmartynov.tmsAn10Java.l6.additionalPart1;

/**
 * RAM of computer
 */
public class RAM {
    private static final String DEFAULT_LABEL = "TOSHIBA";
    private static final int DEFAULT_VOLUME = 4000;
    private final String label;
    private final int volume;

    /**
     * Ctor.
     * Sets default label and volume.
     */
    public RAM() {
        this.label = DEFAULT_LABEL;
        this.volume = DEFAULT_VOLUME;
    }

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

    @Override
    public String toString() {
        return "RAM{" +
            "label='" + label + '\'' +
            ", volume='" + volume + '\'' +
            '}';
    }
}
