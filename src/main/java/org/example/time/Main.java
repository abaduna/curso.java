package org.example.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public void main(String[] args){
        LocalDate fecha = LocalDate.now();
        fecha=fecha.plusDays(5);
        System.out.println(fecha);
        LocalTime holra = LocalTime.now();
        System.out.println(holra);
        LocalDateTime todo = LocalDateTime.now();
        System.out.println(todo );
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaForm = todo.format(format);
        System.out.println(fechaForm);

        //isAfter para comparar dos fechas

    }
}
