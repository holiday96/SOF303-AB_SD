package com.sof303.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class MainFrame extends JFrame{

	private static final long serialVersionUID = 4007123955865212441L;
	
	private JLabel lblWallpaper;
	private JPanel pnlMenu;
	private JMenuBar menuBar;
	private JMenu mnOrganisation;
	private JMenu mnServices;
	private JMenuItem mntmProgrammeMaintenance;
	private JMenuItem mntmServiceMaintenance;
	private JMenu mnGeography;
	private JMenuItem mntmTrustRegions;
	private JMenuItem mntmTrustDistricts;
	private JMenuItem mntmGovernmentOfficeRegionList;
	private JMenuItem mntmGovernmentOfficeRegionView;
	private JMenu mnPremises;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					new MainFrame();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public MainFrame() {
		initialize();
	}

	private void initialize() {
		setTitle("AB_SD - Main Menu");
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("../../../main-icon.png")));
		setVisible(true);
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Set maximum window
		Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize();
		setMaximumSize(DimMax);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		lblWallpaper = new JLabel("");
		lblWallpaper.setIcon(new ImageIcon(this.getClass().getResource("../../../wallpaper.jpg")));
		getContentPane().add(lblWallpaper, BorderLayout.CENTER);
		
		pnlMenu = new JPanel();
		getContentPane().add(pnlMenu, BorderLayout.WEST);
		pnlMenu.setLayout(new BoxLayout(pnlMenu, BoxLayout.Y_AXIS));
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnOrganisation = new JMenu("Organisation");
		menuBar.add(mnOrganisation);
		
		mnServices = new JMenu("Services");
		menuBar.add(mnServices);
		
		mntmProgrammeMaintenance = new JMenuItem("Programme Maintenance");
		mnServices.add(mntmProgrammeMaintenance);
		
		mntmServiceMaintenance = new JMenuItem("Service Maintenance");
		mnServices.add(mntmServiceMaintenance);
		
		mnGeography = new JMenu("Geography");
		menuBar.add(mnGeography);
		
		mntmTrustRegions = new JMenuItem("Trust Regions Maintenance");
		mnGeography.add(mntmTrustRegions);
		
		mntmTrustDistricts = new JMenuItem("Trust Districts Maintenance");
		mnGeography.add(mntmTrustDistricts);
		
		mntmGovernmentOfficeRegionList = new JMenuItem("Government Office Region List");
		mnGeography.add(mntmGovernmentOfficeRegionList);
		
		mntmGovernmentOfficeRegionView = new JMenuItem("Government Office Region View");
		mnGeography.add(mntmGovernmentOfficeRegionView);
		
		mnPremises = new JMenu("Premises");
		menuBar.add(mnPremises);
	}

}
