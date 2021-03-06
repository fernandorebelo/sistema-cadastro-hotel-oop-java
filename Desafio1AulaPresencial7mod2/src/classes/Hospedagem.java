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
		resumo += "Informa??es do h?spede" + "\n";
		resumo += "Nome: " + hospede.nome + "\n";
		resumo += "CPF: " + hospede.cpf + "\n";
		resumo += "--------------------------" + "\n";
		resumo += "Informa??es do quarto" + "\n";
		resumo += "Quarto n?mero: " + quarto.numero + "\n";
		resumo += "Quantidade m?xima de h?spedes: " + quarto.quantidadeMaximaHospedes + "\n";
		resumo += "--------------------------" + "\n";
		resumo += "Detalhes da hospedagem" + "\n";
		resumo += "Quantidade de h?spedes: " + quarto.quantidadeMaximaHospedes + "\n";
		resumo += "Di?rias: " + diasHospedado + "\n";
		resumo += "Valor da di?ria: " + quarto.valorDiaria + "\n";
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
			JOptionPane.showMessageDialog(null, "Quantidade de h?spedes dentro do permitido.");
		}else {
			JOptionPane.showMessageDialog(null, "N?mero de h?spedes ultrapassa o permitido para o quarto.");
		}
	}
}
