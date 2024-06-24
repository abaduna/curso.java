package org.example.singleton;
/*
* se use asi
* JuegoHelperSingleton.getIntance().getDificult();
* */
public class JuegoHelperSingleton {
    private  int puntasion;
    private int puntuacion2;
    private int dificult;

    private JuegoHelperSingleton(){
        
    }

    private  static final   JuegoHelper intance = new JuegoHelper();
    public  static JuegoHelper getIntance(){
        return intance;
    }
    public int getDificult() {
        return dificult;
    }

    public void setDificult(int dificult) {
        this.dificult = dificult;
    }

    public int getPuntasion() {
        return puntasion;
    }

    public void setPuntasion(int puntasion) {
        this.puntasion = puntasion;
    }

    public int getPuntuacion2() {
        return puntuacion2;
    }

    public void setPuntuacion2(int puntuacion2) {
        this.puntuacion2 = puntuacion2;
    }
}
