/*
 * Author :- ROHIT KUMAR(2015078)
 * 			 ASHUTOSH KUMAR(2015018)
 */
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JButton;
public class Query_3Panel extends JPanel {
	/**
	 * Declaring Text fields
	 **/
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	/**
	 * Declaring buttons
	 **/
	private JButton btnSearch;
	private JButton btnReset;
	public Query_3Panel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel yearLabel = new JLabel("Year");///Year label
		GridBagConstraints gbc_yearLabel = new GridBagConstraints();
		gbc_yearLabel.insets = new Insets(0, 0, 5, 5);
		gbc_yearLabel.gridx = 1;
		gbc_yearLabel.gridy = 1;
		add(yearLabel, gbc_yearLabel);
		
		textField = new JTextField();///Text field for year
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel authorLabel = new JLabel("Author1");/// Label for author1 name
		GridBagConstraints gbc_authorLabel = new GridBagConstraints();
		gbc_authorLabel.anchor = GridBagConstraints.EAST;
		gbc_authorLabel.insets = new Insets(0, 0, 5, 5);
		gbc_authorLabel.gridx = 1;
		gbc_authorLabel.gridy = 2;
		add(authorLabel, gbc_authorLabel);
		
		textField_1 = new JTextField();///Text field for author1
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 2;
		add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAuthor_1 = new JLabel("Author2");/// Label for author1 name
		GridBagConstraints gbc_lblAuthor_1 = new GridBagConstraints();
		gbc_lblAuthor_1.anchor = GridBagConstraints.EAST;
		gbc_lblAuthor_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAuthor_1.gridx = 1;
		gbc_lblAuthor_1.gridy = 3;
		add(lblAuthor_1, gbc_lblAuthor_1);
		
		textField_2 = new JTextField();///Text field for author2
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 3;
		add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAuthor_2 = new JLabel("Author3");/// Label for author1 name
		GridBagConstraints gbc_lblAuthor_2 = new GridBagConstraints();
		gbc_lblAuthor_2.anchor = GridBagConstraints.EAST;
		gbc_lblAuthor_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblAuthor_2.gridx = 1;
		gbc_lblAuthor_2.gridy = 4;
		add(lblAuthor_2, gbc_lblAuthor_2);
		
		textField_3 = new JTextField();///Text field for author3
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 4;
		add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAuthor_3 = new JLabel("Author4");/// Label for author1 name
		GridBagConstraints gbc_lblAuthor_3 = new GridBagConstraints();
		gbc_lblAuthor_3.anchor = GridBagConstraints.EAST;
		gbc_lblAuthor_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblAuthor_3.gridx = 1;
		gbc_lblAuthor_3.gridy = 5;
		add(lblAuthor_3, gbc_lblAuthor_3);
		
		textField_4 = new JTextField();///Text field for author4
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 5;
		add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblAuthor_4 = new JLabel("Author5");/// Label for author1 name
		GridBagConstraints gbc_lblAuthor_4 = new GridBagConstraints();
		gbc_lblAuthor_4.anchor = GridBagConstraints.EAST;
		gbc_lblAuthor_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblAuthor_4.gridx = 1;
		gbc_lblAuthor_4.gridy = 6;
		add(lblAuthor_4, gbc_lblAuthor_4);
		
		textField_5 = new JTextField();///Text field for author5
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 2;
		gbc_textField_5.gridy = 6;
		add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		btnSearch = new JButton("Search");///Search button for searching
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
		gbc_btnSearch.gridy = 8;
		add(btnSearch, gbc_btnSearch);
		
		btnReset = new JButton("Reset");///Reset button to reset all the entry
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
			}
		});
		GridBagConstraints gbc_btnReset = new GridBagConstraints();
		gbc_btnReset.insets = new Insets(0, 0, 0, 5);
		gbc_btnReset.gridx = 2;
		gbc_btnReset.gridy = 8;
		add(btnReset, gbc_btnReset);
	}
}
