
package meths;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import butos.Alunos;
import java.util.Iterator;

/**
 *
 * @author hakk
 */
public class methsAlunos {
    
     Scanner scan = new Scanner(System.in);
    Alunos alun = new Alunos();
    List<Alunos> aluno = new ArrayList<>();
    
    public void alterarAluno(){
    
        System.out.println("Informe o Ra que deseja alterar: ");
        double raAlterar = scan.nextDouble();
        boolean encontrado = false;
        for (Alunos alun : aluno) {
                 if (alun.getRa() == raAlterar) {
        System.out.println("Informe seu nome: ");
        alun.setNome(scan.nextLine());
        System.out.println("Informe seu telefone: ");
        alun.setTelefone(scan.nextDouble());
        System.out.println("Informe Seu email: ");
        alun.setEmail(scan.nextLine());
        System.out.println("Informe o seu RA(apenas os numeros): ");
        alun.setRa(scan.nextDouble());
                encontrado = true;
                break;
            }
        
    
        }
    }
    
    
    public void excluirAluno(){
        
        System.out.println("Digite o RA que deseja excluir: ");
        double raExcluir = scan.nextDouble();
        boolean encontrado = false;
                
              Iterator<Alunos> iterator = aluno.iterator();
              while(iterator.hasNext()){
              
                  Alunos aluno = iterator.next();
                  if(aluno.getRa() == raExcluir){
                  iterator.remove();
                      System.out.println("Ra excluido com sucesso!");
                      encontrado = true;
                      break;
                  } else{
                      System.out.println("Ra não encontrado ");
                  
                  }
              
              }
                
        
        
    
    }
    
    public void adicionarAluno(){
    
        System.out.println("Informe seu nome: ");
        alun.setNome(scan.nextLine());
        System.out.println("Informe seu telefone: ");
        alun.setTelefone(scan.nextDouble());
        System.out.println("Informe Seu email: ");
        alun.setEmail(scan.nextLine());
        System.out.println("Informe o seu RA(apenas os numeros): ");
        alun.setRa(scan.nextDouble());
        aluno.add(alun);
    
    }
    
    public void mostrarAluno(){
    
        for(Alunos alun : aluno ){
        
            
            
            System.out.println("Nome: "+alun.getNome());
            System.out.println("RA: "+alun.getRa());
            System.out.println("Telefone:"+alun.getTelefone());
            System.out.println("Email"+alun.getEmail());
            System.out.println("");
        
        }
    
    }
    
    public void buscarAluno(){
        
        
        System.out.println("Digite o RA que deseja buscar: ");
        double raBusca = scan.nextDouble();
        boolean encontrado = false;

        
                for (Alunos alun : aluno) {
                 if (alun.getRa() == raBusca) {
                System.out.println("Aluno encontrado:");
                System.out.println("Nome: " + alun.getNome());
                System.out.println("RA: " + alun.getRa());
                System.out.println("Telefone: " + alun.getTelefone());
                System.out.println("Email: " + alun.getEmail() + "\n");
                encontrado = true;
                break;
            }
                  
                 
                 
        }
        
        
        
    
        
    
    
    }
    
    
    
    
}
