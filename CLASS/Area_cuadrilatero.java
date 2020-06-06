
package area_cuadrilatero;

public class Area_cuadrilatero {

    public static void main(String[] args) {
        Area M = new Area();
        double D1= M.distancia(-2, -4, 6, -2);
        double D2=M.distancia(-8,2, -2, -4);
        double D3=M.distancia(-8,2, 7, 4);
        double D4=M.distancia(7,4, 6,-2);
        
        double Area = M.area(D1, D2, D3, D4);
        
        System.out.println(Area);
          }
    
}
