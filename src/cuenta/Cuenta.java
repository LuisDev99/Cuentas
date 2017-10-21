package cuenta;

import java.util.*;

public class Cuenta {

    public static void main(String[] args) {
        Cuenta_bancaria[] cuentas = new Cuenta_bancaria[5];
        Crear_cuenta[] personas = new Crear_cuenta[5];
        Scanner datos = new Scanner(System.in);
        String respuesta = "si";
        while (respuesta.equals("si")) {
        System.out.println("1. Crear nueva cuenta");
        System.out.println("2. Manejar cuenta");
        System.out.println("3. Ver estado de cuenta");
        System.out.println("3. Eliminar cuenta");
        int opciones = datos.nextInt();
        
            switch (opciones) {
                case 1: {
                    boolean verificar = false;
                    System.out.println("*****Bienvenido*****");
                    System.out.println("Por favor, ingresar lo que se le pida a continuacion: ");
                    System.out.println("Nombre: ");
                    String nombre = datos.next();
                    System.out.println("Apellido: ");
                    String apellido = datos.next();
                    System.out.println("Edad: ");
                    int edad = datos.nextInt();
                    System.out.println("Sexo: ");
                    String sexo = datos.next();

                    for (int i = 0; i < personas.length; i++) {
                        if (personas[i] == null) {
                            System.out.println("Cuenta creada exitosamente!");
                            personas[i] = new Crear_cuenta(nombre, apellido, edad, sexo);
                            cuentas[i] = new Cuenta_bancaria("A poco no karnal xd", 10000);
                            verificar = true;
                        }
                        if (verificar == true) {
                            break;
                        }
                    }
                    break;
                }
                
                case 2: {
                    System.out.println("*****Bienvenido******");
                    System.out.println("Por favor, ingresar lo que se le pide a continuacion: ");
                    System.out.println("Ingrese el numero de cuenta: ");
                    System.out.println("Numero de cuenta: ");
                    int num_cuenta = datos.nextInt();
                    
                    if(personas[num_cuenta]!=null && cuentas[num_cuenta]!=null){
                        System.out.println("1. Ver estado de cuenta");
                        System.out.println("2. Ingresar cantidad");
                        System.out.println("3. Retirar cantidad");
                        int opcion =  datos.nextInt();
                        switch(opcion){
                            case 1:{
                                System.out.println(personas[num_cuenta].toString());
                                break;
                            }
                            
                            case 2:{
                                System.out.println("Cantidad: ");
                                double cantidad = datos.nextDouble();
                                if(cantidad>0)
                                    cuentas[num_cuenta].setCantidad(cantidad);
                                else
                                    System.out.println("No puede ingresar una cantidad menor a 0!");
                                break;
                            }
                        }
                    }
                    break;
                }
                default:
                    break;
            }

        }
    }
}
