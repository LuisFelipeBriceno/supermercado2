package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Negocio.ListadoUsuario;
import datos.Operario;
import datos.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaRegistroOperario extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsuario;
	private JTextField textFieldPassword;
	private JTextField textFielddni;

	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					PantallaRegistroOperario frame = new PantallaRegistroOperario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

	}

	/**
	 * Create the frame.
	 */
	public PantallaRegistroOperario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEncabezado = new JLabel("Registro");
		lblEncabezado.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblEncabezado.setBounds(156, 0, 212, 75);
		contentPane.add(lblEncabezado);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(102, 92, 212, 20);
		contentPane.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(102, 132, 212, 20);
		contentPane.add(textFieldPassword);
		
		textFielddni = new JTextField();
		textFielddni.setColumns(10);
		textFielddni.setBounds(102, 174, 212, 20);
		contentPane.add(textFielddni);
		
		JButton btnNewButtonRegistro = new JButton("Registrarse");
		btnNewButtonRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListadoUsuario Usuarios = new ListadoUsuario();			
				Operario operarios = new Operario();
				operarios.setDni(textFielddni.getText());
				operarios.setNombre(textFieldUsuario.getText());
				operarios.setPassword(textFieldPassword.getText());
				operarios.setNivel(0);
				
				if(Usuarios.add(operarios)) {
					 
					//JOptionPane.showMessageDialog(null, "Se agregó correctamente el Operario.");
					 
					PantallaExitoRegistro exito = new PantallaExitoRegistro();
					exito.run();
				 }else {
					 //JOptionPane.showMessageDialog(null, "No se pudo agregar correctamente el Operario intente nuevamente ingresando correctamente los datos.");
					 PantallaFailRegistro fail = new PantallaFailRegistro();
					 fail.run();
				 }
			}
		});
		btnNewButtonRegistro.setBounds(124, 213, 169, 23);
		contentPane.add(btnNewButtonRegistro);
		
		JLabel lblUsuario = new JLabel("Nombre Usuario");
		lblUsuario.setBounds(102, 77, 128, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(102, 118, 128, 14);
		contentPane.add(lblPassword);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(102, 159, 128, 14);
		contentPane.add(lblDni);
	}
}
