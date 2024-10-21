/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clashofceuta;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Alejandro Varade
 */
public class Parcela {
    //----------------------------------------
    // Atributos
    //----------------------------------------
    public static final int MAX_MINAS = 1;
    public static final int CAPACIDAD = 2;
    
    private List<Oro> minaOro = new ArrayList<>();
    private List<Elixir> minaElixir = new ArrayList<>();
    //----------------------------------------
    // Constructores
    //----------------------------------------
    public Parcela(){
        
    }
    //----------------------------------------
    // Métodos getter
    //----------------------------------------
    public List<Oro> getMinaOro(){
    return minaOro;
    }
    public List<Elixir> getMinaElixir(){
    return minaElixir;
    }
    //----------------------------------------
    // Funcionalidades
    //----------------------------------------
    public boolean puedeProducir(){
        return puedeProducirOro() || puedeProducirElixir();
    }
    public boolean puedeProducirOro(){
        return minaOro.size() < MAX_MINAS && minaElixir.isEmpty();
    }
    public boolean puedeProducirElixir(){
        return minaElixir.size() < MAX_MINAS && minaOro.isEmpty();
    }
    public void producirOro(Oro esteOro){
        if(puedeProducir()){
        minaOro.add(esteOro);
        }
    }
    public void recolectarOro(Oro esteOro){
        minaOro.remove(esteOro);
    }
    public void producirElixir(Elixir esteElixir){
        if(puedeProducir()){
            minaElixir.add(esteElixir);
        }
    }
    public void recolectarElixir(Elixir esteElixir){
        minaElixir.remove(esteElixir);
    }
    public boolean estaMinandoOro(){
        return !minaOro.isEmpty();
    }
    public boolean estaMinandoElixir(){
        return !minaElixir.isEmpty();
    }
    public boolean estaMinando(){
        return estaMinandoOro() || estaMinandoElixir();
    }
    
    public Oro getPrimerMinaOro(){
        return this.minaOro.isEmpty() ? null: this.minaOro.get(0);
    }
    public Elixir getPrimerMinaElixir(){
        return this.minaElixir.isEmpty() ? null: this.minaElixir.get(0);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Parcela{");
        sb.append("minaOro").append(minaOro);
        sb.append(", minaElixir=").append(minaElixir);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}