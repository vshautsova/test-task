package com.epam.rssc.alc;

import com.epam.rssc.alc.components.MainFrame;
import com.epam.rssc.alc.util.Constants;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainApp
{

	public MainApp()
	{
		JTextField textField = new JTextField();
		textField.setEditable(false);

		JPanel buttonPanel = new JPanel();
		JButton button = new JButton(Constants.BUTTON_TEXT);
		button.addActionListener(new ButtonClickListener(textField));
		buttonPanel.add(button);

		Dimension size = new Dimension(Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT);
		MainFrame mainFrame = new MainFrame(textField, buttonPanel, size, Constants.FRAME_TITLE);
	}

	private record ButtonClickListener(JTextField textField) implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			//		String userName = System.getProperty("user.name");
			String userName = "User";
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			String message = String.format("Hello from %s, %s", userName, now.format(formatter));

			textField.setText(message);
		}
	}

	public static void main(String[] args)
	{
		new MainApp();
	}
}
