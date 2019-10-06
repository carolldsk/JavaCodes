package calculadora;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

//import java.util.Scanner;

public class Calculadora extends JFrame {

	// Construtor
	public Calculadora() {
		// Layout da calculadora
		// Nome da janela
		super("Calculadora");

		Container n = new JPanel();
		
		// 4x4 = Linhas e colunas  - 5x5 = Borda entre os botoes
		n.setLayout(new GridLayout(4,4, 5,5));
		n.add(new JButton("7"));
		n.add(new JButton("8"));
		n.add(new JButton("9"));
		n.add(new JButton("/"));
		n.add(new JButton("4"));
		n.add(new JButton("5"));
		n.add(new JButton("6"));
		n.add(new JButton("*"));
		n.add(new JButton("1"));
		n.add(new JButton("2"));
		n.add(new JButton("3"));
		n.add(new JButton("-"));
		n.add(new JButton("0"));
		n.add(new JButton("."));
		n.add(new JButton("="));
		n.add(new JButton("+"));
		
		JTextField display = new JTextField();
		display.setFont(new Font("Serif", Font.PLAIN, 26));
		Container c = getContentPane();
		c.add(BorderLayout.NORTH, display);
		c.add(BorderLayout.CENTER, n);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,300);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Calculadora();

		/*
		* Normal calculadora
		 * float num1; float num2; float resultado; char operacao;
		 * 
		 * Scanner leitor = new Scanner(System.in);
		 * 
		 * System.out.println("Digite o primeiro número: "); num1 =
		 * leitor.nextFloat();
		 * 
		 * System.out.println("Digite o segundo número: "); num2 =
		 * leitor.nextFloat();
		 * 
		 * 
		 * System.out.println("Digite a operação desejada: "); operacao =
		 * leitor.next().charAt(0);
		 * 
		 * 
		 * if(operacao == '+'){ resultado = num1 + num2;
		 * 
		 * System.out.println("O resultado é : " + resultado);
		 * 
		 * } else if(operacao == '-'){ resultado = num1 - num2;
		 * 
		 * System.out.println("O resultado é : " + resultado); }
		 * 
		 * else if(operacao == '*'){ resultado = num1 * num2;
		 * 
		 * System.out.println("O resultado é : " + resultado); }
		 * 
		 * else if(operacao == '/'){ resultado = num1 / num2;
		 * 
		 * System.out.println("O resultado é : " + resultado); } else{
		 * System.out.println("Operação inválida."); }
		 */

	}

}
