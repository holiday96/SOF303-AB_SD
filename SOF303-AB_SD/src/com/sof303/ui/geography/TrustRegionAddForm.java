package com.sof303.ui.geography;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import org.apache.commons.lang.StringUtils;

import com.sof303.model.CountryModel;
import com.sof303.model.TrustRegionModel;
import com.sof303.service.ICountryService;
import com.sof303.service.ITrustRegionService;
import com.sof303.service.impl.CountryService;
import com.sof303.service.impl.TrustRegionService;
import com.sof303.ui.MainFrame;

public class TrustRegionAddForm extends JInternalFrame {

	private static final long serialVersionUID = 8240492114107194125L;

	private JPanel pnlHeader;
	private JPanel pnlDetails;
	private JPanel pnlTitle;
	private Component verticalStrut;
	private JLabel lblTitle;
	private JPanel pnlNav;
	private JButton btnSave;
	private JButton btnBack;
	private JLabel lblNewLabel;
	private JLabel lblName;
	private JLabel lblNewLabel_1;
	private JLabel lblDescription;
	private JTextField txtName;
	private JComboBox<Object> cboNation;
	private JTextArea txtDescription;
	private List<CountryModel> listCountry;

	private ITrustRegionService trustRegionService = new TrustRegionService();
	private ICountryService countryService = new CountryService();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new TrustRegionAddForm();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TrustRegionAddForm() {
		listCountry = countryService.findAll();
		initialize();
	}

	private void initialize() {
		setVisible(true);
		setBounds(100, 100, 758, 501);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pnlHeader = new JPanel();
		getContentPane().add(pnlHeader, BorderLayout.NORTH);
		pnlHeader.setLayout(new BorderLayout(0, 0));

		pnlTitle = new JPanel();
		pnlHeader.add(pnlTitle, BorderLayout.NORTH);
		pnlTitle.setLayout(new BoxLayout(pnlTitle, BoxLayout.Y_AXIS));

		verticalStrut = Box.createVerticalStrut(10);
		pnlTitle.add(verticalStrut);

		lblTitle = new JLabel("  Trust Region List");
		lblTitle.setForeground(new Color(107, 142, 35));
		lblTitle.setFont(new Font("SansSerif", Font.BOLD, 20));
		pnlTitle.add(lblTitle);

		pnlNav = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pnlNav.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		pnlHeader.add(pnlNav, BorderLayout.SOUTH);

		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save();
			}
		});
		pnlNav.add(btnSave);

		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.loadChild(new TrustRegionListForm());
			}
		});
		pnlNav.add(btnBack);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);

		pnlDetails = new JPanel();
		pnlDetails.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		tabbedPane.addTab("Details", null, pnlDetails, null);
		pnlDetails.setLayout(null);

		JLabel lblNation = new JLabel("Nation/Country");
		lblNation.setBounds(10, 15, 90, 16);
		pnlDetails.add(lblNation);

		lblNewLabel = new JLabel("*");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(101, 15, 55, 16);
		pnlDetails.add(lblNewLabel);

		lblName = new JLabel("Trust Region Name");
		lblName.setBounds(10, 50, 114, 16);
		pnlDetails.add(lblName);

		lblNewLabel_1 = new JLabel("*");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(127, 50, 29, 16);
		pnlDetails.add(lblNewLabel_1);

		lblDescription = new JLabel("Description");
		lblDescription.setBounds(10, 84, 114, 16);
		pnlDetails.add(lblDescription);

		cboNation = new JComboBox<Object>();
		cboNation.setBounds(153, 10, 247, 26);
		pnlDetails.add(cboNation);

		listCountry.forEach(e -> cboNation.addItem(e.getName()));

		txtName = new JTextField();
		txtName.setBounds(153, 44, 247, 28);
		pnlDetails.add(txtName);
		txtName.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(153, 78, 247, 166);
		pnlDetails.add(scrollPane);

		txtDescription = new JTextArea();
		scrollPane.setViewportView(txtDescription);
	}

	private boolean validated() {
		if (StringUtils.isBlank(txtName.getText())) {
			return false;
		}
		return true;
	}

	protected void save() {
		if (validated()) {
			TrustRegionModel model = new TrustRegionModel();
			model.setCountryId(listCountry.get(cboNation.getSelectedIndex()).getId());
			model.setName(txtName.getText());
			model.setDescription(txtDescription.getText());
			if (trustRegionService.save(model) != null) {
				MainFrame.loadChild(new TrustRegionListForm());
			}
		}
	}
}
