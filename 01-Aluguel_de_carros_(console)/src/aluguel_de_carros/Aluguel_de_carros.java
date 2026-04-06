/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguel_de_carros;

/**
 *
 * @author gabrielsg
 */
public class Aluguel_de_carros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro car = new Carro ("2013" , "Gallardo", "GTA 0666");
        
        System.out.println (car.toStringCarro ());
        System.out.println (car.toStringCarro ());
        
        Alugar aluga = new Alugar ("Gabriel", "Gallardo", "25/11/2013");
        
        System.out.println (aluga.toStringAlugar ());
        System.out.println (aluga.toStringAlugar ());
        
        Cliente Cli = new Cliente ("Gabriel", "111111111", "32323399");
        
        System.out.println (Cli.toStringCliente ());
        System.out.println (Cli.toStringCliente ());
        
        Atendente At = new Atendente (003, "Marcelo", "222222222", "99323355");
        
        System.out.println (At.toStringAtendente ());
        System.out.println (At.toStringAtendente ());
        
        Atender Atend = new Atender ("Gabriel","Marcelo","25/11/2013");
        
        System.out.println (Atend.toStringAtender ());
        System.out.println (Atend.toStringAtender ());
        
        
    }
}
