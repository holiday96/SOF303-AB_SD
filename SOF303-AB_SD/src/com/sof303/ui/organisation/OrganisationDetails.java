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
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

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
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTable table;
	private DefaultTableModel modelDetal4 = new DefaultTableModel();
	private DefaultTableModel modelDetal5 = new DefaultTableModel();

	private JTable table_1;

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
		
		JLabel lblOrganisation = new JLabel("<html><p>Organisation</p><p>Specicalism</p></html>");
		lblOrganisation.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOrganisation.setBounds(10, 11, 94, 40);
		panelDetail2.add(lblOrganisation);
		
		JLabel lblService = new JLabel("<html><p>Service Disablities</p><p>Capabilities</p></html>");
		lblService.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblService.setBounds(10, 122, 116, 40);
		panelDetail2.add(lblService);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(159, 11, 275, 100);
		panelDetail2.add(scrollPane_2);
		
		JScrollPane scrollPane_2_1 = new JScrollPane();
		scrollPane_2_1.setBounds(159, 122, 275, 100);
		panelDetail2.add(scrollPane_2_1);
		
		JScrollPane scrollPane_2_2 = new JScrollPane();
		scrollPane_2_2.setBounds(159, 233, 275, 100);
		panelDetail2.add(scrollPane_2_2);
		
		JScrollPane scrollPane_2_3 = new JScrollPane();
		scrollPane_2_3.setBounds(159, 344, 275, 100);
		panelDetail2.add(scrollPane_2_3);
		
		JScrollPane scrollPane_2_4 = new JScrollPane();
		scrollPane_2_4.setBounds(615, 11, 282, 100);
		panelDetail2.add(scrollPane_2_4);
		
		JScrollPane scrollPane_2_4_1 = new JScrollPane();
		scrollPane_2_4_1.setBounds(615, 122, 282, 100);
		panelDetail2.add(scrollPane_2_4_1);
		
		JScrollPane scrollPane_2_4_2 = new JScrollPane();
		scrollPane_2_4_2.setBounds(615, 233, 282, 100);
		panelDetail2.add(scrollPane_2_4_2);
		
		JLabel lblService_1 = new JLabel("<html><p>Service Barriers</p><p>Capabilities</p></html>");
		lblService_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblService_1.setBounds(10, 233, 116, 40);
		panelDetail2.add(lblService_1);
		
		JLabel lblService_2 = new JLabel("<html><p>Service Benefits</p><p>Capabilities</p></html>");
		lblService_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblService_2.setBounds(10, 344, 116, 40);
		panelDetail2.add(lblService_2);
		
		JLabel lblService_3 = new JLabel("<html><p>Service Personal</p><p>Circumstances</p><p>Capabilities</p></html>");
		lblService_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblService_3.setBounds(453, 11, 116, 60);
		panelDetail2.add(lblService_3);
		
		JLabel lblService_4 = new JLabel("<html><p>Service Ethinicity</p><p>Capabilities</p></html>");
		lblService_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblService_4.setBounds(453, 122, 116, 40);
		panelDetail2.add(lblService_4);
		
		JLabel lblService_5 = new JLabel("Accreditetion");
		lblService_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblService_5.setBounds(453, 233, 116, 25);
		panelDetail2.add(lblService_5);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Details 3", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblService_5_1 = new JLabel("EOI Programmes");
		lblService_5_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblService_5_1.setBounds(10, 30, 116, 25);
		panel.add(lblService_5_1);
		
		JScrollPane scrollPane_2_5 = new JScrollPane();
		scrollPane_2_5.setBounds(186, 11, 275, 145);
		panel.add(scrollPane_2_5);
		
		JScrollPane scrollPane_2_5_1 = new JScrollPane();
		scrollPane_2_5_1.setBounds(186, 179, 275, 145);
		panel.add(scrollPane_2_5_1);
		
		JLabel lblService_5_1_1 = new JLabel("EOI Services");
		lblService_5_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblService_5_1_1.setBounds(10, 197, 116, 25);
		panel.add(lblService_5_1_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Details 4", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Located In", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 275, 887, 170);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_16.setColumns(10);
		textField_16.setBounds(145, 132, 255, 25);
		panel_3.add(textField_16);
		
		JLabel lblUnitary = new JLabel("Unitary uthority:");
		lblUnitary.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUnitary.setBounds(10, 131, 119, 25);
		panel_3.add(lblUnitary);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_17.setColumns(10);
		textField_17.setBounds(145, 95, 255, 25);
		panel_3.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_18.setColumns(10);
		textField_18.setBounds(145, 59, 255, 25);
		panel_3.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_19.setColumns(10);
		textField_19.setBounds(145, 23, 255, 25);
		panel_3.add(textField_19);
		
		JLabel lblLocalAuthority = new JLabel("Local Authority:");
		lblLocalAuthority.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLocalAuthority.setBounds(10, 95, 119, 25);
		panel_3.add(lblLocalAuthority);
		
		JLabel lblBorough = new JLabel("Borough:");
		lblBorough.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBorough.setBounds(10, 59, 119, 25);
		panel_3.add(lblBorough);
		
		JLabel lblWard = new JLabel("Ward:");
		lblWard.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWard.setBounds(10, 23, 119, 25);
		panel_3.add(lblWard);
		
		JLabel lblNhsAuthority = new JLabel("NHS Authority:");
		lblNhsAuthority.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhsAuthority.setBounds(434, 22, 119, 25);
		panel_3.add(lblNhsAuthority);
		
		JLabel lblWard_1_1 = new JLabel("Gov't Office Region:");
		lblWard_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWard_1_1.setBounds(434, 59, 133, 25);
		panel_3.add(lblWard_1_1);
		
		JLabel lblWard_1_2 = new JLabel("Trust Region:");
		lblWard_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWard_1_2.setBounds(434, 95, 119, 25);
		panel_3.add(lblWard_1_2);
		
		JLabel lblWard_1_3 = new JLabel("Trust District:");
		lblWard_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWard_1_3.setBounds(434, 132, 119, 25);
		panel_3.add(lblWard_1_3);
		// à quên chưa púh
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_20.setColumns(10);
		textField_20.setBounds(577, 26, 289, 25);
		panel_3.add(textField_20);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(577, 60, 205, 25);
		panel_3.add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(577, 97, 205, 25);
		panel_3.add(comboBox_1_1);
		
		JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setBounds(577, 132, 205, 25);
		panel_3.add(comboBox_1_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Premise", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(10, 11, 887, 255);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 21, 867, 223);
		panel_4.add(scrollPane_3);
		
		table = new JTable();
		modelDetal4.addColumn("Premise Name");
		modelDetal4.addColumn("Address");
		modelDetal4.addColumn("Primary Location");
		modelDetal4.addColumn("Phone Number");
		modelDetal4.addColumn("");
		table.setModel(modelDetal4);

		scrollPane_3.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Details 5", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Current List of Supporting Materials");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 11, 293, 25);
		panel_2.add(lblNewLabel_1);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(808, 13, 89, 23);
		panel_2.add(btnCreate);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 47, 887, 398);
		panel_2.add(scrollPane_4);
		
		table_1 = new JTable();
		modelDetal5.addColumn("URL");
		modelDetal5.addColumn("Description");
		modelDetal5.addColumn("Type");
		modelDetal5.addColumn("Added By");
		modelDetal5.addColumn("Added Date");
		modelDetal5.addColumn("");
		table_1.setModel(modelDetal5);
		scrollPane_4.setViewportView(table_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(833, 30, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(734, 30, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnInActive = new JButton("In-active");
		btnInActive.setBounds(635, 30, 89, 23);
		contentPane.add(btnInActive);
	}
}
