package com.sof303.ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import com.sof303.util.MessageUtil;
import com.sof303.util.ValidateUtil;

public class ForgotPasswordForm extends JDialog {

	private static final long serialVersionUID = -1391770040997702881L;
	private JTextField txtUsername;
	private JTextField txtEmail;
	private JButton btnConfirm;
	private JButton btnCancel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					new ForgotPasswordForm();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ForgotPasswordForm() {
		initialize();
	}

	private void initialize() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("../../../lock-icon.png")));
		setVisible(true);
		setBounds(100, 100, 264, 141);
		setTitle("Forgot Password");
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(10, 10, 59, 16);
		getContentPane().add(lblUsername);

		txtUsername = new JTextField();
		txtUsername.setBounds(80, 4, 151, 28);
		getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		txtUsername.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtUsername.setBackground(null);
				confirmKeyPressed(e);
				cancelKeyPressed(e);
			}
		});

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 38, 55, 16);
		getContentPane().add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setBounds(80, 32, 151, 28);
		getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		txtEmail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtEmail.setBackground(null);
				confirmKeyPressed(e);
				cancelKeyPressed(e);
			}
		});

		btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirm();
			}
		});
		btnConfirm.setBounds(159, 61, 72, 28);
		btnConfirm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnConfirm.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		getContentPane().add(btnConfirm);

		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		btnCancel.setBounds(80, 61, 67, 28);
		getContentPane().add(btnCancel);
	}

	private void confirm() {
		if (ValidateUtil.checkForgotPassword(txtUsername.getText(), txtEmail.getText())) {
			MessageUtil.showSuccessMessage(this, "Retrieve the Password success!\nYour Password was sent to your email!");
		} else {
			txtUsername.setBackground(Color.YELLOW);
			txtEmail.setBackground(Color.YELLOW);
			MessageUtil.showErrorMessage(this, "Username and Email do not match");
		}
	}

	protected void confirmKeyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			confirm();
		}
	}

	protected void cancelKeyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			dispose();
		}
	}
}
