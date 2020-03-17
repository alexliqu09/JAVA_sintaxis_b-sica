

package pregunta1;

import java.util.Scanner;


public class Pregunta1_0 {

    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.print("Seleccione un valor");
            opcion=entrada.nextInt();
        switch(opcion){
            case 1:break;
            case 2: pregunta2(); entrada.next();System.out.print("save");break;
            case 3: pregunta3();entrada.next();System.out.print("save");break;
            case 4:pregunta4();entrada.next();System.out.print("save");break;
        }
        }while(opcion!=1);
        
        }
      public static void pregunta2(){
          System.out.print("Sexo: ");
        
      }
      public static void pregunta3(){
          System.out.print("nombre: ");
          
      }
      public static void pregunta4(){
          System.out.print("edad: ");
      }
    }


    

