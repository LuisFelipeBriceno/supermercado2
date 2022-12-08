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
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class PantallaEliminarProducto extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					PantallaEliminarProducto frame = new PantallaEliminarProducto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}


	/**
	 * Create the frame.
	 */
	public PantallaEliminarProducto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleccione Producto a eliminar");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(50, 11, 395, 85);
		contentPane.add(lblNewLabel);
		
		ListadoProducto listadoproducto = new ListadoProducto();
		 List<Producto> MostrarProductos = listadoproducto.MostrarProductos();
         String[] ProductosAmostrar = new String[MostrarProductos.size()];
         for (Producto producto : MostrarProductos) {
             ProductosAmostrar[MostrarProductos.indexOf(producto)] = producto.getNombre();}
		JComboBox comboBoxProducto = new JComboBox(ProductosAmostrar);
		comboBoxProducto.setBounds(142, 107, 142, 22);
		contentPane.add(comboBoxProducto);
		
		JButton btnNewButtonEliminar = new JButton("Eliminar");
		btnNewButtonEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
               
                if (comboBoxProducto.getSelectedItem() != null) {
                    //JOptionPane.showMessageDialog(null, "La opcion elegida fue: " + comboBoxProducto.getSelectedItem());
                    for (Producto producto : MostrarProductos) {
                        if (producto.getNombre().equals(comboBoxProducto.getSelectedItem())){
                            if(listadoproducto.remove(producto)) {
                            	PantallaExitoEliminarProducto eliminar = new PantallaExitoEliminarProducto();
                            	eliminar.run();
                            }else {
                                
                            	PantallaErrorEliminarProducto error = new PantallaErrorEliminarProducto();
                            	error.run();
                            }
                        } 
                    }
                }
			}
		});
		btnNewButtonEliminar.setBounds(166, 172, 89, 23);
		contentPane.add(btnNewButtonEliminar);
	}
}
