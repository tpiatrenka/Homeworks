package hw_5.task_2;
//сделать класс Warehouse, внутри которого массив (массив чего придумайте сами). Массив  должен быть immutable
//При создании объекта создается массив, заносятся в него данные, изменять или добавлять значения в массив после  этого  нельзя
//в классе должен быть метод next() который возвращает следующий элемент массива.
//Если дошли до последнего элемента при вызове next(), должно вернуть первый элемент
//также должен быть метод getArray() - который возвращает массив и переопределен метод toString()
public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(new int[]{1, 2, 3});

        System.out.println(warehouse.next());
        System.out.println(warehouse.next());
        System.out.println(warehouse.next());
        System.out.println(warehouse.next());
        System.out.println(warehouse.next());
        System.out.println(warehouse);
        int[] array = warehouse.getArray();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
