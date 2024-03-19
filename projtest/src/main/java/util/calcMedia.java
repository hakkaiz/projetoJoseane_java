
package util;

import java.util.Scanner;

/**
 *
 * @author hakk
 */
public class calcMedia {
     float num1, num2,media = 0;
     int escolha =0;
     Scanner scan = new Scanner (System.in);
    

    
    public void calcularMedia(){
        
        do {        
            System.out.println("Digite sua primeira nota: ");
            num1 = scan.nextFloat();
            System.out.println("Digite sua segunda nota: ");
            num2 = scan.nextFloat();
            
            media = ((num1 + num2 )/2);
            
            System.out.println("A sua media e: "+ media);
            
            System.out.println("Deseja calcular novamente? ");
            System.out.println("Digite 1 para sim");
            System.out.println("Digite 2 para não");
            escolha = scan.nextInt();
                    
            
            
            
        } while (escolha != 1);
        
    
    
    }
    
    
    
}
