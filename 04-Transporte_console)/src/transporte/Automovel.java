/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;


    /**
 *
 * @author User
 */
public  class Automovel extends Veiculo {
    private int qtde_rodas;
    private boolean vidro_automatico;
    private boolean air_bag;

    public Automovel(int qtde_rodas, boolean vidro_automatico, boolean air_bag, float potencia_motor, String tipo, String cor, float peso) {    
        super(potencia_motor, tipo, cor, peso);/*super referencia da classe pai */
        this.qtde_rodas = qtde_rodas;
        this.vidro_automatico = vidro_automatico;
        this.air_bag = air_bag;
    }

    /*@Override*/
    public float calcula_velocidade() {
       return (super.getPotencia_motor()/super.getPeso()) + 2*qtde_rodas;
    }

    
   
   
    
    public int getQtde_rodas() {
        return qtde_rodas;
    }

    public void setQtde_rodas(int qtde_rodas) {
        this.qtde_rodas = qtde_rodas;
    }

    public boolean isVidro_automatico() {
        return vidro_automatico;
    }

    public void setVidro_automatico(boolean vidro_automatico) {
        this.vidro_automatico = vidro_automatico;
    }

    public boolean isAir_bag() {
        return air_bag;
    }

    public void setAir_bag(boolean air_bag) {
        this.air_bag = air_bag;
    }

     public String toStringCarro() {
        return "Automovel{" + "qtde_rodas=" + qtde_rodas + ", vidro_automatico=" + vidro_automatico + ", air_bag=" + air_bag + '}';
    }
}
    
 
