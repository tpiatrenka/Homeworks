package hw_2.taks_4;

public class Main {
    //Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int multi = 0;
        for (int i = 0; i < a; i++) {
            multi += b;
        }
        System.out.println(multi);
    }
}
