package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaRegistro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					PantallaRegistro frame = new PantallaRegistro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

	}

	/**
	 * Create the frame.
	 */
	public PantallaRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabelencabezado = new JLabel("Seleccione su Rol");
		lblNewLabelencabezado.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabelencabezado.setBounds(101, 11, 275, 73);
		contentPane.add(lblNewLabelencabezado);
		
		JButton btnNewButtonOperario = new JButton("Operario");
		btnNewButtonOperario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaRegistroOperario pantallaregistrooperario = new PantallaRegistroOperario();
				pantallaregistrooperario.run();
			}
		});
		btnNewButtonOperario.setBounds(125, 83, 168, 30);
		contentPane.add(btnNewButtonOperario);
		
		JButton btnNewButtonVentas = new JButton("Ventas");
		btnNewButtonVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaRegistroVentas pantallaventas = new PantallaRegistroVentas();
				pantallaventas.run();
			}
		});
		btnNewButtonVentas.setBounds(125, 124, 168, 30);
		contentPane.add(btnNewButtonVentas);
		
		JButton btnNewButtonGerente = new JButton("Gerente");
		btnNewButtonGerente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaRegistroGerente pantallar = new PantallaRegistroGerente();
				pantallar.run();
			}
		});
		btnNewButtonGerente.setBounds(125, 165, 168, 30);
		contentPane.add(btnNewButtonGerente);
		
		JButton btnNewButtonVolver = new JButton("Volver");
		btnNewButtonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla1 pantalla11 = new pantalla1();
				pantalla11.run();
			}
		});
		btnNewButtonVolver.setBounds(125, 206, 168, 30);
		contentPane.add(btnNewButtonVolver);
	}

}
