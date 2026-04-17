/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguel_de_carros;

/**
 *
 * @author gabrielsg
 */
public class Atender {
    private String Nome_cli;
    private String Nome_vend;
    private String Data_vend;

    public Atender(String Nome_cli, String Nome_vend, String Data_vend) {
        this.Nome_cli = Nome_cli;
        this.Nome_vend = Nome_vend;
        this.Data_vend = Data_vend;
    }

    public String getNome_cli() {
        return Nome_cli;
    }

    public void setNome_cli(String Nome_cli) {
        this.Nome_cli = Nome_cli;
    }

    public String getNome_vend() {
        return Nome_vend;
    }

    public void setNome_vend(String Nome_vend) {
        this.Nome_vend = Nome_vend;
    }

    public String getData_vend() {
        return Data_vend;
    }

    public void setData_vend(String Data_vend) {
        this.Data_vend = Data_vend;
    }

    //@Override
    public String toStringAtender() {
        return "Atender{" + "Nome_cli=" + Nome_cli + ", Nome_vend=" + Nome_vend + ", Data_vend=" + Data_vend + '}';
    }
}
