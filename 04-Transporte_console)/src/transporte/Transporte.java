/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;

/**
 *
 * @author User
 */
public class Transporte {

    /**
     * @param args the command line arguments
     */
    
    public String Qual_tipo (Veiculo veic)
    {
        return veic.getTipo();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Automovel v1 = new Automovel (4, true, true, 400, "terrestre", "vermelho", 300);
        v1.setCor ("azul");
        System.out.println (v1.toStringVeiculo ());
        System.out.println (v1.toStringCarro ());
        
        Barco b1 = new Barco (5, true, 400, "aquatico", "vermelho", 300);
        b1.setCor ("verde");
        System.out.println (b1.toStringVeiculo ());
        
        System.out.println (b1.getQtde_boias());
        b1.setQtde_boias(3);
        System.out.println (b1.toStringBarco());
        
        Aviao a1 = new Aviao (50, "Boing", 500, "Aerio", "preto", 5000);
        System.out.println (a1.toStringAviao ());
        
        Transporte t1 = new Transporte ();
        String Qual_tipo = t1.Qual_tipo(v1);
        System.out.println (Qual_tipo);
        Qual_tipo = t1.Qual_tipo(b1); 
        System.out.println (Qual_tipo);
    }
}
