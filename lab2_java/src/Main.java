import other_class.Button;
import other_class.Bell;
import other_class.Balance;
import other_class.OddEvenSeparator;
import other_class.Table;
import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;
import exceptions.DivisionByZeroException; // Гипотетическое исключение
import exceptions.InvalidDimensionException;
import exceptions.ZeroHeightException;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Демонстрация работы класса Button
        Button button = new Button();
        button.click();
        button.click();
        button.click();

        System.out.println();

        // Демонстрация работы класса Balance
        Balance balance = new Balance();
        balance.addRight(10);
        balance.addLeft(5);
        balance.addLeft(5);
        System.out.println("Результат взвешивания:");
        balance.result();
        balance.addRight(1);
        System.out.println("Результат взвешивания:");
        balance.result();

        System.out.println();

        // Демонстрация работы класса Bell
        Bell bell = new Bell();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();

        System.out.println();

        // Демонстрация работы класса OddEvenSeparator
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(1);
        separator.addNumber(2);
        separator.addNumber(3);
        separator.addNumber(4);
        separator.addNumber(5);
        System.out.println("Четные числа:");
        separator.even();
        System.out.println("Нечетные числа:");
        separator.odd();

        System.out.println();

        // Демонстрация работы класса Table
        Table table = new Table(3, 4);
        table.setValue(0, 0, 1);
        table.setValue(1, 2, 5);
        table.setValue(2, 3, 9);

        System.out.println("Таблица:");
        System.out.println(table);
        System.out.println("Значение в ячейке (1, 2): " + table.getValue(1, 2));
        System.out.println("Среднее арифметическое: " + table.average());
        System.out.println("Количество строк: " + table.rows());
        System.out.println("Количество столбцов: " + table.cols());

        System.out.println();

        // Демонстрация работы классов из пакетов geometry2d и geometry3d
        try {
            Circle circle = new Circle(5);
            Rectangle rectangle = new Rectangle(4, 6);

            System.out.println("Круг: " + circle);
            System.out.println("Площадь круга: " + circle.area());
            System.out.println("Периметр круга: " + circle.perimeter());

            System.out.println("Прямоугольник: " + rectangle);
            System.out.println("Площадь прямоугольника: " + rectangle.area());
            System.out.println("Периметр прямоугольника: " + rectangle.perimeter());

            Cylinder cylinder = new Cylinder(circle, 10);
            System.out.println("Цилиндр: " + cylinder);
            System.out.println("Объем цилиндра: " + cylinder.volume());

            Cylinder cylinder2 = new Cylinder(new Circle(3), 0);
            System.out.println("Цилиндр с нулевой высотой: " + cylinder2);
        } catch (InvalidDimensionException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } catch (ZeroHeightException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Непредвиденная ошибка: " + e.getMessage());
        }

        System.out.println();

        // Дополнительная демонстрация с использованием случайных значений
        Random random = new Random();

        try {
            double radius = random.nextDouble() * 10; // Случайный радиус до 10
            Circle randomCircle = new Circle(radius);
            System.out.println("Случайный круг: " + randomCircle);
            System.out.println("Площадь случайного круга: " + randomCircle.area());

            double width = random.nextDouble() * 10;
            double height = random.nextDouble() * 10;
            Rectangle randomRectangle = new Rectangle(width, height);
            System.out.println("Случайный прямоугольник: " + randomRectangle);
            System.out.println("Площадь случайного прямоугольника: " + randomRectangle.area());

            double cylinderHeight = random.nextDouble() * 10;
            Cylinder randomCylinder = new Cylinder(randomCircle, cylinderHeight);
            System.out.println("Случайный цилиндр: " + randomCylinder);
            System.out.println("Объем случайного цилиндра: " + randomCylinder.volume());
        } catch (InvalidDimensionException e) {
            System.err.println("Ошибка при создании случайных фигур: " + e.getMessage());
        } catch (ZeroHeightException e) {
            System.err.println("Ошибка при создании цилиндра: " + e.getMessage());
        }
    }
}