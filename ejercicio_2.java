import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        //variables
        Scanner sc = new Scanner(System.in);
        int tam = 10;
        int [][] matriz = new int[tam][tam];
        int MDP = 1;
        int MDS = 1;
        
        //FOR PARA AGREGAR DATOS A LOS ARRAYS
        for(int i=0 ; i < matriz.length ; i++){
            for(int j=0 ; j < matriz.length ; j++){
                //metodo con numeros aleatorios

                int n = (int) (Math.random()*9 + 1) ;
                matriz[i][j] = n;
                System.out.println("Ingrese el valor de la posicion : ["+i+"]["+j+"] = "+n);

                //metodo para ingrear por teclado

                //System.out.print("Ingrese el valor de la posicion : ["+i+"]["+j+"] = ");
                //matriz[i][j] = sc.nextInt();
                
                //CONDICIONALES
                //condicional para la diagonal Principal
                if(i == j){
                    //Multiplicacion de la diagonal Principal
                    MDP += matriz[i][j];
                //condicional para la diagonal Secundaria
                }else if(i + j == (matriz.length - 1)){
                    //Multiplicacion de la diagonal Secundaria
                    MDS += matriz[i][j];
                }
            }
        }  
        
        System.out.println("=========================================");

        //IMPRIMIR LA MATRIZ
        for(int i=0 ; i < matriz.length ; i++){
            System.out.println(Arrays.toString(matriz[i]));
        } 
        
        //MOSTRAR EL RESULTADO
        System.out.println("=========================================");
        System.out.println("La multiplicacion de la diagonal primaria es : " + MDP);
        System.out.println("La multiplicacion de la diagonal secundaria es : " + MDS);
    }
}
