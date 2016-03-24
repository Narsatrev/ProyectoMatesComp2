import java.util.*;
public class AutomataPila {
	
	private Gramatica gramatica;
	
	private List<String> estados;
	private String estadoInicial;
	private String estadoFinal;
	private List<String> alfabeto=gramatica.getAlfabeto();
	private List<String> alfabetoPila;
	private String inicialPila;
	private FuncionTransicion transiciones;

	public AutomataPila(Gramatica gramatica, List<String> estados, String estadoInicial, String estadoFinal, String noTerminalInicial,
			String inicialPila) {
		this.gramatica=gramatica;
		this.estados = estados;
		this.estadoInicial = estadoInicial;
		this.estadoFinal = estadoFinal;		
		this.inicialPila = "Z0";
		List<String> alfPila=new ArrayList<String>();
		alfPila=gramatica.getAlfabeto();
		alfPila.addAll(gramatica.getNoTerminales());
		alfPila.add(inicialPila);		
		this.transiciones = new FuncionTransicion(gramatica);
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
	

	public Gramatica getGramatica() {
		return gramatica;
	}

	public void setGramatica(Gramatica gramatica) {
		this.gramatica = gramatica;
	}

	public List<String> getAlfabeto() {
		return alfabeto;
	}

	public void setAlfabeto(List<String> alfabeto) {
		this.alfabeto = alfabeto;
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