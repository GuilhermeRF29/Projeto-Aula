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
		al.setEndere�o (JOptionPane.showInputDialog ("Digite seu endere�o : "));
		al.setCep (JOptionPane.showInputDialog ("Digite seu CEP"));
		
		System.out.println ("Seu nome �: " + al.getNome());
		System.out.println ("Seu Bairro �: " + al.getBairro());
		System.out.println ("Seu Cidade �: " + al.getCidade());
		System.out.println ("Seu Estado �: " + al.getEstado());
		System.out.println ("Seu Endere�o �: " + al.getEndere�o());
		System.out.println ("Seu CEP �: " + al.getCep());
	}

}
