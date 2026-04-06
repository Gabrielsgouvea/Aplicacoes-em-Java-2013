/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;

/**
 *
 * @author User
 */
public class Aviao extends Veiculo{
    private String modelo;
    private String cor;
    private int velocidade;

    @Override
    public float calcula_velocidade() {
    throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    public Aviao(int tamanho, String modelo, float potencia_motor, String tipo, String cor, float peso) {
        super(potencia_motor, tipo, cor, peso);
        this.modelo = modelo;
        this.cor = cor;
    }

    //@Override
    public String toStringAviao() {
        return "Aviao{" + "modelo=" + modelo + ", cor=" + cor + ", velocidade=" + velocidade + '}';
    }
    
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    
    
}
