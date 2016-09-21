package S972Ejercicio05;

/*
 * Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
información sobre el número total de pizzas que se han pedido y que se
han servido. Siempre que se crea una pizza nueva, su estado es “pedida”.
El siguiente código del programa principal debe dar la salida que se muestra:
 * 
 * 
 * 
 */

public class Pizza {
	private String tamanyo;
	private String tipo;
	private String estado;

	private static int ipedida = 0;
	private static int iservida = 0;

	public Pizza(String tamanyo, String tipo, String estado) {
		this.tamanyo = tamanyo;
		this.tipo = tipo;
		this.setEstado("pedida");

	}

	public Pizza(String tamanyo, String tipo) {
		this.tamanyo = tamanyo;
		this.tipo = tipo;
		this.setEstado("pedida");
		Pizza.ipedida++;
	}

	public String getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(String tamanyo) {
		this.tamanyo = tamanyo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void sirve() {
		if (this.getEstado().equals("servida")) {
			System.out.println("esa pizza ya se ha servido");
		} else {

			this.setEstado("servida");
			Pizza.iservida++;
		}
	}

	public static int getTotalPedidas() {

		return Pizza.ipedida;
	}

	public static int getTotalServidas() {

		return Pizza.iservida;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("pizza ");
		builder.append(tamanyo);
		builder.append(" ");
		builder.append(tipo);
		builder.append(", ");
		builder.append(estado);
		builder.append("");
		return builder.toString();
	}

}
