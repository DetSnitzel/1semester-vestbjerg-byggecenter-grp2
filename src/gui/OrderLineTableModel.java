package gui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import model.OrderLine;

public class OrderLineTableModel extends DefaultTableModel {

	private static final String[] COLUMN_NAMES = { "Product name", "Quantity", "Subtotal" };
	private List<OrderLine> elements;

	public OrderLineTableModel() {
		elements = new ArrayList<>();
	}

	public void setModelData(List<OrderLine> data) {
		elements.clear();
		elements.addAll(data);
		super.fireTableDataChanged();
	}

	@Override
	public int getRowCount() {
		int res = 0;
		if (elements != null) {
			res = elements.size();
		}
		return res;
	}

	@Override
	public int getColumnCount() {
		return COLUMN_NAMES.length;
	}

	@Override
	public String getColumnName(int column) {
		return COLUMN_NAMES[column];
	}

	@Override
	public Object getValueAt(int row, int column) {
		OrderLine currOrderLine = elements.get(row);
		String res = "UNKNOWN";

		switch (column) {
		case 0:
			res = currOrderLine.getProduct().getName();
			break;

		case 1:
			res = "" + currOrderLine.getQuantity();
			break;

		case 2:
			res = "" + currOrderLine.getSubtotal();
			break;
		}
		return res;
	}
	
	@Override
	public boolean isCellEditable(int row, int column) {
		return false;
	}
	
	public OrderLine getElementAtIndex(int selectedRow) {
		return elements.get(selectedRow);
	}
}
