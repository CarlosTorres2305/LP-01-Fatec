package com.mycompany.atividade01lp1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;

import br.com.estoque.dao.ControleRemotoDAO;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela_ControleRemoto extends JFrame {

	private JPanel contentPane;
	private JTextField txtSerial;
	private JTextField txtCor;
	private JTextField txtModelo;
	private JTextField txtCarga;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_ControleRemoto frame = new Tela_ControleRemoto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela_ControleRemoto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Controles");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(24, 11, 198, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Serial");
		lblNewLabel_1.setBounds(24, 60, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cor");
		lblNewLabel_2.setBounds(24, 97, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Modelo");
		lblNewLabel_3.setBounds(24, 127, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Carga");
		lblNewLabel_4.setBounds(24, 162, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		txtSerial = new JTextField();
		txtSerial.setBounds(80, 57, 86, 20);
		contentPane.add(txtSerial);
		txtSerial.setColumns(10);
		
		txtCor = new JTextField();
		txtCor.setBounds(81, 94, 86, 20);
		contentPane.add(txtCor);
		txtCor.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(81, 124, 86, 20);
		contentPane.add(txtModelo);
		txtModelo.setColumns(10);
		
		txtCarga = new JTextField();
		txtCarga.setBounds(81, 159, 86, 20);
		contentPane.add(txtCarga);
		txtCarga.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControleRemotoDAO controleRemotoDao = new ControleRemotoDAO();
				ControleRemoto controle = new ControleRemoto();
		        controle.setCor(txtCor.getText());
		        controle.setModelo(txtModelo.getText());
		        controle.setnSerial(Integer.parseInt(txtSerial.getText()));
		        controle.setCarga(txtCarga.getText());
		        controleRemotoDao.save(controle);
		        
		        txtCor.setText("");
		        txtModelo.setText("");
		        txtSerial.setText("");
		        txtCarga.setText("");
		        
		        JOptionPane.showMessageDialog(null,"Cadastro efetuado com sucesso!");
			}
		});
		btnCadastrar.setBounds(73, 209, 149, 41);
		contentPane.add(btnCadastrar);
	}
}
