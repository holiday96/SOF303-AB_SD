package com.sof303.util;

import java.awt.Component;

import javax.swing.JOptionPane;

public class MessageUtil {

	public static void showErrorMessage(Component component, String message) {
		JOptionPane.showMessageDialog(component, message, "Error", JOptionPane.ERROR_MESSAGE);
	}
	
	public static void showSuccessMessage(Component component, String message) {
		JOptionPane.showMessageDialog(component, message, "Success", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static int showConfirmMessage(Component component, String message) {
		return JOptionPane.showConfirmDialog(component, message, "Confirm?", JOptionPane.OK_CANCEL_OPTION);
	}
}
