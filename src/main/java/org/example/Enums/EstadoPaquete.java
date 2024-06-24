package org.example.Enums;

public enum EstadoPaquete {
    SMALL_ENVIADO(true),
    SMALL_PERDIDO(true),
    SMALL_DEVOLUCION(true),
    SMALL_RECIVIDO(true),
    SMALL_CANCELADO(true),
    SMALL_EN_TRACITO(true),

    BIG_ENVIADO(true),
    BIG_PERDIDO(true),
    BIG_DEVOLUCION(true),
    BIG_RECIVIDO(true),
    BIG_CANCELADO(true),
    BIG_EN_TRACITO(true);

    EstadoPaquete(boolean esPequenio) {
        this.esPequenio = esPequenio;
    }

    private boolean esPequenio;

    public boolean isPequenio() {
        return esPequenio;
    }
    public static void main(String[] args) {

        EstadoPaquete estado = EstadoPaquete.BIG_EN_TRACITO;
        if (estado.isPequenio()) {
            System.out.println("se perdio un paquete pequeño");
        }
    }
}
