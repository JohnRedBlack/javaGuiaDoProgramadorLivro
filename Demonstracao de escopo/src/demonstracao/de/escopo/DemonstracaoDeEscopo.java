/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonstracao.de.escopo;

/**
 *
 * @author John
 */
public class DemonstracaoDeEscopo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // inicio do bloco 1
        // TODO code application logic here
        int i = 5; //variavel do bloco 1
        {//inicio do bloco 2
            int j = 0;//variavel do bloco 2
            System.out.println(i); //Uso de i dentro do seu escopo
            j = 5 * i;             //Uso do j dentro do seu escopo
            System.out.println(j);
            {//inicio do bloco 3
                System.out.println(i); //Uso do i dentro do seu escopo
                System.out.println(j); //Uso do j dentro do seu escopo
            }
        }
        System.out.println(i); //uso do i dentro do seu escopo
        //System.out.println(j); Uso do j fora do seu escopo
    }
}
