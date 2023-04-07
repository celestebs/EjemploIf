
package ejemploif;

import java.util.Scanner;
public class EjemploIf {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String resp;
        
        System.out.print("Cual es la capital de España? ");
        resp = s.nextLine();
        
        if ((resp.equals("Madrid")) || (resp.equals("Madrid")) ) { //respuesta.equals cuando es cadena de caracteres (palabra/s)
                                                                             //respuesta== cuando son números 
                                                                             // || significa `or`  
            System.out.println("¡La respuesta es correcta!");
        } else {
            System.out.println("Lo siento, la respuesta es incorrecta.");
        }
    }
    
}
