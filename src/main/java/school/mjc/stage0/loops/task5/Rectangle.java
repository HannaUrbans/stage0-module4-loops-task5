package school.mjc.stage0.loops.task5;

public class Rectangle {
    public static void printRectangleFrom8s(int length, int height){
        for (int i=0;i<height;i++) {
            for (int j = 0; j < length; j++) {
                if (i==0 || j==0 || j==length-1 ||i==height-1 )
                {System.out.print(8);}
                else
                {System.out.print(" ");}

            }

            {
                System.out.println();
            }
        }
    }
    public static void main(String[]args)
    {int length=5;
        int height=6;
    printRectangleFrom8s(length,height);}
}
