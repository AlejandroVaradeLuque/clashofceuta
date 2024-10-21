/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clashofceuta;
/**
 *
 * @author Alejandro Varade
 */
public class Elixir {
    //----------------------------------------
    // Atributos
    //----------------------------------------
    public static final String ICONO = "/img/elixir.png";
    public static final int DURACION = 2 ;
    public static final int EXPERIENCIA = 1 ;
    public static final int PRECIO_VENTA = 2 ;
    public static final int MINAR = 10 ;
    
    private String icono ;
    private int duracionProduccion ;
    private int experienciaRecolecta ;
    private int precioVenta ;
    private int minar ;
    private TipoMina tipo;
    
    //----------------------------------------
    // Constructores
    //----------------------------------------
    public Elixir(String icono, int duracionProduccion, int experienciaRecolecta, int precioVenta, int minar){
        this.icono = icono ;
        this.duracionProduccion = duracionProduccion ;
        this.experienciaRecolecta = experienciaRecolecta ;
        this.precioVenta = precioVenta ;
        this.minar = minar ;
        this.tipo = TipoMina.ELIXIR;
    }
    public Elixir(){
        this(ICONO,DURACION,EXPERIENCIA,PRECIO_VENTA,MINAR );
    }
    
     public Elixir(Elixir otro){
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
    
    public TipoMina getTipo() {
        return tipo;
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
         StringBuilder sb = new StringBuilder();
        sb.append("Elixir{");
        sb.append("icono=").append(icono);
        sb.append(", duracionProduccion=").append(duracionProduccion);
        sb.append(", experienciaRecolecta=").append(experienciaRecolecta);
        sb.append(", precioVenta=").append(precioVenta);
        sb.append(", minar=").append(minar);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }
    
}
