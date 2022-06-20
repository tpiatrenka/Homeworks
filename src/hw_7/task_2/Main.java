package hw_7.task_2;

//Есть слово “alucard”. Нужно изменить порядок букв на обратный
public class Main {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("alucard");
        StringBuilder reverseStr = string.reverse();
        System.out.println(reverseStr);
    }
}
