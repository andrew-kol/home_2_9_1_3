package hw1.Task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        cars.put("Mazda", 1);
        cars.put("Nissan", 2);
        cars.put("BMW", 3);
        cars.put("Subaru", 4);
        cars.put("Toyota", 1);

        System.out.println(cars);

        addCars("Honda", 2);
        addCars("Toyota", 1);
        addCars("Mazda", 9);

        System.out.println(cars);

    }
    static Map<String, Integer> cars = new HashMap<>();

    public static void addCars(String string, Integer number) {
        try {
            if (Objects.equals(cars.put(string, number), number)) {
                throw new RuntimeException("Значения совпадают");
            } else {
                cars.put(string, number);
            }
        } catch (RuntimeException e) {
            System.out.println("e = " + e);
        }
    }
}
