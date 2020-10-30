package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Cons_MatriculaRetiros extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblNumeroMatricula;
	private JTextField txtNumMatricula;
	private JLabel lblNumeroDeRetiro;
	private JTextField txtNumRetiro;
	private JButton btnBuscar_MatriRet;
	private JScrollPane scrollPane;
	private JTable tblMatriculaRetiros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cons_MatriculaRetiros dialog = new Cons_MatriculaRetiros();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Cons_MatriculaRetiros() {
		setTitle("Consulta | Matr\u00EDculas y retiros");
		setBounds(100, 100, 550, 325);
		getContentPane().setLayout(null);
		
		lblNumeroMatricula = new JLabel("N\u00FAmero de matr\u00EDcula");
		lblNumeroMatricula.setBounds(10, 11, 98, 14);
		getContentPane().add(lblNumeroMatricula);
		
		txtNumMatricula = new JTextField();
		txtNumMatricula.setBounds(118, 8, 120, 20);
		getContentPane().add(txtNumMatricula);
		txtNumMatricula.setColumns(10);
		
		lblNumeroDeRetiro = new JLabel("N\u00FAmero de retiro");
		lblNumeroDeRetiro.setBounds(10, 36, 98, 14);
		getContentPane().add(lblNumeroDeRetiro);
		
		txtNumRetiro = new JTextField();
		txtNumRetiro.setColumns(10);
		txtNumRetiro.setBounds(118, 33, 120, 20);
		getContentPane().add(txtNumRetiro);
		
		btnBuscar_MatriRet = new JButton("Buscar");
		btnBuscar_MatriRet.setBounds(435, 7, 89, 23);
		getContentPane().add(btnBuscar_MatriRet);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 61, 514, 214);
		getContentPane().add(scrollPane);
		
		tblMatriculaRetiros = new JTable();
		scrollPane.setViewportView(tblMatriculaRetiros);

	}
}
