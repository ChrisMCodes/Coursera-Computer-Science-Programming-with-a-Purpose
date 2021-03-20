public class RightTriangle {
    public static void main(String[] args) {
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        int third = Integer.parseInt(args[2]);

        boolean firstCondition = first > 0 && second > 0 && third > 0;
        boolean secondCondition = first * first + second * second == third * third ||
                second * second + third * third == first * first ||
                third * third + first * first == second * second;

        System.out.println(firstCondition &&
                secondCondition);
    }
}
