import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

class Ventana extends JFrame implements ActionListener, KeyListener{
	
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	LogicaTemperaturas ct = new LogicaTemperaturas();
	
	JLabel txtConvertir, txtA, txtIq, txtFan;
	JTextField cajaConv, cajaRes;
	JComboBox<String> cboxConv, cboxRes;
	
	public Ventana() {
		// TODO Auto-generated constructor stub
		
		//------------------------------Implementacion de ventana----------------------------------------
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Conversor de Temperaturas");
		setVisible(true);
		//------------------------------------------------------------------------------------------------
		
		txtConvertir = new JLabel("Convertir");
		bgcGrid(txtConvertir, 0, 0, 1, 1);
		
		cajaConv = new JTextField("70");
		bgcGrid(cajaConv, 1, 0, 1, 1);
		cajaConv.addActionListener(this);
				
		cboxConv = new JComboBox<String>();
		bgcGrid(cboxConv, 2, 0, 2, 1);
		cboxConv.addItem("Eliga Temperatura");
		cboxConv.addItem("°Celcius");
		cboxConv.addItem("°Farenheit");
		cboxConv.addItem("°Kelvin");
		cboxConv.addItem("°Rankine");
		cboxConv.addActionListener(this);
		
		//txtFan = new JLabel("--------------------");
		//bgcGrid(txtFan, 4, 0, 1, 1);
		
		//fila ------------------------------------
		
		
		txtA = new JLabel("A:");
		bgcGrid(txtA, 0, 1, 1, 1);
		
		cboxRes = new JComboBox<String>();
		bgcGrid(cboxRes, 1, 1, 1, 1);
		cboxRes.addItem("Elija una opcion");
		
		cboxConv.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				byte op = (byte)cboxConv.getSelectedIndex();
				
				if (op == 1) {
					cboxRes.removeAllItems();
					cboxRes.addItem("Elija una opcion");
					cboxRes.addItem("°Farenheit");
					cboxRes.addItem("°Kelvin");
					cboxRes.addItem("°Rankine");
					cboxRes.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							byte op = (byte)cboxRes.getSelectedIndex();
							if (op == 1) {
								cajaRes.setText(String.valueOf(ct.caF(Double.parseDouble(cajaConv.getText()))));
							}else if (op == 2) {
								cajaRes.setText(String.valueOf(ct.caK(Double.parseDouble(cajaConv.getText()))));
							}else if (op == 3) {
								cajaRes.setText(String.valueOf(ct.caR(Double.parseDouble(cajaConv.getText()))));
							}else {
								JOptionPane.showMessageDialog(getContentPane(), "Se debe elegir una temperatura");
							}
							
						}
					});
				}else if (op == 2) {
					cboxRes.removeAllItems();
					cboxRes.addItem("Elija una opcion");
					cboxRes.addItem("°Celsius");
					cboxRes.addItem("°Kelvin");
					cboxRes.addItem("°Rankine");
					cboxRes.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							byte op = (byte)cboxRes.getSelectedIndex();
							if (op == 1) {
								cajaRes.setText(String.valueOf(ct.faC(Double.parseDouble(cajaConv.getText()))));
							}else if (op == 2) {
								cajaRes.setText(String.valueOf(ct.faK(Double.parseDouble(cajaConv.getText()))));
							}else if (op == 3) {
								cajaRes.setText(String.valueOf(ct.faR(Double.parseDouble(cajaConv.getText()))));
							}else {
								JOptionPane.showMessageDialog(getContentPane(), "Se debe elegir una temperatura");
							}
							
						}
					});
				}else if (op == 3) {
					cboxRes.removeAllItems();
					cboxRes.addItem("Elija una opcion");
					cboxRes.addItem("°Celsius");
					cboxRes.addItem("°Fahrenheit");
					cboxRes.addItem("°Rankine");
					cboxRes.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							byte op = (byte)cboxRes.getSelectedIndex();
							if (op == 1) {
								cajaRes.setText(String.valueOf(ct.kaC(Double.parseDouble(cajaConv.getText()))));
							}else if (op == 2) {
								cajaRes.setText(String.valueOf(ct.kaF(Double.parseDouble(cajaConv.getText()))));
							}else if (op == 3) {
								cajaRes.setText(String.valueOf(ct.kaR(Double.parseDouble(cajaConv.getText()))));
							}else {
								JOptionPane.showMessageDialog(getContentPane(), "Se debe elegir una temperatura");
							}
							
						}
					});
				}
				else if (op == 4) {
					cboxRes.removeAllItems();
					cboxRes.addItem("Elija una opcion");
					cboxRes.addItem("°Celsius");
					cboxRes.addItem("°Fahrenheit");
					cboxRes.addItem("°Kelvin");
					cboxRes.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							byte op = (byte)cboxRes.getSelectedIndex();
							if (op == 1) {
								cajaRes.setText(String.valueOf(ct.raC(Double.parseDouble(cajaConv.getText()))));
							}else if (op == 2) {
								cajaRes.setText(String.valueOf(ct.raF(Double.parseDouble(cajaConv.getText()))));
							}else if (op == 3) {
								cajaRes.setText(String.valueOf(ct.raK(Double.parseDouble(cajaConv.getText()))));
							}else {
								JOptionPane.showMessageDialog(getContentPane(), "Se debe elegir una temperatura");
							}
							
						}
					});
				}else {
					JOptionPane.showMessageDialog(getContentPane(), "Se debe elegir una temperatura");
				}
				
			}
		});
		
		
		
		txtIq = new JLabel("=");
		bgcGrid(txtIq, 2, 1, 1, 1);
		
		cajaRes = new JTextField("");
		bgcGrid(cajaRes, 3, 1, 2, 1);
		cajaRes.setEditable(false);
		
		
		
		
		//-----------------------------------------Complemento de ventana---------------------------------
		pack();
		setLocationRelativeTo(null);		
		//------------------------------------------------------------------------------------------------
		
	}
	
	public void bgcGrid (JComponent c, int x, int y, int w, int h) {
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbl.setConstraints(c, gbc);
		add(c);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {if (e.getKeyChar()<48 || e.getKeyChar()>57) {
		cboxConv.setEnabled(false);
	}	}

	@Override
	public void keyReleased(KeyEvent e) {	if (e.getKeyChar()<48 || e.getKeyChar()>57) {
		cboxConv.setEnabled(false);
	}	}

	@Override
	public void actionPerformed(ActionEvent e) {	}
	
	
	
}

public class ConversorTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Ventana();
			}
		});
	}

}
