import java.util.Scanner;
public class Main { public static void main(String[] args) { // 1. Вывод информации о типах System.out.println("--- Інформація про типи даних ---"); System.out.println("byte: розмір=" + Byte.BYTES + " байт, min=" + Byte.MIN_VALUE + ", max=" + Byte.MAX_VALUE); System.out.println("short: розмір=" + Short.BYTES + " байт, min=" + Short.MIN_VALUE + ", max=" + Short.MAX_VALUE); System.out.println("int: розмір=" + Integer.BYTES + " байт, min=" + Integer.MIN_VALUE + ", max=" + Integer.MAX_VALUE); System.out.println("long: розмір=" + Long.BYTES + " байт, min=" + Long.MIN_VALUE + ", max=" + Long.MAX_VALUE); System.out.println("float: розмір=" + Float.BYTES + " байт, min=" + Float.MIN_VALUE + ", max=" + Float.MAX_VALUE); System.out.println("double: розмір=" + Double.BYTES + " байт, min=" + Double.MIN_VALUE + ", max=" + Double.MAX_VALUE); System.out.println("char: розмір=" + Character.BYTES + " байт, min=" + (int) Character.MIN_VALUE + ", max=" + (int) Character.MAX_VALUE); System.out.println("boolean: значення=" + Boolean.TRUE + " / " + Boolean.FALSE);
    System.out.println();

    // 2. Считывание и конвертация
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введіть ціле число (int): ");
    String intStr = scanner.nextLine();
    int intVal = Integer.parseInt(intStr);
    System.out.println("Отримано int: " + intVal);

    System.out.print("Введіть дробове число (double): ");
    String doubleStr = scanner.nextLine();
    double doubleVal = Double.parseDouble(doubleStr);
    System.out.println("Отримано double: " + doubleVal);

    System.out.print("Введіть булеве значення (true/false): ");
    String boolStr = scanner.nextLine();
    boolean boolVal = Boolean.parseBoolean(boolStr);
    System.out.println("Отримано boolean: " + boolVal);
}
}
