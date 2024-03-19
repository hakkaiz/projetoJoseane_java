
package menu;

import java.util.Scanner;
import meths.methCurso;
import meths.methProfessor;
import meths.methsAlunos;
import util.calcMedia;

/**
 *
 * @author hakk
 */
public class menuAdm {
    
    String escolha,escolha2;
    
    Scanner scan = new Scanner (System.in);
    methCurso mthc = new methCurso();
    methProfessor mthp = new methProfessor();
    methsAlunos mtha = new methsAlunos();
    calcMedia clmd = new calcMedia();
    
    
    public void menuProf(){
        
          int opcao;
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Adicionar Professor");
            System.out.println("2. Mostrar todos os alunos");
            System.out.println("3. Buscar aluno por RA");
            System.out.println("4. Calcular media ");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            opcao = scan.nextInt();
            scan.nextLine(); 

            switch (opcao) {
                case 1 -> mthp.adicionarProfessor();
                case 2 -> mtha.mostrarAluno();
                case 3 -> mtha.buscarAluno();
                case 4 -> clmd.calcularMedia();
                case 5 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
        
        
        
    
    
    
    }
    
   public void menuADM() {
        int opcao;
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Adicionar curso");
            System.out.println("2. Mostrar todos os alunos");
            System.out.println("3. Buscar aluno por RA");
            System.out.println("4. Excluir aluno por RA");
            System.out.println("5. Mostrar Professores");
            System.out.println("6. Sair");
            System.out.print("Opção: ");
            opcao = scan.nextInt();
            scan.nextLine(); 

            switch (opcao) {
                case 1 -> mthc.adicionarCursos();
                case 2 -> mtha.mostrarAluno();
                case 3 -> mtha.buscarAluno();
                case 4 -> mtha.excluirAluno();
                case 5 -> mthp.mostrarProfessor();
                case 6-> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);
    }
   public void menuAluno(){
       
       
       int opcao;
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. somar media ");
            System.out.println("3. Sair ");
            System.out.print("Opção: ");
            opcao = scan.nextInt();
            scan.nextLine(); 

            switch (opcao) {
                case 1 ->mtha.adicionarAluno();
                case 2 -> clmd.calcularMedia();
                case 3 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
        
        
        
    }
   
   
   
   }

    
        
    
    

