package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Toolkit;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblKupovniKurs;
	private JTextField textFieldKupovniKurs;
	private JLabel lblProdajniKurs;
	private JTextField textField;
	private JLabel lblValuta;
	private JLabel lblIznos;
	private JTextField textFieldIznos;
	private JLabel lblVrstaTransakcije;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JSlider slider;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;
	private JComboBox comboBox;
	private MenjacnicaGUI menjacnica;

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI(MenjacnicaGUI menjacnica) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(IzvrsiZamenuGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/TreeLeaf.gif")));
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 537, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTextFieldKupovniKurs());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTextField());
		contentPane.add(getLblValuta());
		contentPane.add(getLblIznos());
		contentPane.add(getTextFieldIznos());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getSlider());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnOdustani());
		contentPane.add(getComboBox());
		this.menjacnica=menjacnica;
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(15, 16, 118, 20);
		}
		return lblKupovniKurs;
	}
	private JTextField getTextFieldKupovniKurs() {
		if (textFieldKupovniKurs == null) {
			textFieldKupovniKurs = new JTextField();
			textFieldKupovniKurs.setEditable(false);
			textFieldKupovniKurs.setBounds(15, 52, 146, 26);
			textFieldKupovniKurs.setColumns(10);
		}
		return textFieldKupovniKurs;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(350, 16, 118, 20);
		}
		return lblProdajniKurs;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(350, 52, 146, 26);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setBounds(224, 16, 83, 20);
		}
		return lblValuta;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(15, 134, 146, 20);
		}
		return lblIznos;
	}
	private JTextField getTextFieldIznos() {
		if (textFieldIznos == null) {
			textFieldIznos = new JTextField();
			textFieldIznos.setBounds(15, 170, 146, 26);
			textFieldIznos.setColumns(10);
		}
		return textFieldIznos;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setBounds(247, 134, 146, 20);
		}
		return lblVrstaTransakcije;
	}
	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			buttonGroup.add(rdbtnKupovina);
			rdbtnKupovina.setBounds(247, 169, 155, 29);
		}
		return rdbtnKupovina;
	}
	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			buttonGroup.add(rdbtnProdaja);
			rdbtnProdaja.setBounds(247, 211, 155, 29);
		}
		return rdbtnProdaja;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					textFieldIznos.setText(""+slider.getValue());
				}
			});
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			slider.setMinorTickSpacing(5);
			slider.setMajorTickSpacing(10);
			slider.setBounds(15, 271, 481, 61);
		}
		return slider;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						String t;
						if(rdbtnKupovina.isSelected()) t="kupovina";
						else t="prodaja";
						String s;
						s="ZAMENA>>> Valuta: "+comboBox.getSelectedItem()+" Iznos: "+
						textFieldIznos.getText()+" Vrsta transakcije: "+t;
						
						menjacnica.textArea.setText(s);
						dispose();
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(contentPane, e1.getMessage(),
								"Greska!", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnIzvrsiZamenu.setBounds(18, 348, 155, 51);
		}
		return btnIzvrsiZamenu;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(350, 348, 146, 51);
		}
		return btnOdustani;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CHF"}));
			comboBox.setBounds(209, 52, 83, 26);
		}
		return comboBox;
	}
}
