package com.rebeca.calculadora;

import java.awt.EventQueue;

import com.rebeca.calculadora.ui.UiPrincipal;

public class Calculadora {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				UiPrincipal window = new UiPrincipal();
				window.mostrar();

			}
		});
	}
}