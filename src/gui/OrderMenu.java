package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.OrderController;
import model.OrderLine;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class OrderMenu extends JDialog {
	private OrderController ctrl;
	private JTextField txtProductByBarcode;
	private JTextField txtCustomerByPhone;
	private JTextField txtProductBarcode;
	private JTextField txtQuantity;
	private JTable tblOrderLines;
	private OrderLineTableModel oltm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			OrderMenu dialog = new OrderMenu();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */

	public OrderMenu(OrderController ctrl) {
		this();
		init(ctrl);
	}

	public OrderMenu() {
		BorderLayout borderLayout = (BorderLayout) getContentPane().getLayout();
		setBounds(100, 100, 450, 300);

		JPanel contentPane = (JPanel) getContentPane();
		contentPane.setBorder(new EmptyBorder(10,10,10,10));
		
		
		
		JPanel panelButtons = new JPanel();
		getContentPane().add(panelButtons, BorderLayout.SOUTH);

		JButton btnCancel = new JButton("Cancel");
		panelButtons.add(btnCancel);

		JButton btnCreateOrder = new JButton("Create order");
		panelButtons.add(btnCreateOrder);

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 209, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel lblSearchCustomerByPhone = new JLabel("Add customer by phone:");
		GridBagConstraints gbc_lblSearchCustomerByPhone = new GridBagConstraints();
		gbc_lblSearchCustomerByPhone.insets = new Insets(0, 0, 5, 5);
		gbc_lblSearchCustomerByPhone.anchor = GridBagConstraints.EAST;
		gbc_lblSearchCustomerByPhone.gridx = 0;
		gbc_lblSearchCustomerByPhone.gridy = 0;
		panel.add(lblSearchCustomerByPhone, gbc_lblSearchCustomerByPhone);

		txtCustomerByPhone = new JTextField();
		GridBagConstraints gbc_txtCustomerByPhone = new GridBagConstraints();
		gbc_txtCustomerByPhone.gridwidth = 3;
		gbc_txtCustomerByPhone.insets = new Insets(0, 0, 5, 5);
		gbc_txtCustomerByPhone.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCustomerByPhone.gridx = 1;
		gbc_txtCustomerByPhone.gridy = 0;
		panel.add(txtCustomerByPhone, gbc_txtCustomerByPhone);
		txtCustomerByPhone.setColumns(10);

		JButton btnAddCustomer = new JButton("Add");
		GridBagConstraints gbc_btnAddCustomer = new GridBagConstraints();
		gbc_btnAddCustomer.insets = new Insets(0, 0, 5, 0);
		gbc_btnAddCustomer.gridx = 4;
		gbc_btnAddCustomer.gridy = 0;
		panel.add(btnAddCustomer, gbc_btnAddCustomer);

		JLabel lblSearchProductByBarcode = new JLabel("Add product by barcode:");
		GridBagConstraints gbc_lblSearchProductByBarcode = new GridBagConstraints();
		gbc_lblSearchProductByBarcode.anchor = GridBagConstraints.EAST;
		gbc_lblSearchProductByBarcode.insets = new Insets(0, 0, 5, 5);
		gbc_lblSearchProductByBarcode.gridx = 0;
		gbc_lblSearchProductByBarcode.gridy = 1;
		panel.add(lblSearchProductByBarcode, gbc_lblSearchProductByBarcode);

		txtProductBarcode = new JTextField();
		GridBagConstraints gbc_txtProductBarcode = new GridBagConstraints();
		gbc_txtProductBarcode.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtProductBarcode.insets = new Insets(0, 0, 5, 5);
		gbc_txtProductBarcode.gridx = 1;
		gbc_txtProductBarcode.gridy = 1;
		panel.add(txtProductBarcode, gbc_txtProductBarcode);
		txtProductBarcode.setColumns(10);

		JLabel lblNewLabel = new JLabel("Qty:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		panel.add(lblNewLabel, gbc_lblNewLabel);

		txtQuantity = new JTextField();
		GridBagConstraints gbc_txtQuantity = new GridBagConstraints();
		gbc_txtQuantity.insets = new Insets(0, 0, 5, 5);
		gbc_txtQuantity.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtQuantity.gridx = 3;
		gbc_txtQuantity.gridy = 1;
		panel.add(txtQuantity, gbc_txtQuantity);
		txtQuantity.setColumns(10);

		JButton btnAddProduct = new JButton("Add");
		btnAddProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addProductClicked();

			}

		});
		GridBagConstraints gbc_btnAddProduct = new GridBagConstraints();
		gbc_btnAddProduct.insets = new Insets(0, 0, 5, 0);
		gbc_btnAddProduct.gridx = 4;
		gbc_btnAddProduct.gridy = 1;
		panel.add(btnAddProduct, gbc_btnAddProduct);

		JLabel lblLines = new JLabel("Lines:");
		GridBagConstraints gbc_lblLines = new GridBagConstraints();
		gbc_lblLines.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblLines.insets = new Insets(0, 0, 0, 5);
		gbc_lblLines.gridx = 0;
		gbc_lblLines.gridy = 2;
		panel.add(lblLines, gbc_lblLines);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		panel.add(scrollPane, gbc_scrollPane);

		tblOrderLines = new JTable();
		scrollPane.setViewportView(tblOrderLines);

		{
		}
	}

	private void init(OrderController ctrl) {
		this.ctrl = ctrl;
		ctrl.createOrder();
		oltm = new OrderLineTableModel();
		tblOrderLines.setModel(oltm);
		
		refresh();
	}

	private void refresh() {
		List<OrderLine> data = ctrl.getOrder().getOrderLines();
		oltm.setModelData(data);
	}

	private void addProductClicked() {
		String barcode = txtProductBarcode.getText();
		if (ctrl.findProductByBarcode(barcode) != null) {
			try {
				int quantity = Integer.parseInt(txtQuantity.getText());
				ctrl.addProduct(barcode, quantity);
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(this, "You must enter a number");
			}

		} else {
			JOptionPane.showMessageDialog(this, "This product does not exist");
		}
		refresh();

	}
}
