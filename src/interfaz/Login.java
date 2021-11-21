package interfaz;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Login {

	protected Shell shell;
	private Text text;
	private Text txtContrasena;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Login window = new Login();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(499, 368);
		shell.setText("SWT Application");
		
		Label lblbienvenidoAAlquila = new Label(shell, SWT.BORDER | SWT.HORIZONTAL | SWT.CENTER);
		lblbienvenidoAAlquila.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblbienvenidoAAlquila.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_FOREGROUND));
		lblbienvenidoAAlquila.setFont(SWTResourceManager.getFont("Lato", 14, SWT.NORMAL));
		lblbienvenidoAAlquila.setBounds(10, 54, 249, 42);
		lblbienvenidoAAlquila.setText("¡Bienvenido a alquila tu\nauto UwU!");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(10, 140, 249, 30);
		
		txtContrasena = new Text(shell, SWT.BORDER | SWT.PASSWORD);
		txtContrasena.setToolTipText("");
		txtContrasena.setBounds(10, 194, 249, 30);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 243, 249, 30);
		btnNewButton.setText("Iniciar Sesión");
		
		Label lblUsuario = new Label(shell, SWT.HORIZONTAL | SWT.CENTER);
		lblUsuario.setAlignment(SWT.LEFT);
		lblUsuario.setText("Usuario");
		lblUsuario.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblUsuario.setFont(SWTResourceManager.getFont("Lato", 10, SWT.NORMAL));
		lblUsuario.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_FOREGROUND));
		lblUsuario.setBounds(10, 121, 249, 49);
		
		Label lblContrasea = new Label(shell, SWT.HORIZONTAL | SWT.CENTER);
		lblContrasea.setText("Contraseña");
		lblContrasea.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblContrasea.setFont(SWTResourceManager.getFont("Lato", 10, SWT.NORMAL));
		lblContrasea.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_FOREGROUND));
		lblContrasea.setAlignment(SWT.LEFT);
		lblContrasea.setBounds(10, 174, 249, 50);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setImage(SWTResourceManager.getImage(Login.class, "/img/sinFondo.png"));
		lblNewLabel.setBounds(86, -119, 985, 617);

	}
}
