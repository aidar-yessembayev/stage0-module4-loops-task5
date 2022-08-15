package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        if (sideLength != 0) {
            
            int check = (sideLength / 2) + 1;

            for (int i = 1; i <= sideLength; i++) {
                if (i == check) {
                    for (int j = 1; j <= sideLength; j++) {
                        System.out.print("8");
                    }
                } else {
                    for (int j = 1; j <= sideLength; j++) {
                        if (j == check) {
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
