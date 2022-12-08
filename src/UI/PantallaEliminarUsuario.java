package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Negocio.ListadoUsuario;
import datos.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class PantallaEliminarUsuario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					PantallaEliminarUsuario frame = new PantallaEliminarUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}


	/**
	 * Create the frame.
	 */
	public PantallaEliminarUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleccione Usuario a Borrar");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(69, 30, 365, 65);
		contentPane.add(lblNewLabel);
		
		ListadoUsuario listadousuario = new ListadoUsuario();
		LinkedList<Usuario> usuario = listadousuario.LlenarListaUsuario();
		String[] UsuariosMostrar = new String[usuario.size()];
		for (Usuario usuarios : usuario) {
			UsuariosMostrar[usuario.indexOf(usuarios)] = usuarios.getNombre();}
		JComboBox comboBoxusuario = new JComboBox(UsuariosMostrar);
		comboBoxusuario.setBounds(127, 113, 163, 22);
		contentPane.add(comboBoxusuario);
		
		JButton btnNewButton = new JButton("Eliminar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (comboBoxusuario.getSelectedItem() != null) {				
					for (Usuario usuarios : usuario) {
						if (usuarios.getNombre().equals(comboBoxusuario.getSelectedItem())){
							if(listadousuario.remove(usuarios)) {
								PantallaEixoEliminarUsuario eliminar = new PantallaEixoEliminarUsuario();
								eliminar.run();
							}else {
								PantallaErrorEliminarUsuario erro = new PantallaErrorEliminarUsuario();
								erro.run();
							}
						} 
					}
				}
			}
		});
		btnNewButton.setBounds(163, 204, 89, 23);
		contentPane.add(btnNewButton);
		

	}

}
