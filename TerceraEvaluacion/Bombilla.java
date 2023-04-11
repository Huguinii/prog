package TerceraEvaluacion;


/**
 * Write a description of class Bombilla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bombilla extends AparatosElec
{
    
    int intensidad;
    
    public Bombilla(int intensidad){
        this.intensidad=intensidad;
    }
    public int getIntensidad(){
        return intensidad;
    }
    public void setIntesidad(int intensidad){
        this.intensidad=intensidad;
    }
    public int getConsumo(){
        String num= ""+ intensidad;
        int primerNum= Integer.parseInt(""+num.charAt(0));
        return intensidad*primerNum;
    }
}
