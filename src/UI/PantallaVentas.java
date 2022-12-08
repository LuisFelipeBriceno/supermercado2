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

public class PantallaVentas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
			public void run() {
				try {
					PantallaVentas frame = new PantallaVentas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
	}

	/**
	 * Create the frame.
	 */
	public PantallaVentas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabelEncabe = new JLabel("Bienvenido Ventas");
		lblNewLabelEncabe.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabelEncabe.setBounds(107, 0, 225, 53);
		contentPane.add(lblNewLabelEncabe);
		
		JButton btnArmarPedido = new JButton("Armar Pedido");
		btnArmarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaCrearPedido pantallapedido = new PantallaCrearPedido();
				pantallapedido.run();
			}
		});
		btnArmarPedido.setBounds(107, 52, 203, 31);
		contentPane.add(btnArmarPedido);
		
		JButton btnCancelarPedido = new JButton("Cancelar Pedido");
		btnCancelarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaCancelarPedido pantallacancel = new PantallaCancelarPedido();
				pantallacancel.run();
			}
		});
		btnCancelarPedido.setBounds(107, 94, 203, 31);
		contentPane.add(btnCancelarPedido);
		
		JButton btnVerStock = new JButton("Ver Stock");
		btnVerStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TablaProducto tablaproducto = new TablaProducto();
				tablaproducto.MostrarProducto();
				tablaproducto.setVisible(true);			
			}
		});
		btnVerStock.setBounds(107, 136, 203, 31);
		contentPane.add(btnVerStock);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interfaz interfaz = new Interfaz();
				interfaz.Salir();
			}
		});
		btnSalir.setBounds(107, 219, 203, 31);
		contentPane.add(btnSalir);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla1 Pantalla = new pantalla1();
				Pantalla.run();
			}
		});
		btnLogout.setBounds(107, 178, 203, 31);
		contentPane.add(btnLogout);
	}

}
