
package com.mycompany.projtest;

import java.util.Scanner;
import menu.menuAdm;
import meths.methsAlunos;

/**
 *
 * @author hakk
 */
public class Projtest {

    public static void main(String[] args) {
        
       Scanner scan = new Scanner (System.in);
        menuAdm menu = new menuAdm();
        int escolha;
        boolean sair;
    
      
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Menu aluno: ");
            System.out.println("2. Menu ADM");
            System.out.println("3. Menu Professor");
            System.out.println("4 Sair");
            System.out.print("Opção: ");
            escolha = scan.nextInt();
            scan.nextLine(); // Limpa o buffer do scanner

            switch (escolha) {
                case 1: menu.menuAluno();
                                        break;
                case 2:
                    menu.menuADM();
                    break;
                case 3:
                    menu.menuProf();
                    break;
                case 4:
                      System.out.println("Saindo...");
                    break;
                
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 4);
        
    }
        
        
       
       
    }


