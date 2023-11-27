package ua.hillel.azimova.lessons.lesson2;

public class Main {
    public static void main(String[] args) {

        /*
        типи даних
         */

        byte agePerson;

        byte agePerson2 = 25;

//        System.out.println(agePerson2);

        short shortVariable = 32555;

        int intVariable = 214000000;

        long longVariable = 21470000000000L;

        float floatVariable = 11.11111111111111F;

        double doubleVariable = 11.11111111111111;

//        System.out.println(floatVariable);
//        System.out.println(doubleVariable);

        char charA = 'A';
        char charA2 = 65;
        char charA3 = '\u0041';
        char charA4 = '\u0407';
        char charA5 = '\u0809';
        char charA6 = '\u17A4';
        char charA7 = '\u00b0';

//        System.out.println(charA);
//        System.out.println(charA2);
//        System.out.println(charA3);
//        System.out.println(charA4);
//        System.out.println(charA5);
//        System.out.println(charA6);
//        System.out.println("проект");
//        System.out.println(charA7);

//        boolean isOk = true;
//
//        System.out.println(isOk);
//
//        boolean isOk2 = false;
//
//        System.out.println(isOk2);

        int age = 30;
        String name = "Den";
        name = "dhgihs";

        System.out.println(age);
        System.out.println(name);

        /*
        int (та інші помаранчеві - примітивні типи данних (stock) з маленької літери)
        Integer (ревференсні типи данних(типу бездонна папка) (heap) усі з великої літери)
        все може бути як стоком так і хіпом. назва та сама,різниця в розмірі першої букви.
        Але int це Integer. А char це Character.
         */

        int a = 25;
        Integer a2 = 25;

        byte byteVariable = 25;
//        short shortVar = byteVariable;
        long longVar = byteVariable;

        double doubleVar = byteVariable;

//        System.out.println(doubleVar);

        int intVar = 127;
        byte byteVar = (byte) intVar;

//        System.out.println(byteVar);

        int intVar2 = 128;
        byte byteVar2 = (byte) intVar2;

//        System.out.println(byteVar2);

        int intVar3 = 129;
        byte byteVar3 = (byte) intVar3;

//        System.out.println(byteVar3);

//        128 перевищує, з 129 починається відрахування назад,
//        так само і в іншу сторону:

        int intVar4 = -129;
        byte byteVar4 = (byte) intVar4;

//        System.out.println(byteVar4);
//        double переходячи в int втрачаэ дробь. не заокруглюэться

        System.out.println(1 + 1 + "gwe");
        System.out.println("qwe" + 1 + 1);
        System.out.println(1 + (1 + "qwe"));
        System.out.println("qwe" + (1 + 1));

        char ch = '\'';
        char ch2 = '\"';
        char ch3 = '\\';

        System.out.println(ch);
        System.out.println(ch2);
        System.out.println(ch3);



    }
}
