package hw_8.task_2;

import java.util.Scanner;

//Написать метод, который бы парсил строку в число, обработать исключение, которое может быть при неверном формате числа
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(parseInt("123asd"));
        } catch (NumberFormatException e) {
            System.out.println("неверный формат числа");
        }
    }

    static int parseInt(String string) {
        return Integer.parseInt(string);
    }
}
