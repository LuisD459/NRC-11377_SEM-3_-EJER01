package Ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblSegundoNmero;
	private JLabel lblTercerNmero;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JButton btnNewButton;
	private JButton btnEnteros;
	private JButton btnReales;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("PRIMER NÚMERO");
			lblNewLabel.setBounds(36, 26, 93, 20);
			contentPane.add(lblNewLabel);
		}
		{
			lblSegundoNmero = new JLabel("SEGUNDO NÚMERO");
			lblSegundoNmero.setBounds(36, 57, 106, 20);
			contentPane.add(lblSegundoNmero);
		}
		{
			lblTercerNmero = new JLabel("TERCER NÚMERO");
			lblTercerNmero.setBounds(36, 85, 93, 20);
			contentPane.add(lblTercerNmero);
		}
		{
			txtN1 = new JTextField();
			txtN1.setBounds(146, 26, 86, 20);
			contentPane.add(txtN1);
			txtN1.setColumns(10);
		}
		{
			txtN2 = new JTextField();
			txtN2.setColumns(10);
			txtN2.setBounds(146, 57, 86, 20);
			contentPane.add(txtN2);
		}
		{
			txtN3 = new JTextField();
			txtN3.setColumns(10);
			txtN3.setBounds(146, 85, 86, 20);
			contentPane.add(txtN3);
		}
		{
			btnNewButton = new JButton("2 ENTEROS");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(143, 116, 116, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnEnteros = new JButton("3 ENTEROS");
			btnEnteros.addActionListener(this);
			btnEnteros.setBounds(143, 150, 116, 23);
			contentPane.add(btnEnteros);
		}
		{
			btnReales = new JButton("2 REALES");
			btnReales.addActionListener(this);
			btnReales.setBounds(143, 181, 116, 23);
			contentPane.add(btnReales);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 226, 414, 120);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				txtS.setText("VERIFICANDO");
				scrollPane.setViewportView(txtS);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnReales) {
			do_btnReales_actionPerformed(e);
		}
		if (e.getSource() == btnEnteros) {
			do_btnEnteros_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		int n1=Integer.parseInt(txtN1.getText());
		int n2=Integer.parseInt(txtN2.getText());
		Calculadora c=new Calculadora (n1,n2);
		txtS.append("La Suma es: "+ c.Sumar(n1, n2));
	}
	protected void do_btnEnteros_actionPerformed(ActionEvent e) {
		int n1=Integer.parseInt(txtN1.getText());
		int n2=Integer.parseInt(txtN2.getText());
		int n3=Integer.parseInt(txtN3.getText());
		Calculadora C= new Calculadora (n1,n2);
		txtS.append("La Suma es: "+ C.Sumar(n1, n2,n3));
		
	}
	protected void do_btnReales_actionPerformed(ActionEvent e) {
		
	}
}
