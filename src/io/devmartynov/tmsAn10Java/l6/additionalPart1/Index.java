package io.devmartynov.tmsAn10Java.l6.additionalPart1;

public class Index {
    public static void main(String[] args) {
        Computer computer1 = new Computer(300000, "MacBook Pro 16");
        Computer computer2 = new Computer(
            200000,
            "MacBook Pro 14",
            new RAM("AppleInc", 8000),
            new HDD("AppleInc", 1000000, HDDTypeEnum.INTERNAL)
        );
        System.out.println(computer1);
        System.out.println(computer2);
    }
}
