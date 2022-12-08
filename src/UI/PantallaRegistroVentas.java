package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Negocio.ListadoUsuario;
import datos.Adminventas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaRegistroVentas extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUSuario;
	private JTextField textFieldPassword;
	private JTextField textFielddni;

	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					PantallaRegistroVentas frame = new PantallaRegistroVentas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

	}

	/**
	 * Create the frame.
	 */
	public PantallaRegistroVentas() {
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
		
		JLabel lblUsuario = new JLabel("Nombre Usuario");
		lblUsuario.setBounds(102, 77, 128, 14);
		contentPane.add(lblUsuario);
		
		textFieldUSuario = new JTextField();
		textFieldUSuario.setColumns(10);
		textFieldUSuario.setBounds(102, 92, 212, 20);
		contentPane.add(textFieldUSuario);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(102, 118, 128, 14);
		contentPane.add(lblPassword);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(102, 132, 212, 20);
		contentPane.add(textFieldPassword);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(102, 159, 128, 14);
		contentPane.add(lblDni);
		
		textFielddni = new JTextField();
		textFielddni.setColumns(10);
		textFielddni.setBounds(102, 174, 212, 20);
		contentPane.add(textFielddni);
		
		JButton btnNewButtonRegistro = new JButton("Registrarse");
		btnNewButtonRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListadoUsuario Usuarios = new ListadoUsuario();
				Adminventas adminventa = new Adminventas();
				adminventa.setDni(textFielddni.getText());
				adminventa.setNombre(textFieldUSuario.getText());
				adminventa.setPassword(textFieldPassword.getText());
				adminventa.setNivel(1);
				
				if(Usuarios.add(adminventa)) {
					 //JOptionPane.showMessageDialog(null, "Se agregó correctamente el Adminventas.");
					// Login();
					PantallaExitoRegistro exito = new PantallaExitoRegistro();
					exito.run();
				 }else {
					 //JOptionPane.showMessageDialog(null, "No se pudo agregar correctamente el Adminventas.");
					 PantallaFailRegistro fail = new PantallaFailRegistro();
					 fail.run();
				 }
			}
		});
		btnNewButtonRegistro.setBounds(124, 213, 169, 23);
		contentPane.add(btnNewButtonRegistro);
	}

}
