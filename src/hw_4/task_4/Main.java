package hw_4.task_4;

import hw_4.task_1.Person;

//Классу из 'Task 1' добавьте статическое приватное поле text = "Hello from static". Создайте в этом же классе метод,
//который бы выводил на экран это поле и метод, при помощи которого можно изменить значение этого поля.
//В другом классе, с методом main создайте несколько экземпляров класса из 'Task 1'. В одном из них измените значение
//поля 'text' и затем выведите на экран поле 'text' у всех созданных классов. Подумайте почему так.
public class Main {
    public static void main(String[] args) {
        Person mika = new Person("Mika",22);
        Person nika = new Person("Nika", 15);

//        nika.print();

        mika.setText("New text");

        nika.print();
    }
}
