package entities;

import java.util.Scanner;
public class Agente extends Entidad {
    private String habilidadEspecial;
    private String misionAsignada;
    private String clonarse;
    private String teleport;
    private String destuirReality;

    public Agente(int id, String nombre, String habilidadEspecial) {
        super(id, nombre);
        this.habilidadEspecial = habilidadEspecial;
    }

    public void asignarAnomalia(String clonarse, String teleport, String destruirReality){
        this.clonarse = clonarse;
        this.teleport = teleport;
        this.destuirReality = destruirReality;
    }

    public void listaAnomalias(){
        Scanner escoger = new Scanner(System.in);

        System.out.println("escoja el tipo de anomalia para el agente");
        System.out.println("1.clonarse");
        System.out.println("2.teletransporte");
        System.out.println("3.destruir la realidad");

        Byte asignar = escoger.nextByte();
        switch (asignar) {
            case 1:
                System.out.println("anomalia de agente: ");
                asignar.asignarAnomalia();

                break;
            case 2:
                System.out.println("anomalia de agente: ");
            break;
        
            case 3:
            System.out.println("anomalia de agente: ");
            break;
            default:
                break;
        }

    }

    public void mirarAnomalia(){
        System.out.println("tipo de anomalia: " + );
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getMisionAsignada() {
        return misionAsignada;
    }

    public void asignarMision(String mision) {
        this.misionAsignada = mision;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habilidad Especial: " + habilidadEspecial +
                (misionAsignada != null ? ", Misión: " + misionAsignada : "");
    }
}
