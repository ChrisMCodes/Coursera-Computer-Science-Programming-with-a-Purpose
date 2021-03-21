public class BandMatrix {
    public static void main(String[] args) {
        int side = Integer.parseInt(args[0]);
        int range = Integer.parseInt(args[1]);

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                // when j == i, the diagonal is formed
                // to print an *, j must be within range i +/- range
                // because of programming oddities, an int is added/subtracted from each of the terms
                // this can definitely be expressed as an absolute value,
                // but I'll need to think a little deeper to get there
                if (j <= i - range - 1 || j >= i + range + 1) {
                    System.out.print("0  ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }
}
