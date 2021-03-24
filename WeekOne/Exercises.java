package WeekOne;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Exercises {
    public static void one(String msg) {
        Integer[] numbers = { 0, 1, 2, 3, 4, 5 };

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println(msg);
    }

    /**
     * Cree un programa que al correrlo le diga cuantos segundos quedan para que se
     * termine el día.
     */
    public static void two() {
        long current = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        long tomorrowzero = calendar.getTimeInMillis();
        long tomorrowzeroSeconds = (tomorrowzero - current) / 1000;
        System.out.println("seconds to midnight " + tomorrowzeroSeconds);
    }

    /**
     * Cree un programa que al correrlo le diga que porcentaje del día ha pasado,
     * considera 24hrs como el 100%
     */
    public static void three() {
        LocalDateTime now = LocalDateTime.now();
        Double dayPercentage = (Double.valueOf(now.getHour()) / 24) * 100;
        System.out.println("Porcentaje del día transcurrido: " + dayPercentage + "%");

    }

    /**
     * Cree un programa que dado 2 enteros positivos (a y b) calcule la hipotenusa
     * (c).
     * 
     * @param a
     * @param b
     */
    public static void four(int a, int b) {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("La hipotenusa es: " + df.format(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))));
    }

    /**
     * Usted debe crear un programa con una función que emule ser una compuerta
     * lógica de tipo XOR, considere el valor 0 como “FALSO” y el valor 1 como
     * “VERDADERO”.
     * 
     * La salida del programa debe de ser la tabla de la compuerta, imprimiendo los
     * parámetros enviados a su función y el resultado de la función.
     */
    public static void five(int x, int y) {
        boolean a = false;
        boolean b = false;

        if (x == 1) {
            a = true;
        }
        if (y == 1) {
            b = true;
        }

        boolean isTrue = a ^ b;
        if (isTrue) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    /**
     * Cree un programa que pida al usuario dos nombres, dos apellidos y una fecha
     * de cumpleaños esta fecha puede ser ingresada en el formato “YYY-MM-DD” y
     * luego de obtener la información desplegarla en la consola, si el cumpleaños
     * de la persona es el mismo día que se ingreso la fecha de cumpleaños, en la
     * consola deberá agregar el siguiente mensaje: “Feliz Cumpleaños!!” al final de
     * la información.
     */
    public static void six() {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(is);

        String name = "";
        String lastname = "";
        String sBirthday = "";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = new Date();
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        Calendar currentDate = Calendar.getInstance();

        try {
            System.out.println("Ingrese sus nombres");
            name = bfr.readLine();
            System.out.println("Ingrese sus apellidos");
            lastname = bfr.readLine();
            System.out.println("Ingrese su fecha de nacimiento en este formato YYYY-MM-DD");
            sBirthday = bfr.readLine();

        } catch (Exception e) {
            System.out.println("Ocurrió un error, intente de nuevo");
        }

        try {
            birthday = formatter.parse(sBirthday);
            calendar.setTime(birthday);
            currentDate.setTime(today);
        } catch (Exception e) {
            System.out.println("Error with birthday");
        }

        if ((calendar.get(Calendar.MONTH) + 1) == (currentDate.get(Calendar.MONTH) + 1)
                && calendar.get(Calendar.DAY_OF_MONTH) == currentDate.get(Calendar.DAY_OF_MONTH)) {
            System.out.println("************************" + "\n" + name + "\n" + lastname + "\n"
                    + formatter.format(birthday) + "\n" + "Feliz cumpleaños!");
        } else {
            System.out.println(
                    "************************" + "\n" + name + "\n" + lastname + "\n" + formatter.format(birthday));
        }
    }

    /**
     * Cree un programa que pida un numero al usuario y como resultado imprima si el
     * numero obtenido es un numero perfecto o no.
     * 
     * @param number
     */
    public static void seven(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            System.out.println(number + " es un número perfecto");
        } else {
            System.out.println(number + " no es un número perfecto");
        }
    }

    /**
     * Dado un número, calcule la suma de todos los números anteriores hasta él y
     * despliegue el resultado. Ejemplo 10, 1 + 2+ 3+ 4+5+6+7+8+9+10 = 55
     * 
     * @param number
     */
    public static void eight(int number) {
        String result = "";
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            if (i == number)
                result += i;
            else
                result += i + " + ";
            sum += i;
        }
        System.out.println("result " + result + " = " + sum);
    }

    /**
     * Cree un programa que pida al usuario un monto en dólares y su programa
     * muestre el resultado de convertir esos dólares a bitcoins. Considere que el
     * cambio esta a (1USD = 0.000018 Bitcoin), debe tener en cuenta que el usuario
     * podrá ingresar números flotantes o números enteros.
     * 
     */
    public static void nine() {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(is);

        System.out.println("Ingrese el monto en dólares que desea convertir a Bitcoin");
        double dollars = 0;
        try {
            dollars = Double.valueOf(bfr.readLine());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Ocurrion un error al ingresar su nombre, intente de nuevo");
        }
        System.out.println("El monto $" + dollars + " es igual a " + (dollars * 0.000018) + " Bitcoins");
    }

    /**
     * Cree un programa con una función llamada “Fibonacci” que reciba un numero
     * como parámetro y devuelva el resultado de la secuencia correspondiente para
     * dicho número.
     * 
     * @param number
     */
    public static int ten(int number) {
        if (number <= 2) {
            return 1;
        }
        return ten(number - 1) + ten(number - 2);
    }

    /**
     * Cree una función que reciba dos números enteros y devuelva la multiplicación
     * de ellos, sin utilizar el operador * (operador de multiplicación)
     * 
     * @param a
     * @param b
     */
    public static void eleven(int a, int b) {
        int bigger = a > b ? a : b;
        int smaller = a > b ? b : a;
        int result = 0;
        int base = 1;

        while (base <= bigger) {
            result += smaller;
            base++;
        }
        System.out.println("El resultado de " + a + "x" + b + " es: " + result);
    }

    /**
     * Cree una función que reciba un String y devuelva el length del String sin
     * utilizar la propiedad length de la clase String.
     * 
     * @param str
     */
    public static void twelve(String str) {
        int length = 0;
        char[] strToCharArray = str.toCharArray();
        for (char c : strToCharArray) {
            length++;
        }
        System.out.println("El length de " + str + " es: " + length);
    }

    /**
     * Cree un método que reciba cuatro parámetros (x1, y1) , (x2, y2) , estos
     * parámetros representan un punto, usted debe de calcular la distancia entre
     * los dos puntos
     * 
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    public static void thirteen(int x1, int y1, int x2, int y2) {

    }

    /**
     * Cree una función que reciba un String, y como resultado devuelva el mismo
     * String al revés, ejemplo: Hola esta es un String => gnirtS un se atse aloH
     * 
     * @param str
     */
    public static void fourteen(String str) {
        StringBuilder builder = new StringBuilder();
        builder.append(str);
        System.out.println(str + " => " + builder.reverse());

    }

    /**
     * Cree una función que reciba como parámetro un String y determine si el String
     * es palíndromo o no.
     * 
     * @param str
     */
    public static void fifteen() {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(is);

        String str = "";
        try {
            System.out.println("Ingrese una palabra");
            str = bfr.readLine();
        } catch (Exception e) {
            System.out.println("Ocurrió un error, intente de nuevo");
        }
        String reverseStr = new StringBuilder(str).reverse().toString();

        if (str.equals(reverseStr)) {
            System.out.println("String es palíndrome");
        } else {
            System.out.println("String no es palíndrome");
        }

    }

    /**
     * Cree un programa que pida al usuario el primero y segundo nombre, así como el
     * primer y segundo apellido, y luego despliegue las iniciales en ascci art,
     * cada letra debe estar compuesta por el carácter #
     * 
     * @param name
     */
    public static void sixteen(String name) {

    }
}
