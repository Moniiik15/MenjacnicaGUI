package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.border.EmptyBorder;

import menjacnica.Menjacnica;
import menjacnica.Valuta;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JTextField textFieldSifra;
	private JLabel lblProdajniKurs;
	private JTextField textFieldProdajniKurs;
	private JLabel lblSrednjiKurs;
	private JTextField textFieldSrednjiKurs;
	private JLabel lblNaziv;
	private JTextField textFieldNaziv;
	private JLabel lblKupovniKurs;
	private JTextField textFieldKupovniKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField textFieldSkraceniNaziv;
	private JButton btnDodaj;
	private JButton btnOdustani;
	private MenjacnicaGUI menjacnica;
	

	/**
	 * Create the frame.
	 */
	public DodajKursGUI(MenjacnicaGUI menjacnica) {
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 480, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getTextFieldSifra());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTextFieldProdajniKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getTextFieldSrednjiKurs());
		contentPane.add(getLblNaziv());
		contentPane.add(getTextFieldNaziv());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTextFieldKupovniKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getTextFieldSkraceniNaziv());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
		
		//podesavanje
		this.menjacnica = menjacnica;
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(15, 16, 69, 20);
		}
		return lblSifra;
	}
	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setBounds(15, 52, 146, 26);
			textFieldSifra.setColumns(10);
		}
		return textFieldSifra;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(15, 94, 146, 20);
		}
		return lblProdajniKurs;
	}
	private JTextField getTextFieldProdajniKurs() {
		if (textFieldProdajniKurs == null) {
			textFieldProdajniKurs = new JTextField();
			textFieldProdajniKurs.setBounds(15, 130, 146, 26);
			textFieldProdajniKurs.setColumns(10);
		}
		return textFieldProdajniKurs;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(15, 172, 106, 20);
		}
		return lblSrednjiKurs;
	}
	private JTextField getTextFieldSrednjiKurs() {
		if (textFieldSrednjiKurs == null) {
			textFieldSrednjiKurs = new JTextField();
			textFieldSrednjiKurs.setBounds(15, 208, 146, 26);
			textFieldSrednjiKurs.setColumns(10);
		}
		return textFieldSrednjiKurs;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(274, 16, 69, 20);
		}
		return lblNaziv;
	}
	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setBounds(274, 52, 146, 26);
			textFieldNaziv.setColumns(10);
		}
		return textFieldNaziv;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(274, 94, 146, 20);
		}
		return lblKupovniKurs;
	}
	private JTextField getTextFieldKupovniKurs() {
		if (textFieldKupovniKurs == null) {
			textFieldKupovniKurs = new JTextField();
			textFieldKupovniKurs.setBounds(274, 130, 146, 26);
			textFieldKupovniKurs.setColumns(10);
		}
		return textFieldKupovniKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(274, 172, 146, 20);
		}
		return lblSkraceniNaziv;
	}
	protected JTextField getTextFieldSkraceniNaziv() {
		if (textFieldSkraceniNaziv == null) {
			textFieldSkraceniNaziv = new JTextField();
			textFieldSkraceniNaziv.setBounds(274, 208, 146, 26);
			textFieldSkraceniNaziv.setColumns(10);
		}
		return textFieldSkraceniNaziv;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						String s;
						s = "Pun naziv valute je "+textFieldNaziv.getText() + " skraceni naziv valute je " + textFieldSkraceniNaziv.getText()
						+ " sifra valute je " + textFieldSifra.getText() + " prodajni kurs iznosi " + textFieldProdajniKurs.getText()
						+ " srednji kurs iznosi " + textFieldSrednjiKurs.getText()+ " kupovni kurs iznosi " + textFieldKupovniKurs.getText() + "\n";
						menjacnica.textArea.setText(s);
						dispose();
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(contentPane, e1.getMessage(),
								"Greska", JOptionPane.ERROR_MESSAGE);
					}
					
				}
			});
			btnDodaj.setBounds(15, 262, 146, 42);
		}
		return btnDodaj;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(274, 262, 140, 42);
		}
		return btnOdustani;
	}
	
	public void dodajKurs() {
		try {
			String s;
			s="Sifra: "+textFieldSifra.getText()+" Pun naziv: "+textFieldNaziv.getText()+
					"Skraceni naziv: "+textFieldSkraceniNaziv.getText()+
					"Prodajni kurs: "+ textFieldProdajniKurs.getText() +"Srednji kurs: "+
					textFieldSrednjiKurs.getText()+" Kupovni kurs: "+ textFieldKupovniKurs.getText();
			
			menjacnica.textArea.setText(s);
			
			
			dispose();
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(contentPane, e1.getMessage(),
					"Greska", JOptionPane.ERROR_MESSAGE);
		}
		
	}
}
