package windowBuilder.views;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import java.awt.Toolkit;

import javax.swing.AbstractButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GiftSmart_GUI extends JFrame {

	private JPanel contentPane;
	private AbstractButton btnStartProgram;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiftSmart_GUI frame = new GiftSmart_GUI();
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
	
	
	public GiftSmart_GUI() {
		
		initComponents();
		
		
	}
	

	////////////////////////////////////////////////////////////////////////////////////
	// This method contains all of the code for creating and initializing components
	////////////////////////////////////////////////////////////////////////////////////

	private void initComponents() {
		setTitle("GiftSmart");
		setIconImage(Toolkit.getDefaultToolkit().getImage(GiftSmart_GUI.class.getResource("/windowBuilder/resources/present_icon_16.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 464);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		
		JButton btnStartProgram = new JButton("Start Program");
		btnStartProgram.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnStartProgram.setForeground(Color.WHITE);
		btnStartProgram.setBackground(new Color(255, 0, 0));
		
		JLabel lblWelcomeToGiftsmart = new JLabel("Welcome to GiftSmart!");
		lblWelcomeToGiftsmart.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		
		JTextArea txtIntro = new JTextArea();
		txtIntro.setEditable(false);
		txtIntro.setWrapStyleWord(true);
		txtIntro.setLineWrap(true);
		txtIntro.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		txtIntro.setText("Unfortunately in today\u2019s society the gift-giving process has become very mundane as the same types of gifts are always being exchanged. People simply do not have time to spend zipping around the city from store to store in order to find \u201Cthe perfect gift\u201D. As a result, most people resort to buying a gift card. However, fear no more!\r\n\r\nGiftSmart is a website that revolutionizes the gift-giving process by finding the consumer gifts that are fitting for their recipient and within their budget. Users input the occasion, and characteristics about the recipient including their age and interests and our Smart-Gifting Algorithm will show a selection of appropriate items.\r\n\r\nClick the button below to start finding the perfect gift!");
		
		JLabel lblLogo = new JLabel("");
		Image Logo = new ImageIcon(this.getClass().getResource("/giftsmart_logo.PNG")).getImage();
		Image modifiedLogo = Logo.getScaledInstance(662, 62, java.awt.Image.SCALE_SMOOTH);
		lblLogo.setIcon(new ImageIcon(modifiedLogo));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtIntro, GroupLayout.PREFERRED_SIZE, 618, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(149)
					.addComponent(lblWelcomeToGiftsmart, GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
					.addGap(136))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addComponent(lblLogo, GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(251)
					.addComponent(btnStartProgram, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(291, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblWelcomeToGiftsmart, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(txtIntro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
					.addComponent(btnStartProgram, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(19))
		);
		contentPane.setLayout(gl_contentPane);
		
		//Button that takes you to the recipient details page
		
		btnStartProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recipient_details details = new recipient_details();
				details.setVisible(true);
			}
		});
		
	}
	
}
