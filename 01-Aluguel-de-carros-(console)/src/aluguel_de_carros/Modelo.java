/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguel_de_carros;

/**
 *
 * @author gabrielsg
 */
public class Modelo {
    private String Nome_md;
    private String Cor;
    private double Velocidade;

    public Modelo(String Nome_md, String Cor, double Velocidade) {
        this.Nome_md = Nome_md;
        this.Cor = Cor;
        this.Velocidade = Velocidade;
    }

    public String getNome_md() {
        return Nome_md;
    }

    public void setNome_md(String Nome_md) {
        this.Nome_md = Nome_md;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public double getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(double Velocidade) {
        this.Velocidade = Velocidade;
    }

    //@Override
    public String toStringModelo() {
        return "Modelo{" + "Nome_md=" + Nome_md + ", Cor=" + Cor + ", Velocidade=" + Velocidade + '}';
    }
}
