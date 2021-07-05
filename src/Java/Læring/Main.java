package Java.Læring;

public class Main {

    public static void main(String[] args) {
        int myValue = 1000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value = " + myMinIntValue);
        System.out.println("Integer maximum value = " + myMaxIntValue);

        System.out.println("Busted max value = " + (myMaxIntValue + 1));
        System.out.println("Busted min value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue= Byte.MAX_VALUE;

        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;

        Long myMaxLongValue = Long.MAX_VALUE;
        Long myMinLongValue = Long.MIN_VALUE;

        System.out.println("Max Byte = " + myMaxByteValue);
        System.out.println("Min Byte = " + myMinByteValue);
        System.out.println("Max Short = " + myMaxShortValue);
        System.out.println("Min Short = " + myMinShortValue);
        System.out.println("Min Long = " + myMinLongValue);
        System.out.println("Max Long = " + myMaxLongValue);


    int myTotal = (myMinIntValue / 2);

    //byte myNewByteValue = (myMinByteValue / 2);
    //Casting
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);



        byte anyByteValue = 100;
        short anyShortValue = 1000;
        int anyIntValue = 10000;
        long specificValue = 50000L + 10L * (anyIntValue + anyShortValue +anyByteValue );
        System.out.println(specificValue);

        //Float  and double: Float single precision & Double double precision
        //Float 32 bits & double 64 bits

    float myMinFloatValue = Float.MIN_VALUE;
    float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        Double myMinDoubleValue = Double.MIN_VALUE;
        Double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double pounds = 200d;
        double poundsToKg = pounds * 0.45359237;
        System.out.println("Converted kilograms= " + poundsToKg);














    }
}
