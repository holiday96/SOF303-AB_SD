package com.sof303.ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import com.sof303.util.MessageUtil;
import com.sof303.util.ValidateUtil;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginForm extends JDialog {

	private static final long serialVersionUID = 2713962910407674502L;

	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JLabel lblTitle;
	private JButton btnLogin;
	private JLabel lblForgotPass;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					new LoginForm();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LoginForm() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("../../../user-icon.png")));
		initialize();
	}

	private void initialize() {
		dispose();
		setUndecorated(false);
		setVisible(true);
		setBounds(100, 100, 198, 285);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Login");
		getContentPane().setLayout(null);

		lblTitle = new JLabel("");
		lblTitle.setIcon(new ImageIcon(this.getClass().getResource("../../../user-icon.png")));
		lblTitle.setFont(new Font("Segoe Print", Font.BOLD, 20));
		lblTitle.setBounds(53, 16, 88, 88);
		getContentPane().add(lblTitle);

		txtUsername = new JTextField();
		txtUsername.setBounds(23, 110, 140, 28);
		getContentPane().add(txtUsername);
		txtUsername.setColumns(10);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(23, 140, 140, 28);
		getContentPane().add(txtPassword);
		txtPassword.setColumns(10);

		btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		btnLogin.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnLogin.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnLogin.setHorizontalTextPosition(SwingConstants.CENTER);
		btnLogin.setBounds(65, 175, 63, 28);
		getContentPane().add(btnLogin);

		lblForgotPass = new JLabel("<HTML><U>Forgot Password</U></HTML>");
		lblForgotPass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblForgotPass.setForeground(Color.RED);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblForgotPass.setForeground(Color.BLUE);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				new ForgotPasswordForm();
			}
		});
		lblForgotPass.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblForgotPass.setForeground(Color.BLUE);
		lblForgotPass.setBounds(47, 200, 94, 32);
		lblForgotPass.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		getContentPane().add(lblForgotPass);

		txtUsername.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtUsername.setBackground(null);
				loginKeyPressed(e);
				exitKeyPressed(e);
			}
		});
		txtPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtPassword.setBackground(null);
				loginKeyPressed(e);
				exitKeyPressed(e);
			}
		});

	}

	protected void login() {
		if (ValidateUtil.checkLogin(txtUsername.getText(), String.valueOf(txtPassword.getPassword()))) {
			this.dispose();
			new MainFrame();
		} else {
			txtUsername.setBackground(Color.YELLOW);
			txtPassword.setBackground(Color.YELLOW);
			MessageUtil.showErrorMessage(this, "Username or Password do not match");
		}
	}

	protected void exitKeyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}
	}

	protected void loginKeyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			login();
		}
	}
}
