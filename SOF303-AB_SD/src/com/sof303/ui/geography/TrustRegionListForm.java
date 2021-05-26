package com.sof303.ui.geography;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import com.sof303.model.TrustRegionModel;
import com.sof303.service.ITrustRegionService;
import com.sof303.service.impl.TrustRegionService;

public class TrustRegionListForm extends JInternalFrame {

	private static final long serialVersionUID = -5262718716606112827L;

	private JPanel pnlHeader;
	private JPanel pnlNav;
	private JLabel lblAll;
	private JPanel pnlTitle;
	private JLabel lblTitle;
	private Component verticalStrut;
	private Component verticalStrut_1;
	private JLabel lbl09;
	private JLabel lblSeparate;
	private JLabel lblSeparate_1;
	private JLabel lblA;
	private JLabel lblB;
	private JLabel lblC;
	private JLabel lblD;
	private JLabel lblE;
	private JLabel lblSeparate_2;
	private JLabel lblF;
	private JLabel lblH;
	private JLabel lblI;
	private JLabel lblJ;
	private JLabel lblG;
	private JLabel lblSeparate_3;
	private JLabel lblK;
	private JLabel lblL;
	private JLabel lblM;
	private JLabel lblN;
	private JLabel lblSeparate_4;
	private JLabel lblO;
	private JLabel lblP;
	private JLabel lblQ;
	private JLabel lblR;
	private JLabel lblSeparate_5;
	private JLabel lblS;
	private JLabel lblT;
	private JLabel lblU;
	private JLabel lblV;
	private JLabel lblSeparate_6;
	private JLabel lblW;
	private JLabel lblX;
	private JLabel lblY;
	private JLabel lblZ;
	private JButton btnCreate;
	private Component horizontalGlue;
	private JCheckBox chkbInclude;
	private Component horizontalStrut;
	private Component horizontalStrut_1;
	private Component horizontalStrut_2;
	private Component horizontalStrut_3;
	private Component horizontalStrut_5;
	private Component horizontalStrut_4;
	private Component horizontalStrut_6;
	private Component horizontalStrut_7;
	private Component horizontalStrut_8;
	private Component horizontalStrut_9;
	private Component horizontalStrut_10;
	private Component horizontalStrut_11;
	private Component horizontalStrut_12;
	private Component horizontalStrut_13;
	private Component horizontalStrut_14;
	private Component horizontalStrut_15;
	private Component horizontalStrut_16;
	private Component horizontalStrut_17;
	private Component horizontalStrut_18;
	private Component horizontalStrut_19;
	private Component horizontalStrut_20;
	private Component horizontalStrut_21;
	private Component horizontalStrut_22;
	private Component horizontalStrut_23;
	private Component horizontalStrut_24;
	private Component horizontalStrut_25;
	private Component horizontalStrut_26;
	private Component horizontalStrut_27;
	private Component horizontalStrut_28;
	private Component horizontalStrut_29;
	private Component horizontalStrut_30;
	private Component horizontalStrut_31;
	private Component horizontalStrut_32;
	private Component horizontalStrut_33;
	private Component horizontalStrut_34;
	private Component horizontalStrut_35;
	private Component horizontalStrut_36;
	private JScrollPane scrollPane;
	private JTable table;
	private JPanel pnlFooter;
	private JLabel lblLast;
	private JPanel pnlPage;
	private Component verticalStrut_2;
	private Component verticalStrut_3;
	private JLabel lblFirst;
	private JLabel lblBack;
	private JLabel lblNext;
	private Component horizontalStrut_37;
	private Component horizontalStrut_38;
	private JLabel lblPage;
	private Component horizontalStrut_39;
	private Component horizontalStrut_40;
	private String column[] = { "<html><b>Trust Region Name</b></html>", "<html><b>Description</b></html>", "<html><b>Nation/Country</b></html>", "<html><b>Is Active?</b></html>", "" };
	private DefaultTableModel model;
	private List<TrustRegionModel> list;
	
	private ITrustRegionService trustRegionService = new TrustRegionService();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					new TrustRegionListForm();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TrustRegionListForm() {
		initialize();
		list = trustRegionService.findAll();
		loadToTable();
	}

	private void initialize() {
		((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
		setVisible(true);
		setBounds(100, 100, 821, 512);

		pnlHeader = new JPanel();
		getContentPane().add(pnlHeader, BorderLayout.NORTH);
		pnlHeader.setLayout(new BorderLayout(0, 0));

		pnlNav = new JPanel();
		pnlHeader.add(pnlNav, BorderLayout.SOUTH);
		pnlNav.setLayout(new BoxLayout(pnlNav, BoxLayout.X_AXIS));

		horizontalStrut_1 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_1);

		lblAll = new JLabel("All");
		lblListener(lblAll);
		pnlNav.add(lblAll);

		horizontalStrut = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut);

		lblSeparate = new JLabel("|");
		pnlNav.add(lblSeparate);

		horizontalStrut_2 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_2);

		lbl09 = new JLabel("0 - 9");
		lblListener(lbl09);
		pnlNav.add(lbl09);

		horizontalStrut_3 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_3);

		lblSeparate_1 = new JLabel("|");
		pnlNav.add(lblSeparate_1);

		horizontalStrut_5 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_5);

		lblA = new JLabel("A");
		lblListener(lblA);
		pnlNav.add(lblA);

		horizontalStrut_4 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_4);

		lblB = new JLabel("B");
		lblListener(lblB);
		pnlNav.add(lblB);

		horizontalStrut_6 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_6);

		lblC = new JLabel("C");
		lblListener(lblC);
		pnlNav.add(lblC);

		horizontalStrut_7 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_7);

		lblD = new JLabel("D");
		lblListener(lblD);
		pnlNav.add(lblD);

		horizontalStrut_8 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_8);

		lblE = new JLabel("E");
		lblListener(lblE);
		pnlNav.add(lblE);

		horizontalStrut_9 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_9);

		lblSeparate_2 = new JLabel("|");
		pnlNav.add(lblSeparate_2);

		horizontalStrut_10 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_10);

		lblF = new JLabel("F");
		lblListener(lblF);
		pnlNav.add(lblF);

		horizontalStrut_11 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_11);

		lblG = new JLabel("G");
		lblListener(lblG);
		pnlNav.add(lblG);

		horizontalStrut_12 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_12);

		lblH = new JLabel("H");
		lblListener(lblH);
		pnlNav.add(lblH);

		horizontalStrut_13 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_13);

		lblI = new JLabel("I");
		lblListener(lblI);
		pnlNav.add(lblI);

		horizontalStrut_14 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_14);

		lblJ = new JLabel("J");
		lblListener(lblJ);
		pnlNav.add(lblJ);

		horizontalStrut_15 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_15);

		lblSeparate_3 = new JLabel("|");
		pnlNav.add(lblSeparate_3);

		horizontalStrut_16 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_16);

		lblK = new JLabel("K");
		lblListener(lblK);
		pnlNav.add(lblK);

		horizontalStrut_17 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_17);

		lblL = new JLabel("L");
		lblListener(lblL);
		pnlNav.add(lblL);

		horizontalStrut_18 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_18);

		lblM = new JLabel("M");
		lblListener(lblM);
		pnlNav.add(lblM);

		horizontalStrut_19 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_19);

		lblN = new JLabel("N");
		lblListener(lblN);
		pnlNav.add(lblN);

		horizontalStrut_20 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_20);

		lblSeparate_4 = new JLabel("|");
		pnlNav.add(lblSeparate_4);

		horizontalStrut_21 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_21);

		lblO = new JLabel("O");
		lblListener(lblO);
		pnlNav.add(lblO);

		horizontalStrut_22 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_22);

		lblP = new JLabel("P");
		lblListener(lblP);
		pnlNav.add(lblP);

		horizontalStrut_23 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_23);

		lblQ = new JLabel("Q");
		lblListener(lblQ);
		pnlNav.add(lblQ);

		horizontalStrut_24 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_24);

		lblR = new JLabel("R");
		lblListener(lblR);
		pnlNav.add(lblR);

		horizontalStrut_25 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_25);

		lblSeparate_5 = new JLabel("|");
		pnlNav.add(lblSeparate_5);

		horizontalStrut_26 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_26);

		lblS = new JLabel("S");
		lblListener(lblS);
		pnlNav.add(lblS);

		horizontalStrut_27 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_27);

		lblT = new JLabel("T");
		lblListener(lblT);
		pnlNav.add(lblT);

		horizontalStrut_28 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_28);

		lblU = new JLabel("U");
		lblListener(lblU);
		pnlNav.add(lblU);

		horizontalStrut_29 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_29);

		lblV = new JLabel("V");
		lblListener(lblV);
		pnlNav.add(lblV);

		horizontalStrut_30 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_30);

		lblSeparate_6 = new JLabel("|");
		pnlNav.add(lblSeparate_6);

		horizontalStrut_31 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_31);

		lblW = new JLabel("W");
		lblListener(lblW);
		pnlNav.add(lblW);

		horizontalStrut_32 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_32);

		lblX = new JLabel("X");
		lblListener(lblX);
		pnlNav.add(lblX);

		horizontalStrut_33 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_33);

		lblY = new JLabel("Y");
		lblListener(lblY);
		pnlNav.add(lblY);

		horizontalStrut_34 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_34);

		lblZ = new JLabel("Z");
		lblListener(lblZ);
		pnlNav.add(lblZ);

		horizontalGlue = Box.createHorizontalGlue();
		pnlNav.add(horizontalGlue);

		btnCreate = new JButton("Create");
		pnlNav.add(btnCreate);

		horizontalStrut_35 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_35);

		chkbInclude = new JCheckBox("Include In-active");
		pnlNav.add(chkbInclude);

		horizontalStrut_36 = Box.createHorizontalStrut(7);
		pnlNav.add(horizontalStrut_36);

		pnlTitle = new JPanel();
		pnlHeader.add(pnlTitle, BorderLayout.NORTH);
		pnlTitle.setLayout(new BoxLayout(pnlTitle, BoxLayout.Y_AXIS));

		verticalStrut = Box.createVerticalStrut(10);
		pnlTitle.add(verticalStrut);

		lblTitle = new JLabel("  Trust Region List");
		lblTitle.setForeground(new Color(107, 142, 35));
		lblTitle.setFont(new Font("SansSerif", Font.BOLD, 20));
		pnlTitle.add(lblTitle);

		verticalStrut_1 = Box.createVerticalStrut(10);
		pnlTitle.add(verticalStrut_1);

		scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		model = new DefaultTableModel(column, 0);
		table = new JTable(model) {

			private static final long serialVersionUID = 5377371199505474349L;

			public boolean isCellEditable(int row, int column) {
				return false;
			};
		};
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);

		pnlFooter = new JPanel();
		getContentPane().add(pnlFooter, BorderLayout.SOUTH);
		pnlFooter.setLayout(new BoxLayout(pnlFooter, BoxLayout.Y_AXIS));

		verticalStrut_2 = Box.createVerticalStrut(10);
		pnlFooter.add(verticalStrut_2);

		pnlPage = new JPanel();
		pnlPage.setAlignmentX(Component.RIGHT_ALIGNMENT);
		pnlPage.setBorder(new LineBorder(new Color(153, 153, 153), 1, true));
		pnlFooter.add(pnlPage);
		pnlPage.setLayout(new BoxLayout(pnlPage, BoxLayout.X_AXIS));

		lblFirst = new JLabel("");
		lblFirst.setIcon(new ImageIcon(this.getClass().getResource("../../../../first-icon.png")));
		lblListener(lblFirst);
		pnlPage.add(lblFirst);

		horizontalStrut_37 = Box.createHorizontalStrut(20);
		pnlPage.add(horizontalStrut_37);

		lblBack = new JLabel("");
		lblBack.setIcon(new ImageIcon(this.getClass().getResource("../../../../back-icon.png")));
		lblListener(lblBack);
		pnlPage.add(lblBack);

		horizontalStrut_39 = Box.createHorizontalStrut(20);
		pnlPage.add(horizontalStrut_39);

		lblPage = new JLabel("Page 0 of 0");
		pnlPage.add(lblPage);

		horizontalStrut_40 = Box.createHorizontalStrut(20);
		pnlPage.add(horizontalStrut_40);

		lblNext = new JLabel("");
		lblNext.setIcon(new ImageIcon(this.getClass().getResource("../../../../next-icon.png")));
		lblListener(lblNext);
		pnlPage.add(lblNext);

		horizontalStrut_38 = Box.createHorizontalStrut(20);
		pnlPage.add(horizontalStrut_38);

		lblLast = new JLabel("");
		lblLast.setIcon(new ImageIcon(this.getClass().getResource("../../../../last-icon.png")));
		lblListener(lblLast);
		pnlPage.add(lblLast);

		verticalStrut_3 = Box.createVerticalStrut(10);
		pnlFooter.add(verticalStrut_3);
	}

	private void mouseHoverIn(JLabel label) {
		label.setForeground(Color.RED);
		label.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}

	private void mouseHoverOut(JLabel label) {
		label.setForeground(new Color(0, 51, 153));
		label.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
	}

	private void lblListener(JLabel label) {
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				mouseHoverIn(label);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				mouseHoverOut(label);
			}
		});
		label.setFont(new Font("SansSerif", Font.BOLD, 15));
		label.setForeground(new Color(0, 51, 153));
	}
	
	private void loadToTable() {
		try {
			model.setRowCount(0);
			for (TrustRegionModel i : list) {
				model.addRow(new Object[] { i.getName(), i.getDescription(), i.getCountryId(), "", });
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
