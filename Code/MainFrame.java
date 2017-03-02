/*
 * Author :- ROHIT KUMAR(2015078)
 * 			 ASHUTOSH KUMAR(2015018)
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane; /// Content pane
	private JTextField textField; /// text field
	public static JTable table; /// table
	public static DefaultTableModel model; /// default table model
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {	/// Overriding run() method
				try {
					MainFrame frame = new MainFrame(); ///creating frame object 
					frame.setVisible(true); /// setting frame visibile 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainFrame() throws FileNotFoundException {
		tester test = new tester();
		test.database(); /// calling database method to test class to parse .xml file
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel DblpQueryEngine = new JLabel("DBLP Query Engine"); /// setting labels
		DblpQueryEngine.setFont(new Font("Georgia", Font.BOLD, 24));
		DblpQueryEngine.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(DblpQueryEngine, BorderLayout.NORTH);
		
		JSplitPane splitPane = new JSplitPane(); /// creating split panels
		splitPane.setContinuousLayout(true);
		splitPane.setOneTouchExpandable(true);
		splitPane.setResizeWeight(1.0);
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		JPanel leftPanel = new JPanel(); /// creating left panel of split panel
		splitPane.setLeftComponent(leftPanel);
		
		Query_0Panel query_0Panel = new Query_0Panel(); /// calling query0 but keeping visible off
		query_0Panel.setVisible(false);
		
		Query_1Panel query_1Panel = new Query_1Panel();/// calling query1 but keeping visible off
		query_1Panel.setVisible(false);
		
		Query_2Panel query_2Panel = new Query_2Panel();/// calling query2 but keeping visible off
		query_2Panel.setVisible(false);
		
		Query_3Panel query_3Panel = new Query_3Panel();/// calling query3 but keeping visible off
		query_3Panel.setVisible(false);
		
		String[] queryList = {"Query", "Query1", "Query2", "Query3"};
		leftPanel.setLayout(new BorderLayout(0, 0));
		
		JComboBox<String> queryComboBox = new JComboBox<String>(queryList); /// combo box of type String to choose between queries
		leftPanel.add(queryComboBox, BorderLayout.NORTH);
		queryComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int queryOption = queryComboBox.getSelectedIndex();
				switch(queryOption){
				case 0:
					query_1Panel.setVisible(false);
					query_2Panel.setVisible(false);
					query_3Panel.setVisible(false);
					query_0Panel.setVisible(true);
					leftPanel.add(query_0Panel, BorderLayout.CENTER); ///Adding query0 panel to left panel
					break;
				case 1:
					query_1Panel.setVisible(true);
					query_0Panel.setVisible(false);
					query_2Panel.setVisible(false);
					query_3Panel.setVisible(false);
					leftPanel.add(query_1Panel, BorderLayout.CENTER);///Adding query1 panel to left panel
					break;
				case 2:
					query_2Panel.setVisible(true);
					query_1Panel.setVisible(false);
					query_3Panel.setVisible(false);
					query_0Panel.setVisible(false);
					leftPanel.add(query_2Panel, BorderLayout.CENTER);///Adding query2 panel to left panel
					break;
				case 3:
					query_3Panel.setVisible(true);
					query_2Panel.setVisible(false);
					query_1Panel.setVisible(false);
					query_0Panel.setVisible(false);
					leftPanel.add(query_3Panel, BorderLayout.CENTER);///Adding query3 panel to left panel
					break;
				}
			}
		});
		queryComboBox.setSelectedIndex(0);
		queryComboBox.setMaximumRowCount(4);
		JPanel rightPanel = new JPanel(); /// creating right panel of split panel
		splitPane.setRightComponent(rightPanel);
		rightPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel resultCountPanel = new JPanel(); // result count panel
		resultCountPanel.setBorder(null);
		GridBagLayout gbl_resultCountPanel = new GridBagLayout();
		gbl_resultCountPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_resultCountPanel.rowHeights = new int[]{0, 0};
		gbl_resultCountPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_resultCountPanel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		resultCountPanel.setLayout(gbl_resultCountPanel);
		
		JLabel countLabel = new JLabel("Count");
		GridBagConstraints gbc_countLabel = new GridBagConstraints();
		gbc_countLabel.insets = new Insets(0, 0, 0, 5);
		gbc_countLabel.gridx = 1;
		gbc_countLabel.gridy = 0;
		resultCountPanel.add(countLabel, gbc_countLabel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 0;
		resultCountPanel.add(textField, gbc_textField);
		textField.setColumns(10);
		rightPanel.add(resultCountPanel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		rightPanel.add(panel, BorderLayout.SOUTH);
		
		JButton btnNext = new JButton("Next");
		panel.add(btnNext);
		model = new DefaultTableModel();
		/**
		 * Adding columns to table
		 **/
		model.addColumn("SNo");
		model.addColumn("Authors");
		model.addColumn("Title");
		model.addColumn("pages");
		model.addColumn("Year");
		model.addColumn("Volume");
		model.addColumn("Journals/BookTitles");
		model.addColumn("url");
		/**
		 * Adding rows to table
		 **/
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		model.addRow(new Object[]{" "," "," "," "," "," "," "," "});
		table = new JTable(model); /// creating table
		rightPanel.add(table, BorderLayout.CENTER); /// adding table to right panel
		///String[] columns = {"ee", "url", "Number", "Journal", "Volume", "Year", "Pages", "Title", "Author"};
		
		
	}
}
