import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Crud {

	private JFrame frame;
	private JTable table;
	private JTextField User;
	private JTextField Eml;
	private JPasswordField pt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Crud window = new Crud();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Crud() {
		initialize();
		connect();
	}

	Connection cn = null;

	public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			try {
				cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/gui", "root", "");

			} catch (SQLException e) {

				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 34, 180, 184);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel Label1 = new JLabel("UserName");
		Label1.setBounds(10, 32, 49, 14);
		panel.add(Label1);

		JLabel Label2 = new JLabel("Email");
		Label2.setBounds(10, 57, 46, 14);
		panel.add(Label2);

		JLabel Label3 = new JLabel("Pass");
		Label3.setBounds(10, 82, 46, 14);
		panel.add(Label3);

		User = new JTextField();
		User.setBounds(69, 32, 86, 14);
		panel.add(User);
		User.setColumns(10);

		Eml = new JTextField();
		Eml.setColumns(10);
		Eml.setBounds(69, 57, 86, 14);
		panel.add(Eml);

		pt = new JPasswordField();
		pt.setBounds(69, 57, 86, 14);
		panel.add(pt);
		pt.setColumns(10);

		JButton Button1 = new JButton("Submit");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String us = User.getText();
				String el = Eml.getText();
				String ps1 = pt.getText();
				try {
					PreparedStatement ps = cn.prepareStatement("insert into crud values(?,?,?,?)");

					ps.setInt(1, 0);
					ps.setString(2, us);
					ps.setString(3, el);
					ps.setString(4, ps1);

					int i = ps.executeUpdate();

					if (i > 0) {
						JOptionPane.showMessageDialog(frame, "Data inserted !!!");
						User.setText("");
						Eml.setText("");
						pt.setText("");
					}

				} catch (SQLException e1) {

					e1.printStackTrace();
				}
			}
		});
		Button1.setBounds(20, 107, 60, 23);
		panel.add(Button1);

		JButton Button2 = new JButton("Reset");
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User.setText("");
				Eml.setText("");
				pt.setText("");
			}
		});
		Button2.setBounds(90, 107, 60, 23);
		panel.add(Button2);

		JButton Button4 = new JButton("Delete");
		Button4.setBounds(90, 141, 60, 23);
		panel.add(Button4);

		JButton Button3 = new JButton("Update");
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String us = User.getText();
				String el = User.getText();
				String ps1 = User.getText();

				try {
					PreparedStatement pre = cn.prepareStatement("select * from crud");
				} catch (SQLException e1) {

					e1.printStackTrace();
				}

			}
		});
		Button3.setBounds(20, 141, 60, 23);
		panel.add(Button3);

		pt = new JPasswordField();
		pt.setBounds(69, 79, 86, 14);
		panel.add(pt);

		table = new JTable();
		table.setBounds(225, 34, 173, 184);
		frame.getContentPane().add(table);
	}
}
