import figures.*;

import java.util.Arrays;

public class ClassesManager {

    Figure[] f;

    public static double totalSum(Figure[] f) {
        double sum = 0;
        for(int i = 0; i < f.length; i++){
            sum += f[i].area();
        }
        return sum;
    }

    public static void sort(Figure[] f) {
        Arrays.sort(f);
    }


    public static void main(String[] args) {

        Figure[] fig = new Figure[4];

        fig[0] = new Circle(1);
        fig[1] = new Rectangle(4,5);
        fig[2] = new Square(6);
        fig[3] = new TriangleRectangle(1,2);

        double sum = ClassesManager.totalSum(fig);

        System.out.println(Arrays.asList(fig));
        ClassesManager.sort(fig);
        System.out.println(Arrays.asList(fig));

    }
}