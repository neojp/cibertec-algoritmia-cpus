package final_project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventas extends JDialog implements ActionListener {
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JComboBox <String>cboModelo;
	private JButton btnVender;
	private JButton btnCerrar;
	private JScrollPane scp;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Ventas dialog = new Ventas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Ventas() {
		setTitle("Vender");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setModal(true);
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(23, 25, 67, 14);
		getContentPane().add(lblModelo);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(23, 51, 67, 14);
		getContentPane().add(lblPrecio);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(23, 76, 67, 14);
		getContentPane().add(lblCantidad);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(100, 48, 179, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(100, 73, 179, 20);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);
		
		cboModelo = new JComboBox<String>();
		cboModelo.addActionListener(this);
		cboModelo.setBounds(100, 21, 179, 22);
		cboModelo.addItem(Principal.modelo1);
		cboModelo.addItem(Principal.modelo2);
		cboModelo.addItem(Principal.modelo3);
		cboModelo.addItem(Principal.modelo4);
		cboModelo.addItem(Principal.modelo5);
		cboModelo.addItem(Principal.modelo6);
		cboModelo.addItem(Principal.modelo7);
		cboModelo.addItem(Principal.modelo8);
		cboModelo.addItem(Principal.modelo9);
		cboModelo.addItem(Principal.modelo10);
		getContentPane().add(cboModelo);
		
		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setBackground(new Color(0, 64, 128));
		btnVender.setForeground(new Color(255, 255, 255));
		btnVender.setBounds(314, 25, 89, 23);
		getContentPane().add(btnVender);
		
		btnCerrar = new JButton("Cerrar ");
		btnCerrar.addActionListener(this);
		btnCerrar.setBackground(new Color(128, 64, 64));
		btnCerrar.setForeground(new Color(255, 255, 255));
		btnCerrar.setBounds(314, 51, 89, 23);
		getContentPane().add(btnCerrar);
		
		scp = new JScrollPane();
		scp.setBounds(23, 106, 380, 148);
		getContentPane().add(scp);
		
		txtS = new JTextArea();
		scp.setViewportView(txtS);
		
		//mostrar datos del primer microprocesador al cagar la interfase
		//precio es double, se le  pone un artificio una cadena vacia
		txtPrecio.setText(Principal.formatPrecio(Principal.precio1));
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e)  {
		// cerrar ventana
		dispose();
	}
	//declaracion de variables GLOBALES
	int modelo,cantModelo,cantModeloTotal,contadorVentas=0;
	double impCom,impDesc,impPag, precioSeleccionado,montoAcumTotal,cuotaDiaria = 5000;
	String obsequio="",modeloSeleccionado;
    
	protected void actionPerformedBtnVender(ActionEvent e) 
	
	{ //Entrada de datos
		leerModelo();
		leerCantModelo();
		
		//Proceso
		calcularImpCom();
		calcularImpDesc();
		calcularImpPag();
		calcularObsequio();
		//SR
					
		montoAcumTotal+=impPag;
		contadorVentas++;
		
			mostrarResultados();
			alertaVentas();
	}
	 //metodo SIN VALOR DE RETORNO
	//Entrada de datos
	//método que lee modelo y asigna el indice a la variable
	 void leerModelo() { modelo=cboModelo.getSelectedIndex();}
		 //método que lee la cantidad de los modelos adquiridos
	 void leerCantModelo() { cantModelo=Integer.parseInt(txtCantidad.getText());}
	
	 //proceso
	  	 		  		
	 void calcularImpCom() { 
	switch (modelo) 
	{	case 0:impCom=207*cantModelo;
	           modeloSeleccionado=Principal.modelo1;
               precioSeleccionado=Principal.precio1;break;
	    case 1:impCom=144*cantModelo;
			    modeloSeleccionado=Principal.modelo2;
		        precioSeleccionado=Principal.precio2;break;
	    case 2:impCom=175*cantModelo;
			   modeloSeleccionado=Principal.modelo3;
		       precioSeleccionado=Principal.precio3;break;
	    case 3:impCom=280*cantModelo;
			   modeloSeleccionado=Principal.modelo4;
		       precioSeleccionado=Principal.precio4;break;
	    case 4:impCom=449*cantModelo;
			   modeloSeleccionado=Principal.modelo5;
		       precioSeleccionado=Principal.precio5;break;
	    case 5:impCom=228.5*cantModelo;
	    	   modeloSeleccionado=Principal.modelo6;
	           precioSeleccionado=Principal.precio6;break;
	    case 6:impCom=90*cantModelo;
	           modeloSeleccionado=Principal.modelo7;
	           precioSeleccionado=Principal.precio7;break;
	    case 7:impCom=240*cantModelo;
	    	   modeloSeleccionado=Principal.modelo8;
	           precioSeleccionado=Principal.precio8;break;
	    case 8:impCom=195*cantModelo;
	    	   modeloSeleccionado=Principal.modelo9;
	           precioSeleccionado=Principal.precio9;break;
	   	default:impCom=669*cantModelo;
	   	        modeloSeleccionado=Principal.modelo10;
	            precioSeleccionado=Principal.precio10;
		break;
	}
	 }
	 
	 //Método que calcula y asigna el importe de descuento 
	 void calcularImpDesc() 
	 {if (cantModelo<=5) impDesc=0.075*impCom;	
	 else if (cantModelo<=10) impDesc=0.10*impCom;
	 else if (cantModelo<=15) impDesc=0.125*impCom;
	 else impDesc=0.15*impCom;
	 }
	 
	 //Método que calcula importe a pagar
	 void calcularImpPag() 
	 {impPag=impCom-impDesc;}
	 
	 //Método calcula obsequio
	 void calcularObsequio()
	 { if (cantModelo<2) obsequio=Principal.obsequio1;
	   else if (cantModelo<=5) obsequio=Principal.obsequio2;
	   else obsequio=Principal.obsequio3;}
	 
     //Método  que muestra los resultados
	 void mostrarResultados()
	 
	 { txtS.setText("BOLETA DE VENTA "+" \n \n");
	   imprimir("Modelo \t\t: "+modeloSeleccionado);
	   imprimir("Precio \t\t: "+Principal.formatPrecio(precioSeleccionado));
	   imprimir("Cantidad \t\t: "+cantModelo);
	   imprimir("Importe de Compra \t: "+Principal.formatPrecio(impCom));
	   imprimir("Importe de Desc. \t: "+Principal.formatPrecio(impDesc));
	   imprimir("Importe a Pagar \t: "+Principal.formatPrecio(impPag));
	   imprimir("Obsequio \t\t: "+ obsequio);
		}
	
		void imprimir(String x) {txtS.append(x+" \n");}

		
		void alertaVentas()
		{if(contadorVentas%5==0)
			JOptionPane.showMessageDialog(this,
					"Venta Nro:"+contadorVentas+"\n"+
			"Importe total general Acumulado: S/."+montoAcumTotal+"\n"+
			"Porcentaje de cuota diaria:"+(montoAcumTotal/cuotaDiaria)*100+"%"+"\n",
			"Reporte de ventas",
			JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	protected void actionPerformedCboModelo(ActionEvent e)
	{	int modelo = cboModelo.getSelectedIndex();
	
		switch (modelo)
		{ case 0: txtPrecio.setText(Principal.formatPrecio(Principal.precio1));break; 
		  case 1: txtPrecio.setText(Principal.formatPrecio(Principal.precio2));break;
		  case 2: txtPrecio.setText(Principal.formatPrecio(Principal.precio3));break;
		  case 3: txtPrecio.setText(Principal.formatPrecio(Principal.precio4));break;
		  case 4: txtPrecio.setText(Principal.formatPrecio(Principal.precio5));break;
		  case 5: txtPrecio.setText(Principal.formatPrecio(Principal.precio6));break;
		  case 6: txtPrecio.setText(Principal.formatPrecio(Principal.precio7));break;
		  case 7: txtPrecio.setText(Principal.formatPrecio(Principal.precio8));break;
		  case 8: txtPrecio.setText(Principal.formatPrecio(Principal.precio9));break;
		  default:  txtPrecio.setText(Principal.formatPrecio(Principal.precio10));break;
		}
		}
				
		}

