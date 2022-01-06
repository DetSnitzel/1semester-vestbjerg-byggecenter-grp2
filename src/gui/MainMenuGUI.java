package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.OrderController;
import tui.TryMe;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenuGUI extends JFrame {
	private TryMee tryMee;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuGUI frame = new MainMenuGUI();
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
	public MainMenuGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);

		JButton btnTestData = new JButton("Generate Test Data");
		btnTestData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generateTestData();
			}
		});
		panel.add(btnTestData);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));

		JButton btnCustomerMenu = new JButton("Customer Menu");
		btnCustomerMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				customerMenu();
			}
		});
		panel_1.add(btnCustomerMenu);

		JButton btnProductMenu = new JButton("Product Menu");
		btnProductMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				productMenu();
			}
		});
		panel_1.add(btnProductMenu);

		JButton btnOrderMenu = new JButton("Order Menu");
		btnOrderMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderMenuClicked();
			}
		});
		panel_1.add(btnOrderMenu);

		JButton btnLeasingMenu = new JButton("Leasing Menu");
		btnLeasingMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				leasingMenu();
			}
		});
		panel_1.add(btnLeasingMenu);

	}

	private void generateTestData() {
		tryMee = new TryMee();
		String test = tryMee.generateTestData();
		JOptionPane.showMessageDialog(this, test);

	}

	private void leasingMenu() {
		JOptionPane.showMessageDialog(this, "Hasn't been implemented yet");
	}

	private void productMenu() {
		JOptionPane.showMessageDialog(this, "Hasn't been implemented yet");
	}

	protected void customerMenu() {
		JOptionPane.showMessageDialog(this, "Hasn't been implemented yet");

	}

	private void customerMenuClicked() {
		JOptionPane.showMessageDialog(this, "Hasn't been implemented yet");

	}

	private void orderMenuClicked() {

		OrderController ctrl = new OrderController();
		OrderMenu om = new OrderMenu(ctrl);
		om.setVisible(true);
		this.dispose();
//		refresh();

	}

}
