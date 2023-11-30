import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        
        int cont = 0;

        int vec[] = new int[9];
        
        for(int i=0; i<vec.length; i++){
        
            vec[i]=tec.nextInt();
            vec[i]=vec[i]*2;
        }
        
        System.out.print(vec[0]);
        for(int i=1; i<vec.length; i++){
        
            System.out.print(", "+vec[i]);
        }
        
        
    }

}
