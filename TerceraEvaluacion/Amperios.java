package TerceraEvaluacion;


/**
 * Write a description of class Amperios here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public enum Amperios {
    AMPERIO(2.4,5);
    double bajo;
    int alto;
    Amperios(double bajo, int alto) {
        bajo=this.bajo;
        alto=this.alto;
    }
    
}