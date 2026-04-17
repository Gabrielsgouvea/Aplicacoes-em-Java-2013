/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguel_de_carros;

/**
 *
 * @author gabrielsg
 */
public class Atendente extends Funcionario{
    private int ID_aten;

    public Atendente(int ID_aten, String Nome_fun, String CPF_fun, String Cel_fun) {
        super(Nome_fun, CPF_fun, Cel_fun);
        this.ID_aten = ID_aten;
    }

    public int getID_aten() {
        return ID_aten;
    }

    public void setID_aten(int ID_aten) {
        this.ID_aten = ID_aten;
    }

    //@Override
    public String toStringAtendente() {
        return "Atendente{" + "ID_aten=" + ID_aten + '}';
    }


    
}
