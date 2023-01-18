package guru.qa;

import java.util.*;

public class Main {
    public static void main(String... args) {
        // Типы данных
        // логический
        boolean varBoolean = false;
        // целочисленные
        byte varByte = 100; // -128 ... 127  (-2 ^ 7 ... (2 ^ 7) -1)
        short varShort = 1000; // -321768  ... 321767
        int varInt = 1;
        long varLong = -1L;
        // символ (под капотом тоже число)
        char varChar = 'f';
        //  числа с плавающей точкой
        float varFloat = 1.01F;
        double varDouble0 = 36.0;
        String varString0 = "Selenide";
        String varString1 = "Selenide";

        int coinNominal = 3;
        String coinCurrency = "RUB";

        // Операторы
        // Операторы математические
        int result = 10;
        result = result + 1;
        result +=  1;
        result = ++result;

        // Операторы сравнения
        // > < >= <= == !=

        // Логические операторы
        // && || !, ^
        if (coinCurrency.equals("RUB")) {
            System.out.println("Это рубль!");
        } else if (coinCurrency.equals("USD")) {
            System.out.println("Это долар!");
        } else {
            System.out.println("Ничего не подошло");
        }

        switch (coinCurrency) {
            case "RUB": {
                System.out.println("Это рубль!");
                break;
            }
            case "USD": {
                System.out.println("Это долар!");
                break;
            }
            default: {
                System.out.println("Ничего не подошло");
            }
        }

        byte varByte0 = -65;
        short varShort0 = 32765;
        int varInt0 = 1073741824;
        long varLong0 = -2147483648L;

        float varFloat0 = 13.12F;
        double varDouble = 0.892469310453633;

        System.out.println(String.format("Integer overflow example: %d * 2 = %d", varInt0, varInt0 * 2));
        System.out.println(String.format("Byte overflow example: %d * 2 = %d", varByte0, (byte) (varByte0 * 2)));

        System.out.println("Enter math operator");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        switch (str) {
            case "+": {
                System.out.println((byte) (varByte + varByte0));
                System.out.println(varShort + varShort0);
                System.out.println(varInt + varInt0);
                System.out.println(varLong + varLong0);
                System.out.println(varFloat + varFloat0);
                System.out.println(varDouble + varDouble0);
                break;
            }
            case "-": {
                System.out.println((byte) (varByte - varByte0));
                System.out.println(varShort - varShort0);
                System.out.println(varInt - varInt0);
                System.out.println(varLong - varLong0);
                System.out.println(varFloat - varFloat0);
                System.out.println(varDouble - varDouble0);
                break;
            }
            case "*": {
                System.out.println((byte) (varByte * varByte0));
                System.out.println(varShort * varShort0);
                System.out.println(varInt * varInt0);
                System.out.println(varLong * varLong0);
                System.out.println(varFloat * varFloat0);
                System.out.println(varDouble * varDouble0);
                break;
            }
            case "/": {
                System.out.println(varByte > varByte0 ? (byte) (varByte / varByte0) : (byte) (varByte0 / varByte));
                System.out.println(varShort > varShort0 ? varShort / varShort0 : varShort0 / varShort);
                System.out.println(varInt > varInt0 ? varInt / varInt0 : varInt0 / varInt);
                System.out.println(varLong > varLong0 ? varLong / varLong0 : varLong0 / varLong);
                System.out.println(varFloat / varFloat0);
                System.out.println(varDouble / varDouble0);
                break;
            }
            case "%": {
                System.out.println(varByte % varByte0);
                System.out.println(varShort % varShort0);
                System.out.println(varInt % varInt0);
                System.out.println(varLong % varLong0);
                break;
            }
            default:
                System.out.println("Unsupported operation type");
        }

        String[] arrayStr = new String[] {"Dima", "Vasya"};

        int[] array = {100, 150 , -1, 90, 80, 345, 43534};

        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                continue;
            }
            // Сложное вычисление
            System.out.println("Радуемся, нашли: " + array[i]);
            break;
        }

        for (int i = array.length - 1;  i >= 0  ; i--) {
            System.out.println(array[i]);
        }

        for (int var : array) {
            System.out.println(var);
        }


        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);


        List<Integer> stringList = new ArrayList<>();
        stringList.add(12); //boxing
        stringList.addAll(Arrays.asList(34, 3534));


        for (int var : stringList) { //unboxing
            System.out.println(var);
        }

        for (int i = stringList.size() - 1;  i >= 0  ; i--) {
            System.out.println(stringList.get(i));
        }

        Set<Integer> stringSet = new HashSet<>();
        stringSet.add(1);
        stringSet.add(10);

        Map<Integer, Human> aMap = new HashMap<>();
        aMap.put(3434343, new Human("Dima", 33, "M"));
        aMap.put(2342323, new Human("Petr", 30, "M"));
        aMap.put(4535355, new Human("Ivan", 20, "M"));

        Set<Integer> passportNumbers = aMap.keySet();
        Collection<Human> humans = aMap.values();
        Set<Map.Entry<Integer, Human>> entrySet = aMap.entrySet();

        for (Map.Entry<Integer, Human> entry : entrySet) {
            if (entry.getKey() == 2342323) {
                System.out.println("Нашли Петра: " + entry.getValue().getName());
            }
        }
    }


    public static String someMethod(String... args) {
        return "" ;
    }
}
