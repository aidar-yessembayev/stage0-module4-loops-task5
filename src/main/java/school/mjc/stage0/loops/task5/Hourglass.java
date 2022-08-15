package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height != 0) {
            int cross = height / 2;
            int cross_2 = 0;

            if (height % 2 != 0) {
                cross += 1;
            } else {
                cross_2 = cross + 1;
            }

            int goDown = height;

            for (int i = 1; i <= height; i++) {
                if (i == 1 || i == height) {
                    for (int j = 1; j <= height; j++) {
                        System.out.print("8");
                    }

                    goDown -= 2;

                } else {
                    if (i < cross) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" ");
                        }

                        for (int j = 1; j <= goDown; j++) {
                            System.out.print("8");
                        }

                        for (int j = 1; j < i; j++) {
                            System.out.print(" ");
                        }

                        goDown -= 2;

                    } else if (i == cross) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" ");
                        }

                        for (int j = 1; j <= goDown; j++) {
                            System.out.print("8");
                        }

                        for (int j = 1; j < i; j++) {
                            System.out.print(" ");
                        }

                    } else if (i == cross_2) {
                        for (int j = 1; j < i-1; j++) {
                            System.out.print(" ");
                        }

                        for (int j = 1; j <= goDown; j++) {
                            System.out.print("8");
                        }

                        for (int j = 1; j < i-1; j++) {
                            System.out.print(" ");
                        }

                    } else if (i > cross && i > cross_2) {
                        int till = cross;
                        if (cross_2 > cross) {
                            till = cross_2;
                        }

                        goDown += 2;

                        for (int j = till; j < i; j++) {
                            System.out.print(" ");
                        }

                        for (int j = 1; j <= goDown; j++) {
                            System.out.print("8");
                        }

                        for (int j = till; j < i; j++) {
                            System.out.print(" ");
                        }

                    }
                }
                System.out.println();
            }
        }
    }
}
