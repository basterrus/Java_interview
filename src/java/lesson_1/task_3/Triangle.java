package lesson_1.task_3;

public class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Рисуем треугольник");
    }

    @Override
    public void myName() {
        System.out.println("Это треугольник");
    }
}
