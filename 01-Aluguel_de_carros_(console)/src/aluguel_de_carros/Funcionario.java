/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguel_de_carros;

/**
 *
 * @author gabrielsg
 */
public abstract class Funcionario {
    private String Nome_fun;
    private String CPF_fun;
    private String Cel_fun;

    public Funcionario(String Nome_fun, String CPF_fun, String Cel_fun) {
        this.Nome_fun = Nome_fun;
        this.CPF_fun = CPF_fun;
        this.Cel_fun = Cel_fun;
    }

    public String getNome_fun() {
        return Nome_fun;
    }

    public void setNome_fun(String Nome_fun) {
        this.Nome_fun = Nome_fun;
    }

    public String getCPF_fun() {
        return CPF_fun;
    }

    public void setCPF_fun(String CPF_fun) {
        this.CPF_fun = CPF_fun;
    }

    public String getCel_fun() {
        return Cel_fun;
    }

    public void setCel_fun(String Cel_fun) {
        this.Cel_fun = Cel_fun;
    }

    //@Override
    public String toStringFuncionario() {
        return "Funcionario{" + "Nome_fun=" + Nome_fun + ", CPF_fun=" + CPF_fun + ", Cel_fun=" + Cel_fun + '}';
    }
    
}
