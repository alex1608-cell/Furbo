package equipo.jugadores.centrocampistas;

public class Pivote extends Centrocampista {
	private int intercepciones;

	public Pivote (String nombre, int dorsal, String equipo, int pasesCompletados, int intercepciones) {
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
	public void monstrarDatos(String nombre, int dorsal, String equipo) {
		// TODO Auto-generated method stub
		
	}

	

	

}
