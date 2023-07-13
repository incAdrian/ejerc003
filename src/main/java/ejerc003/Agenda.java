package ejerc003;

import java.util.ArrayList;

public class Agenda {

	ArrayList<Persona> agenda;

	public Agenda() {
		this.agenda = new ArrayList<Persona>();
	}

	public void anadirPersona(Persona persona) {

		if (agenda.indexOf(persona) < 0) {
			agenda.add(persona);
		}
	}

	public void editarPersona(Persona personaOld, Persona personaNew) {

		int posicion = agenda.indexOf(personaOld);

		if (posicion >= 0) {
			agenda.set(posicion, personaNew);
		}

	}

	public void eliminarPersona(Persona persona) {

		int posicion = agenda.indexOf(persona);

		if (posicion >= 0) {
			agenda.remove(posicion);
		}
	}

	public String visualizarAgenda() {
		String cadena = "";
		
		for (Persona persona : agenda) {
			cadena += persona.toString();
		}

		return cadena;
	}
	
	public int totalContactos() {
		return agenda.size();
	}

	public ArrayList<Persona> getAgenda() {
		return agenda;
	}
	
	public int buscarPersona(Persona persona) {
		return agenda.indexOf(persona);
	}
	
	
	
	

}
