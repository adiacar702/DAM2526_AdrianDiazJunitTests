package dam2526.pruebas.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import dam2526.pruebas.EvaluadorNotas;

class EvaluadorNotasParameterizedTest {

	@ParameterizedTest
	@CsvSource({ "0, Suspenso", "1, Suspenso", "3, Suspenso", "4, Suspenso", "5, Aprobado", "6, Aprobado", "7, Notable",
			"8, Notable", "9, Sobresaliente", "10, Sobresaliente" })
	void clasificarNota_devuelveCalificacionEsperada(int nota, String esperado) {
		EvaluadorNotas evaluador = new EvaluadorNotas();
		String resultado = evaluador.clasificarNota(nota);
		assertEquals(esperado, resultado);
	}

	@ParameterizedTest
	@ValueSource(ints = { -5, -1, 11, 20 })
	void clasificarNota_fueraDeRango_lanzaExcepcion(int nota) {
		EvaluadorNotas evaluador = new EvaluadorNotas();
		assertThrows(IllegalArgumentException.class, () -> evaluador.clasificarNota(nota));
	}

}
