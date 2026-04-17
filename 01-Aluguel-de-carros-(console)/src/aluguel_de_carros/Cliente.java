/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguel_de_carros;

/**
 *
 * @author gabrielsg
 */
public class Cliente {
    private String Nome_cli;
    private String CPF_cli;
    private String Tel_cli;

    public Cliente(String Nome_cli, String CPF_cli, String Tel_cli) {
        this.Nome_cli = Nome_cli;
        this.CPF_cli = CPF_cli;
        this.Tel_cli = Tel_cli;
    }

    public String getNome_cli() {
        return Nome_cli;
    }

    public void setNome_cli(String Nome_cli) {
        this.Nome_cli = Nome_cli;
    }

    public String getCPF_cli() {
        return CPF_cli;
    }

    public void setCPF_cli(String CPF_cli) {
        this.CPF_cli = CPF_cli;
    }

    public String getTel_cli() {
        return Tel_cli;
    }

    public void setTel_cli(String Tel_cli) {
        this.Tel_cli = Tel_cli;
    }

    //@Override
    public String toStringCliente() {
        return "Cliente{" + "Nome_cli=" + Nome_cli + ", CPF_cli=" + CPF_cli + ", Tel_cli=" + Tel_cli + '}';
    }
}
