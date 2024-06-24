package org.example;

import org.example.singleton.JuegoHelper;
import org.example.singleton.JuegoHelperSingleton;

public class Partida {
    public void jugar(){
        JuegoHelperSingleton.getIntance().getDificult();
    }
}
