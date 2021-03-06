package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reg_Matricula extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblCodigo;
	private JTextField txtCodigoMAtri;
	private JLabel lblFecha;
	private JTextField txtFecha;
	private JLabel lblHora;
	private JTextField txtHora;
	private JButton btnConsultar_Matricula;
	private JButton btnModificar_Matricula;
	private JLabel lblCursoMatri;
	private JComboBox <String> cboCurso;
	private JButton btnAdicionar_Matricula;
	private JLabel lblNewLabel;
	private JComboBox <String> cboCodAlumno;
	private JScrollPane scrollPane;
	private JTable tblMatricula;
	private JButton btnEliminar_Matricula;

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
					Reg_Matricula dialog = new Reg_Matricula();
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
	public Reg_Matricula() {
		setModal(true);
		setResizable(false);
		setTitle("Registro | Matricula");
		setBounds(100, 100, 540, 375);
		getContentPane().setLayout(null);
		
		lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(10, 11, 46, 14);
		getContentPane().add(lblCodigo);
		
		txtCodigoMAtri = new JTextField();
		txtCodigoMAtri.setEditable(false);
		txtCodigoMAtri.setBounds(81, 8, 86, 20);
		getContentPane().add(txtCodigoMAtri);
		txtCodigoMAtri.setColumns(10);
		
		lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(10, 36, 46, 14);
		getContentPane().add(lblFecha);
		
		txtFecha = new JTextField();
		txtFecha.setEditable(false);
		txtFecha.setBounds(81, 33, 86, 20);
		getContentPane().add(txtFecha);
		txtFecha.setColumns(10);
		
		lblHora = new JLabel("Hora");
		lblHora.setBounds(177, 36, 23, 14);
		getContentPane().add(lblHora);
		
		txtHora = new JTextField();
		txtHora.setEditable(false);
		txtHora.setBounds(210, 33, 86, 20);
		getContentPane().add(txtHora);
		txtHora.setColumns(10);
		
		btnConsultar_Matricula = new JButton("Consultar");
		btnConsultar_Matricula.addActionListener(this);
		btnConsultar_Matricula.setBounds(425, 32, 89, 23);
		getContentPane().add(btnConsultar_Matricula);
		
		btnModificar_Matricula = new JButton("Modificar");
		btnModificar_Matricula.addActionListener(this);
		btnModificar_Matricula.setBounds(425, 57, 89, 23);
		getContentPane().add(btnModificar_Matricula);
		
		lblCursoMatri = new JLabel("Curso");
		lblCursoMatri.setBounds(10, 86, 46, 14);
		getContentPane().add(lblCursoMatri);
		
		cboCurso = new JComboBox <String> ();
		cboCurso.setModel(new DefaultComboBoxModel <String> (new String[] {"Matem\u00E1tica II", "Base de datos"}));
		cboCurso.setBounds(81, 82, 119, 22);
		getContentPane().add(cboCurso);
		
		btnAdicionar_Matricula = new JButton("Adicionar");
		btnAdicionar_Matricula.addActionListener(this);
		btnAdicionar_Matricula.setBounds(425, 7, 89, 23);
		getContentPane().add(btnAdicionar_Matricula);
		
		lblNewLabel = new JLabel("Cod. Alumno");
		lblNewLabel.setBounds(10, 61, 61, 14);
		getContentPane().add(lblNewLabel);
		
		cboCodAlumno = new JComboBox <String> ();
		cboCodAlumno.setBounds(81, 57, 119, 22);
		getContentPane().add(cboCodAlumno);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 111, 504, 214);
		getContentPane().add(scrollPane);
		
		tblMatricula = new JTable();
		scrollPane.setViewportView(tblMatricula);
		
		btnEliminar_Matricula = new JButton("Eliminar");
		btnEliminar_Matricula.addActionListener(this);
		btnEliminar_Matricula.setBounds(425, 82, 89, 23);
		getContentPane().add(btnEliminar_Matricula);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminar_Matricula) {
			actionPerformedBtnEliminar_Matricula(e);
		}
		if (e.getSource() == btnModificar_Matricula) {
			actionPerformedBtnModificar_Matricula(e);
		}
		if (e.getSource() == btnConsultar_Matricula) {
			actionPerformedBtnConsultar_Matricula(e);
		}
		if (e.getSource() == btnAdicionar_Matricula) {
			actionPerformedBtnAdicionar_Matricula(e);
		}
	}
	protected void actionPerformedBtnAdicionar_Matricula(ActionEvent e) {
	}
	protected void actionPerformedBtnConsultar_Matricula(ActionEvent e) {
	}
	protected void actionPerformedBtnModificar_Matricula(ActionEvent e) {
	}
	protected void actionPerformedBtnEliminar_Matricula(ActionEvent e) {
	}
}
