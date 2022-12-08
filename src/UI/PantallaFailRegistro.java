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

public class PantallaFailRegistro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					PantallaFailRegistro frame = new PantallaFailRegistro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

	}

	/**
	 * Create the frame.
	 */
	public PantallaFailRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblErrorAlRegistrarse = new JLabel("Error al Registrarse ");
		lblErrorAlRegistrarse.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblErrorAlRegistrarse.setBounds(88, 0, 357, 132);
		contentPane.add(lblErrorAlRegistrarse);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla1 pantalla = new pantalla1();
				pantalla.run();
			}
		});
		btnOk.setBounds(142, 170, 137, 40);
		contentPane.add(btnOk);
		
		JLabel lblIngreseCorrectamenteLos = new JLabel("Ingrese Correctamente los datos");
		lblIngreseCorrectamenteLos.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblIngreseCorrectamenteLos.setBounds(10, 47, 411, 132);
		contentPane.add(lblIngreseCorrectamenteLos);
	}

}
