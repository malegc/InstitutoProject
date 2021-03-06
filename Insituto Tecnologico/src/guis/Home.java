package guis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnMantenimiento;
	private JMenu mnRegistro;
	private JMenu mnConsulta;
	private JMenu mnReporte;
	private JMenuItem mntmSalir;
	private JMenuItem mntmAlumno;
	private JMenuItem mntmCurso;
	private JMenuItem mntmMatricula;
	private JMenuItem mntmRetiro;
	private JMenuItem mntmAlumnosCursos;
	private JMenuItem mntmMatrículasRetiros;
	private JMenuItem mntmAlmnMatriculaPendiente;
	private JMenuItem mntmAlmnMatriculaVigente;
	private JMenuItem mntmAlmnMatriculadosPorCurso;

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
					Home frame = new Home();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setResizable(false);
		setTitle("Instituto Tecnologico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 350);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmAlumno = new JMenuItem("Alumno");
		mntmAlumno.addActionListener(this);
		mnMantenimiento.add(mntmAlumno);
		
		mntmCurso = new JMenuItem("Curso");
		mntmCurso.addActionListener(this);
		mnMantenimiento.add(mntmCurso);
		
		mnRegistro = new JMenu("Registro");
		menuBar.add(mnRegistro);
		
		mntmMatricula = new JMenuItem("Matr\u00EDcula");
		mntmMatricula.addActionListener(this);
		mnRegistro.add(mntmMatricula);
		
		mntmRetiro = new JMenuItem("Retiro");
		mntmRetiro.addActionListener(this);
		mnRegistro.add(mntmRetiro);
		
		mnConsulta = new JMenu("Consulta");
		menuBar.add(mnConsulta);
		
		mntmAlumnosCursos = new JMenuItem("Alumnos y cursos");
		mntmAlumnosCursos.addActionListener(this);
		mnConsulta.add(mntmAlumnosCursos);
		
		mntmMatrículasRetiros = new JMenuItem("Matr\u00EDculas y retiros");
		mntmMatrículasRetiros.addActionListener(this);
		mnConsulta.add(mntmMatrículasRetiros);
		
		mnReporte = new JMenu("Reporte");
		menuBar.add(mnReporte);
		
		mntmAlmnMatriculaPendiente = new JMenuItem("Alumnos con matr\u00EDcula pendiente");
		mntmAlmnMatriculaPendiente.addActionListener(this);
		mnReporte.add(mntmAlmnMatriculaPendiente);
		
		mntmAlmnMatriculaVigente = new JMenuItem("Alumnos con matr\u00EDcula vigente");
		mntmAlmnMatriculaVigente.addActionListener(this);
		mnReporte.add(mntmAlmnMatriculaVigente);
		
		mntmAlmnMatriculadosPorCurso = new JMenuItem("Alumnos matriculados por curso");
		mntmAlmnMatriculadosPorCurso.addActionListener(this);
		mnReporte.add(mntmAlmnMatriculadosPorCurso);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmAlmnMatriculadosPorCurso) {
			actionPerformedMntmAlmnMatriculadosPorCurso(e);
		}
		if (e.getSource() == mntmAlmnMatriculaVigente) {
			actionPerformedMntmAlmnMatriculaVigente(e);
		}
		if (e.getSource() == mntmAlmnMatriculaPendiente) {
			actionPerformedMntmAlmnMatriculaPendiente(e);
		}
		if (e.getSource() == mntmMatrículasRetiros) {
			actionPerformedMntmMatrículasRetiros(e);
		}
		if (e.getSource() == mntmAlumnosCursos) {
			actionPerformedMntmAlumnosCursos(e);
		}
		if (e.getSource() == mntmRetiro) {
			actionPerformedMntmRetiro(e);
		}
		if (e.getSource() == mntmMatricula) {
			actionPerformedMntmMatricula(e);
		}
		if (e.getSource() == mntmCurso) {
			actionPerformedMntmCurso(e);
		}
		if (e.getSource() == mntmAlumno) {
			actionPerformedMntmAlumno(e);
		}
		if (e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}
	}
	protected void actionPerformedMntmSalir(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedMntmAlumno(ActionEvent e) {
		Man_Alumno ma = new Man_Alumno();
		ma.setLocationRelativeTo(this);
		ma.setVisible(true);
	}
	protected void actionPerformedMntmCurso(ActionEvent e) {
		Man_Curso mc = new Man_Curso();
		mc.setLocationRelativeTo(this);
		mc.setVisible(true);
	}
	
	protected void actionPerformedMntmMatricula(ActionEvent e) {
		Reg_Matricula rm = new Reg_Matricula();
		rm.setLocationRelativeTo(this);
		rm.setVisible(true);
	}
	protected void actionPerformedMntmRetiro(ActionEvent e) {
		Reg_Retiro rr = new Reg_Retiro();
		rr.setLocationRelativeTo(this);
		rr.setVisible(true);
	}
	protected void actionPerformedMntmAlumnosCursos(ActionEvent e) {
		Cons_AlumnoCursos ca = new Cons_AlumnoCursos();
		ca.setLocationRelativeTo(this);
		ca.setVisible(true);
	}
	protected void actionPerformedMntmMatrículasRetiros(ActionEvent e) {
		Cons_MatriculaRetiros cm = new Cons_MatriculaRetiros();
		cm.setLocationRelativeTo(this);
		cm.setVisible(true);
	}
	protected void actionPerformedMntmAlmnMatriculaPendiente(ActionEvent e) {
		Repo_AlmnMatriculaPendiente rp = new Repo_AlmnMatriculaPendiente();
		rp.setLocationRelativeTo(this);
		rp.setVisible(true);
	}
	protected void actionPerformedMntmAlmnMatriculaVigente(ActionEvent e) {
		Repo_AlmnMatriculaVigente rv = new Repo_AlmnMatriculaVigente();
		rv.setLocationRelativeTo(this);
		rv.setVisible(true);
	}
	protected void actionPerformedMntmAlmnMatriculadosPorCurso(ActionEvent e) {
		Repo_AlmnMatriculadosPorCurso rc = new Repo_AlmnMatriculadosPorCurso();
		rc.setLocationRelativeTo(this);
		rc.setVisible(true);
	}
}
