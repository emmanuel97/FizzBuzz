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
public class FizzBuzz implements IFizzBuzz{

    /*
  
     public String Answer(int i){
        return Integer.toString(i);//retorna string com o valor de i
    }
     
      public String Answer(int i){
          if(i%5==0)return "Buzz";//retorna string "buzz" se i for divisivel por 5
        return Integer.toString(i);//retorna string com o valor de i
    }
    
     public String Answer(int i){
          if(i%5==0)return "Buzz";//retorna string "Buzz" se i for divisivel por 5
          else if(i%3==0)return "Fizz";//retorna string "Fizz" se i for divisivel por 3
        return Integer.toString(i);//retorna string com o valor de i
    }
    */
    
    public String Answer(int i){
          if(i%5==0 && i%3==0)return "FizzBuzz";//retorna string "FizzBuzz" se i for divisivel por 5 e por 3
          else if(i%5==0)return "Buzz";//retorna string "Buzz" se i for divisivel por 5
          else if(i%3==0)return "Fizz";//retorna string "Fizz" se i for divisivel por 3
        return Integer.toString(i);//retorna string com o valor de i
    }

}

