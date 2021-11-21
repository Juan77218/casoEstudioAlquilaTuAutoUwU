package interfaz;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ValorTotal extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public ValorTotal() {
		setBorder(new TitledBorder(null, "Valor Final", TitledBorder.CENTER, TitledBorder.TOP, null, Color.RED));
		setLayout(new GridLayout(1, 3, 1, 0));
		
		JLabel lblNewLabel_1 = new JLabel("");
		add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Su valor a pagar es");
		add(lblNewLabel);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		add(lblNewLabel_2);

	}

}
