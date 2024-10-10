/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashofceuta;
    
/**
 *
 * @author Alejandro Varade
 */
public class Oro {
    //----------------------------------------
    // Atributos
    //----------------------------------------
    public static final String ICONO = "/img/oro.png";
    public static final int DURACION = 2 ;
    public static final int EXPERIENCIA = 1 ;
    public static final int PRECIO_VENTA = 2 ;
    public static final int MINAR = 10 ;
    
    private String icono ;
    private int duracionProduccion ;
    private int experienciaRecolecta ;
    private int precioVenta ;
    private int minar ;
    
    //----------------------------------------
    // Constructores
    //----------------------------------------
    public Oro(String icono, int duracionProduccion, int experienciaRecolecta, int precioVenta, int minar){
        this.icono = icono ;
        this.duracionProduccion = duracionProduccion ;
        this.experienciaRecolecta = precioVenta ;
        this.minar = minar ;
    }
    public Oro(){
        this(ICONO,DURACION,EXPERIENCIA,PRECIO_VENTA,MINAR );
    }
    
     public Oro(Oro otro){
        this(otro.ICONO,otro.DURACION,otro.EXPERIENCIA,otro.PRECIO_VENTA,otro.MINAR );
    }

    @Override
    public String toString() {
        return "Oro{" + "icono=" + icono + ", duracionProduccion=" + duracionProduccion + ", experienciaRecolecta=" +
                experienciaRecolecta + ", precioVenta=" + precioVenta + ", minar=" + minar + '}';
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Oro o1 = new Oro();
        Oro o2 = new Oro(Oro.ICONO,3,10,20,1);
        Oro o3 = new Oro(o1);
        
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
    }
    
}
