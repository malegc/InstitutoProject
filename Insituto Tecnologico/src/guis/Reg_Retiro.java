package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;

public class Reg_Retiro extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reg_Retiro dialog = new Reg_Retiro();
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
	public Reg_Retiro() {
		setTitle("Registro | Retiro");
		setBounds(100, 100, 450, 300);

	}

}
