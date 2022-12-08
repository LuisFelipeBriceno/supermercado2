package UI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Negocio.ListadoProducto;
import datos.Producto;

public class PantallaEliminarProductoGerente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					PantallaEliminarProductoGerente frame = new PantallaEliminarProductoGerente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}


	/**
	 * Create the frame.
	 */
	public PantallaEliminarProductoGerente() {
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
                            	PantallaExitoEliminarProductoGerente eliminar = new PantallaExitoEliminarProductoGerente();
                            	eliminar.run();
                            }else {
                                
                            	PantallaErrorEliminarProductoGerente error = new PantallaErrorEliminarProductoGerente();
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
