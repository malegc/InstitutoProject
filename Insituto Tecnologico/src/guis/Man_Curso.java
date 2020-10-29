package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;

public class Man_Curso extends JDialog {
	private JLabel lblCodCurso;
	private JTextField txtCodCurso;
	private JLabel lblAsignaturaCurso;
	private JTextField txtAsignaturaCurso;
	private JLabel lblCicloCurso;
	private JTextField txtCicloCurso;
	private JLabel lblNcreditosCurso;
	private JTextField txtNcreditosCurso;
	private JLabel lblHorasCurso;
	private JTextField txtHorasCurso;
	private JButton btnGuardar_Curso;
	private JButton btnAdicionar_Curso;
	private JButton btnConsultar_Curso;
	private JButton btnModificar_Curso;
	private JButton btnEliminar_Curso;
	private JScrollPane scrollPane;
	private JTable tblCurso;

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
					Man_Curso dialog = new Man_Curso();
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
	public Man_Curso() {
		setResizable(false);
		setTitle("Mantenimiento | Curso");
		setBounds(100, 100, 535, 375);
		getContentPane().setLayout(null);
		
		lblCodCurso = new JLabel("Codigo");
		lblCodCurso.setBounds(10, 11, 46, 14);
		getContentPane().add(lblCodCurso);
		
		txtCodCurso = new JTextField();
		txtCodCurso.setEditable(false);
		txtCodCurso.setBounds(66, 8, 86, 20);
		getContentPane().add(txtCodCurso);
		txtCodCurso.setColumns(10);
		
		lblAsignaturaCurso = new JLabel("Asignatura");
		lblAsignaturaCurso.setBounds(10, 36, 52, 14);
		getContentPane().add(lblAsignaturaCurso);
		
		txtAsignaturaCurso = new JTextField();
		txtAsignaturaCurso.setBounds(66, 33, 252, 20);
		getContentPane().add(txtAsignaturaCurso);
		txtAsignaturaCurso.setColumns(10);
		
		lblCicloCurso = new JLabel("Ciclo");
		lblCicloCurso.setBounds(10, 61, 46, 14);
		getContentPane().add(lblCicloCurso);
		
		txtCicloCurso = new JTextField();
		txtCicloCurso.setBounds(66, 58, 86, 20);
		getContentPane().add(txtCicloCurso);
		txtCicloCurso.setColumns(10);
		
		lblNcreditosCurso = new JLabel("N\u00B0 Cr\u00E9ditos");
		lblNcreditosCurso.setBounds(162, 61, 60, 14);
		getContentPane().add(lblNcreditosCurso);
		
		txtNcreditosCurso = new JTextField();
		txtNcreditosCurso.setBounds(232, 58, 86, 20);
		getContentPane().add(txtNcreditosCurso);
		txtNcreditosCurso.setColumns(10);
		
		lblHorasCurso = new JLabel("Horas");
		lblHorasCurso.setBounds(10, 86, 46, 14);
		getContentPane().add(lblHorasCurso);
		
		txtHorasCurso = new JTextField();
		txtHorasCurso.setBounds(66, 83, 86, 20);
		getContentPane().add(txtHorasCurso);
		txtHorasCurso.setColumns(10);
		
		btnGuardar_Curso = new JButton("Guardar");
		btnGuardar_Curso.setBounds(229, 7, 89, 23);
		getContentPane().add(btnGuardar_Curso);
		
		btnAdicionar_Curso = new JButton("Adicionar");
		btnAdicionar_Curso.setBounds(420, 7, 89, 23);
		getContentPane().add(btnAdicionar_Curso);
		
		btnConsultar_Curso = new JButton("Consultar");
		btnConsultar_Curso.setBounds(420, 32, 89, 23);
		getContentPane().add(btnConsultar_Curso);
		
		btnModificar_Curso = new JButton("Modificar");
		btnModificar_Curso.setBounds(420, 57, 89, 23);
		getContentPane().add(btnModificar_Curso);
		
		btnEliminar_Curso = new JButton("Eliminar");
		btnEliminar_Curso.setBounds(420, 82, 89, 23);
		getContentPane().add(btnEliminar_Curso);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 111, 499, 209);
		getContentPane().add(scrollPane);
		
		tblCurso = new JTable();
		scrollPane.setViewportView(tblCurso);

	}

}
