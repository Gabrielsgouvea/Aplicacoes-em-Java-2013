/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguel_de_carros;

/**
 *
 * @author gabrielsg
 */
public class Alugar {
    private String Nome_cli;
    private String Nome_car;
    private String Data;

    public Alugar(String Nome_cli, String Nome_car, String Data) {
        this.Nome_cli = Nome_cli;
        this.Nome_car = Nome_car;
        this.Data = Data;
    }

    public String getNome_cli() {
        return Nome_cli;
    }

    public void setNome_cli(String Nome_cli) {
        this.Nome_cli = Nome_cli;
    }

    public String getNome_car() {
        return Nome_car;
    }

    public void setNome_car(String Nome_car) {
        this.Nome_car = Nome_car;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    //@Override
    public String toStringAlugar() {
        return "Alugar{" + "Nome_cli=" + Nome_cli + ", Nome_car=" + Nome_car + ", Data=" + Data + '}';
    }
}
