package io.devmartynov.tmsAn10Java.l6.additionalPart1;

public class Index {
    public static void main(String[] args) {
        Computer computer1 = new Computer(300000, "MacBook Pro 16");
        computer1.hdd().setLabel("hdd test");
        computer1.hdd().setVolume(4000);
        computer1.hdd().setType(HDDTypeEnum.INTERNAL);
        computer1.ram().setLabel("ram test");
        computer1.ram().setVolume(4000);
        computer1.ram().setVolume(4000);
        Computer computer2 = new Computer(
            200000,
            "MacBook Pro 14",
            new RAM("AppleInc", 8000),
            new HDD("AppleInc", 1000000, HDDTypeEnum.INTERNAL)
        );
        computer1.displayInfo();
        computer2.displayInfo();
    }
}
