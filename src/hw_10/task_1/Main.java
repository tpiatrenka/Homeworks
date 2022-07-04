package hw_10.task_1;
//Создать обобщенный (generic) класс, который в конструкторе принимает аргумент неизвестного типа. Создайте в классе метод,
//который бы выводил что это за тип на экран (получить имя класса для переменной getClass().getName())
public class Main {
    public static void main(String[] args) {
        Box c = new Box(new Toy());
        c.printType();
    }
}
