import java.util.*;
public class Gramatica{
    private List<String> noTerminales;
    private List<String> alfabeto;
    private List<String> noTerminalInicial;
    private Map<String,String> producciones;
    
	public Gramatica(List<String> noTerminales, List<String> alfabeto, List<String> noTerminalInicial,
			Map<String, String> producciones) {
		super();
		this.noTerminales = noTerminales;
		this.alfabeto = alfabeto;
		this.noTerminalInicial = noTerminalInicial;
		this.producciones = producciones;
	}

	public List<String> getNoTerminales() {
		return noTerminales;
	}

	public void setNoTerminales(List<String> noTerminales) {
		this.noTerminales = noTerminales;
	}

	public List<String> getAlfabeto() {
		return alfabeto;
	}

	public void setAlfabeto(List<String> alfabeto) {
		this.alfabeto = alfabeto;
	}

	public List<String> getNoTerminalInicial() {
		return noTerminalInicial;
	}

	public void setNoTerminalInicial(List<String> noTerminalInicial) {
		this.noTerminalInicial = noTerminalInicial;
	}

	public Map<String, String> getProducciones() {
		return producciones;
	}

	public void setProducciones(Map<String, String> producciones) {
		this.producciones = producciones;
	}
    
	
    
}