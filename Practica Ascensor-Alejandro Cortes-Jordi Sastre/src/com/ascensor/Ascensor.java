package com.ascensor;

public class Ascensor {

    private final static int NUMERO_PISOS = 5;
    private final static int PISO_INICIAL = 0;
    private boolean puertaAbierta;
    private int pisoActual;
    private EstadoPiso[] pisos;

    public enum EstadoPiso{
        EN_ESPERA,
        EN_COLA,
        EN_LUGAR
    }

    public Ascensor(){
        pisos = new EstadoPiso[NUMERO_PISOS];
        pisoActual = PISO_INICIAL;
    }

    public void irPiso(int piso){

    }

    public static int getNumeroPisos() {
        return NUMERO_PISOS;
    }

    public static void setNumeroPisos(int numeroPisos) {
        NUMERO_PISOS = numeroPisos;
    }

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

    public EstadoPiso[] getPisos() {
        return pisos;
    }

    public void setPisos(EstadoPiso[] pisos) {
        this.pisos = pisos;
    }
}
