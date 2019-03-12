/**
 * Métodos para convertir unidades de longitud del sistema británico a kilómetros del sistema métrico
 * Esta clase implementa los métodos para convertir millas, estadios, cadenas, barras, yardas, pies y manos
 * a kilómetros.
 * @author: Equipo JAVIER TUR GARC�A Proyecto colavorativo clase MGCSS-Universidad de Huelva
 */
package mgcss.conversor;


public class longitud {
    /**
     * Método que convierte millas británicas a kilómetros del sistema métrico
     * @param milla double indica las millas que deseamos convertir
     * @return double valor en kilómetros
     */
    public static double milla(double milla){
              return (milla*1.61);
    }
    // TODO resto de métodos
    
    /**
     * M�todo que convierte estadios a km del sistema m�trico
     * @param estadio
     * @return kms
     */
    public static double estadios(double estadio){
        return (estadio*201.168/1000);
    }
    
    /**
     * M�todo que convierte cadenas brit�nicas a km del sistema m�trico
     * @param cadena
     * @return kms
     */
    public static double cadenas(double cadena){
        return (cadena/0.0201);
    }
    
    /**
     * M�todo que convierte barras brit�nicas a km del sistema m�trico
     * @param barra
     * @return kms
     */
    public static double barras(double barra){
        return (barra/0.0050292);
    }
    
    /**
     * M�todo que convierte yardas brit�nicas a km del sistema m�trico
     * @param yarda
     * @return kms
     */
    public static double yardas(double yarda){
        return (yarda/0.0009);
    }
    
    /**
     * M�todo que convierte pies brit�nicos a km del sistema m�trico
     * @param pie
     * @return kms
     */
    public static double pies(double pie){
        return (pie/0.0003);
    }
    
    /**
     * M�todo que convierte manos brit�nicas a km del sistema m�trico
     * @param mano
     * @return kms
     */
    public static double manos(double mano){
        return (mano/0.0003);
    }
}
