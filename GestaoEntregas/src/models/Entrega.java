package models;

public class Entrega {
	private int id, kmRodado;
	private String data, hora, endereco;
	private Entregador entregador;	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getKmRodado() {
		return kmRodado;
	}

	public void setKmRodado(int kmRodado) {
		this.kmRodado = kmRodado;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Entregador getEntregador() {
		return entregador;
	}

	public void setEntregador(Entregador entregador) {
		this.entregador = entregador;
	}
	
	
	@Override
	public String toString() {
		return "Entrega [id=" + id + ", kmRodado=" + kmRodado + ", data=" + data + ", hora=" + hora + ", endereco="
				+ endereco + ", entregador=" + entregador.getId() + "]";
	}
	
	public String toCSV () {
		return id + ";" + entregador.getId() + ";" + kmRodado + ";" + data + ";" + hora
				+ ";" + endereco + "]";
	}
	
	public String [] toVetor() {
		String [] vetorString = new String  [6];
		vetorString [0] = Integer.toString (id);
		vetorString [1] = Integer.toString (entregador.getId());
		vetorString [2] = Integer.toString (kmRodado);
		vetorString [3] = data;
		vetorString [4] = hora;
		vetorString [5] = endereco;
		return vetorString;
	}
	
	public String toHTML () {
		return "<tr><td>" + id + "</td><td>" + entregador + "</td><td>" + kmRodado + "</td><td>" + data + "</td><td>" + hora
				+ "</td><td>=" + endereco + "</td></tr>";
	}
	
	double getSubtotal() {
		return kmRodado * entregador.getValorKM();
	}
	

}
