public class RandomWalker {
    public static void main(String[] args){
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int cx = 0, cy = 0;
        int steps = 0;
        System.out.println("("+x+", "+y+")");

        while( cx + cy != r){
            double rand = Math.random();
            steps++;
            if(rand < 0.25)
            x++;
            else if(rand < 0.5)
            y--;
            else if(rand < 0.75)
            y++;
            else if(rand < 1)
            x--;

            System.out.println("("+x+", "+y+")");
            if(x < 0) cx =  -x; else cx =  x;
            if(y < 0) cy = -y ; else cy =  y;
        }

        System.out.println("steps = " + steps);
    }
}