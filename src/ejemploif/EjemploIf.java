
package ejemploif;

import java.util.Scanner;
public class EjemploIf {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String respuesta;
        
        System.out.print("Cual es la capital de Kiribati? ");
        respuesta = s.nextLine();
        
        if ((respuesta.equals("Tarawa")) || (respuesta.equals("tarawa")) ) { //respuesta.equals cuando es cadena de caracteres (palabra/s)
                                                                             //respuesta== cuando son números 
                                                                             // || significa `or`  
            System.out.println("¡La respuesta es correcta!");
        } else {
            System.out.println("Lo siento, la respuesta es incorrecta.");
        }
    }
    
}
