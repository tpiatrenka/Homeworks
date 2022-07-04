package hw_10.task_3;

public class Garage<C extends Car> {
    private Car car;

    public void putCarInside(C car) {
        this.car = car;
    }
}