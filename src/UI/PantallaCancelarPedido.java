package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Negocio.ListadoPedido;
import datos.Pedido;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;

public class PantallaCancelarPedido extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldticket;

	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					PantallaCancelarPedido frame = new PantallaCancelarPedido();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

	}

	/**
	 * Create the frame.
	 */
	public PantallaCancelarPedido() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewCancelTicket = new JLabel("Escriba Nro de Ticket");
		lblNewCancelTicket.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewCancelTicket.setBounds(75, 11, 306, 98);
		contentPane.add(lblNewCancelTicket);
		
		textFieldticket = new JTextField();
		textFieldticket.setBounds(127, 108, 171, 37);
		contentPane.add(textFieldticket);
		textFieldticket.setColumns(10);
		
		JButton btnNewButtonBorrar = new JButton("Cancelar Pedido");
		btnNewButtonBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListadoPedido listadopedido = new ListadoPedido();
				LinkedList<Pedido> MostrarPedido = listadopedido.LlenarListaPedido();
				int[] PedidosAmostrar = new int[MostrarPedido.size()];
				for (Pedido pedido : MostrarPedido) {
					PedidosAmostrar[MostrarPedido.indexOf(pedido)] = pedido.getNro_pedido();
				}	
				int opcion = Integer.parseInt(textFieldticket.getText());
				for (Pedido pedido : MostrarPedido) {
				if (opcion == pedido.getNro_pedido()) {		
					if (listadopedido.remove(pedido)) {
						PantallaPedidoCancelado cancel =  new PantallaPedidoCancelado();
						cancel.run();
					} else {
						PantallaErrorCancelarPedido error = new PantallaErrorCancelarPedido();
						error.run();
					}							
				}
				}
			}
		});
		btnNewButtonBorrar.setBounds(147, 157, 131, 37);
		contentPane.add(btnNewButtonBorrar);
	}
}
