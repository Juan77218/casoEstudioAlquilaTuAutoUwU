package interfaz;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Color;

public class Devolucion extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Devolucion() {
		setBorder(new TitledBorder(null, "Devolucion", TitledBorder.CENTER, TitledBorder.TOP, null, Color.RED));
		setLayout(new GridLayout(4, 3, 1, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese los Km");
		add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Km Nuevos");
		add(chckbxNewCheckBox);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Accidente");
		add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		add(lblNewLabel_4);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Multa");
		add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_5 = new JLabel("");
		add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Agregar");
		add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("");
		add(lblNewLabel_6);

	}

}
