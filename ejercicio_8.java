import java.util.Arrays;
import java.util.Scanner;

/* EJERCICIO: MATRIZ DE 10X1O INGRESADO POR TECLADO QUE SUME TODAS LA FILAS PARES DE LA MATRIZ */
public class ejercicio_8 {
    public static void main(String[] args) {
        //variables
        Scanner sc = new Scanner(System.in);
        int tam = 4;
        int [][] matriz = new int[tam][tam];
        int [] SFP = new int [tam];
        
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

                //suma de filas pares
                if(i % 2 == 0 && i != 0){
                    SFP[i] += matriz[i][j];
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
        for(int i=0 ; i < matriz.length ; i++){
            if(i % 2 == 0 && i != 0){
                System.out.println("La suma de la Filas pares "+i+" es : "+SFP[i]);
            }
        }
    }
}
