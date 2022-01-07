package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CustomerController;
import controller.ProductController;
import model.Person;
import model.PrivateCustomer;
import model.Product;

import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.GridBagLayout;
import java.util.List;
import java.awt.GridBagConstraints;

public class TestData extends JFrame {

	private TryMee tryMe;
	private JPanel contentPane;
	private JList<String> list;
	private JList<String> customerList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	//	new TryMee().generateTestData();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestData frame = new TestData();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 13;
		gbc_scrollPane.gridheight = 5;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		panel.add(scrollPane, gbc_scrollPane);

		list = new JList<>();
		scrollPane.setViewportView(list);
		generateTestData();
		
	}
		
		
		private void generateTestData() {
			tryMe = new TryMee();
			String test = tryMe.generateTestData();
			ProductController pCtrl = new ProductController();
			List<Product> products = pCtrl.findAll();
			DefaultListModel<String> model = new DefaultListModel<>(); //TODO typeparamatisere product, lav renderer
			for(Product p : products) {
				model.addElement(p.getName() + " " + p.getBarcode());
			}
			CustomerController cCtrl = new CustomerController();
			List<Person> customers = cCtrl.findAll();
			for(Person c : customers) {
				model.addElement(c.getName() + " " + c.getPhone());
			}
//			JOptionPane.showMessageDialog(this, test);	
			list.setModel(model);

	}
	
	

}
