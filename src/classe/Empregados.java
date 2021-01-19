package classe;

public class Empregados {

	private Integer id;
	private String nome;
	private Double salario;

	public Empregados(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;

	}

	public void increaseSalary(Double porcentagem) {
		salario += salario * porcentagem / 100;
	}

	public Integer getId() {
		return id;
	}

	public String toString() {
		return id + ", " + nome + ", " + salario;

	}

}
