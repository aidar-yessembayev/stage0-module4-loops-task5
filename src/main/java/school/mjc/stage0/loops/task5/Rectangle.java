package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        if (height == 0) {
            System.out.println("");

        } else {
            int start = 1;
            int finish = height;

            for (int i = 1; i <= height; i++) {
                if (i == start || i == finish) {
                    for (int j = 1; j <= length; j++) {
                        System.out.print("8");
                    }
                } else {
                    for (int j = 1; j <= length; j++) {
                        if (j == 1 || j == length) {
                            System.out.print("8");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
