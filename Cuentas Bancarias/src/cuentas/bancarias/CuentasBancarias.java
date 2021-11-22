package cuentas.bancarias;

import java.util.*;

/**
 *
 * @author bilian
 */
public class CuentasBancarias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double cuentas[] = new double[100]; //Declaramos un array de longitud 100 en el que almacenar el dinero de cada usuario en orden
        String titulares[] = new String[100]; // * el nombre de cada usuario en orden
        int eleccion = 0; //Aquí guardamos la operación que quiere realizar el usuario
        int last = -1; //Registramos la última cuenta creada
        String nombre = ""; //Se usará para buscar un nombre
        boolean encontrado = false; //Si encuentra un nombre será true
        
        System.out.println("Bienvenido a tu cajero de confianza JDKbanking. ¿Que operacion deseas realizar?");
        while(eleccion != 8){
            System.out.println("1. Ver cuentas");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Agregar cuenta");
            System.out.println("5. Eliminar cuenta");
            System.out.println("6. Buscar cuenta");
            System.out.println("7. Mostrar morosos");
            System.out.println("8. Salir");
            
            eleccion = sc.nextInt();
            System.out.println("");
            switch(eleccion){
                case 1:
                    if (last == -1) {
                        System.out.println("La tecnología blockchain ha dominado el planeta, los bancos han quebrado. No hay cuentas!");
                    } else {
                        for (int i = 0; i <= last; i++) {
                            System.out.println(i + ". " + titulares[i] + " - Saldo: " + cuentas[i]);
                        }
                    }
                    break;
                    
                case 2:
                    System.out.println("¿A que cuenta quieres ingresar dinero?");
                    eleccion = sc.nextInt();
                    if (eleccion < 0 || eleccion > last) {
                        System.out.println("Cuenta no existente");
                    } else{
                        System.out.println("¿Cuanto dinero desea ingresar?");
                        cuentas[eleccion] += sc.nextDouble();
                    }
                    break;
                    
                case 3:
                    System.out.println("¿A que cuenta quieres retirar dinero?");
                    eleccion = sc.nextInt();
                    if (eleccion < 0 || eleccion > last) {
                        System.out.println("Cuenta no existente");
                    } else{
                        System.out.println("¿Cuanto dinero desea retirar?");
                        cuentas[eleccion] -= sc.nextDouble();
                    }
                    break;
                    
                case 4:
                    if (last <= 99) {
                        if (last == -1) {
                            last = 0;
                        } else{
                            last++;
                        }
                        System.out.println("Nombre de la cuenta a crear: ");
                        titulares[last] = sc.next();
                        System.out.println("Saldo de la nueva cuenta: ");
                        cuentas[last] = sc.nextInt();
                        
                    } else{
                        System.out.println("Somos un banco indie, nuestra base de datos es limitada. Elimina cuentas para continuar");
                    }
                    break;
                    
                case 5:
                    System.out.println("Que numero de cuenta desea eliminar");
                    eleccion = sc.nextInt();
                    if (eleccion > last || eleccion < 0) {
                        System.out.println("La cuenta no existe");
                    } else {
                        while(eleccion < last){
                            cuentas[eleccion] = cuentas[(eleccion + 1)];
                            titulares[eleccion] = titulares[(eleccion +1)];
                            eleccion++;
                        }
                        last--;
                    }
                    break;
                    
                case 6:
                    System.out.println("¿Que nombre desea buscar?");
                    nombre = sc.next();
                    encontrado = false;
                    for (int i = 0; i <= last; i++) {
                        if (titulares[i].toLowerCase().contains(nombre.toLowerCase())) {
                            System.out.println(i + ". " + titulares[i] + " - Saldo: " + cuentas[i]);
                            encontrado = true;
                        }
                    }
                    if (encontrado == false) {
                        System.out.println("No se ha encontrado ninguna cuenta");
                    }
                    break;
                    
                case 7:
                    System.out.println("Morosos:");
                    encontrado = false;
                    for (int i = 0; i < last; i++) {
                        if (cuentas[i] < 0) {
                            System.out.println(i + ". " + titulares[i] + " - Saldo: " + cuentas[i]);
                            encontrado = true;
                        }
                    }
                    if (encontrado == false) {
                        System.out.println("Nadie es moroso.");
                    }
            }
            System.out.println("");
        }
        
    }
    
}
