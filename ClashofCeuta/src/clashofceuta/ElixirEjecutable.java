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
public class ElixirEjecutable {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test creacion objeto oro
        Oro o1 = new Oro();
        Oro o2 = new Oro(Oro.ICONO,3,10,20,1);
        Oro o3 = new Oro(o1);
        
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        
        //Test getters
        System.out.println("Precio: " + o1.getPrecioVenta());
        System.out.println("Duracion de la produccion: " + o1.getDuracionProduccion());
        System.out.println("EXP: " + o1.getExperienciaRecolecta());
        System.out.println("Path del icono: " + o1.getIcono());
        
        //Test setters
        o1.setPrecioVenta(5);
        System.out.println("Precio: " + o1.getPrecioVenta());
        o1.setDuracionProduccion(10);
        System.out.println("Duracion de la produccion: " + o1.getDuracionProduccion());
         o1.setExperienciaRecolecta(50);
        System.out.println("EXP: " + o1.getExperienciaRecolecta());
        System.out.println(o1);
        
        //Test creacion objeto elixir
        Elixir e1 = new Elixir();
        Elixir e2 = new Elixir(Elixir.ICONO,3,10,20,1);
        Elixir e3 = new Elixir(e1);
        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        
        //Test getters
        System.out.println("Precio: " + e1.getPrecioVenta());
        System.out.println("Duracion de la produccion: " + e1.getDuracionProduccion());
        System.out.println("EXP: " + e1.getExperienciaRecolecta());
        System.out.println("Path del icono: " + e1.getIcono());
        
        //Test setters
        e1.setPrecioVenta(5);
        System.out.println("Precio: " + e1.getPrecioVenta());
        e1.setDuracionProduccion(10);
        System.out.println("Duracion de la produccion: " + e1.getDuracionProduccion());
         e1.setExperienciaRecolecta(50);
        System.out.println("EXP: " + e1.getExperienciaRecolecta());
        System.out.println(e1);
        
        //Test Parcela
        Parcela p1 = new Parcela();
        Parcela p2 = new Parcela();
        Parcela p3 = new Parcela();
        
        System.out.println("Parcela 1: " + p1);
        System.out.println("Parcela 2: " + p2);
        System.out.println("Parcela 3: " + p3);
        
        //Test getters
        
        System.out.println("p1 puede producir? " + p1.puedeProducir());
        System.out.println("p2 puede producir? " + p2.puedeProducir());
        System.out.println("p1 puede producir?" + p3.puedeProducir());
        
        //Test setters
        
        p1.producirOro(o1);
        System.out.println("Parcela 1: " + p1);
        System.out.println("p1 puede producir?" + p1.puedeProducir());
        p1.producirOro(o1);
        System.out.println("Parcela 1: " + p1);
        p1.producirOro(o2);
        System.out.println("Parcela 1: " + p1);
        p1.producirOro(o2);
        System.out.println("Parcela 1: " + p1);
        
        p1.producirElixir(e2);
        System.out.println("Parcela 1: " + p2);
        
        System.out.println("Parcela 1 primer oro: " + p1.getPrimerMinaOro());
        System.out.println("Parcela 1 primer elixir: " + p1.getPrimerMinaElixir());
        System.out.println("Parcela 2 primer oro: " + p2.getPrimerMinaOro());
        System.out.println("Parcela 2 primer elixir: " + p2.getPrimerMinaElixir());
        
        
        
        
    }
    
    
    
    
    }
