
package pi;

import java.util.Scanner;


public class PI {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
 
        int n=entrada.nextInt();  
       float P=(float) 0.0; 
 
for(int i=0;i<n;i++){
    if(i%2==0){
        P=P+((float)4/(float)((2*i)+1));
       // System.out.print(P+" "+(float)4/((2*i)+1)+" ");
    }else{
        P=P -((float)4/((2*i)+1));
        //System.out.print(P+" "+ (float)4/(float)((2*i)+1)+" ");
    }      
 }
        System.out.print(P);

    }
}