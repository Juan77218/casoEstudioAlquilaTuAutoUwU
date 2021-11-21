package interfaz;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class TablaCarros extends JPanel {
	private JTable table;
	private String[] columnas = {"Marca", "Modelo", "Color", "Disponibilidad"};

	/**
	 * Create the panel.
	 */
	public TablaCarros() {
		setBorder(new TitledBorder(null, "Listas", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, Color.RED));
		
		table = new JTable();
	}

	public JTable getTable() {
		return table;
	}
}
