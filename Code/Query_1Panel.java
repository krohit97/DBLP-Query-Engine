/*
 * Author :- ROHIT KUMAR(2015078)
 * 			 ASHUTOSH KUMAR(2015018)
 */
import javax.swing.JPanel;import java.awt.GridBagLayout;import javax.swing.JComboBox;import java.awt.GridBagConstraints;import java.awt.Insets;import javax.swing.JLabel;import javax.swing.JTextField;import javax.swing.JRadioButton;import javax.swing.JButton;import java.awt.event.ActionListener;import java.util.ArrayList;import java.awt.event.ActionEvent;
public class Query_1Panel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField nameTextField,sinceYeartextField,range1TextField,range2TextField,titleTextField; /// Text fields
	boolean authorName = false,titleName = false,sinceYear = false,rangeYear = false; /// boolean values to keep track of which option is choosen 
	public Query_1Panel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		JLabel nameTags = new JLabel("AuthorName"); /// label for author name
		GridBagConstraints gbc_nameTags = new GridBagConstraints();
		gbc_nameTags.insets = new Insets(0, 0, 5, 5);
		gbc_nameTags.gridx = 1;
		gbc_nameTags.gridy = 3;
		add(nameTags, gbc_nameTags);
		nameTextField = new JTextField();/// text field for author name
		GridBagConstraints gbc_nameTextField = new GridBagConstraints();
		gbc_nameTextField.insets = new Insets(0, 0, 5, 5);
		gbc_nameTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_nameTextField.gridx = 3;
		gbc_nameTextField.gridy = 3;
		add(nameTextField, gbc_nameTextField);
		nameTextField.setColumns(10);
		JLabel titleTag = new JLabel("Title Tag");/// label for title
		GridBagConstraints gbc_titleTag = new GridBagConstraints();
		gbc_titleTag.insets = new Insets(0, 0, 5, 5);
		gbc_titleTag.gridx = 1;
		gbc_titleTag.gridy = 4;
		add(titleTag, gbc_titleTag);
		titleTextField = new JTextField();/// title text field for title
		GridBagConstraints gbc_titleTextField = new GridBagConstraints();
		gbc_titleTextField.insets = new Insets(0, 0, 5, 5);
		gbc_titleTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_titleTextField.gridx = 3;
		gbc_titleTextField.gridy = 4;
		add(titleTextField, gbc_titleTextField);
		titleTextField.setColumns(10);
		titleTextField.setVisible(false);
		titleTag.setVisible(false);
		nameTextField.setVisible(false);
		nameTags.setVisible(false);
		String[] searchByList = {"Search By", "Author name", "Title Tag"};
		JComboBox<String> searchByComboBox = new JComboBox<String>(searchByList);/// combo box to choose between Author name or title
		searchByComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int searchOption = searchByComboBox.getSelectedIndex();
				switch(searchOption){
				case 0:
					titleTextField.setVisible(false);
					titleTag.setVisible(false);
					nameTextField.setVisible(false);
					nameTags.setVisible(false);
					authorName = false;
					titleName = false;
					break;
				case 1:
					titleTextField.setVisible(false);
					titleTag.setVisible(false);
					nameTextField.setVisible(true);
					nameTags.setVisible(true);
					authorName = true;
					titleName = false;
					break;
				case 2:
					titleTextField.setVisible(true);
					titleTag.setVisible(true);
					nameTextField.setVisible(false);
					nameTags.setVisible(false);
					authorName = false;
					titleName = true;
					break;
				}
			}
		});
		searchByComboBox.setSelectedIndex(0);
		searchByComboBox.setMaximumRowCount(3);
		GridBagConstraints gbc_searchByComboBox = new GridBagConstraints();
		gbc_searchByComboBox.insets = new Insets(0, 0, 5, 5);
		gbc_searchByComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_searchByComboBox.gridx = 1;
		gbc_searchByComboBox.gridy = 1;
		add(searchByComboBox, gbc_searchByComboBox);
		JLabel sinceYearLabelTag = new JLabel("Since Year");
		GridBagConstraints gbc_sinceYearLabelTag = new GridBagConstraints();
		gbc_sinceYearLabelTag.insets = new Insets(0, 0, 5, 5);
		gbc_sinceYearLabelTag.gridx = 1;
		gbc_sinceYearLabelTag.gridy = 6;
		add(sinceYearLabelTag, gbc_sinceYearLabelTag);
		sinceYearLabelTag.setVisible(false);
		sinceYeartextField = new JTextField();
		GridBagConstraints gbc_sinceYeartextField = new GridBagConstraints();
		gbc_sinceYeartextField.insets = new Insets(0, 0, 5, 5);
		gbc_sinceYeartextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_sinceYeartextField.gridx = 3;
		gbc_sinceYeartextField.gridy = 6;
		add(sinceYeartextField, gbc_sinceYeartextField);
		sinceYeartextField.setColumns(10);
		sinceYeartextField.setVisible(false);
		JLabel rangeLabelTag = new JLabel("Range");
		GridBagConstraints gbc_rangeLabelTag = new GridBagConstraints();
		gbc_rangeLabelTag.insets = new Insets(0, 0, 5, 5);
		gbc_rangeLabelTag.gridx = 1;
		gbc_rangeLabelTag.gridy = 7;
		add(rangeLabelTag, gbc_rangeLabelTag);
		rangeLabelTag.setVisible(false);
		range1TextField = new JTextField();
		GridBagConstraints gbc_range1TextField = new GridBagConstraints();
		gbc_range1TextField.insets = new Insets(0, 0, 5, 5);
		gbc_range1TextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_range1TextField.gridx = 3;
		gbc_range1TextField.gridy = 7;
		add(range1TextField, gbc_range1TextField);
		range1TextField.setColumns(10);
		range1TextField.setVisible(false);
		range2TextField = new JTextField();
		GridBagConstraints gbc_range2TextField = new GridBagConstraints();
		gbc_range2TextField.insets = new Insets(0, 0, 5, 5);
		gbc_range2TextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_range2TextField.gridx = 4;
		gbc_range2TextField.gridy = 7;
		add(range2TextField, gbc_range2TextField);
		range2TextField.setColumns(10);
		range2TextField.setVisible(false);
		sinceYearLabelTag.setVisible(false);
		sinceYeartextField.setVisible(false);
		rangeLabelTag.setVisible(false);
		range1TextField.setVisible(false);
		range2TextField.setVisible(false);
		String[] yearList = {"Year", "Since", "Range"};
		JComboBox<String> yearComboBox = new JComboBox<String>(yearList);/// combo box to choose between since year or rage of year 
		yearComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int yearOption = yearComboBox.getSelectedIndex();
				switch(yearOption){
				case 0:
					sinceYearLabelTag.setVisible(false);
					sinceYeartextField.setVisible(false);
					rangeLabelTag.setVisible(false);
					range1TextField.setVisible(false);
					range2TextField.setVisible(false);
					sinceYear = false;
					rangeYear = false;
					break;
				case 1:
					sinceYearLabelTag.setVisible(true);
					sinceYeartextField.setVisible(true);
					rangeLabelTag.setVisible(false);
					range1TextField.setVisible(false);
					range2TextField.setVisible(false);
					sinceYear = true;
					rangeYear = false;
					break;
				case 2:
					sinceYearLabelTag.setVisible(false);
					sinceYeartextField.setVisible(false);
					rangeLabelTag.setVisible(true);
					range1TextField.setVisible(true);
					range2TextField.setVisible(true);
					sinceYear = false;
					rangeYear = true;
					break;
				}
			}
		});
		yearComboBox.setSelectedIndex(0);
		yearComboBox.setMaximumRowCount(3);
		GridBagConstraints gbc_yearComboBox = new GridBagConstraints();
		gbc_yearComboBox.insets = new Insets(0, 0, 5, 5);
		gbc_yearComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_yearComboBox.gridx = 1;
		gbc_yearComboBox.gridy = 5;
		add(yearComboBox, gbc_yearComboBox);
		JRadioButton rdbuttonSortByYear = new JRadioButton("Sort By Year");/// radio button for sort by year
		GridBagConstraints gbc_rdbuttonSortByYear = new GridBagConstraints();
		gbc_rdbuttonSortByYear.insets = new Insets(0, 0, 5, 5);
		gbc_rdbuttonSortByYear.gridx = 1;
		gbc_rdbuttonSortByYear.gridy = 8;
		add(rdbuttonSortByYear, gbc_rdbuttonSortByYear);
		JRadioButton rdbuttonSortByRelevance = new JRadioButton("Sort By Relevance");/// radio button for sort by relevance
		GridBagConstraints gbc_rdbuttonSortByRelevance = new GridBagConstraints();
		gbc_rdbuttonSortByRelevance.insets = new Insets(0, 0, 5, 5);
		gbc_rdbuttonSortByRelevance.gridx = 1;
		gbc_rdbuttonSortByRelevance.gridy = 9;
		add(rdbuttonSortByRelevance, gbc_rdbuttonSortByRelevance);
		JButton searchButton = new JButton("Search");/// button to search for data according to entry by the user
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tester test = new tester();
				ArrayList<dblp> users=null;
				users = test.getdata();
				String authorname;
				String titlename;
				String pages;
				int year;
				String volume;
				String journal;
				for(dblp a:users){
					if(authorName == true){
						for(String s : a.author){
							if(s.equals(nameTextField)){
								authorname = s;
								titlename = a.getTitle();
								pages = a.getPages();
								year = a.getYear();
								volume = a.getVolume();
								journal = a.getJournal();
								MainFrame.model.addRow(new Object[]{authorname, titlename, pages, year, volume, journal});
							}
						}
					}
					else if(titleName == true){
						if(a.getTitle().equals(titleTextField)){
							authorname = a.author.get(0);
							titlename = a.getTitle();
							pages = a.getPages();
							year = a.getYear();
							volume = a.getVolume();
							journal = a.getJournal();
							MainFrame.model.addRow(new Object[]{authorname, titlename, pages, year, volume, journal});
						}
					}
				}
			}
		});
		GridBagConstraints gbc_searchButton = new GridBagConstraints();
		gbc_searchButton.insets = new Insets(0, 0, 0, 5);
		gbc_searchButton.gridx = 1;
		gbc_searchButton.gridy = 10;
		add(searchButton, gbc_searchButton);
		JButton resetButton = new JButton("Reset");/// Reset button to reset all the entries
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameTextField.setText("");
				titleTextField.setText("");
				sinceYeartextField.setText("");
				range1TextField.setText("");
				range2TextField.setText("");
				rdbuttonSortByRelevance.setSelected(false);
				rdbuttonSortByYear.setSelected(false);
			}
		});
		GridBagConstraints gbc_resetButton = new GridBagConstraints();
		gbc_resetButton.insets = new Insets(0, 0, 0, 5);
		gbc_resetButton.gridx = 3;
		gbc_resetButton.gridy = 10;
		add(resetButton, gbc_resetButton);
	}
}
