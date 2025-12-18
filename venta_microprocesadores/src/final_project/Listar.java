package final_project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Listar extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton btnCerrar;
	private JButton btnListar;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Listar dialog = new Listar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Listar() {
		setTitle("Listado de Microprocesadores");
		setBounds(100, 100, 520, 320);
		getContentPane().setLayout(null);
		
		JScrollPane scp = new JScrollPane();
		scp.setBounds(10, 11, 484, 224);
		getContentPane().add(scp);
			
		txtS = new JTextArea();
		txtS.setEditable(false);
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scp.setViewportView(txtS);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBackground(new Color(128, 64, 64));
		btnCerrar.setForeground(new Color(255, 255, 255));
		btnCerrar.setBounds(149, 246, 89, 23);
		getContentPane().add(btnCerrar);

		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBackground(new Color(0, 64, 128));
		btnListar.setForeground(new Color(255, 255, 255));
		btnListar.setBounds(263, 246, 89, 23);
		getContentPane().add(btnListar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedBtnListar(ActionEvent e) {
		// mostrar resultados
		imprimir("LISTADO DE MICROPROCESADORES");
		imprimir("");
		
		imprimir("Nombre \t\t\t\t : " + Principal.modelo1);
		imprimir("Precio \t\t\t\t : $" + String.format("%.2f", Principal.precio1));
		imprimir("Fabricante \t\t\t : " + Principal.fabricante1);
		imprimir("Número de Núcleos \t\t : " + Principal.nucleos1);
		imprimir("Número de Hilos \t\t : " + Principal.hilos1);
		imprimir("Velocidad de Núcleos \t\t : " + Principal.velocidad1 + " Ghz");
		if (Principal.video1 == '1') imprimir("Tarjeta de Video Integrada \t : Si");
		else imprimir("Tarjeta de Video Integrada \t : No");
		imprimir("\n");
		
		imprimir("Nombre \t\t\t\t : " + Principal.modelo2);
		imprimir("Precio \t\t\t\t : $" + String.format("%.2f", Principal.precio2));
		imprimir("Fabricante \t\t\t : " + Principal.fabricante2);
		imprimir("Número de Núcleos \t\t : " + Principal.nucleos2);
		imprimir("Número de Hilos \t\t : " + Principal.hilos2);
		imprimir("Velocidad de Núcleos \t\t : " + Principal.velocidad2 + " Ghz");
		if (Principal.video2 == '1') imprimir("Tarjeta de Video Integrada \t : Si");
		else imprimir("Tarjeta de Video Integrada \t : No");
		imprimir("\n");

		imprimir("Nombre \t\t\t\t : " + Principal.modelo3);
		imprimir("Precio \t\t\t\t : $" + String.format("%.2f", Principal.precio3));
		imprimir("Fabricante \t\t\t : " + Principal.fabricante3);
		imprimir("Número de Núcleos \t\t : " + Principal.nucleos3);
		imprimir("Número de Hilos \t\t : " + Principal.hilos3);
		imprimir("Velocidad de Núcleos \t\t : " + Principal.velocidad3 + " Ghz");
		if (Principal.video3 == '1') imprimir("Tarjeta de Video Integrada \t : Si");
		else imprimir("Tarjeta de Video Integrada \t : No");
		imprimir("\n");

		imprimir("Nombre \t\t\t\t : " + Principal.modelo4);
		imprimir("Precio \t\t\t\t : $" + String.format("%.2f", Principal.precio4));
		imprimir("Fabricante \t\t\t : " + Principal.fabricante4);
		imprimir("Número de Núcleos \t\t : " + Principal.nucleos4);
		imprimir("Número de Hilos \t\t : " + Principal.hilos4);
		imprimir("Velocidad de Núcleos \t\t : " + Principal.velocidad4 + " Ghz");
		if (Principal.video4 == '1') imprimir("Tarjeta de Video Integrada \t : Si");
		else imprimir("Tarjeta de Video Integrada \t : No");
		imprimir("\n");
		
		imprimir("Nombre \t\t\t\t : " + Principal.modelo5);
		imprimir("Precio \t\t\t\t : $" + String.format("%.2f", Principal.precio5));
		imprimir("Fabricante \t\t\t : " + Principal.fabricante5);
		imprimir("Número de Núcleos \t\t : " + Principal.nucleos5);
		imprimir("Número de Hilos \t\t : " + Principal.hilos5);
		imprimir("Velocidad de Núcleos \t\t : " + Principal.velocidad5 + " Ghz");
		if (Principal.video5 == '1') imprimir("Tarjeta de Video Integrada \t : Si");
		else imprimir("Tarjeta de Video Integrada \t : No");
		imprimir("\n");
		
		imprimir("Nombre \t\t\t\t : " + Principal.modelo6);
		imprimir("Precio \t\t\t\t : $" + String.format("%.2f", Principal.precio6));
		imprimir("Fabricante \t\t\t : " + Principal.fabricante6);
		imprimir("Número de Núcleos \t\t : " + Principal.nucleos6);
		imprimir("Número de Hilos \t\t : " + Principal.hilos6);
		imprimir("Velocidad de Núcleos \t\t : " + Principal.velocidad6 + " Ghz");
		if (Principal.video6 == '1') imprimir("Tarjeta de Video Integrada \t : Si");
		else imprimir("Tarjeta de Video Integrada \t : No");
		imprimir("\n");
		
		imprimir("Nombre \t\t\t\t : " + Principal.modelo7);
		imprimir("Precio \t\t\t\t : $" + String.format("%.2f", Principal.precio7));
		imprimir("Fabricante \t\t\t : " + Principal.fabricante7);
		imprimir("Número de Núcleos \t\t : " + Principal.nucleos7);
		imprimir("Número de Hilos \t\t : " + Principal.hilos7);
		imprimir("Velocidad de Núcleos \t\t : " + Principal.velocidad7 + " Ghz");
		if (Principal.video7 == '1') imprimir("Tarjeta de Video Integrada \t : Si");
		else imprimir("Tarjeta de Video Integrada \t : No");
		imprimir("\n");
		
		imprimir("Nombre \t\t\t\t : " + Principal.modelo8);
		imprimir("Precio \t\t\t\t : $" + String.format("%.2f", Principal.precio8));
		imprimir("Fabricante \t\t\t : " + Principal.fabricante8);
		imprimir("Número de Núcleos \t\t : " + Principal.nucleos8);
		imprimir("Número de Hilos \t\t : " + Principal.hilos8);
		imprimir("Velocidad de Núcleos \t\t : " + Principal.velocidad8 + " Ghz");
		if (Principal.video8 == '1') imprimir("Tarjeta de Video Integrada \t : Si");
		else imprimir("Tarjeta de Video Integrada \t : No");
		imprimir("\n");
		
		imprimir("Nombre \t\t\t\t : " + Principal.modelo9);
		imprimir("Precio \t\t\t\t : $" + String.format("%.2f", Principal.precio9));
		imprimir("Fabricante \t\t\t : " + Principal.fabricante9);
		imprimir("Número de Núcleos \t\t : " + Principal.nucleos9);
		imprimir("Número de Hilos \t\t : " + Principal.hilos9);
		imprimir("Velocidad de Núcleos \t\t : " + Principal.velocidad9 + " Ghz");
		if (Principal.video9 == '1') imprimir("Tarjeta de Video Integrada \t : Si");
		else imprimir("Tarjeta de Video Integrada \t : No");
		imprimir("\n");
		
		imprimir("Nombre \t\t\t\t : " + Principal.modelo10);
		imprimir("Precio \t\t\t\t : $" + String.format("%.2f", Principal.precio10));
		imprimir("Fabricante \t\t\t : " + Principal.fabricante10);
		imprimir("Número de Núcleos \t\t : " + Principal.nucleos10);
		imprimir("Número de Hilos \t\t : " + Principal.hilos10);
		imprimir("Velocidad de Núcleos \t\t : " + Principal.velocidad10 + " Ghz");
		if (Principal.video10 == '1') imprimir("Tarjeta de Video Integrada \t : Si");
		else imprimir("Tarjeta de Video Integrada \t : No");

		// hacer scroll a la primera linea
		txtS.setCaretPosition(0);
	}
	
	void imprimir(String cad) {
		txtS.append(cad + "\n");
	}
}
