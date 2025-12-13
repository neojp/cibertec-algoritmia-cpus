package final_project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar mnBar;
	private JMenu mnArchivo;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenu mnConfig;
	private JMenu mnAyuda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsulta;
	private JMenuItem mntmEdicion;
	private JMenuItem mntmLista;
	private JMenuItem mntmVender;
	private JMenuItem mntmConfDesc;
	private JMenuItem mntmConfObseq;
	private JMenuItem mntmAcerca;
	
	// Información de microprocesadores:

	// Braulio
	public static String modelo1 = "AMD Ryzen 7 5700X";
	public static double precio1 = 0;
	public static String fabricante1 = "";
	public static String series1 = "";
	public static int nucleos1 = 0;
	public static int hilos1 = 0;
	public static double velocidad1 = 0.0;
	public static char video1 = 0;
	
	// Braulio
	public static String modelo2 = "Intel Core i5-11400F";
	public static double precio2 = 0;
	public static String fabricante2 = "";
	public static String series2 = "";
	public static int nucleos2 = 0;
	public static int hilos2 = 0;
	public static double velocidad2 = 0.0;
	public static char video2 = 0;
	
	// Donnie
	public static String modelo3 = "Intel Core i5-14600K";
	public static double precio3 = 0;
	public static String fabricante3 = "";
	public static String series3 = "";
	public static int nucleos3 = 0;
	public static int hilos3 = 0;
	public static double velocidad3 = 0.0;
	public static char video3 = 0;
	
	// Donnie
	public static String modelo4 = "Intel Core i9-12900KF";
	public static double precio4 = 0;
	public static String fabricante4 = "";
	public static String series4 = "";
	public static int nucleos4 = 0;
	public static int hilos4 = 0;
	public static double velocidad4 = 0.0;
	public static char video4 = 0;
	
	// Joan
	public static String modelo5 = "AMD Ryzen 7 9800X3D";
	public static double precio5 = 449;
	public static String fabricante5 = "AMD";
	public static String series5 = "AMD Ryzen 7";
	public static int nucleos5 = 8;
	public static int hilos5 = 16;
	public static double velocidad5 = 4.7;
	public static char video5 = 1;
	
	// Joan
	public static String modelo6 = "AMD Ryzen 9 5900X";
	public static double precio6 = 228.5;
	public static String fabricante6 = "AMD";
	public static String series6 = "AMD Ryzen 9";
	public static int nucleos6 = 12;
	public static int hilos6 = 24;
	public static double velocidad6 = 3.7;
	public static char video6 = 0;
	
	// Rosa
	public static String modelo7 = "Intel Pentium Gold 6500";
	public static double precio7 = 0;
	public static String fabricante7 = "";
	public static String series7 = "";
	public static int nucleos7 = 0;
	public static int hilos7 = 0;
	public static double velocidad7 = 0.0;
	public static char video7 = 0;

	// Rosa
	public static String modelo8 = "Intel Core Ultra 7 265KF";
	public static double precio8 = 0;
	public static String fabricante8 = "";
	public static String series8 = "";
	public static int nucleos8 = 0;
	public static int hilos8 = 0;
	public static double velocidad8 = 0.0;
	public static char video8 = 0;
	
	// Wilfredo
	public static String modelo9 = "AMD Ryzen 5 9600X";
	public static double precio9 = 0;
	public static String fabricante9 = "";
	public static String series9 = "";
	public static int nucleos9 = 0;
	public static int hilos9 = 0;
	public static double velocidad9 = 0.0;
	public static char video9 = 0;
	
	// Wilfredo
	public static String modelo10 = "AMD Ryzen 9 9950X3D";
	public static double precio10 = 0;
	public static String fabricante10 = "";
	public static String series10 = "";
	public static int nucleos10 = 0;
	public static int hilos10 = 0;
	public static double velocidad10 = 0.0;
	public static char video10 = 0;
	
	// Configuration: Descuentos (Wilfredo)

	// Configuracion: Obsequios (Joan)
	public static String obs1 = "Lapicero";
	public static String obs2 = "Llavero";
	public static String obs3 = "Memoria USB";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Tienda de microprocesadores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 500);
		
		mnBar = new JMenuBar();
		setJMenuBar(mnBar);
		
		mnArchivo = new JMenu("Archivo");
		mnBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		mnBar.add(mnMantenimiento);
		
		mntmConsulta = new JMenuItem("Consultar procesador");
		mntmConsulta.addActionListener(this);
		mnMantenimiento.add(mntmConsulta);
		
		mntmEdicion = new JMenuItem("Modificar procesador");
		mntmEdicion.addActionListener(this);
		mnMantenimiento.add(mntmEdicion);
		
		mntmLista = new JMenuItem("Listar procesadores");
		mntmLista.addActionListener(this);
		mnMantenimiento.add(mntmLista);
		
		mnVentas = new JMenu("Ventas");
		mnBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mnConfig = new JMenu("Configuracíón");
		mnBar.add(mnConfig);
		
		mntmConfDesc = new JMenuItem("Configurar descuentos");
		mntmConfDesc.addActionListener(this);
		mnConfig.add(mntmConfDesc);
		
		mntmConfObseq = new JMenuItem("Configurar obsequios");
		mntmConfObseq.addActionListener(this);
		mnConfig.add(mntmConfObseq);
		
		mnAyuda = new JMenu("Ayuda");
		mnBar.add(mnAyuda);
		
		mntmAcerca = new JMenuItem("Acerca de tienda");
		mntmAcerca.addActionListener(this);
		mnAyuda.add(mntmAcerca);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmEdicion) {
			actionPerformedMntmEdición(e);
		}
		if (e.getSource() == mntmConfDesc) {
			actionPerformedMntmConfDesc(e);
		}
		if (e.getSource() == mntmAcerca) {
			actionPerformedMntmAcerca(e);
		}
		if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == mntmConfObseq) {
			actionPerformedMntmConfObseq(e);
		}
		if (e.getSource() == mntmLista) {
			actionPerformedMntmLista(e);
		}
		if (e.getSource() == mntmConsulta) {
			actionPerformedMntmConsulta(e);
		}
		if (e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}
	}
	protected void actionPerformedMntmSalir(ActionEvent e) {
		System.exit(0);
	}
	protected void actionPerformedMntmConsulta(ActionEvent e) {
		Consulta consult1 = new Consulta();
		consult1.setLocationRelativeTo(this);
		consult1.setModal(true);
		consult1.setVisible(true);
	}
	protected void actionPerformedMntmLista(ActionEvent e) {
		Listar list1 = new Listar();
		list1.setLocationRelativeTo(this);
		list1.setModal(true);
		list1.setVisible(true);
	}
	protected void actionPerformedMntmConfObseq(ActionEvent e) {
		ConfigurarObsequios confObs1 = new ConfigurarObsequios();
		confObs1.setLocationRelativeTo(this);
		confObs1.setModal(true);
		confObs1.setVisible(true);
	}
	protected void actionPerformedMntmVender(ActionEvent e) 
	{Ventas vent=new Ventas();
		vent.setLocationRelativeTo(this);
		vent.setModal(true);
		vent.setVisible(true);
			}
	
	protected void actionPerformedMntmAcerca(ActionEvent e) 
	{Acerca acer=new Acerca();
		acer.setLocationRelativeTo(this);
		acer.setModal(true);
					acer.setVisible(true);
		
	}
	protected void actionPerformedMntmConfDesc(ActionEvent e) {
		Descuento desc = new Descuento();
		desc.setLocationRelativeTo(this);
		desc.setModal(true);
		desc.setVisible(true);
	}
	protected void actionPerformedMntmEdición(ActionEvent e) {
		Modificar modif = new Modificar();
		modif.setLocationRelativeTo(this);
		modif.setModal(true);
		modif.setVisible(true);
	}
}
