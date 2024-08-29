import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RaceLemana24 {
    ArrayList<Car> roaster = new ArrayList<Car>();
    Car winner;

    public Car run() {

        for (Car currentCar : roaster) {
            if (winner != null && (winner.speed * 24 > currentCar.speed * 24)) {
                continue;
            }
            winner = currentCar;
        }

        return winner;
    }

    public void addCarToRoaster(Car car) {
        roaster.add(car);
    }
}
