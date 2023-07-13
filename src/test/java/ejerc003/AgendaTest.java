package ejerc003;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgendaTest {
	
	Agenda agenda;
	Persona p1,p2;

	@BeforeEach
	void setUp() throws Exception {
		agenda = new Agenda();
		p1=new Persona(0, "Adrian", "Incera", "Alvarez", "123456789");
		p2=new Persona(1, "Juan", "Villa", "Gonzalez", "152414152");
		agenda.anadirPersona(p1);
		agenda.anadirPersona(p2);
	}

	@Test
	void testAnadirPersona() {	
		agenda.anadirPersona(new Persona(2, "Pedro", "Gonzalez", "Uriarte", "654123987"));
		assertEquals(3, agenda.totalContactos());
		assertEquals("Pedro", agenda.getAgenda().get(2).getNombre());
		
	}

	@Test
	void testEditarPersona() {
		
		Persona personaNew = new Persona(0, "Adrian", "Alvarez", "Incera", "123456789");
		agenda.editarPersona(p1, personaNew);
		//assertEquals(p1, agenda.buscarPersona(personaOld));
		assertEquals(personaNew.toString(), agenda.getAgenda().get(0).toString());
	}

	@Test
	void testEliminarPersona() {
		int antes=agenda.totalContactos();
		agenda.eliminarPersona(p2);
		int despues=agenda.totalContactos();
		assertEquals(antes, despues+1);
	
	}

	@Test
	void testVisualizarAgenda() {
		assertNotNull(agenda.visualizarAgenda());
		
	}
}
