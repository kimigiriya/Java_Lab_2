package other_class;

// Класс кнопки
public class Button {
    private int clickCount = 0;

    public void click() {
        clickCount++;
        System.out.println("Кнопка нажата " + clickCount + " раз.");
    }
}

