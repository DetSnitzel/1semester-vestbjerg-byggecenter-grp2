package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.OrderController;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderMenu extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private OrderController ctrl;

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
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(0, 2, 0, 0));
		{
			JButton btnCreateOrder = new JButton("Create order");
			btnCreateOrder.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					createOrderClicked();
				}
			});
			contentPanel.add(btnCreateOrder);
			
		}
		{
			JButton btnFindOrder = new JButton("Find order");
			contentPanel.add(btnFindOrder);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnBack = new JButton("Back");
				buttonPane.add(btnBack);
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

	private void createOrderClicked() {
		ctrl.createOrder();
		CustomerGUI cg = new CustomerGUI(ctrl);
		cg.setVisible(true);
	
	
	
	}


}
