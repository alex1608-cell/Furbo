package equipo.jugadores.centrocampistas;

public class Pivote extends Centrocampista {
	private int intercepciones;

	public Pivote(String nombre, int dorsal, String equipo, int pasesCompletados, int intercepciones) {
		super(nombre, dorsal, equipo, pasesCompletados);
		this.setIntercepciones(intercepciones);
	}

	public int getIntercepciones() {
		return intercepciones;
	}

	public void setIntercepciones(int intercepciones) {
		this.intercepciones = intercepciones;
	}

	@Override
	public String toString() {
		return "Pivote [Intercepciones=" + this.intercepciones + ", Pases Completados=" + this.getPasesCompletados()
				+ ", Nombre=" + this.getNombre() + ", Dorsal=" + this.getDorsal() + ", Equipo=" + this.getEquipo()
				+ "]";
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
}
