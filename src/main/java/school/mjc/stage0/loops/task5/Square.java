package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        if (sideLength != 0) {
            int start = 1;
            int finish = sideLength;

            for (int i = 1; i <= sideLength; i++) {
                if (i == start || i == finish) {
                    for (int j = 1; j <= sideLength; j++) {
                        System.out.print("8");
                    }
                } else {
                    for (int j = 1; j <= sideLength; j++) {
                        if (j == 1 || j == sideLength) {
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
