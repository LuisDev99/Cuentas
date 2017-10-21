
package cuenta;

public class Cuenta_bancaria {
    private String titular;
    private double cantidad;
    
    public Cuenta_bancaria(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
            
}
