package hw_11.task_10;

public class Fruits {
    private String name;
    private Integer kg;

    public Fruits(String name, Integer kg) {
        this.name = name;
        this.kg = kg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getKg() {
        return kg;
    }

    public void setKg(Integer kg) {
        this.kg = kg;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", kg=" + kg +
                '}';
    }
}
