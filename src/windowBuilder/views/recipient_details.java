package windowBuilder.views;

import java.awt.BorderLayout;
import windowBuilder.views.gift;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class recipient_details extends JFrame {

	private JPanel contentPane;
	private String modifiedLogo;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtf_maxgiftprice;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private static JComboBox comboAge;
	private static JRadioButton rbMale;
	private static JRadioButton rbFemale;
	private JTextField txtf_mingiftprice;
	private static JCheckBox cbSports;
	private static JCheckBox cbClothes;
	private static JCheckBox cbToys;
	private static JCheckBox cbEducation;
	private static JCheckBox cbElectronics;
	private static JCheckBox cbAccesories;
	private static JCheckBox cbHouseItems;
	private JButton btnSearch;
	public static String gender = "";
	public static String age_range = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					recipient_details frame = new recipient_details();
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
	
	public static String gender_checker() {
		
		if(rbMale.isSelected()) {
			gender = "boy";
		}
		
		else if(rbFemale.isSelected()) {
			gender = "girl";
		}
		
		return gender;
		
	}
	
	public static String age_range_checker() {
		
		if(comboAge.getSelectedItem() == "0-4") {
			age_range = "0-4";
		}
		
		else if(comboAge.getSelectedItem() == "5-7") {
			age_range = "5-7";
		}
		
		else if(comboAge.getSelectedItem() == "8-12") {
			age_range = "8-12";
		}
		
		else if(comboAge.getSelectedItem() == "13-16") {
			age_range = "13-16";
		}
		
		else if(comboAge.getSelectedItem() == "17-25") {
			age_range = "17-25";
		}
		
		else if(comboAge.getSelectedItem() == "26-35") {
			age_range = "26-35";
		}
		
		else if(comboAge.getSelectedItem() == "36-45") {
			age_range = "36-45";
		}
		
		else if(comboAge.getSelectedItem() == "55+") {
			age_range = "55+";
		}
		
		return age_range;
		
	}
	
	public static boolean sportsChecker() {
		
		boolean result = false;
		
		if(cbSports.isSelected()) {
			result = true;
		}
		
		return result;
	}
	
	public static boolean clothesChecker() {
		
		boolean result = false;
		
		if(cbClothes.isSelected()) {
			result = true;
		}
		
		return result;
		
	}
	
	public static boolean toysChecker() {
		
		boolean result = false;
		
		if(cbToys.isSelected()) {
			result = true;
		}
		return result;
	}
		
	public static boolean educationChecker() {
		
		boolean result = false; 
		
		if(cbEducation.isSelected()) {
			result = true;
		}
		
		return result;
	}
	
	public static boolean electronicsChecker() {
		
		boolean result = false; 
		
		if(cbElectronics.isSelected()) {
			result = true;
		}
		return result;	
	}
	
	public static boolean accessoriesChecker() {
		
		boolean result = false; 
		
		if(cbAccesories.isSelected()) {
			result = true;
			
		}
		return result; 
	}
		
	public static boolean houseItemsChecker() {
		
		boolean result = false; 
		
		if(cbHouseItems.isSelected()) {
			result = true;
		}
		
		return result;
	}

	
	public recipient_details() {
		setTitle("GiftSmart");
		setIconImage(Toolkit.getDefaultToolkit().getImage(recipient_details.class.getResource("/windowBuilder/resources/present_icon_16.png")));
		
		initComponents();
		
		
		
	}

	public void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 464);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		
		btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gender_checker();
				age_range_checker();
				sportsChecker();
				clothesChecker();
				toysChecker();
				educationChecker();
				electronicsChecker();
				accessoriesChecker();
				houseItemsChecker();
				
				
				gift.score_updater(gift.gifts);
			}
		});
		btnSearch.setFont(new Font("Century Gothic", Font.PLAIN, 19));
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setBackground(Color.RED);
		
		JLabel lblLogo2 = new JLabel("");
		Image Logo = new ImageIcon(this.getClass().getResource("/giftsmart_logo.PNG")).getImage();
		Image modifiedLogo = Logo.getScaledInstance(662, 62, java.awt.Image.SCALE_SMOOTH);
		lblLogo2.setIcon(new ImageIcon(modifiedLogo));
		
		JLabel lblRecipientAndOccasion = new JLabel("Recipient Details");
		lblRecipientAndOccasion.setFont(new Font("Century Gothic", Font.PLAIN, 21));
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		rbMale = new JRadioButton("Male");
		rbMale.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		rbMale.setBackground(Color.WHITE);
		buttonGroup.add(rbMale);
		
		rbFemale = new JRadioButton("Female");
		rbFemale.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		rbFemale.setBackground(Color.WHITE);
		buttonGroup.add(rbFemale);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		comboAge = new JComboBox();
		comboAge.setModel(new DefaultComboBoxModel(new String[] {"0-4", "5-7", "8-12", "13-16", "17-25", "26-35", "36-45", "46-55", "55+"}));
		comboAge.setBackground(Color.WHITE);
		comboAge.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		
		JLabel lblMinGiftPrice = new JLabel("Minimum Gift Price:");
		lblMinGiftPrice.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		txtf_mingiftprice = new JTextField();
		txtf_mingiftprice.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		txtf_mingiftprice.setColumns(10);
		
		JLabel lblMaxGiftPrice = new JLabel("Maximum Gift Price:");
		lblMaxGiftPrice.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		txtf_maxgiftprice = new JTextField();
		txtf_maxgiftprice.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		txtf_maxgiftprice.setColumns(10);
		
		JLabel lblTypeOfOccasion = new JLabel("Type of Occasion:");
		lblTypeOfOccasion.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		JRadioButton rbBirthday = new JRadioButton("Birthday/Christmas");
		buttonGroup_1.add(rbBirthday);
		rbBirthday.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		rbBirthday.setBackground(Color.WHITE);
		
		JRadioButton rdbtnJobPromotion = new JRadioButton("Job Promotion");
		buttonGroup_1.add(rdbtnJobPromotion);
		rdbtnJobPromotion.setBackground(Color.WHITE);
		rdbtnJobPromotion.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		
		JRadioButton rdbtnValentinesDayanniversary = new JRadioButton("Valentine's Day/Anniversary");
		buttonGroup_1.add(rdbtnValentinesDayanniversary);
		rdbtnValentinesDayanniversary.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		rdbtnValentinesDayanniversary.setBackground(Color.WHITE);
		
		JLabel lblInterests = new JLabel("Interests:");
		lblInterests.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		cbSports = new JCheckBox("Sports");
		cbSports.setBackground(Color.WHITE);
		cbSports.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		
		cbClothes = new JCheckBox("Clothes");
		cbClothes.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		cbClothes.setBackground(Color.WHITE);
		
		cbToys = new JCheckBox("Toys");
		cbToys.setBackground(Color.WHITE);
		cbToys.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		
		cbEducation = new JCheckBox("Education/School");
		cbEducation.setBackground(Color.WHITE);
		cbEducation.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		
		cbElectronics = new JCheckBox("Electronics");
		cbElectronics.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		cbElectronics.setBackground(Color.WHITE);
		
		cbAccesories = new JCheckBox("Accesories");
		cbAccesories.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		cbAccesories.setBackground(Color.WHITE);
		
		cbHouseItems = new JCheckBox("House Items");
		cbHouseItems.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		cbHouseItems.setBackground(Color.WHITE);
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(lblLogo2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTypeOfOccasion, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(1)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblGender, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(rbMale, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
									.addComponent(lblMinGiftPrice))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(0)
										.addComponent(rbFemale)
										.addGap(98)
										.addComponent(lblAge, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(comboAge, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(rbBirthday, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(rdbtnJobPromotion, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(txtf_mingiftprice, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
												.addGap(185)
												.addComponent(txtf_maxgiftprice, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
											.addComponent(rdbtnValentinesDayanniversary, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(114)
										.addComponent(lblMaxGiftPrice)))
								.addPreferredGap(ComponentPlacement.RELATED))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblInterests, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(cbElectronics)
										.addGap(18)
										.addComponent(cbAccesories, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(cbHouseItems, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(cbSports, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(cbClothes, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(cbToys, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(cbEducation, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
					.addGap(101))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(241, Short.MAX_VALUE)
					.addComponent(lblRecipientAndOccasion, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
					.addGap(233))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(276)
					.addComponent(btnSearch)
					.addContainerGap(287, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblLogo2, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblRecipientAndOccasion, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAge, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGender, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(rbMale, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(rbFemale))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMinGiftPrice, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtf_mingiftprice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMaxGiftPrice, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
						.addComponent(txtf_maxgiftprice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTypeOfOccasion)
						.addComponent(rbBirthday, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnJobPromotion))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnValentinesDayanniversary, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(41)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblInterests, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(cbSports)
								.addComponent(cbClothes)
								.addComponent(cbToys)
								.addComponent(cbEducation))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(cbElectronics)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(cbHouseItems)
							.addComponent(cbAccesories)))
					.addGap(18)
					.addComponent(btnSearch)
					.addGap(29))
		);
		contentPane.setLayout(gl_contentPane);
		
		
	}
}
