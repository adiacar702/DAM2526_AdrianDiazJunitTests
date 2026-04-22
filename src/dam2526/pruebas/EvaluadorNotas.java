package dam2526.pruebas;

public class EvaluadorNotas {
	public String clasificarNota(int nota) {
		if (nota < 0 || nota > 10) {
			throw new IllegalArgumentException("La nota debe estar entre 0 y 10.");
		}

		if (nota <= 4) {
			return "Suspenso";
		} else if (nota <= 6) {
			return "Aprobado";
		} else if (nota <= 8) {
			return "Notable";
		} else {
			return "Sobresaliente";
		}
	}
}
