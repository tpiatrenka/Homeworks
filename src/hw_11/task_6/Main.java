package hw_11.task_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Есть ArrayList и LinkedList на 100К одинаковых элементов.
//Нужно написать бенчмарк, который бы показал скорость удаления из НАЧАЛА у двух этих листов
//Удалить нужно все элементы
public class Main {
    public static void main(String[] args) {
        List<Integer> arrayNumbers = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            arrayNumbers.add(i);
        }

        //delete from the start ArrayList
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            arrayNumbers.remove(0);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList time = " + (end - start));

        List<Integer> linkedListNumbers = new LinkedList<>();
        for (int i = 0; i < 100_000; i++) {
            linkedListNumbers.add(i);
        }
        start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            linkedListNumbers.remove(0);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList time = " + (end - start));
    }
}
