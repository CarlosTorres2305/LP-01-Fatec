/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atividade01lp1;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Carlos Torres
 */
public class Atividade01LP1 {
    public static void main(String[] args) throws IOException {
        ControleRemoto c1 = new ControleRemoto();
        c1.setModelo("Universal");
        c1.setCor("Azul");
        c1.setnSerial(1222);
        c1.setCarga("Pilhas");
        String caminho = "C:\\Users\\Carlos Torres\\Desktop\\arquivo.csv";
        
        //Gerando Arquivo.csv
        FileWriter controle = new FileWriter(caminho);
        controle.write("NOVO CONTROLE\n");
        controle.write("Modelo: " + c1.getModelo()+"\n");
        controle.write("Cor: " + c1.getCor()+"\n");
        controle.write("Num. Serie: " + c1.getnSerial()+"\n");
        controle.write("Carga: " + c1.getCarga()+"\n");
        controle.close();
    }
}
