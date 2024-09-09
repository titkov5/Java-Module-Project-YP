import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RaceLemana24 race = new RaceLemana24();

        int carCount = 3;
        int index = 1;

        while (index <= carCount ) {
            System.out.println("— Введите название машины №" + index + ":");
            String carName = sc.nextLine();

            int speed;
            while (true)
            {
                System.out.println("— Введите скорость машины №" + index + ":");
                // вводим строку
                String line = sc.nextLine();
                try {
                    speed = Integer.parseInt(line);
                    if (speed > 0 && speed <= 250) {
                        break;
                    }
                }
                catch (NumberFormatException ignored)  {
                }
            }

            Car car = new Car(carName, speed);
            race.addCarToRoaster(car);
            index++;
        }

        Car winner = race.run();
        System.out.println("Самая быстрая машина: " + winner.name);
    }
}
