package UI;


import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Negocio.ListadoProducto;
import datos.Producto;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class TablaProducto extends JFrame {

	static ListadoProducto listadoproducto = new ListadoProducto();
	private List<Producto> productos = listadoproducto.MostrarProductos();
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					TablaProducto frame = new TablaProducto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}

	/**
	 * Create the frame.
	 */
	public TablaProducto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButtonvolver = new JButton("Volver");
		btnNewButtonvolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaVentas pantallaventas = new PantallaVentas();
				pantallaventas.run();
			}
		});
		btnNewButtonvolver.setBounds(215, 283, 89, 23);
		contentPane.add(btnNewButtonvolver);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 33, 458, 239);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
	
	 public void MostrarProducto(){
	        String[]indices = {"ID","Producto","Cantidad","Precio"};
	        DefaultTableModel model = new DefaultTableModel(null, indices);
	        //model.addRow(indices);
	        String[] registros = new String[4];
	        for (Producto i : productos){
	           registros[0] = String.valueOf(i.getId_producto());
	           registros[1] = i.getNombre();
	           registros[2] = String.valueOf(i.getCantidad());
	           registros[3] = String.valueOf(i.getPrecio());
	           model.addRow(registros);
	        }
	        table.setModel(model);
	    }
}
