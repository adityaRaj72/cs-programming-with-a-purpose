public class GreatCircle {
    public static void main(String args[]){
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        double r = 6371.0;

        double siny = Math.sin((y2-y1)/2);
        double sinx = Math.sin((x2-x1)/2);
        siny = siny * siny;
        sinx = sinx * sinx;
        double cx1 = Math.cos(x1);
        double cx2 = Math.cos(x2);
        double exp = sinx + (cx1 * cx2 * siny);
        exp = Math.sqrt(exp);
        exp = Math.asin(exp);
        exp = 2 * r * exp;

        System.out.println(exp + " kilometers");
    }
}