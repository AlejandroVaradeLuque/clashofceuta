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
        this.experienciaRecolecta = experienciaRecolecta ;
        this.precioVenta = precioVenta ;
        this.minar = minar ;
    }
    public Oro(){
        this(ICONO,DURACION,EXPERIENCIA,PRECIO_VENTA,MINAR );
    }
    
     public Oro(Oro otro){
        this(otro.icono,otro.duracionProduccion,otro.experienciaRecolecta,otro.precioVenta,otro.minar );
    }
    //----------------------------------------
    // Métodos getter
    //----------------------------------------
    public String getIcono() {
        return icono;
    }

    public int getDuracionProduccion() {
        return duracionProduccion;
    }

    public int getExperienciaRecolecta() {
        return experienciaRecolecta;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public int getMinar() {
        return minar;
    }
    
    //----------------------------------------
    // Métodos setter
    //----------------------------------------
    public void setIcono(String icono) {
        this.icono = icono;
    }

    public void setDuracionProduccion(int duracionProduccion) {
        this.duracionProduccion = duracionProduccion;
    }

    public void setExperienciaRecolecta(int experienciaRecolecta) {
        this.experienciaRecolecta = experienciaRecolecta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setMinar(int minar) {
        this.minar = minar;
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
        System.out.println("Path del incono: " + o1.getIcono());
        
        //Test setters
        o1.setPrecioVenta(5);
        System.out.println("Precio: " + o1.getPrecioVenta());
        o1.setDuracionProduccion(10);
        System.out.println("Duracion de la produccion: " + o1.getDuracionProduccion());
        o1.setExperienciaRecolecta(50);
        System.out.println("EXP: " + o1.getExperienciaRecolecta());
        System.out.println(o1);
    }
    
}
