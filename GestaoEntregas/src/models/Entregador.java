package models;

public class Entregador {
	private int id;
	private double valorKM;
	private String nome, telefone, habilitacao, veiculo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValorKM() {
		return valorKM;
	}
	public void setValorKM(double valorKM) {
		this.valorKM = valorKM;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getHabilitacao() {
		return habilitacao;
	}
	public void setHabilitacao(String habilitacao) {
		this.habilitacao = habilitacao;
	}
	public String getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}
	@Override
	public String toString() {
		return "Entregador [id=" + id + ", valorKM=" + valorKM + ", nome=" + nome + ", telefone=" + telefone
				+ ", habilitacao=" + habilitacao + ", veiculo=" + veiculo + "]";
	}
	
	public String toCSV() {
		return id + ";" + valorKM + ";" + nome + ";" + telefone
				+ ";" + habilitacao + ";" + veiculo + "]";
	}
	
	public String [] toVetor() {
		String [] vetorString = new String  [6];
		//vetorString = [id, valorKM, nome, telefone, habilitacao, veiculo];
		vetorString [0] = Integer.toString (id);
		vetorString [1] = Double.toString (valorKM);
		vetorString [2] = nome;
		vetorString [3] = telefone;
		vetorString [4] = habilitacao;
		vetorString [5] = veiculo;
		return vetorString;
	}
	
	public String toHTML () {
		return "<tr><td>" + id + "</td><td>" + valorKM + "</td><td>" + nome + "</td><td>" + telefone
				+ "</td><td>=" + habilitacao + "</td><td>" + veiculo + "</td></tr>";
	}
}
