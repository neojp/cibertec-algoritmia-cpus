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
	private JMenuItem mntmEdición;
	private JMenuItem mntmLista;
	private JMenuItem mntmVender;
	private JMenuItem mntmConfDesc;
	private JMenuItem mntmConfObseq;
	private JMenuItem mntmAcerca;

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
		
		mntmEdición = new JMenuItem("Modificar procesador");
		mntmEdición.addActionListener(this);
		mnMantenimiento.add(mntmEdición);
		
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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmEdición) {
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
		consult1.setVisible(true);
	}
	protected void actionPerformedMntmLista(ActionEvent e) {
		Listar list1 = new Listar();
		list1.setLocationRelativeTo(this);
		list1.setVisible(true);
	}
	protected void actionPerformedMntmConfObseq(ActionEvent e) {
		ConfigurarObsequios confObs1 = new ConfigurarObsequios();
		confObs1.setLocationRelativeTo(this);
		confObs1.setVisible(true);
	}
	protected void actionPerformedMntmVender(ActionEvent e) 
	{Ventas vent=new Ventas();
		vent.setLocationRelativeTo(this);
		vent.setVisible(true);
			}
	
	protected void actionPerformedMntmAcerca(ActionEvent e) 
	{Acerca acer=new Acerca();
		acer.setLocationRelativeTo(this);
					acer.setVisible(true);
		
	}
	protected void actionPerformedMntmConfDesc(ActionEvent e) {
		Descuento desc = new Descuento();
		desc.setLocationRelativeTo(this);
		desc.setVisible(true);
	}
	protected void actionPerformedMntmEdición(ActionEvent e) {
		Modificar modif = new Modificar();
		modif.setLocationRelativeTo(this);
		modif.setVisible(true);
	}
}
