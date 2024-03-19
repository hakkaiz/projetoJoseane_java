/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meths;

import butos.Curso;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class methCurso {
    
    Scanner scan = new Scanner(System.in);
    Curso c = new Curso();
    List<Curso> cursos = new ArrayList<>();

     


    
    
    public  void adicionarCursos(){
    
        System.out.println("informe o curso: ");
        c.setNome(scan.nextLine());
        System.out.println("Informe o id do curso: ");
        c.setId(scan.nextInt());
        System.out.println("Infrome o preiodo do curso: ");
        c.setNome(scan.nextLine());
       cursos.add(c);
        
       
    }
    
    public void mostrarCursos(){
        System.out.println("cursos existentes: ");
       
        
        for (Curso c : cursos) {
            System.out.println("ID: " +c.getId());
            System.out.println("Nome: " + c.getNome());
            System.out.println("Período: " + c.getPeriodo());
            System.out.println();
            
            
        }
    
    }

    
}
