
public class BandMatrix {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        boolean space = false;

        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n; j++){
                if (space) {
                    System.out.print("  ");
                }
                if(j <= i + width && j >= i - width){
                    System.out.print("*");
                }
                else{
                    System.out.print("0");
                }
                space = true;
            }
            System.out.print("\n");
            space = false;
        }
    }
}
