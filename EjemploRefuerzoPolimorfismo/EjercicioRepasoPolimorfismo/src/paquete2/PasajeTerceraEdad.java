/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public abstract class PasajeTerceraEdad extends PasajeUrbano {
    
    public PasajeTerceraEdad(double pasaje){
        super(pasaje);
    }
    public void establecerValorPasaje() {
        valorPasaje = (valorFijo * 0.50) - valorFijo;
    }
       
    @Override
    public String toString(){
        return String.format("Tipo de pasaje: Tercera Edad\n"
                + "%s",
                super.toString()
                );
    }
}
