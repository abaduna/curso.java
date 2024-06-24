package org.example.mensages;

import java.time.LocalDateTime;

public class Mensaje {
    private  String txt;
    private LocalDateTime fecha;

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Mensaje{" +
                "fecha=" + fecha +
                ", txt='" + txt + '\'' +
                '}';
    }
}
