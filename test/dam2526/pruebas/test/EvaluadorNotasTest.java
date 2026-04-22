package dam2526.pruebas.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dam2526.pruebas.EvaluadorNotas;

class EvaluadorNotasTest {

	@Test
	void notaCero_devuelveSuspenso() {
		EvaluadorNotas evaluador = new EvaluadorNotas();
		String resultado = evaluador.clasificarNota(0);
		assertEquals("Suspenso", resultado);
	}

	@Test
	void notaCuatro_devuelveSuspenso() {
		EvaluadorNotas evaluador = new EvaluadorNotas();
		String resultado = evaluador.clasificarNota(4);
		assertEquals("Suspenso", resultado);
	}

	@Test
	void notaCinco_devuelveAprobado() {
		EvaluadorNotas evaluador = new EvaluadorNotas();
		String resultado = evaluador.clasificarNota(5);
		assertEquals("Aprobado", resultado);
	}

	@Test
	void notaSeis_devuelveAprobado() {
		EvaluadorNotas evaluador = new EvaluadorNotas();
		String resultado = evaluador.clasificarNota(6);
		assertEquals("Aprobado", resultado);
	}

	@Test
	void notaSiete_devuelveNotable() {
		EvaluadorNotas evaluador = new EvaluadorNotas();
		String resultado = evaluador.clasificarNota(7);
		assertEquals("Notable", resultado);
	}

	@Test
	void notaOcho_devuelveNotable() {
		EvaluadorNotas evaluador = new EvaluadorNotas();
		String resultado = evaluador.clasificarNota(8);
		assertEquals("Notable", resultado);
	}

	@Test
	void notaNueve_devuelveSobresaliente() {
		EvaluadorNotas evaluador = new EvaluadorNotas();
		String resultado = evaluador.clasificarNota(9);
		assertEquals("Sobresaliente", resultado);
	}

	@Test
	void notaDiez_devuelveSobresaliente() {
		EvaluadorNotas evaluador = new EvaluadorNotas();
		String resultado = evaluador.clasificarNota(10);
		assertEquals("Sobresaliente", resultado);
	}

	@Test
	void notaNegativa_lanzaExcepcion() {
		EvaluadorNotas evaluador = new EvaluadorNotas();
		assertThrows(IllegalArgumentException.class, () -> evaluador.clasificarNota(-1));
	}

	@Test
	void notaMayorQueDiez_lanzaExcepcion() {
		EvaluadorNotas evaluador = new EvaluadorNotas();
		assertThrows(IllegalArgumentException.class, () -> evaluador.clasificarNota(11));
	}

}
