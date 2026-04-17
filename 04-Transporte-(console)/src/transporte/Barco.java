/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;

/**
 *
 * @author User
 */
public class Barco extends Veiculo {
    private int qtde_boias;
    private boolean cobertura;

    public Barco(int qtde_boias, boolean cobertura, float potencia_motor, String tipo, String cor, float peso) {
        super(potencia_motor, tipo, cor, peso);
        this.qtde_boias = qtde_boias;
        this.cobertura = cobertura;
    }

    @Override
    public float calcula_velocidade() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getQtde_boias() {
        return qtde_boias;
    }

    public void setQtde_boias(int qtde_boias) {
        this.qtde_boias = qtde_boias;
    }

    public boolean isCobertura() {
        return cobertura;
    }

    public void setCobertura(boolean cobertura) {
        this.cobertura = cobertura;
    }

    
    public String toStringBarco() {
        return "Barco{" + "qtde_boias=" + qtde_boias + ", cobertura=" + cobertura + '}';
    }
    
}
