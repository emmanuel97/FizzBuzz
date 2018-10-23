/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import tdd.FizzBuzz;

/**
 *
 * @author aluno
 */
public class FizzBuzzTest extends TestCase {
    
    public FizzBuzzTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    FizzBuzz jogo=new FizzBuzz();
    
    /*
    public void testFizzBuzz() {     
        assertEquals("", jogo.Answer(4));//primeiro teste. Destinado a falhar: quando o return "4"; o teste falha pois esperase ""
    }
   
     public void testFizzBuzz() {     
        assertEquals("4", jogo.Answer(4));//segundo teste. Destinado a passar: quando o return num; com num = "4", o teste passa
    }
    
   
     public void testFizzBuzz() {     
        assertEquals("4", jogo.Answer(4));
         ssertEquals("Buzz", jogo.Answer(5));//terceiro teste. Destinado a falhar: quando o return num; com num = "5", o teste falha pois deve ser "Buzz"
    }
    
    
      public void testFizzBuzz() {     
        assertEquals("4", jogo.Answer(4));
        assertEquals("Buzz", jogo.Answer(5));//quarto teste. Destinado a passar: quando o return num; com num = "Buzz", o teste passa
    }
     
    
      public void testFizzBuzz() {     
        assertEquals("4", jogo.Answer(4));
        assertEquals("Buzz", jogo.Answer(5));
        assertEquals("Fizz", jogo.Answer(3));//quarto teste. Destinado a falhar: quando o return num; com num = "3", o teste falha pois deve ser "Fizz"
    }
    
    
      public void testFizzBuzz() {     
        assertEquals("4", jogo.Answer(4));
        assertEquals("Buzz", jogo.Answer(5));
        assertEquals("Fizz", jogo.Answer(3));//quarto teste. Destinado a passar: quando o return num; com num = "Fizz", o teste passa
    }
    
    
      public void testFizzBuzz() {   
        assertEquals("Fizz", jogo.Answer(3));
        assertEquals("4", jogo.Answer(4));
        assertEquals("Buzz", jogo.Answer(5));
        assertEquals("FizzBuzz", jogo.Answer(15));//quinto teste. Destinado a falhar: quando o return num; com num = "Buzz", o teste falha pois deve ser "FizzBuzz"
    }  
     
    
    public void testFizzBuzz() {   
        assertEquals("Fizz", jogo.Answer(3));
        assertEquals("4", jogo.Answer(4));
        assertEquals("Buzz", jogo.Answer(5));
        assertEquals("FizzBuzz", jogo.Answer(15));//quinto teste. Destinado a passar: quando o return num; com num = "FizzBuzz", o teste passa
    }    
      
   */
    
     public void testFizzBuzz() {   
        assertEquals("Fizz", jogo.Answer(3));
        assertEquals("4", jogo.Answer(4));
        assertEquals("Buzz", jogo.Answer(5));
        assertEquals("FizzBuzz", jogo.Answer(15));
        //sexto e ultimo teste teste. Destinado a passar: com qualquer numero informado
        assertEquals("-1", jogo.Answer(-1));//numero não multiplo de 3 ou de 5 retorna o mesmo em string, mesmo que seja negativo
        assertEquals("Buzz", jogo.Answer(-5));//numero  multiplo de 5 retorna a string "Buzz", mesmo que seja negativo
        assertEquals("Fizz", jogo.Answer(-3));//numero  multiplo de 3 retorna a string "Fizz", mesmo que seja negativo
        assertEquals("FizzBuzz", jogo.Answer(0));// zero é numero divisivel por todos os numeros. retornando portanto a string "FizzBuzz"
        
    }    
}
