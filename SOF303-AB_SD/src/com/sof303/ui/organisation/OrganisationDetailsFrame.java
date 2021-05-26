package com.sof303.ui.organisation;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class OrganisationDetailsFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtContact;
	private JTextField txtAddress1;
	private JTextField txtAddress2;
	private JTextField txtAddress3;
	private JTextField txtPost;
	private JTextField txtCity;
	private JTextField txtCountry;
	private JTextField txtBusiness;
	private JTextField txtCode;
	private JTextField txtPhone;
	private JTextField txtFax;
	private JTextField txtEmail;
	private JTextField txtWeb;
	private JTextField txtCharity;
	private JTextField txtCompany;
	private JTextField txtUnitary;
	private JTextField txtLocal;
	private JTextField txtBorough;
	private JTextField txtWard;
	private JTextField txtNHS;
	private JTable tableDetails4;
	private DefaultTableModel modelDetal4 = new DefaultTableModel();
	private DefaultTableModel modelDetal5 = new DefaultTableModel();
	private DefaultTableModel modelBU = new DefaultTableModel();
	private JLabel lblSortAll = new JLabel("<html><u>All</u>&ensp;|</html>");
	private JLabel lblSort09 = new JLabel("<html>0 - 9&ensp;|</html>");
	private JLabel lblSortA = new JLabel("<html>A B C D E&ensp;|</html>");
	private JLabel lblSortG = new JLabel("<html>F G H I J K&ensp;|</html>");
	private JLabel lblSortK = new JLabel("<html>K L M N&ensp;|</html>");
	private JLabel lblSortQ = new JLabel("<html>O P Q R&ensp;|</html>");
	private JLabel lblSortS = new JLabel("<html>S T U V&ensp;|</html>");
	private JLabel lblSortW = new JLabel("<html>W X Y Z&ensp;|</html>");
	private ArrayList<JLabel> listSort = new ArrayList<JLabel>();

	private JTable tableDetail5;
	private JTextField txtPage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrganisationDetailsFrame frame = new OrganisationDetailsFrame();
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
	public OrganisationDetailsFrame() {
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
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtName.setBounds(181, 12, 255, 25);
		panelDetal1.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblOrganisationShort = new JLabel("Organisation Short");
		lblOrganisationShort.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOrganisationShort.setBounds(10, 47, 136, 25);
		panelDetal1.add(lblOrganisationShort);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(181, 47, 255, 61);
		panelDetal1.add(scrollPane);
		
		JTextArea txtDescrip = new JTextArea();
		scrollPane.setViewportView(txtDescrip);
		
		JLabel lblDescription = new JLabel("<html><p>Description <span style=\"color: red;\">*</span></p></html>");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescription.setBounds(10, 70, 136, 25);
		panelDetal1.add(lblDescription);
		
		txtContact = new JTextField();
		txtContact.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtContact.setColumns(10);
		txtContact.setBounds(181, 119, 163, 25);
		panelDetal1.add(txtContact);
		
		txtAddress1 = new JTextField();
		txtAddress1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtAddress1.setColumns(10);
		txtAddress1.setBounds(181, 155, 255, 25);
		panelDetal1.add(txtAddress1);
		
		txtAddress2 = new JTextField();
		txtAddress2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtAddress2.setColumns(10);
		txtAddress2.setBounds(181, 191, 255, 25);
		panelDetal1.add(txtAddress2);
		
		txtAddress3 = new JTextField();
		txtAddress3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtAddress3.setColumns(10);
		txtAddress3.setBounds(181, 227, 255, 25);
		panelDetal1.add(txtAddress3);
		
		txtPost = new JTextField();
		txtPost.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtPost.setColumns(10);
		txtPost.setBounds(181, 263, 163, 25);
		panelDetal1.add(txtPost);
		
		txtCity = new JTextField();
		txtCity.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCity.setColumns(10);
		txtCity.setBounds(181, 299, 255, 25);
		panelDetal1.add(txtCity);
		
		txtCountry = new JTextField();
		txtCountry.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCountry.setColumns(10);
		txtCountry.setBounds(181, 335, 255, 25);
		panelDetal1.add(txtCountry);
		
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
		
		JComboBox cbbNation = new JComboBox();
		cbbNation.setBounds(181, 371, 231, 25);
		panelDetal1.add(cbbNation);
		
		JLabel lblPreferredOrganisation = new JLabel("Preferred Organisation");
		lblPreferredOrganisation.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPreferredOrganisation.setBounds(466, 11, 148, 25);
		panelDetal1.add(lblPreferredOrganisation);
		
		JCheckBox chkPreferred = new JCheckBox("");
		chkPreferred.setBounds(626, 11, 99, 25);
		panelDetal1.add(chkPreferred);
		
		JCheckBox chkExpression = new JCheckBox("");
		chkExpression.setBounds(626, 39, 99, 25);
		panelDetal1.add(chkExpression);
		
		JLabel lblNewLabel_1_1 = new JLabel("Expression of interest");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(466, 39, 154, 25);
		panelDetal1.add(lblNewLabel_1_1);
		
		txtBusiness = new JTextField();
		txtBusiness.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtBusiness.setColumns(10);
		txtBusiness.setBounds(631, 83, 231, 25);
		panelDetal1.add(txtBusiness);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("<html><p>Tye of Business <span style=\"color: red;\">*</span></p></html>");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(466, 83, 136, 25);
		panelDetal1.add(lblNewLabel_1_1_1);
		
		txtCode = new JTextField();
		txtCode.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCode.setColumns(10);
		txtCode.setBounds(631, 119, 81, 25);
		panelDetal1.add(txtCode);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(631, 155, 255, 61);
		panelDetal1.add(scrollPane_1);
		
		JTextArea txtFullDess = new JTextArea();
		scrollPane_1.setViewportView(txtFullDess);
		
		txtPhone = new JTextField();
		txtPhone.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtPhone.setColumns(10);
		txtPhone.setBounds(631, 227, 255, 25);
		panelDetal1.add(txtPhone);
		
		txtFax = new JTextField();
		txtFax.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFax.setColumns(10);
		txtFax.setBounds(631, 263, 255, 25);
		panelDetal1.add(txtFax);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtEmail.setColumns(10);
		txtEmail.setBounds(631, 299, 255, 25);
		panelDetal1.add(txtEmail);
		
		txtWeb = new JTextField();
		txtWeb.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtWeb.setColumns(10);
		txtWeb.setBounds(631, 335, 255, 25);
		panelDetal1.add(txtWeb);
		
		txtCharity = new JTextField();
		txtCharity.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCharity.setColumns(10);
		txtCharity.setBounds(631, 371, 255, 25);
		panelDetal1.add(txtCharity);
		
		txtCompany = new JTextField();
		txtCompany.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCompany.setColumns(10);
		txtCompany.setBounds(631, 407, 255, 25);
		panelDetal1.add(txtCompany);
		
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
		
		txtUnitary = new JTextField();
		txtUnitary.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtUnitary.setColumns(10);
		txtUnitary.setBounds(145, 132, 255, 25);
		panel_3.add(txtUnitary);
		
		JLabel lblUnitary = new JLabel("Unitary uthority:");
		lblUnitary.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUnitary.setBounds(10, 131, 119, 25);
		panel_3.add(lblUnitary);
		
		txtLocal = new JTextField();
		txtLocal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtLocal.setColumns(10);
		txtLocal.setBounds(145, 95, 255, 25);
		panel_3.add(txtLocal);
		
		txtBorough = new JTextField();
		txtBorough.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtBorough.setColumns(10);
		txtBorough.setBounds(145, 59, 255, 25);
		panel_3.add(txtBorough);
		
		txtWard = new JTextField();
		txtWard.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtWard.setColumns(10);
		txtWard.setBounds(145, 23, 255, 25);
		panel_3.add(txtWard);
		
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
		
		txtNHS = new JTextField();
		txtNHS.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNHS.setColumns(10);
		txtNHS.setBounds(577, 26, 289, 25);
		panel_3.add(txtNHS);
		
		JComboBox cbbRegion = new JComboBox();
		cbbRegion.setBounds(577, 60, 205, 25);
		panel_3.add(cbbRegion);
		
		JComboBox cbbTrustRegion = new JComboBox();
		cbbTrustRegion.setBounds(577, 97, 205, 25);
		panel_3.add(cbbTrustRegion);
		
		JComboBox cbbStrustDestrict = new JComboBox();
		cbbStrustDestrict.setBounds(577, 132, 205, 25);
		panel_3.add(cbbStrustDestrict);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Premise", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(10, 11, 887, 255);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 21, 867, 223);
		panel_4.add(scrollPane_3);
		
		tableDetails4 = new JTable();
		modelDetal4.addColumn("Premise Name");
		modelDetal4.addColumn("Address");
		modelDetal4.addColumn("Primary Location");
		modelDetal4.addColumn("Phone Number");
		modelDetal4.addColumn("");
		tableDetails4.setModel(modelDetal4);

		scrollPane_3.setViewportView(tableDetails4);
		
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
		
		tableDetail5 = new JTable();
		modelDetal5.addColumn("URL");
		modelDetal5.addColumn("Description");
		modelDetal5.addColumn("Type");
		modelDetal5.addColumn("Added By");
		modelDetal5.addColumn("Added Date");
		modelDetal5.addColumn("");
		tableDetail5.setModel(modelDetal5);
		scrollPane_4.setViewportView(tableDetail5);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("BU/Directorates", null, panel_5, null);
		panel_5.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_7.setBounds(672, 418, 225, 26);
		panel_5.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblLast = new JLabel("");
		lblLast.setIcon(new ImageIcon("SOF303-AB_SD\\images\\skip-next-regular-24.png"));
		lblLast.setBounds(200, 1, 24, 24);
		panel_7.add(lblLast);
		
		JLabel lblNext = new JLabel("");
		lblNext.setIcon(new ImageIcon("SOF303-AB_SD\\images\\last-page-regular-24.png"));
		lblNext.setBounds(171, 1, 24, 24);
		panel_7.add(lblNext);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("of 2 |");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setBounds(138, 0, 35, 24);
		panel_7.add(lblNewLabel_2_1_1);
		
		txtPage = new JTextField();
		txtPage.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPage.setText("1");
		txtPage.setBorder(null);
		txtPage.setBounds(100, 3, 35, 20);
		panel_7.add(txtPage);
		txtPage.setColumns(10);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("| Page");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1_1_1.setBounds(51, 0, 43, 24);
		panel_7.add(lblNewLabel_2_1_1_1);
		
		JLabel lblPre = new JLabel("");
		lblPre.setIcon(new ImageIcon("SOF303-AB_SD\\images\\first-page-regular-24.png"));
		lblPre.setBounds(25, 1, 24, 24);
		panel_7.add(lblPre);
		
		JLabel lblFirst = new JLabel("");
		lblFirst.setIcon(new ImageIcon("SOF303-AB_SD\\images\\skip-previous-regular-24.png"));
		lblFirst.setBounds(1, 1, 24, 24);
		panel_7.add(lblFirst);
		
		lblSortAll.setForeground(new Color(0, 0, 205));
		lblSortAll.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSortAll.setBounds(10, 12, 30, 15);
		panel_5.add(lblSortAll);
		
		lblSort09.setForeground(new Color(0, 0, 205));
		lblSort09.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSort09.setBounds(42, 12, 48, 15);
		panel_5.add(lblSort09);
		
		lblSortA.setForeground(new Color(0, 0, 205));
		lblSortA.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSortA.setBounds(90, 12, 74, 15);
		panel_5.add(lblSortA);
		
		lblSortG.setForeground(new Color(0, 0, 205));
		lblSortG.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSortG.setBounds(165, 12, 80, 15);
		panel_5.add(lblSortG);
		
		lblSortK.setForeground(new Color(0, 0, 205));
		lblSortK.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSortK.setBounds(244, 12, 65, 15);
		panel_5.add(lblSortK);
		
		lblSortQ.setForeground(new Color(0, 0, 205));
		lblSortQ.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSortQ.setBounds(309, 12, 66, 15);
		panel_5.add(lblSortQ);
		
		lblSortS.setForeground(new Color(0, 0, 205));
		lblSortS.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSortS.setBounds(375, 12, 63, 15);
		panel_5.add(lblSortS);
		
		lblSortW.setForeground(new Color(0, 0, 205));
		lblSortW.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSortW.setBounds(436, 12, 76, 15);
		panel_5.add(lblSortW);
		
		JButton btnCreateBU = new JButton("Create");
		btnCreateBU.setBounds(671, 9, 87, 23);
		panel_5.add(btnCreateBU);
		
		JCheckBox chkInclude = new JCheckBox("Include In-active");
		chkInclude.setBounds(764, 9, 133, 23);
		panel_5.add(chkInclude);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(833, 30, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(734, 30, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnInActive = new JButton("In-active");
		btnInActive.setBounds(635, 30, 89, 23);
		contentPane.add(btnInActive);
		
		listSort.add(lblSort09);
		listSort.add(lblSortA);
		listSort.add(lblSortAll);
		listSort.add(lblSortG);
		listSort.add(lblSortK);
		listSort.add(lblSortQ);
		listSort.add(lblSortS);
		listSort.add(lblSortW);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(10, 38, 887, 359);
		panel_5.add(scrollPane_5);
		
		tableBU = new JTable();
		scrollPane_5.setViewportView(tableBU);
		modelBU.addColumn("BU/Directorate Name");
		modelBU.addColumn("Office Address Line 1");
		modelBU.addColumn("Postcode");
		modelBU.addColumn("Contact");
		modelBU.addColumn("Is Active?");
		tableBU.setModel(modelBU);
		
		listSort.forEach((lbl) -> {
			lbl.addMouseListener(clicker);
		});
	}
	
	MouseListener clicker = new MouseListener() {
		
		public void mouseReleased(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			JLabel clickJLabel = (JLabel) e.getComponent();
			listSort.forEach((lbl) -> {
				if(lbl == clickJLabel) {
					String lblText = clickJLabel.getText().substring(6, clickJLabel.getText().length() - 14);
					lbl.setText("<html><u>"+lblText+"</u>&ensp;|</html>");
				} else {
					if(lbl.getText().contains("<u>")) {
						lbl.setText("<html>"+lbl.getText().substring(9, lbl.getText().length() - 18)+"&ensp;|</html>");
					}
				}
			});
		}
	};
	private JTable tableBU;
}
