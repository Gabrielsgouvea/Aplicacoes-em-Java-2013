/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguel_de_carros;

/**
 *
 * @author gabrielsg
 */
public class Carro {
    private String Ano;
    private String Nome_car;
    private String Placa;

    public Carro(String Ano, String Nome_car, String Placa) {
        this.Ano = Ano;
        this.Nome_car = Nome_car;
        this.Placa = Placa;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String Ano) {
        this.Ano = Ano;
    }

    public String getNome_car() {
        return Nome_car;
    }

    public void setNome_car(String Nome_car) {
        this.Nome_car = Nome_car;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    //@Override
    public String toStringCarro() {
        return "Carro{" + "Ano=" + Ano + ", Nome_car=" + Nome_car + ", Placa=" + Placa + '}';
    }
}
