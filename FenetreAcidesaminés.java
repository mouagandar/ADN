package dna.com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window.Type;

public class FenetreAcidesaminés {

	private JFrame frmFentreAcidesAmins;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreAcidesaminés window = new FenetreAcidesaminés();
					window.frmFentreAcidesAmins.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FenetreAcidesaminés() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFentreAcidesAmins = new JFrame();
		frmFentreAcidesAmins.setTitle("Fen\u00EAtre Acides Amin\u00E9s\r\n");
		frmFentreAcidesAmins.setBounds(100, 100, 665, 363);
		frmFentreAcidesAmins.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblAcidesAmins = new JLabel("Acides Amin\u00E9s");
		lblAcidesAmins.setFont(new Font("Candara", Font.BOLD, 16));
		lblAcidesAmins.setForeground(Color.BLUE);
		lblAcidesAmins.setLabelFor(frmFentreAcidesAmins);
		lblAcidesAmins.setToolTipText("");
		GroupLayout groupLayout = new GroupLayout(frmFentreAcidesAmins.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(254)
					.addComponent(lblAcidesAmins, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
					.addGap(203))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
					.addGap(19))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addComponent(lblAcidesAmins, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JTextArea textArea = new JTextArea();
		FenêtreTransciptionDna fen = new FenêtreTransciptionDna();
		String texte = fen.Builder_4;
		textArea.setText(texte);
		scrollPane.setViewportView(textArea);
		frmFentreAcidesAmins.getContentPane().setLayout(groupLayout);
	}

}
