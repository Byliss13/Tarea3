
/**
 * La clase matematico es la tercera tarea.
 * 
 * @author (Lisandro Vargas Muñoz ) 
 * @version (22/04/2021)
 */
public class Calculadora
{
    /**
     * Constructorvacio
     */
    public Calculadora()
    {
        
    }
    
    /**
     * este metodo calcula las soluciones de una ecuacion de 2do Grado
     * la ecuacion es -b +- v/b^2 - 4ac / 2a
     */
    public String calcularEcuacion(int a, int b,int c)
    {
        double solucion = (-(b) + Math.sqrt((b*b)-(4*a*c))) / 2*a;
        String valores = "Solucion 1 = "+solucion+" ,Solucion 2 = "+(-solucion);
        return valores;
    }
    
    /**
     * este metodo obtiene la ecuacion de la recta 
     * Para ello tenemos que saber que la ecuacion de la recta es 
     * y = mx + b
     */
    public String EncontrarEcuacionDeLaRecta(int x, int y, int i,int j)
    {
        double pendiente = (y - j)/(x-i);
        double b  =  (pendiente*x)-y;
        String ecuacion = "y = "+pendiente+"x + "+b;
        return ecuacion;
    }
    
    /**
     * este metodo obtiene el cateto faltante 
     * de un triangulo rectangulo
     * La formula es h^2 = c1^2 + c2^2;
     */
    public double CatetoFatante(double hipotenusa, double cateto1)
    {
        double cateto2;
        cateto2 = Math.sqrt((hipotenusa*hipotenusa)-(cateto1*cateto1));
        return cateto2;
    }
}