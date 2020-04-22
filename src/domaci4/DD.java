package domaci4;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class DD {

	private JFrame frmCezar;
	Sifrovanje sifrovanje = new Sifrovanje();
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DD window = new DD();
					window.frmCezar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DD() {
		initialize();
	}
	
	
	private void initialize() {
		frmCezar = new JFrame();
		frmCezar.setTitle("Cezar");
		frmCezar.setBounds(100, 100, 450, 382);
		frmCezar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCezar.getContentPane().setLayout(null);
		
	
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Rezultat", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(31, 179, 357, 137);
		frmCezar.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextArea sifrovaniTekst = new JTextArea();
		sifrovaniTekst.setBounds(10, 22, 341, 104);
		panel.add(sifrovaniTekst);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Tekst", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(31, 5, 357, 137);
		frmCezar.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea cistTekst = new JTextArea();
		cistTekst.setBounds(10, 21, 337, 105);
		panel_1.add(cistTekst);
		cistTekst.setLineWrap(true);
		
		JButton btnNewButton = new JButton("Sifruj");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sifrovaniTekst.setText(sifrovanje.sifrujTekst(cistTekst.getText(), 3));
				sifrovaniTekst.setForeground(Color.GREEN);
				cistTekst.setForeground(Color.BLACK);
			
			}
		});
		btnNewButton.setBounds(64, 145, 89, 23);
		frmCezar.getContentPane().add(btnNewButton);
		
		JButton btnDesifruj = new JButton("Desifruj");
		btnDesifruj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cistTekst.setText(sifrovanje.desifrujTekst(sifrovaniTekst.getText(), 3));
				cistTekst.setForeground(Color.GREEN);
				sifrovaniTekst.setForeground(Color.BLACK);
				
				
			}
		});
		btnDesifruj.setBounds(249, 145, 89, 23);
		frmCezar.getContentPane().add(btnDesifruj);
	}
}
