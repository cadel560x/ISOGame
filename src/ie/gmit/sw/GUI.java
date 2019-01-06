package ie.gmit.sw;

public class GUI {

	public void startGUI() {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() { // Template method....
				try {
					new GameWindow(); // Could be done nicer?
				} catch (Exception e) {
					e.printStackTrace(); // Real lazy stuff here...
				}
			}
		});
	}
}
