package classes;

import javax.swing.JOptionPane;

public class Hospedagem {

	public Hospede hospede;
	public Quarto quarto;
	public int diasHospedado;
	public int quantidadeHospedes;
	
	public void mostrarHospedagem() {

		String resumo = "DADOS DA ESTADIA" + "\n";
		resumo += "--------------------------" + "\n";
		resumo += "Informações do hóspede" + "\n";
		resumo += "Nome: " + hospede.nome + "\n";
		resumo += "CPF: " + hospede.cpf + "\n";
		resumo += "--------------------------" + "\n";
		resumo += "Informações do quarto" + "\n";
		resumo += "Quarto número: " + quarto.numero + "\n";
		resumo += "Quantidade máxima de hóspedes: " + quarto.quantidadeMaximaHospedes + "\n";
		resumo += "--------------------------" + "\n";
		resumo += "Detalhes da hospedagem" + "\n";
		resumo += "Quantidade de hóspedes: " + quarto.quantidadeMaximaHospedes + "\n";
		resumo += "Diárias: " + diasHospedado + "\n";
		resumo += "Valor da diária: " + quarto.valorDiaria + "\n";
		resumo += "Valor total a pagar: " + calcularEstadia() + "\n";
		
		System.out.println(resumo);
	}
	
	private Double calcularEstadia() {
			Double valorTotal = quarto.valorDiaria * diasHospedado;
			
		if(diasHospedado >= 7) {
			valorTotal = valorTotal * 0.9;
		}
		return valorTotal;
	}
	
	public void validarHospedagem(int quantidadeAcompanhantes) {
		if(quantidadeAcompanhantes <= quarto.quantidadeMaximaHospedes) {
			JOptionPane.showMessageDialog(null, "Quantidade de hóspedes dentro do permitido.");
		}else {
			JOptionPane.showMessageDialog(null, "Número de hóspedes ultrapassa o permitido para o quarto.");
		}
	}
}
