import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int vec[] = new int[8];
        
        for(int i=0; i<vec.length; i++){
        
            vec[i]=tec.nextInt();
        }
        
        for(int i=0; i<vec.length; i++){
        
            System.out.print(vec[i]+" ");
        }
    }

}
