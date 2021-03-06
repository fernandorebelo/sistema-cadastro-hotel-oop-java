package principal;

import javax.swing.JOptionPane;

import classes.Hospedagem;
import classes.Hospede;
import classes.Quarto;

public class Principal {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "HOTEL - CADASTRO DO CLIENTE");
		String nome = JOptionPane.showInputDialog("Cadastro - Nome: ").toUpperCase();
		String cpf = JOptionPane.showInputDialog("Cadastro - CPF: ");
		
		Hospede hospedePrincipal = new Hospede();
		hospedePrincipal.cadastroHospede(nome, cpf);
		
		JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
		
		Quarto quarto1 = new Quarto();
		quarto1.cadastrarQuarto(005, 4, 200.00);

		
		Hospedagem hospedagem = new Hospedagem();
		hospedagem.hospede = hospedePrincipal; //Inst?ncias associadas. Criado para n?o dar NullPointerException.
		hospedagem.quarto = quarto1;
		
		int quantidadeAcompanhantes = Integer.parseInt(JOptionPane.showInputDialog("Quantos h?spedes ficar?o no quarto?"));
		hospedagem.validarHospedagem(quantidadeAcompanhantes);
		hospedagem.quantidadeHospedes = quantidadeAcompanhantes;
		
		int quantidadeDiarias = Integer.parseInt(JOptionPane.showInputDialog("Quantos di?rias?"));
		hospedagem.diasHospedado = quantidadeDiarias;
		
		hospedagem.mostrarHospedagem();
	}

}
