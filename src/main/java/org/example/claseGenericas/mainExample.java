package org.example.claseGenericas;

public class mainExample {
    public static void main(String[] args) {
        Producto producto = new Producto();
        producto.setDescripcion("mack prop");
        producto.setNombre("oglkss");
        Notificacion<Producto> notificacion = new Notificacion<>(producto);
        notificacion.getObjeto().getDescripcion();
        System.out.println(notificacion);
    }
}
