
/**
 * La clase matematico es la tercera tarea.
 * 
 * @author (Lisandro Vargas Muñoz ) 
 * @version (22/04/2021)
 */
public class MatematicoV2
{
    private String nombreMatematico;
    private Calculadora calculadora;
    /**
     * Constructor para asignar el nombre
     */
    public MatematicoV2(String nombre)
    {
        nombreMatematico = nombre;
        calculadora = new Calculadora();
    }

    /**
     * este metodo calcula las soluciones de una ecuacion de 2do Grado
     */
    public String calcularEcuacion(int a, int b,int c)
    {
        String resultado;
        resultado = calculadora.calcularEcuacion(a,b,c);
        return resultado;
    }
    
    /**
     * este metodo obtiene la ecuacion de la recta 
     */
    public String EncontrarEcuacionDeLaRecta(int x, int y, int i,int j)
    {
        String resultado;
        resultado = calculadora.EncontrarEcuacionDeLaRecta(x,y,i,j);
        return resultado;
    }
    
    /**
     * este metodo obtiene el cateto faltante 
     */
    public double CatetoFatante(double h, double c1)
    {
        double resultado;
        resultado = calculadora.CatetoFatante(h,c1);
        return resultado;
    }
}