import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

public class WeekOne {
    public static void exerciseOne(String msg) {
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
    public static void exerciseTwo() {
        long current = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar: " + calendar);
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
    public static void exerciseThree() {
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
    public static void exerciseFour(int a, int b) {
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
    public static void exerciseFive() {

    }

    /**
     * Cree un programa que pida al usuario dos nombres, dos apellidos y una fecha
     * de cumpleaños esta fecha puede ser ingresada en el formato “YYY-MM-DD” y
     * luego de obtener la información desplegarla en la consola, si el cumpleaños
     * de la persona es el mismo día que se ingreso la fecha de cumpleaños, en la
     * consola deberá agregar el siguiente mensaje: “Feliz Cumpleaños!!” al final de
     * la información.
     */
    public static void exerciseSix() {

    }

    /**
     * Cree un programa que pida un numero al usuario y como resultado imprima si el
     * numero obtenido es un numero perfecto o no.
     * 
     * @param number
     */
    public static void exerciseSeven(int number) {
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
    public static void exerciseEight(int number) {

    }

    /**
     * Cree un programa que pida al usuario un monto en dólares y su programa
     * muestre el resultado de convertir esos dólares a bitcoins. Considere que el
     * cambio esta a (1USD = 0.000018 Bitcoin), debe tener en cuenta que el usuario
     * podrá ingresar números flotantes o números enteros.
     * 
     * @param number
     */
    public static void exerciseNine(float number) {

    }

    /**
     * Cree un programa con una función llamada “Fibonacci” que reciba un numero
     * como parámetro y devuelva el resultado de la secuencia correspondiente para
     * dicho número.
     * 
     * @param number
     */
    public static void exerciseTen(int number) {

    }

    /**
     * Cree una función que reciba dos números enteros y devuelva la multiplicación
     * de ellos, sin utilizar el operador * (operador de multiplicación)
     * 
     * @param a
     * @param b
     */
    public static void exerciseEleven(int a, int b) {
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
    public static void exerciseTwelve(String str) {
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
    public static void exerciseThirteen(int x1, int y1, int x2, int y2) {

    }

    /**
     * Cree una función que reciba un String, y como resultado devuelva el mismo
     * String al revés, ejemplo: Hola esta es un String => gnirtS un se atse aloH
     * 
     * @param str
     */
    public static void exerciseFourteen(String str) {
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
    public static void exerciseFifteen(String str) {

    }

    /**
     * Cree un programa que pida al usuario el primero y segundo nombre, así como el
     * primer y segundo apellido, y luego despliegue las iniciales en ascci art,
     * cada letra debe estar compuesta por el carácter #
     * 
     * @param name
     */
    public static void exerciseSixteen(String name) {

    }

}
