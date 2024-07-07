public class RightTriangle {
    public static void main(String args[]){
        long a = Long.parseLong(args[0]);
        long b = Long.parseLong(args[1]);
        long c = Long.parseLong(args[2]);

        boolean isPositive = (a > 0) && (b > 0) && (c > 0);
        
        boolean firstTry = (a * a) == ((b * b) + (c * c));
        boolean secondTry = (b * b) == ((a * a) + (c * c));
        boolean thirdTry = (c * c) == ((b * b) + (a * a));

        boolean satisfy = firstTry || secondTry || thirdTry;
        boolean isRightTriangle = isPositive && satisfy;

        System.out.println(isRightTriangle);
    }
}