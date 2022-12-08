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

public class PantallaGerente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
			public void run() {
				try {
					PantallaGerente frame = new PantallaGerente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
	}

	/**
	 * Create the frame.
	 */
	public PantallaGerente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabelEncabe = new JLabel("Bienvenido Gerente");
		lblNewLabelEncabe.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabelEncabe.setBounds(103, 0, 233, 60);
		contentPane.add(lblNewLabelEncabe);
		
		JButton btnNewAgregarProducto = new JButton("Agregar Producto");
		btnNewAgregarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaIngresarProductoGerente gerentproduct = new PantallaIngresarProductoGerente();
				gerentproduct.run();
			}
		});
		btnNewAgregarProducto.setBounds(52, 70, 147, 23);
		contentPane.add(btnNewAgregarProducto);
		
		JButton btnEliminarProducto = new JButton("Eliminar Producto");
		btnEliminarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaEliminarProductoGerente elininarprod = new PantallaEliminarProductoGerente();
				elininarprod.run();
			}
		});
		btnEliminarProducto.setBounds(228, 70, 147, 23);
		contentPane.add(btnEliminarProducto);
		
		JButton btnModificarProducto = new JButton("Modificar Producto");
		btnModificarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaModificarProductoGerente modd = new PantallaModificarProductoGerente();
				modd.run();
			}
		});
		btnModificarProducto.setBounds(52, 104, 147, 23);
		contentPane.add(btnModificarProducto);
		
		JButton btnEliminarUsuario = new JButton("Eliminar Usuario");
		btnEliminarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaEliminarUsuario eliminar = new PantallaEliminarUsuario();
				eliminar.run();
			}
		});
		btnEliminarUsuario.setBounds(228, 104, 147, 23);
		contentPane.add(btnEliminarUsuario);
		
		JButton btnModificarPermisos = new JButton("Modificar Permisos");
		btnModificarPermisos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PantallaModificarNivel pantallanivel = new PantallaModificarNivel();
				pantallanivel.run();
			}
		});
		btnModificarPermisos.setBounds(228, 138, 147, 23);
		contentPane.add(btnModificarPermisos);
		
		JButton btnArmarPedido = new JButton("Armar Pedido");
		btnArmarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//InterfazGerente interfazgerente = new InterfazGerente();
				//interfazgerente.CrearPedido();
				PantallaCrearPedido pantallapedido = new PantallaCrearPedido();
				pantallapedido.run();
			}
		});
		btnArmarPedido.setBounds(52, 138, 147, 23);
		contentPane.add(btnArmarPedido);
		
		JButton btnCancelarPedido = new JButton("Cancelar Pedido");
		btnCancelarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaCancelarPedidoGerente pangerente = new PantallaCancelarPedidoGerente();
				pangerente.run();
			}
		});
		btnCancelarPedido.setBounds(52, 172, 147, 23);
		contentPane.add(btnCancelarPedido);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterfazGerente interfazgerente = new InterfazGerente();
				interfazgerente.Salir();
			}
		});
		btnSalir.setBounds(228, 206, 147, 23);
		contentPane.add(btnSalir);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla1 Pantalla = new pantalla1();
				Pantalla.run();
			}
		});
		btnLogout.setBounds(228, 172, 147, 23);
		contentPane.add(btnLogout);
	}

}
