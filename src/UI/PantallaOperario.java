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

public class PantallaOperario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
			public void run() {
				try {
					PantallaOperario frame = new PantallaOperario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}		
	}

	/**
	 * Create the frame.
	 */
	public PantallaOperario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabelEncabe = new JLabel("Bienvenido Operario");
		lblNewLabelEncabe.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabelEncabe.setBounds(99, -12, 233, 66);
		contentPane.add(lblNewLabelEncabe);
		
		JButton btnNewProducto = new JButton("Agregar Producto");
		btnNewProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaIngresarProducto producto = new PantallaIngresarProducto();
				producto.run();
			}
		});
		btnNewProducto.setBounds(109, 49, 203, 32);
		contentPane.add(btnNewProducto);
		
		JButton btnEliminarProducto = new JButton("Eliminar Producto");
		btnEliminarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaEliminarProducto eliminar = new PantallaEliminarProducto();
				eliminar.run();
			}
		});
		btnEliminarProducto.setBounds(109, 92, 203, 32);
		contentPane.add(btnEliminarProducto);
		
		JButton btnModificarProducto = new JButton("Modificar Producto");
		btnModificarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaModificarProducto product = new PantallaModificarProducto();
				product.run();
			}
		});
		btnModificarProducto.setBounds(109, 135, 203, 32);
		contentPane.add(btnModificarProducto);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interfaz interfaz = new Interfaz();
				interfaz.Salir();
			}
		});
		btnSalir.setBounds(109, 218, 203, 32);
		contentPane.add(btnSalir);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla1 Pantalla = new pantalla1();
				Pantalla.run();
			}
		});
		btnLogout.setBounds(109, 176, 203, 32);
		contentPane.add(btnLogout);
	}

}
