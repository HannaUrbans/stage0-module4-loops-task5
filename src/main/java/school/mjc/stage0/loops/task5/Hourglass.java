package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void printHourglassOfGivenSize(int height) {
        int a;

        if (height % 2 != 0) {a=height / 2 + 1;}
        else {a=height/2;}
//верхний перевернутый треугольник
            for (int i = 0; i < a; i++) {
                // пробелы (часть слева только, до 8!0-1-2...)
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                // одновременнно пишем цифры
                for (int k = 0; k < height - i * 2; k++) {
                    System.out.print(8);
                }
                for (int z = 0; z < i; z++) {
                    System.out.print(" ");
           }
                System.out.println();
            }
            //нижний треугольник
        if (height % 2 != 0){
            for (int i = 2; i <= a; i++) {
                // пробелы 5-4-3....
                for (int j = a; j > i; j--) {
                    System.out.print(" ");
                }
                // цифры
                for (int k = 0; k < i * 2 - 1; k++) {
                    System.out.print(8);
                }
                for (int z = a; z > i; z--) {
                    System.out.print(" ");
                }
                System.out.println();
            }}
        else { for (int i = 1; i <= a; i++) {
                // пробелы 5-4-3....
                for (int j = a; j > i; j--) {
                    System.out.print(" ");
                }
                // цифры
                for (int k = 0; k < i * 2 ; k++) {
                    System.out.print(8);
                }
                for (int z = a; z > i; z--) {
                    System.out.print(" ");
                }
                System.out.println();}}

    }

    public static void main(String[] args) {
        int height = 6;
        printHourglassOfGivenSize(height);
    }
}