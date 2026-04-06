/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

/**
 *
 * @author Mauricio
 */
public class Programa {

    private float  altura;
    private int    idade;
    private String nome;

    public Programa(float altura, int idade, String nome) {
        this.altura = altura;
        this.idade  = idade;
        this.nome   = nome;
    }
    
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
