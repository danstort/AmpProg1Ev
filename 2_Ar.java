import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        
        int cont = 0;

        int vec[] = new int[5];
        
        for(int i=0; i<vec.length; i++){
        
            vec[i]=tec.nextInt();
        }
        
        for(int i=0; i<vec.length; i++){
        
           if(vec[i]>vec[vec.length-1]){
           
               cont++;
               
           }
        }
        
        System.out.print("Hay "+cont+" mayores que el último");
    }

}
