package org.example.Landa;

import java.util.ArrayList;
import java.util.List;

public class Pipeline {

    public static void   main(String[] arg){

        List<String> frutas = new ArrayList<>();
        frutas.add("applet");
        frutas.add("applet");
        frutas.add("banana");
        frutas.add("applet");
        frutas.add("zandia");
        /*
        for (String fruta:frutas) {
            System.out.println(fruta);
        }*/
        frutas.stream().parallel().forEach(fruta -> System.out.println("landa: "+fruta));
        calcularArea(11,1);
        float area = calcularArea(11, 1);
        System.out.println("El área es: " + area);

        // (float ancho, float alto) ->  alto * ancho;
/*
* ( ancho) ->  alto * 5;
* */
        frutas.stream().parallel()
                .filter(fruta -> fruta.startsWith("B"))
                
                .forEach(fruta -> System.out.println("landa2: "+fruta));
    }
    public static float calcularArea(float ancho, float alto) {
        return alto * ancho;
    }
}
