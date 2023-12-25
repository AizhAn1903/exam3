package exercise2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Первая строка с пробелом: ");
        String inputNum1 = scanner.nextLine();
        String[] num1 = inputNum1.split(" ");

        System.out.print("Вторая строка с пробелам ");
        String inputNum2 = scanner.nextLine();
        String[] num2 = inputNum2.split(" ");

        Set<String> numbers = new HashSet<>();
        Set<String> resultSet = new HashSet<>();

        for (String num : num1) {
            numbers.add(num);
        }

        for (String num : num2) {
            if (numbers.contains(num)) {
                resultSet.add(num);
            }
        }

        System.out.println("Все числа в строке: " + resultSet);
    }
    }

