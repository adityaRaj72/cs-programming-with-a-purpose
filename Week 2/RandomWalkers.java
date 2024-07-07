public class RandomWalkers {
    public static void main(String[] args){
        int r = Integer.parseInt(args[0]);
        int turns = Integer.parseInt(args[1]);
        int x = 0;
        int y = 0;
        int cx = 0, cy = 0;
        long steps = 0;
        double avr;

        for(int i = 0; i < turns; i++){
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

                if(x < 0) cx =  -x; else cx =  x;
                if(y < 0) cy = -y ; else cy =  y;
            }
            x = 0; cx = 0;
            y = 0; cy = 0;
        }

        avr = (double)steps / turns;
        System.out.println("average number of steps = " + avr);
    }
}
