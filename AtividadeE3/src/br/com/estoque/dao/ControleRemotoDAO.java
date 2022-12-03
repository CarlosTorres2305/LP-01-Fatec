package br.com.estoque.dao;

import br.com.controle.factory.ConnectionFactory;
import com.mycompany.atividade01lp1.ControleRemoto;
import java.sql.Connection;
import java.sql.PreparedStatement;



public class ControleRemotoDAO {
    public void save(ControleRemoto controle){
        String sql = "INSERT INTO controles(cor, modelo, nSerial, carga) VALUES (?, ?, ?, ?)";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, controle.getCor());
            pstm.setString(2, controle.getModelo());
            pstm.setInt(3, controle.getnSerial());
            pstm.setString(4, controle.getCarga());
            
            pstm.execute();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(pstm!=null){
                    pstm.close();
                }
                if(conn!=null){
                    conn.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}