/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade01lp1;

import javax.swing.JLabel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


/**
 *
 * @author Carlos Torres
 */
public class ControleRemoto {
    //Atributos
	private String cor;
	private String modelo;
	private int nSerial;
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

	public int getnSerial() {
		return nSerial;
	}

	public void setnSerial(int nSerial) {
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
	
	public ControleRemoto() {
		status = false;
		carga = "Pilhas";
		modelo = "Universal";
		
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControleRemoto c1 = new ControleRemoto();
		c1.ligaDesliga(true);
		c1.playPause(false);
		c1.playPause(true);
		c1.mudaMusica(15);
		
	
		
		

	}

    JLabel getModelo(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
