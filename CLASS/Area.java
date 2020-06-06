/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area_cuadrilatero;

/**
 *
 * @author alex
 */
public class Area {
    
    public Area(){
        
    }
      public  double area(double lado1,double lado2,double lado3,double lado4){
   
      double P;
      
      P = (lado1+lado2+lado3)/2;
      
      double area = Math.sqrt(P*(P-lado1)*(P-lado2)*(P-lado3)*(P-lado4));
      
      return area;
  
  }
  public double distancia(double x1,double x2,double y1,double y2){
      
      double  difX=x2-x1;
      double  dify=y2-y1;
      double dist;
      dist = Math.sqrt(Math.pow(difX, 2)+Math.pow(dify, 2));
      
     return dist ; 
  }
}
