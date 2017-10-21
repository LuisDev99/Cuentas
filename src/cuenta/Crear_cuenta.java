
package cuenta;

public class Crear_cuenta {

   
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
     
    public Crear_cuenta(int posicion, String nombre, String apellido, int edad, String sexo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        String mensaje = "Nombre: "+nombre+"\n"+"Apellido: "+apellido+"\n"+"Edad: "+edad+"\n"+"Sexo: "+sexo;
        return mensaje;
    }
    
    
   
 
    
    
}
