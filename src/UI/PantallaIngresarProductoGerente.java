package UI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import datos.Producto;

public class PantallaIngresarProductoGerente extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldnombre;
	private JTextField textFieldcantidad;
	private JTextField textFieldprecio;

	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					PantallaIngresarProductoGerente frame = new PantallaIngresarProductoGerente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}


	/**
	 * Create the frame.
	 */
	public PantallaIngresarProductoGerente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton ButtonProducto = new JButton("Agregar");
		ButtonProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Producto producto = new Producto();
				producto.setNombre(textFieldnombre.getText());
				producto.setCantidad(Integer.parseInt(textFieldcantidad.getText()));
				producto.setPrecio(Double.parseDouble(textFieldprecio.getText()));
				if (producto.guardarProducto(producto)) {
					PantallaExitoProductoGerente exitoge = new PantallaExitoProductoGerente();
					exitoge.run();
				} else {
					PantallaFallaProducto falla = new PantallaFallaProducto();
					falla.run();
				}
			}
		});
		ButtonProducto.setBounds(161, 187, 89, 23);
		contentPane.add(ButtonProducto);
		
		textFieldnombre = new JTextField();
		textFieldnombre.setBounds(131, 69, 150, 20);
		contentPane.add(textFieldnombre);
		textFieldnombre.setColumns(10);
		
		textFieldcantidad = new JTextField();
		textFieldcantidad.setColumns(10);
		textFieldcantidad.setBounds(131, 111, 150, 20);
		contentPane.add(textFieldcantidad);
		
		textFieldprecio = new JTextField();
		textFieldprecio.setColumns(10);
		textFieldprecio.setBounds(131, 156, 150, 20);
		contentPane.add(textFieldprecio);
		
		JLabel lblNewLabel = new JLabel("Ingrese Producto");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(118, 11, 209, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese nombre");
		lblNewLabel_1.setBounds(131, 54, 132, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingrese cantidad");
		lblNewLabel_1_1.setBounds(131, 98, 132, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabelPrecio = new JLabel("Ingrese precio");
		lblNewLabelPrecio.setBounds(131, 142, 132, 14);
		contentPane.add(lblNewLabelPrecio);
	}
}
