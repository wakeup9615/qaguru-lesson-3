package quru.qa;

import java.util.Locale;

public class Base { //класс - это синоним тип данных
    //примитивные типы данных
    boolean bool = true; //это не переменная, а поле класса. Переменная внутри метода
    char character = 'c';
    byte aByte = 0;
    short aShort = 0;
    int anInt = 0;
    long aLong = 0;

    //для вычислений лучше не использовать, только для хранения данных
    float aFloat = 0.0F;
    double aDouble = 0.0;

    String aString = "Hello";

    void method() {
        String upper = aString.toUpperCase();
        System.out.println(upper);
    }

    int[] arr = new int[]{1, 2, 3};

    void someMethod() {
        //арифм операторы
        int result = 1 + 4;
        int result0 = 1 - 4;
        int result1 = 10 / 3;
        int result2 = 10 % 3;
        int result4 = 10 * 3;

        //логические операторы
        boolean result5 = 3 > 2;
        boolean result6 = 3 >= 2;
        boolean result7 = 3 < 2;
        boolean result8 = 3 <= 2;
        boolean result9 = 3 != 2;
        boolean result10 = 3 == 2;
        boolean result11 = !(3 > 2);

        boolean result12 = ((3 > 2) && (4 > 2)); //если первое выр-е ложь, то второе не будет вычисляться
        boolean result13 = ((3 > 2) || (4 > 2));


        String str = null;

        //условия
        //в самих тесах не должно быть условий
        if (str != null && str.length() == 3) { //в случае одного & во втором выр-е будет NullPointerException если в
            // строке будет null, поэтому его не вычисляют
            System.out.println(str);
        }

        if (str != null && str.length() == 3) { //в случае одного & во втором выр-е будет NullPointerException если в
            // строке будет null, поэтому его не вычисляют
            System.out.println(str);
        } else {
            System.out.println("");
        }

        if (str != null && str.length() == 3) { //в случае одного & во втором выр-е будет NullPointerException если в
            // строке будет null, поэтому его не вычисляют
            System.out.println(str);
        } else if (str != null && str.length() == 3) {
            System.out.println("");
        } else{

        }
    }

    void someMethod0() {
        int result = 1 + 4;
        int result0 = 1 - 4;
    }
}
