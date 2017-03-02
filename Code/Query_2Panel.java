/*
 * Author :- ROHIT KUMAR(2015078)
 * 			 ASHUTOSH KUMAR(2015018)
 */
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
public class Query_2Panel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	public Query_2Panel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel publicationsLabel = new JLabel("K Publications");///Label for publication
		GridBagConstraints gbc_publicationsLabel = new GridBagConstraints();
		gbc_publicationsLabel.insets = new Insets(0, 0, 5, 5);
		gbc_publicationsLabel.gridx = 1;
		gbc_publicationsLabel.gridy = 4;
		add(publicationsLabel, gbc_publicationsLabel);
		
		textField = new JTextField();///Text field for storing number of publication
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 4;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");/// Search button to perform searching based on data entered by user 
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tester test = new tester();
				//MainFrame display = new MainFrame();
					ArrayList<dblp> users = test.getdata();
				//MainFrame.table
			}
		});
		GridBagConstraints gbc_btnSearch = new GridBagConstraints();
		gbc_btnSearch.insets = new Insets(0, 0, 0, 5);
		gbc_btnSearch.gridx = 1;
		gbc_btnSearch.gridy = 6;
		add(btnSearch, gbc_btnSearch);
		
		JButton resetButton = new JButton("Reset");// Reset button to reset all the entries
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		GridBagConstraints gbc_btnReset = new GridBagConstraints();
		gbc_btnReset.insets = new Insets(0, 0, 0, 5);
		gbc_btnReset.gridx = 2;
		gbc_btnReset.gridy = 6;
		add(resetButton, gbc_btnReset);
	}
}
