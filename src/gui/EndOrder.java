package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.OrderController;
import model.CustomerContainer;
import model.OrderLine;
import model.Person;
import model.PrivateCustomer;

import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.List;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EndOrder extends JDialog {
	private JTextField txtID;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTable tableEndOrder;
	private JTextField txtTotal;
	private OrderController ctrl;
	private OrderLineTableModel oltm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EndOrder dialog = new EndOrder();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public EndOrder(OrderController ctrl) {
		this();
		init(ctrl);
	}

	/**
	 * Create the dialog.
	 */
	public EndOrder() {
		BorderLayout borderLayout = (BorderLayout) getContentPane().getLayout();
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		
		JPanel contentPane = (JPanel) getContentPane();
		contentPane.setBorder(new EmptyBorder(10,10,10,10));
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.CENTER);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JLabel lblNewLabel = new JLabel("ID: ");
				GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
				gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel.gridx = 0;
				gbc_lblNewLabel.gridy = 0;
				panel.add(lblNewLabel, gbc_lblNewLabel);
			}
			
			txtID = new JTextField();
			txtID.setEditable(false);
			GridBagConstraints gbc_txtID = new GridBagConstraints();
			gbc_txtID.insets = new Insets(0, 0, 5, 5);
			gbc_txtID.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtID.gridx = 1;
			gbc_txtID.gridy = 0;
			panel.add(txtID, gbc_txtID);
			txtID.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("Name: ");
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_1.gridx = 2;
			gbc_lblNewLabel_1.gridy = 0;
			panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
			
			txtName = new JTextField();
			txtName.setEditable(false);
			GridBagConstraints gbc_txtName = new GridBagConstraints();
			gbc_txtName.insets = new Insets(0, 0, 5, 5);
			gbc_txtName.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtName.gridx = 3;
			gbc_txtName.gridy = 0;
			panel.add(txtName, gbc_txtName);
			txtName.setColumns(10);
			
			JLabel lblNewLabel_2 = new JLabel("Phone: ");
			GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
			gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_2.gridx = 4;
			gbc_lblNewLabel_2.gridy = 0;
			panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
			
			txtPhone = new JTextField();
			txtPhone.setEditable(false);
			GridBagConstraints gbc_txtPhone = new GridBagConstraints();
			gbc_txtPhone.insets = new Insets(0, 0, 5, 0);
			gbc_txtPhone.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtPhone.gridx = 5;
			gbc_txtPhone.gridy = 0;
			panel.add(txtPhone, gbc_txtPhone);
			txtPhone.setColumns(10);
			
			JScrollPane scrollPane = new JScrollPane();
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.gridheight = 7;
			gbc_scrollPane.gridwidth = 5;
			gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 1;
			gbc_scrollPane.gridy = 1;
			panel.add(scrollPane, gbc_scrollPane);
			
			tableEndOrder = new JTable();
			scrollPane.setViewportView(tableEndOrder);
			
			JPanel panel_1 = new JPanel();
			GridBagConstraints gbc_panel_1 = new GridBagConstraints();
			gbc_panel_1.gridwidth = 6;
			gbc_panel_1.fill = GridBagConstraints.BOTH;
			gbc_panel_1.gridx = 0;
			gbc_panel_1.gridy = 8;
			panel.add(panel_1, gbc_panel_1);
			GridBagLayout gbl_panel_1 = new GridBagLayout();
			gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_panel_1.rowHeights = new int[]{0, 0};
			gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			panel_1.setLayout(gbl_panel_1);
			
			JLabel lblNewLabel_3 = new JLabel("Total: ");
			GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
			gbc_lblNewLabel_3.insets = new Insets(0, 0, 0, 5);
			gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_3.gridx = 10;
			gbc_lblNewLabel_3.gridy = 0;
			panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);
			
			txtTotal = new JTextField();
			txtTotal.setEditable(false);
			GridBagConstraints gbc_txtTotal = new GridBagConstraints();
			gbc_txtTotal.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtTotal.gridx = 11;
			gbc_txtTotal.gridy = 0;
			panel_1.add(txtTotal, gbc_txtTotal);
			txtTotal.setColumns(10);
		}
	}
	private void init(OrderController ctrl) {
		this.ctrl = ctrl;
		ctrl.endOrder();
		oltm = new OrderLineTableModel();
		tableEndOrder.setModel(oltm);
		
		refresh();
	}
	
	private void refresh() {
		List<OrderLine> data = ctrl.getOrder().getOrderLines();
		oltm.setModelData(data);
	}
	
	public void setCustomerDetails() {
		txtName.setText(ctrl.getOrder().getCustomer().getName());
		txtPhone.setText(ctrl.getOrder().getCustomer().getPhone());
		
		String total = Double.toString(ctrl.getOrder().getTotal());
        txtTotal.setText(total);
        
        Person currPerson = ctrl.getOrder().getCustomer();
        if(currPerson instanceof PrivateCustomer) {
        	PrivateCustomer currCustomer = (PrivateCustomer) currPerson;
        	txtID.setText(currCustomer.getCustomerID());
        }
        
	}	
}
