/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;

/**
 *
 * @author User
 */
public abstract class Veiculo {
  private float potencia_motor;
  private float velocidade;
  private String tipo;
  private String cor;
  private float [] tamanho= new float[3];
  private float peso;

    public Veiculo(float potencia_motor, String tipo, String cor, float peso) {
        this.potencia_motor = potencia_motor;
        this.tipo = tipo;
        this.cor = cor;
        this.peso = peso;
        
    }
    public abstract float calcula_velocidade();
    
    public float getPotencia_motor() {
        return potencia_motor;
    }

    public void setPotencia_motor(float potencia_motor) {
        this.potencia_motor = potencia_motor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float[] getTamanho() {
        return tamanho;
    }

    public void setTamanho(float[] tamanho) {
        this.tamanho = tamanho;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float volume_aproximado(float[]tamanho)
    {
        float tamanho_tempo = (float) 0.0;
        for (int i=0;i<tamanho.length;i++)
            tamanho_tempo=tamanho_tempo * tamanho[i];
            return tamanho_tempo;    
    }
    
    /*@Override*/
    public String toStringVeiculo() {
        return "Veiculo{" + "potencia_motor=" + potencia_motor + ", velocidade=" + velocidade + ", tipo=" + tipo + ", cor=" + cor + ", peso=" + peso + '}';
    }
    
}

  