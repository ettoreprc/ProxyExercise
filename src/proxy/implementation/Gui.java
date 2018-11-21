package proxy.implementation;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Gui extends JFrame {

	public Gui() {
		initFrame();
		//lista di immagini
	}

	private void initFrame() {
		this.setTitle("ImageProxyViewer");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(800, 600));
		this.setVisible(true);
		this.pack();
		this.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		Gui gui = new Gui();
	}
}
