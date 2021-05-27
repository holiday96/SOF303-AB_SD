package com.sof303.ui.organisation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.sof303.dao.impl.OrganisationDAO;
import com.sof303.model.OrganisationModel;
import java.awt.event.MouseAdapter;

public class OrganisationListFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3813285729480942509L;
	private JPanel contentPane;
	private JTextField txtPage;
	private JTable table;
	private DefaultTableModel modelOrgani = new DefaultTableModel();
	private ArrayList<JLabel> listSort = new ArrayList<JLabel>();
	private JLabel lblSortAll = new JLabel("<html><u>All</u>&ensp;|</html>");
	private JLabel lblSort09 = new JLabel("<html>0 - 9&ensp;|</html>");
	private JLabel lblSortA = new JLabel("<html>A B C D E&ensp;|</html>");
	private JLabel lblSortG = new JLabel("<html>F G H I J K&ensp;|</html>");
	private JLabel lblSortK = new JLabel("<html>K L M N&ensp;|</html>");
	private JLabel lblSortQ = new JLabel("<html>O P Q R&ensp;|</html>");
	private JLabel lblSortS = new JLabel("<html>S T U V&ensp;|</html>");
	private JLabel lblSortW = new JLabel("<html>W X Y Z&ensp;|</html>");

	private List<OrganisationModel> listOrga = new OrganisationDAO().findAll();
	int count = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrganisationListFrame frame = new OrganisationListFrame();
					frame.setTitle("Organisation list");
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
	public OrganisationListFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 986, 594);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Organisation list");
		lblNewLabel.setForeground(new Color(46, 139, 87));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));

		lblSortAll.setForeground(new Color(0, 0, 205));
		lblSortAll.setFont(new Font("Tahoma", Font.BOLD, 12));

		lblSort09.setForeground(new Color(0, 0, 205));
		lblSort09.setFont(new Font("Tahoma", Font.BOLD, 12));

		lblSortA.setForeground(new Color(0, 0, 205));
		lblSortA.setFont(new Font("Tahoma", Font.BOLD, 12));

		lblSortG.setForeground(new Color(0, 0, 205));
		lblSortG.setFont(new Font("Tahoma", Font.BOLD, 12));

		lblSortK.setForeground(new Color(0, 0, 205));
		lblSortK.setFont(new Font("Tahoma", Font.BOLD, 12));

		lblSortQ.setForeground(new Color(0, 0, 205));
		lblSortQ.setFont(new Font("Tahoma", Font.BOLD, 12));

		lblSortS.setForeground(new Color(0, 0, 205));
		lblSortS.setFont(new Font("Tahoma", Font.BOLD, 12));

		lblSortW.setForeground(new Color(0, 0, 205));
		lblSortW.setFont(new Font("Tahoma", Font.BOLD, 12));

		JCheckBox chkInclude = new JCheckBox("Include In-active");

		JButton btnCreate = new JButton("Create");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel.createSequentialGroup()
						.addComponent(lblSortAll, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE).addGap(1)
						.addComponent(lblSort09, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE).addGap(1)
						.addComponent(lblSortA, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE).addGap(1)
						.addComponent(lblSortG, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE).addGap(1)
						.addComponent(lblSortK, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE).addGap(1)
						.addComponent(lblSortQ, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE).addGap(1)
						.addComponent(lblSortS, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE).addGap(1)
						.addComponent(lblSortW, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
						.addComponent(btnCreate, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(chkInclude, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
				.addContainerGap()));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(10).addComponent(lblNewLabel).addGap(15)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblSortAll)
								.addComponent(lblSort09, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSortA, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSortG, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSortK, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSortS, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSortW, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSortQ, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
								.addComponent(chkInclude, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnCreate))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1
						.createSequentialGroup().addContainerGap(729, Short.MAX_VALUE).addComponent(panel_2,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		JLabel lblLast = new JLabel(">|");
		lblLast.setFont(new Font("Tahoma", Font.BOLD, 13));

		txtPage = new JTextField();
		txtPage.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtPage.setText("1");
		txtPage.setBorder(null);
		txtPage.setColumns(10);

		JLabel lblNext = new JLabel(">");
		lblNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				count = count + 1;
				loadTable(count);
			}
		});
		lblNext.setFont(new Font("Tahoma", Font.BOLD, 13));

		float page1 = listOrga.size() / 15;
		float page2 = (int) page1;
		int page = (int) page1;
		if(page1%page2 != 0) {
			page = page + 1;
		}
		JLabel lblMaxPage = new JLabel("of "+page+" |");
		lblMaxPage.setFont(new Font("Tahoma", Font.PLAIN, 13));

		JLabel lblNewLabel_2_2_1 = new JLabel(" | Page");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));

		JLabel lblPre = new JLabel("<");
		lblPre.setEnabled(false);
		lblPre.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel lblFirst = new JLabel("|<");
		lblFirst.setEnabled(false);
		lblFirst.setFont(new Font("Tahoma", Font.BOLD, 13));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup().addGap(1)
						.addComponent(lblFirst, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE).addGap(1)
						.addComponent(lblPre, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE).addGap(1)
						.addComponent(lblNewLabel_2_2_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 1, Short.MAX_VALUE)
						.addComponent(txtPage, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblMaxPage, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE).addGap(3)
						.addComponent(lblNext, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE).addGap(1)
						.addComponent(lblLast, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE).addGap(1)));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_2
				.createSequentialGroup().addGap(0)
				.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLast, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNext, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMaxPage, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_2.createSequentialGroup().addGap(3).addComponent(txtPage,
										GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)))
						.addComponent(lblNewLabel_2_2_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPre, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblFirst, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
				.addGap(3)));
		panel_2.setLayout(gl_panel_2);
		panel_1.setLayout(gl_panel_1);

		listSort.add(lblSort09);
		listSort.add(lblSortA);
		listSort.add(lblSortAll);
		listSort.add(lblSortG);
		listSort.add(lblSortK);
		listSort.add(lblSortQ);
		listSort.add(lblSortS);
		listSort.add(lblSortW);

		listSort.forEach((lbl) -> {
			lbl.addMouseListener(clicker);
		});

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		scrollPane.setViewportView(table);
		modelOrgani.addColumn("Organisation Name");
		modelOrgani.addColumn("Head Office Address Line 1");
		modelOrgani.addColumn("Postcode");
		modelOrgani.addColumn("Contact");
		modelOrgani.addColumn("Is Active");
		table.setModel(modelOrgani);
		loadTable(0);
	}

	public void loadTable(int i) {
		modelOrgani.setRowCount(0);
		for (; i < listOrga.size(); i++) {
			modelOrgani.addRow(new Object[] { listOrga.get(i).getName(), "", "", listOrga.get(i).getContact(), "" });
			count = i;
			if((count + 1) % 15 == 0) {
				break;
			}
		}
		System.out.println(count);
		table.setRowHeight(25);
	}

	MouseListener clicker = new MouseListener() {

		public void mouseReleased(MouseEvent e) {
		}

		public void mousePressed(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			JLabel clickJLabel = (JLabel) e.getComponent();
			listSort.forEach((lbl) -> {
				if (lbl == clickJLabel) {
					String lblText = clickJLabel.getText().substring(6, clickJLabel.getText().length() - 14);
					lbl.setText("<html><u>" + lblText + "</u>&ensp;|</html>");
				} else {
					if (lbl.getText().contains("<u>")) {
						lbl.setText(
								"<html>" + lbl.getText().substring(9, lbl.getText().length() - 18) + "&ensp;|</html>");
					}
				}
			});
		}
	};

}
