/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguel_de_carros;

/**
 *
 * @author gabrielsg
 */
public class Gerente extends Funcionario{
    private int ID_ger;

    public Gerente(int ID_ger, String Nome_fun, String CPF_fun, String Cel_fun) {
        super(Nome_fun, CPF_fun, Cel_fun);
        this.ID_ger = ID_ger;
    }

    public int getID_ger() {
        return ID_ger;
    }

    public void setID_ger(int ID_ger) {
        this.ID_ger = ID_ger;
    }

    //@Override
    public String toStringGerente() {
        return "Gerente{" + "ID_ger=" + ID_ger + '}';
    }
    
    
}
