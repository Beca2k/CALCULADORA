package com.rebeca.calculadora.ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class UiPrincipal {

	private JFrame frmCalculadora;
	private JTextField textResultado;
	private Double num1;
	private Double num2;
	private String tela = "";
	private String simbulos = "";

	/**
	 * Create the application.
	 */
	public UiPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora
				.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\dev\\Pictures\\IconeCalculadora.png"));
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.getContentPane().setBackground(new Color(219, 188, 231));
		frmCalculadora.setBounds(100, 100, 325, 424);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);

		textResultado = new JTextField();
		textResultado.setBackground(new Color(255, 255, 255));
		textResultado.setEditable(false);
		textResultado.setBounds(10, 29, 289, 41);
		frmCalculadora.getContentPane().add(textResultado);
		textResultado.setColumns(10);

		JButton btnSete = new JButton("7");
		btnSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela = tela + 7;
				updateTela(tela);
			}
		});
		btnSete.setBackground(new Color(173, 91, 255));
		btnSete.setBounds(10, 104, 59, 41);
		frmCalculadora.getContentPane().add(btnSete);

		JButton btnOito = new JButton("8");
		btnOito.setBackground(new Color(173, 91, 255));
		btnOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela = tela + 8;
				updateTela(tela);
			}
		});
		btnOito.setBounds(79, 104, 59, 41);
		frmCalculadora.getContentPane().add(btnOito);

		JButton btnNove = new JButton("9");
		btnNove.setBackground(new Color(173, 91, 255));
		btnNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela = tela + 9;
				updateTela(tela);
			}
		});
		btnNove.setBounds(148, 104, 59, 41);
		frmCalculadora.getContentPane().add(btnNove);

		JButton btnDivisao = new JButton("/");
		btnDivisao.setBackground(new Color(255, 164, 255));
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.valueOf(tela);
				simbulos = "/";
				tela = "";
			}
		});
		btnDivisao.setBounds(240, 104, 59, 41);
		frmCalculadora.getContentPane().add(btnDivisao);

		JButton btnQuatro = new JButton("4");
		btnQuatro.setBackground(new Color(173, 91, 255));
		btnQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela = tela + 4;
				updateTela(tela);
			}
		});
		btnQuatro.setBounds(10, 166, 59, 41);
		frmCalculadora.getContentPane().add(btnQuatro);

		JButton btnUm = new JButton("1");
		btnUm.setBackground(new Color(173, 91, 255));
		btnUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela = tela + 1;
				updateTela(tela);
			}
		});
		btnUm.setBounds(10, 222, 59, 41);
		frmCalculadora.getContentPane().add(btnUm);

		JButton btnCinco = new JButton("5");
		btnCinco.setBackground(new Color(173, 91, 255));
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela = tela + 5;
				updateTela(tela);
			}
		});
		btnCinco.setBounds(79, 166, 59, 41);
		frmCalculadora.getContentPane().add(btnCinco);

		JButton btnSeis = new JButton("6");
		btnSeis.setBackground(new Color(173, 91, 255));
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela = tela + 6;
				updateTela(tela);
			}
		});
		btnSeis.setBounds(148, 166, 59, 41);
		frmCalculadora.getContentPane().add(btnSeis);

		JButton btnDois = new JButton("2");
		btnDois.setBackground(new Color(173, 91, 255));
		btnDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela = tela + 2;
				updateTela(tela);
			}
		});
		btnDois.setBounds(79, 222, 59, 41);
		frmCalculadora.getContentPane().add(btnDois);

		JButton btnTres = new JButton("3");
		btnTres.setBackground(new Color(173, 91, 255));
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela = tela + 3;
				updateTela(tela);
			}
		});
		btnTres.setBounds(148, 222, 59, 41);
		frmCalculadora.getContentPane().add(btnTres);

		JButton btnMultiplicacao = new JButton("x");
		btnMultiplicacao.setBackground(new Color(255, 164, 255));
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.valueOf(tela);
				simbulos = "*";
				tela = "";
			}
		});
		btnMultiplicacao.setBounds(240, 166, 59, 41);
		frmCalculadora.getContentPane().add(btnMultiplicacao);

		JButton btnSubtracao = new JButton("-");
		btnSubtracao.setBackground(new Color(255, 164, 255));
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.valueOf(tela);
				simbulos = "-";
				tela = "";
			}
		});
		btnSubtracao.setBounds(240, 222, 59, 41);
		frmCalculadora.getContentPane().add(btnSubtracao);

		JButton btnZero = new JButton("0");
		btnZero.setBackground(new Color(173, 91, 255));
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela = tela + 0;
				updateTela(tela);
			}
		});
		btnZero.setBounds(79, 274, 59, 41);
		frmCalculadora.getContentPane().add(btnZero);

		JButton btnAdicao = new JButton("+");
		btnAdicao.setBackground(new Color(255, 164, 255));
		btnAdicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.valueOf(tela);
				simbulos = "+";
				tela = "";
			}
		});
		btnAdicao.setBounds(240, 274, 59, 41);
		frmCalculadora.getContentPane().add(btnAdicao);

		JButton btnIgual = new JButton("=");
		btnIgual.setBackground(new Color(255, 164, 255));
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (simbulos.equals("+")) {

					num2 = Double.valueOf(tela);
					String res = (num1 + num2) + "";
					res = res.replace(".0", "");
					updateTela(res);
					tela = "";

				} else if (simbulos.equals("-")) {

					num2 = Double.valueOf(tela);
					String res = (num1 - num2) + "";
					res = res.replace(".0", "");
					updateTela(res);
					tela = "";

				} else if (simbulos.equals("*")) {

					num2 = Double.valueOf(tela);
					String res = (num1 * num2) + "";
					res = res.replace(".0", "");
					updateTela(res);
					tela = "";

				} else if (simbulos.equals("/")) {

					num2 = Double.valueOf(tela);
					String res = (num1 / num2) + "";
					res = res.replace(".0", "");
					updateTela(res);
					tela = "";

				}
			}
		});
		btnIgual.setBounds(148, 274, 59, 41);
		frmCalculadora.getContentPane().add(btnIgual);

		JButton btnVirgula = new JButton(",");
		btnVirgula.setBackground(new Color(255, 164, 255));
		btnVirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela = tela + ".";
				updateTela(tela);
			}
		});
		btnVirgula.setBounds(10, 274, 59, 41);
		frmCalculadora.getContentPane().add(btnVirgula);

		JButton btnApagar = new JButton("C");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResultado.setText("");
			}
		});
		btnApagar.setBackground(new Color(255, 164, 255));
		btnApagar.setBounds(240, 326, 59, 41);
		frmCalculadora.getContentPane().add(btnApagar);
	}

	public void mostrar() {
		frmCalculadora.setVisible(true);
	}

	private void updateTela(String tela) {
		textResultado.setText(tela);

	}
}
