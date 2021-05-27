package com.sof303.ui.organisation;

import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Details1Panel extends JPanel {
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

	/**
	 * Create the panel.
	 */
	public Details1Panel() {
		setLayout(null);

		JLabel lblNewLabel = new JLabel("<html><p>Organisation Name <span style=\"color: red;\">*</span></p></html>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 161, 25);
		add(lblNewLabel);

		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtName.setBounds(181, 12, 255, 25);
		add(txtName);
		txtName.setColumns(10);

		JLabel lblOrganisationShort = new JLabel("Organisation Short");
		lblOrganisationShort.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOrganisationShort.setBounds(10, 47, 136, 25);
		add(lblOrganisationShort);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(181, 47, 255, 61);
		add(scrollPane);

		JTextArea txtDescrip = new JTextArea();
		scrollPane.setViewportView(txtDescrip);

		JLabel lblDescription = new JLabel("<html><p>Description <span style=\"color: red;\">*</span></p></html>");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescription.setBounds(10, 70, 136, 25);
		add(lblDescription);

		txtContact = new JTextField();
		txtContact.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtContact.setColumns(10);
		txtContact.setBounds(181, 119, 163, 25);
		add(txtContact);

		txtAddress1 = new JTextField();
		txtAddress1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtAddress1.setColumns(10);
		txtAddress1.setBounds(181, 155, 255, 25);
		add(txtAddress1);

		txtAddress2 = new JTextField();
		txtAddress2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtAddress2.setColumns(10);
		txtAddress2.setBounds(181, 191, 255, 25);
		add(txtAddress2);

		txtAddress3 = new JTextField();
		txtAddress3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtAddress3.setColumns(10);
		txtAddress3.setBounds(181, 227, 255, 25);
		add(txtAddress3);

		txtPost = new JTextField();
		txtPost.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtPost.setColumns(10);
		txtPost.setBounds(181, 263, 163, 25);
		add(txtPost);

		txtCity = new JTextField();
		txtCity.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCity.setColumns(10);
		txtCity.setBounds(181, 299, 255, 25);
		add(txtCity);

		txtCountry = new JTextField();
		txtCountry.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCountry.setColumns(10);
		txtCountry.setBounds(181, 335, 255, 25);
		add(txtCountry);

		JLabel lblLeadContact = new JLabel("Lead contact");
		lblLeadContact.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLeadContact.setBounds(10, 119, 136, 25);
		add(lblLeadContact);

		JLabel lblAddressLine = new JLabel("<html><p>Address line 1 <span style=\"color: red;\">*</span></p></html>");
		lblAddressLine.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddressLine.setBounds(10, 155, 136, 25);
		add(lblAddressLine);

		JLabel lblAddressLine_1 = new JLabel("Address line 2");
		lblAddressLine_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddressLine_1.setBounds(10, 191, 136, 25);
		add(lblAddressLine_1);

		JLabel lblAddressLine_2 = new JLabel("Address line 3");
		lblAddressLine_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddressLine_2.setBounds(10, 227, 136, 25);
		add(lblAddressLine_2);

		JLabel lblPostCode = new JLabel("<html><p>Postcode <span style=\"color: red;\">*</span></p></html>");
		lblPostCode.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPostCode.setBounds(10, 263, 136, 25);
		add(lblPostCode);

		JLabel lblCitytown = new JLabel("City/Town");
		lblCitytown.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCitytown.setBounds(10, 299, 136, 25);
		add(lblCitytown);

		JLabel lblCountry = new JLabel("Country");
		lblCountry.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCountry.setBounds(10, 335, 136, 25);
		add(lblCountry);

		JLabel lblNationcountry = new JLabel("Nation/Country");
		lblNationcountry.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNationcountry.setBounds(10, 371, 136, 25);
		add(lblNationcountry);

		JComboBox cbbNation = new JComboBox();
		cbbNation.setBounds(181, 371, 231, 25);
		add(cbbNation);

		JLabel lblPreferredOrganisation = new JLabel("Preferred Organisation");
		lblPreferredOrganisation.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPreferredOrganisation.setBounds(466, 11, 148, 25);
		add(lblPreferredOrganisation);

		JCheckBox chkPreferred = new JCheckBox("");
		chkPreferred.setBounds(626, 11, 99, 25);
		add(chkPreferred);

		JCheckBox chkExpression = new JCheckBox("");
		chkExpression.setBounds(626, 39, 99, 25);
		add(chkExpression);

		JLabel lblNewLabel_1_1 = new JLabel("Expression of interest");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(466, 39, 154, 25);
		add(lblNewLabel_1_1);

		txtBusiness = new JTextField();
		txtBusiness.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtBusiness.setColumns(10);
		txtBusiness.setBounds(631, 83, 231, 25);
		add(txtBusiness);

		JLabel lblNewLabel_1_1_1 = new JLabel(
				"<html><p>Tye of Business <span style=\"color: red;\">*</span></p></html>");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(466, 83, 136, 25);
		add(lblNewLabel_1_1_1);

		txtCode = new JTextField();
		txtCode.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCode.setColumns(10);
		txtCode.setBounds(631, 119, 81, 25);
		add(txtCode);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(631, 155, 255, 61);
		add(scrollPane_1);

		JTextArea txtFullDess = new JTextArea();
		scrollPane_1.setViewportView(txtFullDess);

		txtPhone = new JTextField();
		txtPhone.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtPhone.setColumns(10);
		txtPhone.setBounds(631, 227, 255, 25);
		add(txtPhone);

		txtFax = new JTextField();
		txtFax.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFax.setColumns(10);
		txtFax.setBounds(631, 263, 255, 25);
		add(txtFax);

		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtEmail.setColumns(10);
		txtEmail.setBounds(631, 299, 255, 25);
		add(txtEmail);

		txtWeb = new JTextField();
		txtWeb.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtWeb.setColumns(10);
		txtWeb.setBounds(631, 335, 255, 25);
		add(txtWeb);

		txtCharity = new JTextField();
		txtCharity.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCharity.setColumns(10);
		txtCharity.setBounds(631, 371, 255, 25);
		add(txtCharity);

		txtCompany = new JTextField();
		txtCompany.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCompany.setColumns(10);
		txtCompany.setBounds(631, 407, 255, 25);
		add(txtCompany);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("SIC Code");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(466, 119, 136, 25);
		add(lblNewLabel_1_1_1_1);

		JLabel lblOrganisationShort_1 = new JLabel("Organisation Full");
		lblOrganisationShort_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOrganisationShort_1.setBounds(466, 161, 136, 25);
		add(lblOrganisationShort_1);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Description");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1.setBounds(466, 180, 136, 25);
		add(lblNewLabel_1_1_1_1_1);

		JLabel lblNewLabel_1_1_1_1_2 = new JLabel(
				"<html><p>Phone number <span style=\"color: red;\">*</span></p></html>");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_2.setBounds(466, 227, 136, 25);
		add(lblNewLabel_1_1_1_1_2);

		JLabel lblNewLabel_1_1_1_1_3 = new JLabel("Fax");
		lblNewLabel_1_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_3.setBounds(466, 263, 136, 25);
		add(lblNewLabel_1_1_1_1_3);

		JLabel lblNewLabel_1_1_1_1_4 = new JLabel("Email");
		lblNewLabel_1_1_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_4.setBounds(466, 299, 136, 25);
		add(lblNewLabel_1_1_1_1_4);

		JLabel lblNewLabel_1_1_1_1_5 = new JLabel("Web address");
		lblNewLabel_1_1_1_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_5.setBounds(466, 335, 136, 25);
		add(lblNewLabel_1_1_1_1_5);

		JLabel lblNewLabel_1_1_1_1_6 = new JLabel("Charity number");
		lblNewLabel_1_1_1_1_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_6.setBounds(466, 371, 136, 25);
		add(lblNewLabel_1_1_1_1_6);

		JLabel lblNewLabel_1_1_1_1_7 = new JLabel("Company number");
		lblNewLabel_1_1_1_1_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_7.setBounds(466, 407, 136, 25);
		add(lblNewLabel_1_1_1_1_7);
	}

}
