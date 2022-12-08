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

public class PantallaExitoRegistro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					PantallaExitoRegistro frame = new PantallaExitoRegistro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

	}

	/**
	 * Create the frame.
	 */
	public PantallaExitoRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registrado Exitosamente!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(54, 34, 357, 132);
		contentPane.add(lblNewLabel);
		
		JButton btnNewiniciar = new JButton("Iniciar Sesion");
		btnNewiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla1 pantalla = new pantalla1();
				pantalla.run();
			}
		});
		btnNewiniciar.setBounds(142, 163, 137, 40);
		contentPane.add(btnNewiniciar);
	}

}
