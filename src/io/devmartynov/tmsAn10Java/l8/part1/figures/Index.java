package io.devmartynov.tmsAn10Java.l8.part1.figures;

/*
1. Написать иерархию классов «Фигуры».
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра. Создать массив из 5 фигур.
Вывести на экран сумму периметра всех фигур в массиве.
 */
public class Index {
    public static void main(String[] args) {
        Figure circle1 = new Circle(5);
        Figure circle2 = new Circle(14);
        Figure rectangle1 = new Rectangle(12, 15);
        Figure rectangle2 = new Rectangle(1, 26);
        Figure triangle = new Triangle(1, 2, 4);

        Figure[] figures = {circle1, circle2, rectangle1, rectangle2, triangle};
        double sum = 0;
        for (Figure figure : figures) {
            sum += figure.calculatePerimeter();
        }
        System.out.println("Sum of figures: " + sum);
    }
}
