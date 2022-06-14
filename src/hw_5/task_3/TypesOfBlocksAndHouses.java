package hw_5.task_3;

//+- Интерейс может называться просто House
public interface TypesOfBlocksAndHouses {
    int getTheFloor(); //обычно в названиях методов артикли опускаются -> getFloor, но метод должен возвращать количество этажей, пэтому еще лучше будет getFloorsNumber 
    boolean turnOnTheHeating(); 
    int getTheNumberOfResidents();
}
