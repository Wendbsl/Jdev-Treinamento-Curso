package cursojava.executavel;

import javax.swing.JOptionPane;
import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* Main é um método auto executavel em Java */
	public static void main(String[] args) {

		/* new Aluno() é uma instancia (Criação de Objeto) */
		/* Aluno1 é uma referencia para o objeto aluno */

		String nome = JOptionPane.showInputDialog("Informe o seu nome ?");
		String idade = JOptionPane.showInputDialog("Informe a sua idade ?");
		String nascimento = JOptionPane.showInputDialog("data de nascimento ?");
		String rg = JOptionPane.showInputDialog("Informe o Registro Geral ?");
		String cpf = JOptionPane.showInputDialog("Qual é o CPF ?");
		String mae = JOptionPane.showInputDialog("Qual o nome da mãe ?");
		String pai = JOptionPane.showInputDialog("Qual o nome do pai ?");
		String matricula = JOptionPane.showInputDialog("Qual a data da matricula ?");
		String escola = JOptionPane.showInputDialog("Qual o nome da escola ?");
		String serie = JOptionPane.showInputDialog("Qual a série = ");
		String nota1 = JOptionPane.showInputDialog("Informe a nota 1 ?");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2 ?");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3 ?");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4 ?");

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(nascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setNomeEscola(escola);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));

		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("Nascimento é = " + aluno1.getDataNascimento());
		System.out.println("RG é = " + aluno1.getRegistroGeral());
		System.out.println("CPF é = " + aluno1.getNumeroCpf());
		System.out.println("Mãe é = " + aluno1.getNomeMae());
		System.out.println("Pai é = " + aluno1.getNomePai());
		System.out.println("Matricula é = " + aluno1.getDataMatricula());
		System.out.println("Escola é = " + aluno1.getNomeEscola());
		System.out.println("Série é = " + aluno1.getSerieMatriculado());

		System.out.println(aluno1); /* Descrição do objeto na memoria */
		System.out.println("A média do aluno é = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 = " + aluno1.getAlunoAprovado2());

		System.out.println("-----------------------------------------------");

		Aluno aluno2 = new Aluno();

		aluno2.setNome("Pedro");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("02/08/1970");
		aluno2.setRegistroGeral("339.330.580");
		aluno2.setNumeroCpf("550.335.660");
		aluno2.setNomeMae("Marlene");
		aluno2.setNomePai("Jorge");
		aluno2.setDataMatricula("20/04/2003");
		aluno2.setNomeEscola("Escola Saint Frances");
		aluno2.setSerieMatriculado("8");
		aluno2.setNota1(20.8);
		aluno2.setNota2(68.6);
		aluno2.setNota3(88.2);
		aluno2.setNota4(98.8);

		System.out.println("Aluno 2 Nome é = " + aluno2.getNome());
		System.out.println("Aluno 2 Idade é = " + aluno2.getIdade());
		System.out.println("Aluno 2 Nascimento é = " + aluno2.getDataNascimento());
		System.out.println("Aluno 2 RG é = " + aluno2.getRegistroGeral());
		System.out.println("Aluno 2 CPF é = " + aluno2.getNumeroCpf());
		System.out.println("Aluno 2 Mãe é = " + aluno2.getNomeMae());
		System.out.println("Aluno 2 Pai é = " + aluno2.getNomePai());
		System.out.println("Aluno 2 Matricula é = " + aluno2.getDataMatricula());
		System.out.println("Aluno 2 Escola é = " + aluno2.getNomeEscola());
		System.out.println("Aluno 2 Série é = " + aluno2.getSerieMatriculado());
		System.out.println("Aluno 2 média é = " + aluno2.getMediaNota());
		System.out.println("Aluno 2 Resultado = " + (aluno2.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Aluno 2 Resultado 2 = " + aluno2.getAlunoAprovado2());
		System.out.println("----------------------------------------------------");

		/* Equals e hashcode (Diferenciar e comparar objetos) */

		aluno1.setNome("Alex");
		aluno1.setNumeroCpf("123");

		aluno2.setNome("Alex");
		aluno2.setNumeroCpf("123");

		if (aluno1.equals(aluno2)) {
			System.out.println("Alunos são iguais");
		} else {
			System.out.println("Alunos não são iguais");
		}

	}
}
