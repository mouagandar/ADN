package dna.com;

import java.awt.EventQueue;

public class FenêtreTransciptionDna {

	private JFrame frame;
	private JRadioButton rdbtnSaisie;
	private JRadioButton rdbtnLire;
	private String path;
	public static String Builder_4 = "";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					FenêtreTransciptionDna window = new FenêtreTransciptionDna();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FenêtreTransciptionDna() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		final JTextArea textArea = new JTextArea();
		final JTextArea BrinctextArea = new JTextArea();
		final JTextArea ARNtextArea = new JTextArea();
		//Jfile chooser pour choisir un fichier + appel à la function Lire fichier pour faire la lecture
		JButton btnNewButton = new JButton("Lire un fichier");
		btnNewButton.addActionListener(new ActionListener() {
		
			private LireFichier lecture;

			public void actionPerformed(ActionEvent e) {
				System.out.println("//ouvrir une arborescence.");
				//
				try{		
				
				JFileChooser chooser = new JFileChooser();
			    File f = new File("c:/folder");
			    chooser.setCurrentDirectory(f);
			    chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
			    chooser.showOpenDialog(null);
			    File curDir = chooser.getSelectedFile();			    
			    path = curDir.getAbsolutePath();
			    lecture = new LireFichier();
			    String lire = lecture.Lecture(path);
			    textArea.setText(lire);
			   
			   
				}catch (Exception ee) {
					System.out.println(ee.getMessage());
				}
			
			}
			
		});
		frame.setBounds(100, 100, 1385, 596);
		
		LireFichier lecture = new LireFichier();
		String text = lecture.Lecture(path);
		 System.out.println(path);
		textArea.setText(text);
		JButton btnNewButton_1 = new JButton("valider");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texte = textArea.getText();
				System.out.println(texte);
				converter ff = new converter();
				String builder_2=ff.complementWC(texte);
				ARNm bb = new ARNm();
				String builder_3 = bb.GenereARN(texte);
				BrinctextArea.setText(builder_2);
				ARNtextArea.setText(builder_3);
				
			}	
	});
		rdbtnSaisie = new JRadioButton("Saisie à la main");
		
		rdbtnLire = new JRadioButton("Lecture depuis un Fichier");
		
		
		JButton btnNewButton_2 = new JButton("Creation d'Acides aminés");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FenetreAcidesaminés.main(null);
				String texte3 = ARNtextArea.getText();
				Builder_4 = Proteine.Pro(texte3);
				System.out.println(Builder_4);
				
				
				;
				
			}
		});
			
		
		JLabel lblArnm = new JLabel("ARNm");
		
		JLabel lblBrinComplmentaire = new JLabel("Brin Compl\u00E9mentaire");
		
		JLabel lblBrin = new JLabel("Brin");
		
		JButton btnAnnimation = new JButton("Annimations");
		btnAnnimation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				animation ani = new animation();
				try {
					ani.main(null);
				} catch (InterruptedException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
	
						 
				
			
			}	
		});
		JScrollPane scrollPane = new JScrollPane();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JScrollPane scrollPane_2 = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(185)
							.addComponent(lblBrin, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(140)
							.addComponent(rdbtnSaisie, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
							.addGap(155)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblBrinComplmentaire, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(122)
									.addComponent(rdbtnLire, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)))
							.addGap(48)
							.addComponent(lblArnm, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(74)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
							.addGap(83)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
							.addGap(458)
							.addComponent(btnAnnimation, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
							.addGap(79)
							.addComponent(btnNewButton_2))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)))
					.addGap(15))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(36)
							.addComponent(lblBrin))
						.addComponent(rdbtnSaisie, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(9)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(24)
									.addComponent(lblBrinComplmentaire, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
								.addComponent(rdbtnLire, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(33)
							.addComponent(lblArnm)))
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)))))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnAnnimation, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addGap(6))
		);
		
		
		scrollPane_2.setViewportView(ARNtextArea);
		
		
		scrollPane_1.setViewportView(BrinctextArea);
		
		
		scrollPane.setViewportView(textArea);
		frame.getContentPane().setLayout(groupLayout);
		
		
		
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}


