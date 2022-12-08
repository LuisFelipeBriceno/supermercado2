package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Negocio.ListadoProducto;
import datos.Producto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class PantallaModificarProducto extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldnombre;
	private JTextField textFieldcantidad;
	private JTextField textFieldprecio;

	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					PantallaModificarProducto frame = new PantallaModificarProducto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}


	/**
	 * Create the frame.
	 */
	public PantallaModificarProducto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modifique su producto");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(93, 0, 424, 77);
		contentPane.add(lblNewLabel);
		
		ListadoProducto listadoproducto = new ListadoProducto();
		List<Producto> MostrarProductos = listadoproducto.MostrarProductos();
		String[] ProductosAmostrar = new String[MostrarProductos.size()];
		for (Producto producto : MostrarProductos) {
			ProductosAmostrar[MostrarProductos.indexOf(producto)] = producto.getNombre();}
		JComboBox comboBoxProducto = new JComboBox(ProductosAmostrar);
		comboBoxProducto.setBounds(118, 66, 174, 22);
		contentPane.add(comboBoxProducto);
		
		JButton btnNewButtonmodificar = new JButton("Modificar");
		btnNewButtonmodificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				if (comboBoxProducto.getSelectedItem() != null) {
					//JOptionPane.showMessageDialog(null, "La opcion elegida fue: " + comboBoxProducto.getSelectedItem());
					for (Producto producto : MostrarProductos) {
						if (producto.getNombre().equals(comboBoxProducto.getSelectedItem())){
							
							String nombreNuevo = textFieldnombre.getText();
							int cantidadNuevo = Integer.parseInt(textFieldcantidad.getText());
							double precioNuevo = Double.parseDouble(textFieldprecio.getText());
							producto.setNombre(nombreNuevo);
							producto.setCantidad(cantidadNuevo);
							producto.setPrecio(precioNuevo);
							if(listadoproducto.actualizar(producto)) {
								PantallaExitoModificarProduct product = new PantallaExitoModificarProduct();
								product.run();
							}else {
								PantallaErrorModificarProducto error = new PantallaErrorModificarProducto();
								error.run();
							}
						} 
					}
				}
			}
		});
		btnNewButtonmodificar.setBounds(162, 227, 89, 23);
		contentPane.add(btnNewButtonmodificar);
		

		
		textFieldnombre = new JTextField();
		textFieldnombre.setBounds(118, 109, 174, 20);
		contentPane.add(textFieldnombre);
		textFieldnombre.setColumns(10);
		
		textFieldcantidad = new JTextField();
		textFieldcantidad.setColumns(10);
		textFieldcantidad.setBounds(118, 150, 174, 20);
		contentPane.add(textFieldcantidad);
		
		textFieldprecio = new JTextField();
		textFieldprecio.setColumns(10);
		textFieldprecio.setBounds(118, 192, 174, 20);
		contentPane.add(textFieldprecio);
		
		JLabel lblNewLabel_1 = new JLabel("ingrese nombre");
		lblNewLabel_1.setBounds(118, 94, 133, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ingrese cantidad");
		lblNewLabel_1_1.setBounds(118, 135, 133, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ingrese precio");
		lblNewLabel_1_1_1.setBounds(118, 177, 133, 14);
		contentPane.add(lblNewLabel_1_1_1);
	}

}
