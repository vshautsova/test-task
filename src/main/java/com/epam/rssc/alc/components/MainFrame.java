package com.epam.rssc.alc.components;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Dimension;


/**
 * Main frame of the application.
 */
public final class MainFrame extends JFrame
{
	private final JTextField textField;
	private final JPanel buttonPanel;

	public MainFrame(JTextField textField, JPanel buttonPanel, Dimension size, String title)
	{
		super(title);
		this.textField = textField;
		this.buttonPanel = buttonPanel;

		initFrame(size);
	}

	/**
	 * Initialize frame and its properties.
	 *
	 * @param size
	 */
	private void initFrame(Dimension size)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(size);

		add(textField, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);

		setLocationRelativeTo(null);
		setResizable(false);
		pack();
		setVisible(true);
	}

	public JTextField getTextField()
	{
		return textField;
	}

	public JPanel getButtonPanel()
	{
		return buttonPanel;
	}
}
