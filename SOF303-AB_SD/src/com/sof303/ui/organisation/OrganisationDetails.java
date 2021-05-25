package com.sof303.ui.organisation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class OrganisationDetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrganisationDetails frame = new OrganisationDetails();
					frame.setLocationRelativeTo(null);
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
	public OrganisationDetails() {
		setTitle("Organisation details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 948, 579);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOrganisationDetails = new JLabel("Organisation details");
		lblOrganisationDetails.setForeground(new Color(46, 139, 87));
		lblOrganisationDetails.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblOrganisationDetails.setBounds(10, 11, 194, 22);
		contentPane.add(lblOrganisationDetails);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 44, 912, 484);
		contentPane.add(tabbedPane);
		
		JPanel panelDetal1 = new JPanel();
		tabbedPane.addTab("Details 1", null, panelDetal1, null);
		panelDetal1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html><p>Organisation Name <span style=\"color: red;\">*</span></p></html>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 161, 25);
		panelDetal1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setBounds(181, 12, 255, 25);
		panelDetal1.add(textField);
		textField.setColumns(10);
		
		JLabel lblOrganisationShort = new JLabel("Organisation Short");
		lblOrganisationShort.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOrganisationShort.setBounds(10, 47, 136, 25);
		panelDetal1.add(lblOrganisationShort);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(181, 47, 255, 61);
		panelDetal1.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel lblDescription = new JLabel("<html><p>Description <span style=\"color: red;\">*</span></p></html>");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescription.setBounds(10, 70, 136, 25);
		panelDetal1.add(lblDescription);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(181, 119, 163, 25);
		panelDetal1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBounds(181, 155, 255, 25);
		panelDetal1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_3.setColumns(10);
		textField_3.setBounds(181, 191, 255, 25);
		panelDetal1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_4.setColumns(10);
		textField_4.setBounds(181, 227, 255, 25);
		panelDetal1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_5.setColumns(10);
		textField_5.setBounds(181, 263, 163, 25);
		panelDetal1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_6.setColumns(10);
		textField_6.setBounds(181, 299, 255, 25);
		panelDetal1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_7.setColumns(10);
		textField_7.setBounds(181, 335, 255, 25);
		panelDetal1.add(textField_7);
		
		JLabel lblLeadContact = new JLabel("Lead contact");
		lblLeadContact.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLeadContact.setBounds(10, 119, 136, 25);
		panelDetal1.add(lblLeadContact);
		
		JLabel lblAddressLine = new JLabel("<html><p>Address line 1 <span style=\"color: red;\">*</span></p></html>");
		lblAddressLine.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddressLine.setBounds(10, 155, 136, 25);
		panelDetal1.add(lblAddressLine);
		
		JLabel lblAddressLine_1 = new JLabel("Address line 2");
		lblAddressLine_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddressLine_1.setBounds(10, 191, 136, 25);
		panelDetal1.add(lblAddressLine_1);
		
		JLabel lblAddressLine_2 = new JLabel("Address line 3");
		lblAddressLine_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddressLine_2.setBounds(10, 227, 136, 25);
		panelDetal1.add(lblAddressLine_2);
		
		JLabel lblPostCode = new JLabel("<html><p>Postcode <span style=\"color: red;\">*</span></p></html>");
		lblPostCode.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPostCode.setBounds(10, 263, 136, 25);
		panelDetal1.add(lblPostCode);
		
		JLabel lblCitytown = new JLabel("City/Town");
		lblCitytown.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCitytown.setBounds(10, 299, 136, 25);
		panelDetal1.add(lblCitytown);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCountry.setBounds(10, 335, 136, 25);
		panelDetal1.add(lblCountry);
		
		JLabel lblNationcountry = new JLabel("Nation/Country");
		lblNationcountry.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNationcountry.setBounds(10, 371, 136, 25);
		panelDetal1.add(lblNationcountry);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(181, 371, 231, 25);
		panelDetal1.add(comboBox);
		
		JLabel lblPreferredOrganisation = new JLabel("Preferred Organisation");
		lblPreferredOrganisation.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPreferredOrganisation.setBounds(466, 11, 148, 25);
		panelDetal1.add(lblPreferredOrganisation);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(626, 11, 99, 25);
		panelDetal1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setBounds(626, 39, 99, 25);
		panelDetal1.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Expression of interest");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(466, 39, 154, 25);
		panelDetal1.add(lblNewLabel_1_1);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_8.setColumns(10);
		textField_8.setBounds(631, 83, 231, 25);
		panelDetal1.add(textField_8);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("<html><p>Tye of Business <span style=\"color: red;\">*</span></p></html>");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(466, 83, 136, 25);
		panelDetal1.add(lblNewLabel_1_1_1);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_9.setColumns(10);
		textField_9.setBounds(631, 119, 81, 25);
		panelDetal1.add(textField_9);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(631, 155, 255, 61);
		panelDetal1.add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_10.setColumns(10);
		textField_10.setBounds(631, 227, 255, 25);
		panelDetal1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_11.setColumns(10);
		textField_11.setBounds(631, 263, 255, 25);
		panelDetal1.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_12.setColumns(10);
		textField_12.setBounds(631, 299, 255, 25);
		panelDetal1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_13.setColumns(10);
		textField_13.setBounds(631, 335, 255, 25);
		panelDetal1.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_14.setColumns(10);
		textField_14.setBounds(631, 371, 255, 25);
		panelDetal1.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_15.setColumns(10);
		textField_15.setBounds(631, 407, 255, 25);
		panelDetal1.add(textField_15);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("SIC Code");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(466, 119, 136, 25);
		panelDetal1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblOrganisationShort_1 = new JLabel("Organisation Full");
		lblOrganisationShort_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOrganisationShort_1.setBounds(466, 161, 136, 25);
		panelDetal1.add(lblOrganisationShort_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Description");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1.setBounds(466, 180, 136, 25);
		panelDetal1.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("<html><p>Phone number <span style=\"color: red;\">*</span></p></html>");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_2.setBounds(466, 227, 136, 25);
		panelDetal1.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_3 = new JLabel("Fax");
		lblNewLabel_1_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_3.setBounds(466, 263, 136, 25);
		panelDetal1.add(lblNewLabel_1_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_1_4 = new JLabel("Email");
		lblNewLabel_1_1_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_4.setBounds(466, 299, 136, 25);
		panelDetal1.add(lblNewLabel_1_1_1_1_4);
		
		JLabel lblNewLabel_1_1_1_1_5 = new JLabel("Web address");
		lblNewLabel_1_1_1_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_5.setBounds(466, 335, 136, 25);
		panelDetal1.add(lblNewLabel_1_1_1_1_5);
		
		JLabel lblNewLabel_1_1_1_1_6 = new JLabel("Charity number");
		lblNewLabel_1_1_1_1_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_6.setBounds(466, 371, 136, 25);
		panelDetal1.add(lblNewLabel_1_1_1_1_6);
		
		JLabel lblNewLabel_1_1_1_1_7 = new JLabel("Company number");
		lblNewLabel_1_1_1_1_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_7.setBounds(466, 407, 136, 25);
		panelDetal1.add(lblNewLabel_1_1_1_1_7);
		
		JPanel panelDetail2 = new JPanel();
		tabbedPane.addTab("Details 2", null, panelDetail2, null);
		panelDetail2.setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(833, 30, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(734, 30, 89, 23);
		contentPane.add(btnSave);
	}
}
