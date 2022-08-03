package io.devmartynov.tmsAn10Java.l7.additional;

public class Array<T> {
    private T[] origin;
    private T[] value;

    public Array(T[] origin) {
        this.origin = origin;
        this.value = origin;
    }

    /**
     * Gets array
     * @return array
     */
    public T[] getValue() {
        return value;
    }

    /**
     * Adds element to array
     * @param element element
     */
    public void addElement(T element) {
        T[] newArray = (T[]) java.lang.reflect.Array
            .newInstance(origin.getClass().getComponentType(), value.length + 1);
        System.arraycopy(value, 0, newArray, 0, value.length);
        newArray[newArray.length - 1] = element;
        value = newArray;
    }
}
