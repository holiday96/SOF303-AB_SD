package com.sof303.ui.geography;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class TrustRegionListForm extends JInternalFrame{

	private static final long serialVersionUID = -5262718716606112827L;

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
	}

	private void initialize() {
		((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
		setVisible(true);
		setBounds(100, 100, 450, 300);
		
		JLabel lblNewLabel = new JLabel("Hahahaha");
		getContentPane().add(lblNewLabel, BorderLayout.CENTER);
	}

}
