package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.OrderController;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerGUI extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCustomerPhone;
	private OrderController ctrl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CustomerGUI dialog = new CustomerGUI();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	
	public CustomerGUI(OrderController ctrl) {
		this();
		init(ctrl);
	}
	
	

	public CustomerGUI() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[] { 0, 0, 0 };
			gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0 };
			gbl_panel.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
			gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
			panel.setLayout(gbl_panel);
			{
				JLabel lblAdvise = new JLabel("Insert customer phone number:");
				lblAdvise.setFont(new Font("Tahoma", Font.PLAIN, 20));
				GridBagConstraints gbc_lblAdvise = new GridBagConstraints();
				gbc_lblAdvise.gridwidth = 2;
				gbc_lblAdvise.insets = new Insets(0, 0, 5, 0);
				gbc_lblAdvise.gridx = 0;
				gbc_lblAdvise.gridy = 2;
				panel.add(lblAdvise, gbc_lblAdvise);
			}
			{
				JLabel lblPhone = new JLabel("Phone: ");
				lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 13));
				GridBagConstraints gbc_lblPhone = new GridBagConstraints();
				gbc_lblPhone.insets = new Insets(0, 0, 0, 5);
				gbc_lblPhone.anchor = GridBagConstraints.EAST;
				gbc_lblPhone.gridx = 0;
				gbc_lblPhone.gridy = 3;
				panel.add(lblPhone, gbc_lblPhone);
			}
			{
				txtCustomerPhone = new JTextField();
				GridBagConstraints gbc_txtCustomerPhone = new GridBagConstraints();
				gbc_txtCustomerPhone.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtCustomerPhone.gridx = 1;
				gbc_txtCustomerPhone.gridy = 3;
				panel.add(txtCustomerPhone, gbc_txtCustomerPhone);
				txtCustomerPhone.setColumns(10);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						okClicked();
					}

				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	private void init(OrderController ctrl) {
		this.ctrl = ctrl;
	}
	
	private void okClicked() {
		String phone = txtCustomerPhone.getText();
		ctrl.addCustomer(phone);
		
	}

}
