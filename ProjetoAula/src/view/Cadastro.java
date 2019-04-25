package view;

	import model.Aluno;
	import javax.swing.JOptionPane;

public class Cadastro {

	public static void main(String[] args) {
		Aluno al = new Aluno ();
		
		al.setNome (JOptionPane.showInputDialog ("Digite seu nome : "));
		al.setBairro (JOptionPane.showInputDialog ("Digite seu bairro : "));
		al.setCidade(JOptionPane.showInputDialog ("Digite sua cidade : "));
		al.setEstado(JOptionPane.showInputDialog ("Digite seu estado : "));
		al.setEndereço (JOptionPane.showInputDialog ("Digite seu endereço : "));
		al.setCep (JOptionPane.showInputDialog ("Digite seu CEP"));
		
		System.out.println ("Seu nome é: " + al.getNome());
		System.out.println ("Seu Bairro é: " + al.getBairro());
		System.out.println ("Seu Cidade é: " + al.getCidade());
		System.out.println ("Seu Estado é: " + al.getEstado());
		System.out.println ("Seu Endereço é: " + al.getEndereço());
		System.out.println ("Seu CEP é: " + al.getCep());
	}

}
