package hw_8.task_1;

//Создать метод, который бы делил одно число на другое, обработать исключение при делении на 0.
//И вывести пользователю сообщение о том, что на 0 делить нельзя
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(divide(6, 0));
        } catch (ArithmeticException e) {
            System.out.println("на 0 делить нельзя");
        }
    }

    static int divide(int a, int b) {
        return a / b;
    }
}
