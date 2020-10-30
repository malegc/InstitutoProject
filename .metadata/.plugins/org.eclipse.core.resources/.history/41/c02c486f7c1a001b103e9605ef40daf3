package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Man_Alumno extends JDialog implements ActionListener {
	private JLabel lblcodAlumno;
	private JTextField txtcodAlumno;
	private JLabel lblNomAlumno;
	private JLabel lblApeAlumno;
	private JTextField txtNomAlumno;
	private JTextField txtApeAlumno;
	private JLabel lblDniAlumno;
	private JTextField txtDniAlumno;
	private JLabel lblEdadAlumno;
	private JTextField txtEdadAlumno;
	private JButton btnAdicionar_Alumno;
	private JButton btnConsultar_Alumno;
	private JButton btnModificar_Alumno;
	private JButton btnEliminar;
	private JLabel lblCelularAlumno;
	private JTextField txtCelularAlumno;
	private JButton btnGuardar_Alumno;
	private JScrollPane scrollPane;
	private JTable tblAlumno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Man_Alumno dialog = new Man_Alumno();
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
	public Man_Alumno() {
		setResizable(false);
		setTitle("Mantenimiento | Alumno");
		setBounds(100, 100, 535, 375);
		getContentPane().setLayout(null);
		
		lblcodAlumno = new JLabel("Codigo");
		lblcodAlumno.setBounds(10, 11, 46, 14);
		getContentPane().add(lblcodAlumno);
		
		txtcodAlumno = new JTextField();
		txtcodAlumno.setEditable(false);
		txtcodAlumno.setBounds(66, 8, 86, 20);
		getContentPane().add(txtcodAlumno);
		txtcodAlumno.setColumns(10);
		
		lblNomAlumno = new JLabel("Nombres");
		lblNomAlumno.setBounds(10, 36, 46, 14);
		getContentPane().add(lblNomAlumno);
		
		lblApeAlumno = new JLabel("Apellidos");
		lblApeAlumno.setBounds(10, 61, 46, 14);
		getContentPane().add(lblApeAlumno);
		
		txtNomAlumno = new JTextField();
		txtNomAlumno.setBounds(66, 33, 236, 20);
		getContentPane().add(txtNomAlumno);
		txtNomAlumno.setColumns(10);
		
		txtApeAlumno = new JTextField();
		txtApeAlumno.setBounds(66, 58, 236, 20);
		getContentPane().add(txtApeAlumno);
		txtApeAlumno.setColumns(10);
		
		lblDniAlumno = new JLabel("DNI");
		lblDniAlumno.setBounds(10, 86, 46, 14);
		getContentPane().add(lblDniAlumno);
		
		txtDniAlumno = new JTextField();
		txtDniAlumno.setBounds(66, 83, 86, 20);
		getContentPane().add(txtDniAlumno);
		txtDniAlumno.setColumns(10);
		
		lblEdadAlumno = new JLabel("Edad");
		lblEdadAlumno.setBounds(171, 86, 35, 14);
		getContentPane().add(lblEdadAlumno);
		
		txtEdadAlumno = new JTextField();
		txtEdadAlumno.setBounds(216, 83, 86, 20);
		getContentPane().add(txtEdadAlumno);
		txtEdadAlumno.setColumns(10);
		
		btnAdicionar_Alumno = new JButton("Adicionar");
		btnAdicionar_Alumno.addActionListener(this);
		btnAdicionar_Alumno.setBounds(415, 7, 89, 23);
		getContentPane().add(btnAdicionar_Alumno);
		
		btnConsultar_Alumno = new JButton("Consultar");
		btnConsultar_Alumno.setBounds(415, 32, 89, 23);
		getContentPane().add(btnConsultar_Alumno);
		
		btnModificar_Alumno = new JButton("Modificar");
		btnModificar_Alumno.setBounds(415, 57, 89, 23);
		getContentPane().add(btnModificar_Alumno);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(415, 82, 89, 23);
		getContentPane().add(btnEliminar);
		
		lblCelularAlumno = new JLabel("Celular");
		lblCelularAlumno.setBounds(10, 111, 46, 14);
		getContentPane().add(lblCelularAlumno);
		
		txtCelularAlumno = new JTextField();
		txtCelularAlumno.setBounds(66, 108, 86, 20);
		getContentPane().add(txtCelularAlumno);
		txtCelularAlumno.setColumns(10);
		
		btnGuardar_Alumno = new JButton("Guardar");
		btnGuardar_Alumno.setBounds(213, 7, 89, 23);
		getContentPane().add(btnGuardar_Alumno);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 136, 494, 187);
		getContentPane().add(scrollPane);
		
		tblAlumno = new JTable();
		scrollPane.setViewportView(tblAlumno);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAdicionar_Alumno) {
			actionPerformedBtnAdicionar_Alumno(e);
		}
	}
	protected void actionPerformedBtnAdicionar_Alumno(ActionEvent e) {
	}
}
