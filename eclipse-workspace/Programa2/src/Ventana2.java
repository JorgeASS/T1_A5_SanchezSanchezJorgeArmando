
import java.awt.*;
import javax.swing.*;

class VentanaDeInterfaz extends JFrame{
	
	public VentanaDeInterfaz() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(750, 600);
		setLocationRelativeTo(null);
		setTitle("Formulario");
		setVisible(true);
		
		JLabel txtTheClassic = new JLabel("<html>The <strong>Classic Form</strong> includes all visible fields for<p>this list</html>");
		txtTheClassic.setBounds(10, 10, 280, 30);
		//setBounds(x, y, ancho, Alto);
		add(txtTheClassic);
		
		JLabel txtFormOpt = new JLabel("<html><i>Form Options</i></html>");
		txtFormOpt.setBounds(10, 50, 280, 20);
		add(txtFormOpt);
		
		//Area de etiqueta
		JLabel txtIncFoll = new JLabel("Include the following:");
		txtIncFoll.setBounds(10, 70, 280, 20);
		add(txtIncFoll);
		
		//checkBox
		JCheckBox checkATitle = new JCheckBox("A title for your from");
		checkATitle.setBounds(10, 95, 280, 20);
		add(checkATitle);
		
		//Area de comentarios
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(10, 120, 280, 20);
		add(scroll);
		
		//Area Radio
		JRadioButton rbtnOnReFi = new JRadioButton("only required fields");
		rbtnOnReFi.setBounds(10, 165, 280, 20);
		add(rbtnOnReFi);
		
		JRadioButton rbtnAllFields = new JRadioButton("all fields");
		rbtnAllFields.setBounds(10, 185, 280, 20);
		add(rbtnAllFields);
		
		JLabel txtTextito = new JLabel("(edit required fields in the form builder)");
		txtTextito.setBounds(15, 205, 280, 20);
		add(txtTextito);
		
		//_________CheckBox________________
		JCheckBox checkIntGro = new JCheckBox("interest group fields");
		checkIntGro.setBounds(10, 260, 280, 20);
		add(checkIntGro);
		
		JCheckBox checkReFi = new JCheckBox("required field indicators");
		checkReFi.setBounds(10, 280, 280, 20);
		add(checkReFi);
		//_________CheckBox________________
		
		JLabel txtSetForm = new JLabel("Set form width");
		txtSetForm.setBounds(10, 320, 280, 20);
		add(txtSetForm);
		
		JScrollPane scroll2 = new JScrollPane();
		scroll2.setBounds(10, 340, 280, 20);
		add(scroll2);
		
		//------------------------------------------------
		JLabel txtEnhaFor = new JLabel("Enhance your form");
		txtEnhaFor.setBounds(10, 380, 280, 20);
		add(txtEnhaFor);
		
		JCheckBox checkEnEv = new JCheckBox("enable evil popup mode");
		checkEnEv.setBounds(10, 400, 280, 20);
		add(checkEnEv);
		
		JCheckBox checkJS = new JCheckBox("disable all JavaScript");
		checkATitle.setBounds(10, 420, 280, 20);
		add(checkIntGro);
		
		JCheckBox checkInLink = new JCheckBox("include archive link");
		checkInLink.setBounds(10, 440, 280, 20);
		add(checkInLink);
		
		JCheckBox checkInMon = new JCheckBox("include MonkeyRewards link");
		checkInMon.setBounds(10, 460, 280, 20);
		add(checkInMon);
		//------------------------------------------------
		//Seccion de la derecha
		
		JLabel txtPreview = new JLabel("Preview");
		txtPreview.setBounds(305, 10, 280, 20);
		add(txtPreview);
		
		/*JScrollPane scroll3 = new JScrollPane();
		scroll3.setBounds(310, 30, 400, 220);
		add(scroll3);*/
		
		//----------------Email---------
		JLabel txtEmAd= new JLabel("Email Address");
		txtEmAd.setBounds(315, 50, 300, 20);
		add(txtEmAd);
		
		JScrollPane scrollMail = new JScrollPane();
		scrollMail.setBounds(315, 70, 350, 20);
		add(scrollMail);
		//----------------Email---------
		
		//-------------Firs Name---------
		JLabel txtFiNa= new JLabel("First Name");
		txtFiNa.setBounds(315, 100, 300, 20);
		add(txtFiNa);
		
		JScrollPane scrollName = new JScrollPane();
		scrollName.setBounds(315, 120, 350, 20);
		add(scrollName);
		//-------------Firs Name---------
		
		//-------------Firs Name---------
		JLabel txtLaNam= new JLabel("Last Name");
		txtLaNam.setBounds(315, 150, 300, 20);
		add(txtLaNam);
		
		JScrollPane scrollLaNam = new JScrollPane();
		scrollLaNam.setBounds(315, 170, 350, 20);
		add(scrollLaNam);
		//-------------Firs Name---------
		
		//   Areas de botones
		JButton btnSubscribe = new JButton("Subscribe");
		btnSubscribe.setBounds(315, 200, (350/3), 20);
		add(btnSubscribe);
		
		JLabel txtCopPast= new JLabel("Copy/paste onto your site");
		txtCopPast.setBounds(305, 280, 200, 20);
		add(txtCopPast);
		
		JScrollPane scrollCopy = new JScrollPane();
		scrollCopy.setBounds(310, 300, 400, 180);
		add(scrollCopy);
		
		
	}
	
}

public class Ventana2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new VentanaDeInterfaz();
			}
		});

	}

}
