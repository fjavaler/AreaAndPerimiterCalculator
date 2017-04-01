package inClassDemo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class Main
{

	private JFrame frame;
	private JTextField txtWidth;
	private JTextField txtHeight;
	private JTextField txtArea;
	private JTextField txtPerimeter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Main window = new Main();
					window.frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main()
	{
		initialize();
		clearForm();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/javax/swing/plaf/basic/icons/JavaCup16.png")));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblWidth = new JLabel("Width:");
		lblWidth.setBounds(43, 61, 61, 16);
		frame.getContentPane().add(lblWidth);

		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setBounds(43, 94, 61, 16);
		frame.getContentPane().add(lblHeight);

		JLabel lblArea = new JLabel("Area:");
		lblArea.setBounds(43, 180, 61, 16);
		frame.getContentPane().add(lblArea);

		JLabel lblPerimeter = new JLabel("Perimeter: ");
		lblPerimeter.setBounds(43, 215, 67, 16);
		frame.getContentPane().add(lblPerimeter);

		txtWidth = new JTextField();
		txtWidth.setBounds(116, 56, 130, 26);
		frame.getContentPane().add(txtWidth);
		txtWidth.setColumns(10);

		txtHeight = new JTextField();
		txtHeight.setBounds(116, 89, 130, 26);
		frame.getContentPane().add(txtHeight);
		txtHeight.setColumns(10);

		txtArea = new JTextField();
		txtArea.setBounds(116, 175, 130, 26);
		frame.getContentPane().add(txtArea);
		txtArea.setColumns(10);

		txtPerimeter = new JTextField();
		txtPerimeter.setBounds(116, 210, 130, 26);
		frame.getContentPane().add(txtPerimeter);
		txtPerimeter.setColumns(10);

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int width = Integer.parseInt(txtWidth.getText());
				int height = Integer.parseInt(txtHeight.getText());
				int area = width * height;
				int perimeter = 2 * (width * height);
				txtArea.setText("" + area);
				txtPerimeter.setText("" + perimeter);
			}
		});
		btnCalculate.setBounds(38, 134, 117, 29);
		frame.getContentPane().add(btnCalculate);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				clearForm();
			}
		});
		btnClear.setBounds(149, 134, 117, 29);
		frame.getContentPane().add(btnClear);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Main.class.getResource("/Images/image.png")));
		lblLogo.setBounds(284, 80, 130, 135);
		frame.getContentPane().add(lblLogo);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 450, 22);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		mntmExit.setIcon(new ImageIcon(Main.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
		mnFile.add(mntmExit);
	}
	
	private void clearForm()
	{
		//clear all the text boxes
		txtArea.setText("");
		txtPerimeter.setText("");
		txtWidth.setText("");
		txtHeight.setText("");
	}
}
