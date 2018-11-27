package teste;

import java.util.Scanner;

/**
 *
 * @author Marcos Guimaraes
 */
public class AdivinheAnimal {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        char animal;
        
        
        System.out.println("Escolha um dos animais a seguir: Leao, cavalo, homem, macaco, morcego, baleia, avestruz, pinguim, pato, aguia, tartaruga, crocodilo, cobra! ");
        
        System.out.println("O animal que você imaginou e mamifero? Responda apenas com sim ou nao!!");
        
        animal = entrada.next().charAt(0);
       
        if (animal == 's'){
                
            System.out.println("O animal que voce escolheu e Quadrupedes?");
                animal = entrada.next().charAt(0);               
                   if (animal == 's'){
                       
                    System.out.println("O animal que voce escolheu e carnivoro?");
                    animal = entrada.next().charAt(0);
                    if (animal == 's'){
                        System.out.println("O animal que voce escolheu e Leao");
                    }else 
                           System.out.println("O animal escolhido e o CAVALO");
                   }else{
                        System.out.println("O animal que voce escolheu e Bipedes?");
                        animal = entrada.next().charAt(0);
                        if (animal == 's'){
                        System.out.println("O animal que voce escolheu e carnivoros?");
                        animal = entrada.next().charAt(0);
                         if (animal == 's'){
                         System.out.println("O animal escolhido e o Homem");
                        }else
                            System.out.println("O animal escolhido e o Macaco");
                        }else 
                        System.out.println("O animal e Aquatico?");
                        animal = entrada.next().charAt(0);
                        if (animal == 's'){
                            System.out.println("O animal escolhido e o BALEIA");
                        }else 
                            System.out.println("O animal escilhido e a MORCEGO");
                        
                   
                }
                 
        }  else System.out.println("O animal e uma ave?");
            animal = entrada.next().charAt(0);
            if (animal == 's'){
                System.out.println("A ave voa?");
                animal = entrada.next().charAt(0);
                if (animal == 's'){
                     System.out.println("E uma ave de rapida?");    
                animal = entrada.next().charAt(0);
                if (animal == 's'){
                    System.out.println("O animal escolhido e  a AGUIA");
                }else
                    System.out.println("O animal escolhido e o PATO");
                    
                }else   
                System.out.println("E uma ave polar?");    
                animal = entrada.next().charAt(0);
                if (animal == 's'){
                System.out.println("O animal que voce escolheu e o Pinguim");
                }else    
                System.out.println("O animal que voce escolheu e o Avestruz");
                
                }else 
                System.out.println("O animal escolhido e carnivoro?");
            animal = entrada.next().charAt(0);
            if (animal == 's'){ 
            System.out.println("o Animal escolhido e o CROCODILO");
                      
        }else System.out.println("O animal escolhido tem patas?");
            animal = entrada.next().charAt(0);
            
            if (animal == 's'){
            System.out.println("O animal escolhido e a TARTARUGA");
            }else 
                 System.out.println("O animal escolhido e a COBRA");
            
                    
    }
}
