import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lab1java {
    public static void main(String[] args) {
        System.out.println("\nЛабораторна робота №1\nВиконала студентка групи КМ-21 Марченко Єва\nДодатковий варіант 2\n");

        // Створення списку з числами різних типів
        List<Number> numbers = new ArrayList<>();
        numbers.add(10);       // Integer
        numbers.add(20.5);     // Double
        numbers.add(30);       // Integer
        numbers.add(40.7);     // Double
        numbers.add(50);       // Integer
        numbers.add(60.3);     // Double
        numbers.add(70);       // Integer
        numbers.add(80.1);     // Double
        numbers.add(90);       // Integer
        numbers.add(100.9);    // Double

        
        System.out.println("Початкові числа:");
        for (Number number : numbers) {
            System.out.println(number);
        }

    
        System.out.println("\nВиведення цілих чисел:");
        for (Number number : numbers) {
            System.out.println(number.intValue());
        }

    
        System.out.println("\nВиведення чисел у форматі дробних чисел з 2 знаками після коми:");
        for (Number number : numbers) {
            System.out.printf("%.2f\n", number.doubleValue());
        }

        //Розподіл чисел за типами
        Map<String, List<Number>> categorizedNumbers = new HashMap<>();
        categorizedNumbers.put("Integer", new ArrayList<>());
        categorizedNumbers.put("Double", new ArrayList<>());

        for (Number number : numbers) {
            if (number instanceof Integer) {
                categorizedNumbers.get("Integer").add(number);
            } else if (number instanceof Double) {
                categorizedNumbers.get("Double").add(number);
            }
        }

        // Виведення чисел за типами
        System.out.println("\nВиведення чисел за типами:");
        System.out.println("Integers: " + categorizedNumbers.get("Integer"));
        System.out.println("Doubles: " + categorizedNumbers.get("Double"));

        // додаткове завдання, варіант 2. обчислення суми всіх чисел
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }

        System.out.println("\nСума: " + String.format("%.2f", sum));
    }
}

