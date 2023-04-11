package TerceraEvaluacion;


/**
 * bombilla, cargador, usb
 * 
 * el consumo de la bombilla se obtendra apartir de la intensidad * primer digito de la intensidad
 * 
 * conector usb tendrá longitud en metros, potencia que nos da solo podra ser 2,4 A o 5 A
 * 
 * tenemos un pequeño almacen de aparatos electronicos del que podremos obtener numero de aparatos
 * numero de aparatos de un tipo, listado de todo lo que hay en el almacen
 * 
 * preparar una opcion de carga del almacen con la lectura de un fichero de tipo txt cuyos datos iran
 * separados por guiones- y podran ir mezclados tanto bombillas como cargadoresº
 */
public class AparatosElec
{
    private String nombre;
    private String funcion;
    
    
    
    public AparatosElec(String nombre, String funcion)
    {
        this.nombre=nombre;
        this.funcion=funcion;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    
    
    
    


}
