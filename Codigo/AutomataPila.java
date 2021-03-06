import java.util.*;
public class AutomataPila {
	private List<String> estados;
	private String estadoInicial;
	private String estadoFinal;
	private String noTerminalInicial;
	private List<String> alfabetoPila;
	private String inicialPila;
	private FuncionTransicion transiciones;

	public AutomataPila(List<String> estados, String estadoInicial, String estadoFinal, String noTerminalInicial,
			List<String> alfabetoPila, String inicialPila, FuncionTransicion transiciones) {
		super();
		this.estados = estados;
		this.estadoInicial = estadoInicial;
		this.estadoFinal = estadoFinal;
		this.noTerminalInicial = noTerminalInicial;
		this.alfabetoPila = alfabetoPila;
		this.inicialPila = inicialPila;
		this.transiciones = transiciones;
	}

	public List<String> getEstados() {
		return estados;
	}

	public void setEstados(List<String> estados) {
		this.estados = estados;
	}

	public String getEstadoInicial() {
		return estadoInicial;
	}

	public void setEstadoInicial(String estadoInicial) {
		this.estadoInicial = estadoInicial;
	}

	public String getEstadoFinal() {
		return estadoFinal;
	}

	public void setEstadoFinal(String estadoFinal) {
		this.estadoFinal = estadoFinal;
	}

	public String getNoTerminalInicial() {
		return noTerminalInicial;
	}

	public void setNoTerminalInicial(String noTerminalInicial) {
		this.noTerminalInicial = noTerminalInicial;
	}

	public List<String> getAlfabetoPila() {
		return alfabetoPila;
	}

	public void setAlfabetoPila(List<String> alfabetoPila) {
		this.alfabetoPila = alfabetoPila;
	}

	public String getInicialPila() {
		return inicialPila;
	}

	public void setInicialPila(String inicialPila) {
		this.inicialPila = inicialPila;
	}

	public FuncionTransicion getTransiciones() {
		return transiciones;
	}

	public void setTransiciones(FuncionTransicion transiciones) {
		this.transiciones = transiciones;
	}



}