/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

/**
 *
 * @author aluno
 */
public class TDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FizzBuzz jogo=new FizzBuzz();
       int num=4;
       for(int i=num;i<num*4;i++){
           System.out.println(jogo.Answer(i));
       }
    }
    
}
