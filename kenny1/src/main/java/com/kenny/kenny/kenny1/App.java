package com.kenny.kenny.kenny1;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 * Hello world!
 *
 */
public class App {
	JFrame f;

	public static void main(String argv[]) {
		System.out.println("Hello World");
		new App();
	}

	public App() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		f = new JFrame("JButton1");
		f.setBounds(0, 0, 400, 300);
		f.setVisible(true);
		Container cp = f.getContentPane();
		JButton b1 = new JButton("確定");
		cp.add(b1);
		f.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(f, "確定要結束程式嗎?",
						"確認訊息", JOptionPane.YES_NO_OPTION,
						JOptionPane.WARNING_MESSAGE);
				if (result == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
	}
}
