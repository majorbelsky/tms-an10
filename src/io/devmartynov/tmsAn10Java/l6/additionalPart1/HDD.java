package io.devmartynov.tmsAn10Java.l6.additionalPart1;

/**
 * HDD
 */
public class HDD {
    private static final String DEFAULT_LABEL = "TOSHIBA";
    private static final int DEFAULT_VOLUME = 512000;
    private static final HDDTypeEnum DEFAULT_TYPE = HDDTypeEnum.INTERNAL;
    private final String label;
    private final int volume;
    private final HDDTypeEnum type;

    /**
     * Ctor.
     * Sets default label, volume, type
     */
    public HDD() {
        this.label = DEFAULT_LABEL;
        this.volume = DEFAULT_VOLUME;
        this.type = DEFAULT_TYPE;
    }

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

    @Override
    public String toString() {
        return "HDD{" +
            "label='" + label + '\'' +
            ", volume='" + volume + '\'' +
            ", type=" + type +
            '}';
    }
}
