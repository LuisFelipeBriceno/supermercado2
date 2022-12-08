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

public class PantallaPedidoExito extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					PantallaPedidoExito frame = new PantallaPedidoExito();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

	}

	/**
	 * Create the frame.
	 */
	public PantallaPedidoExito() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabelpedido = new JLabel("Pedido Agregado!");
		lblNewLabelpedido.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
		lblNewLabelpedido.setBounds(97, 48, 286, 111);
		contentPane.add(lblNewLabelpedido);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaVentas ventas = new PantallaVentas();
				ventas.run();
			}
		});
		btnNewButton.setBounds(159, 182, 110, 35);
		contentPane.add(btnNewButton);
	}
}
