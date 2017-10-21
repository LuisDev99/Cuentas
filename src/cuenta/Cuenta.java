package cuenta;

import java.util.*;

public class Cuenta {

    public static void main(String[] args) {
        Cuenta_bancaria[] cuentas = new Cuenta_bancaria[5];
        Crear_cuenta[] personas = new Crear_cuenta[5];
        Scanner datos = new Scanner(System.in);
        String respuesta = "si";
        while (respuesta.equals("si")) {
        System.out.println("");
        System.out.println("1. Crear nueva cuenta");
        System.out.println("2. Manejar cuenta");
        System.out.println("3. Eliminar cuenta");
        System.out.println("4. Salir.");
        int opciones = datos.nextInt();
        
            switch (opciones) {
                case 1: {
                    boolean verificar = false;
                    System.out.println("");
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
                            personas[i] = new Crear_cuenta(i,nombre, apellido, edad, sexo);
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
                    System.out.println("");
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
                                System.out.println("Monto: ");
                                System.out.println(cuentas[num_cuenta].getCantidad());
                                break;
                            }
                            
                            case 2:{
                                System.out.println("Ingrese la cantidad a ingresar: ");
                                double cantidad = datos.nextDouble();
                                if(cantidad>0)
                                    cuentas[num_cuenta].setCantidad(cantidad+cuentas[num_cuenta].getCantidad());
                                else
                                    System.out.println("No puede ingresar una cantidad menor a 0!");
                                break;
                            }
                            
                            case 3:{
                                System.out.println("Ingrese la cantidad a retirar: ");
                                double cantidad = datos.nextDouble();
                                if(cantidad>0){
                                    if(cantidad>=cuentas[num_cuenta].getCantidad())
                                        cuentas[num_cuenta].setCantidad(0);
                                    else
                                        cuentas[num_cuenta].setCantidad(cuentas[num_cuenta].getCantidad()-cantidad);
                                }
                                System.out.println("Retiro exitoso!");
                                break;
                            }
                        }
                    }
                    else 
                        System.out.println("Ese numero de cuenta no esta registrada!");
                    break;
                }
                
                case 3:{
                    System.out.println("Ingrese la cuenta a eliminar: ");
                    int posicion = datos.nextInt();
                    if(posicion<=5 && posicion>=0 && cuentas[posicion]!=null && personas[posicion]!=null){
                        System.out.println("Borrado de cuenta exitoso!");
                        cuentas[posicion]=null;
                        personas[posicion]=null;
                    }
                    else    
                        System.out.println("Ese numero de cuenta no esta registrada");
                    break;
                        
                }
                case 4:{
                    System.out.println("Hasta la proxima!");
                    respuesta="no";
                    break;
                }
                default:
                    break;
            }

        }
    }
}
