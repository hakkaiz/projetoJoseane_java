
package meths;


import butos.Professor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hakk
 */
public class methProfessor {
    
    Scanner scan = new Scanner(System.in);
    Professor prof = new Professor();
    List<Professor> professor = new ArrayList<>();
    
    public void adicionarProfessor(){
        System.out.println("Infrome seu nome: ");
        prof.setNome(scan.nextLine());
        System.out.println("Informe sua matricula: ");
        prof.setMatricula(scan.nextLine());
        System.out.println("Informe seu telefone(apenas numeros): ");
        prof.setTelefone(scan.nextDouble());
        System.out.println("Informe seu email: ");
        prof.setEmail(scan.nextLine());
        professor.add(prof);
    
    }
    
    public void mostrarProfessor(){
        
        for(Professor prof : professor){
            
                System.out.println("Nome: " + prof.getNome());
                System.out.println("Matricula: "+ prof.getMatricula());
                System.out.println("Telefone: " + prof.getTelefone());
                System.out.println("Email "+ prof.getEmail());
        
        
        }
    
    
    }
    
    
}
