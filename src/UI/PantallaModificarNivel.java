package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Negocio.ListadoUsuario;
import datos.Usuario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class PantallaModificarNivel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	ListadoUsuario listadousuario = new ListadoUsuario();
	private JTextField textFieldnivel;
			public void run() {
				try {
					PantallaModificarNivel frame = new PantallaModificarNivel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}

	/**
	 * Create the frame.
	 */
	public PantallaModificarNivel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		LinkedList<Usuario> usuario = listadousuario.LlenarListaUsuario();
		String[] UsuariosMostrar = new String[usuario.size()];
		for (Usuario usuarios : usuario) {
			UsuariosMostrar[usuario.indexOf(usuarios)] = usuarios.getNombre();}
		JComboBox comboBoxUsuario = new JComboBox(UsuariosMostrar);
		comboBoxUsuario.setBounds(140, 75, 134, 22);
		contentPane.add(comboBoxUsuario);
		
		textFieldnivel = new JTextField();
		textFieldnivel.setBounds(140, 121, 134, 20);
		contentPane.add(textFieldnivel);
		textFieldnivel.setColumns(10);
		
		JButton buttonModificar = new JButton("Modificar");
		buttonModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkedList<Usuario> usuario = listadousuario.LlenarListaUsuario();
				String[] UsuariosMostrar = new String[usuario.size()];
			
				if (comboBoxUsuario.getSelectedItem() != null) {
					JOptionPane.showMessageDialog(null, "La opcion elegida fue: " + comboBoxUsuario.getSelectedItem());
					for (Usuario usuarios : usuario) {
						if (usuarios.getNombre().equals(comboBoxUsuario.getSelectedItem())){
							
							int nivelNuevo=Integer.parseInt(textFieldnivel.getText());
							usuarios.setNivel(nivelNuevo);
							
							if(listadousuario.actualizar(usuarios)) {
								JOptionPane.showMessageDialog(null, "Usuario modificado con exito");
								//login();
								//PantallaGerente pantallagerente = new PantallaGerente();
								//pantallagerente.run();
								PantallaGerente pantallagerente = new PantallaGerente();
								pantallagerente.run();
							}else {
								JOptionPane.showMessageDialog(null, "Error al modificar usuario");
								//login();
								PantallaGerente pantallagerente = new PantallaGerente();
								pantallagerente.run();
							}
						} 
					}
				}
			}
		});
		buttonModificar.setBounds(165, 183, 89, 23);
		contentPane.add(buttonModificar);
		
		JLabel lblNewLabel = new JLabel("Modificar Nivel de Permiso");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(66, 11, 335, 57);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese nuevo nivel");
		lblNewLabel_1.setBounds(140, 108, 114, 14);
		contentPane.add(lblNewLabel_1);
		

	}
}
