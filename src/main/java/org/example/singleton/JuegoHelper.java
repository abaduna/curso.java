package org.example.singleton;
// un funcion estatica no puede llamara una normaml
public class JuegoHelper {
    private static int puntasion;
    private int puntuacion2;
    private int dificult;

    public int getPuntasion() {
        return puntasion;
    }

    public static void setPuntasion(int puntasion) {
        JuegoHelper.puntasion = puntasion;
    }

    public int getPuntuacion2() {
        return puntuacion2;
    }

    public void setPuntuacion2(int puntuacion2) {
        this.puntuacion2 = puntuacion2;
    }

    public int getDificult() {
        return dificult;
    }

    public void setDificult(int dificult) {
        this.dificult = dificult;
    }
    public static  void mostrarReglas(){
        System.out.println("las reglas del juego son...");
    }
}
