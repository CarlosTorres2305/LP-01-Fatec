/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeE2;

/**
 *
 * @author Carlos Torres
 */
public class ControleRemoto {
     //Atributos
	private String cor;
	private String modelo;
	private String nSerial;
	private boolean status;
	private String carga;
	
	//Metodos especiais
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getnSerial() {
		return nSerial;
	}

	public void setnSerial(String nSerial) {
		this.nSerial = nSerial;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean s) {
		this.status = s;
	}

	public String getCarga() {
		return carga;
	}

	public void setCarga(String carga) {
		this.carga = carga;
	}
	
	//Metodos personalizados

    public ControleRemoto(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
        //this.nSerial = nSerial;
        //this.carga = carga;
        //this.status = false;
    }
	
	
	public void ligaDesliga(boolean onBut) {
		if (onBut == false){
			System.out.println("O controle está Desligado");
		} else {
			System.out.println("O controle está Ligado");
			this.setStatus(true);
		}
	}
	
	public void volume(int v) {
		System.out.println("Volume " + v);
	}
	
	public void busca(int b) {
		if (this.getStatus() == false) {
			System.out.println("Impossível buscar, controle desligado");
		} else {
			System.out.println("Música: " + b);
		}	
	}
	
	public void mudaMusica(int m) {
		System.out.println("Faixa atual " + m);
		System.out.println("Próxima faixa " + (m+1));
	}
	
	public void playPause(boolean play) {
		if (play == false) {
			System.out.println("Pausado");
		} else {
			System.out.println("Tocando");
		}
	}
}
