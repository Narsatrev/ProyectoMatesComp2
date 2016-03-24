import java.io.*;
import java.util.*;

public class Principal{
	public static void main(String[] args){

		Scanner s= new Scanner(System.in);
		boolean otroAutomata=true;        


		while(otroAutomata){

			System.out.print("Escriba el nombre del archivo de prueba:\n");
			String nombreArchivo=s.nextLine();

			File archivo = new File(nombreArchivo);

			try {
				BufferedReader buff = new BufferedReader(new FileReader(archivo));

				List<String> estados=new ArrayList<String>();
				List<String> estadosFinales=new ArrayList<String>();
				List<String> alfabeto=new ArrayList<String>();

				String estadoInicial=null;


				String[] aux=null;

				aux=buff.readLine().split(",");
				for(String str: aux){			    	
					estados.add(str);
				}

				alfabeto=Arrays.asList(buff.readLine().split(","));

				estadoInicial=new String(buff.readLine());

				aux=buff.readLine().split(",");
				for(String str: aux){
					estadosFinales.add(str);
				}

				String linea = "";
				Map<String,List<String>> tablaTransicion= new HashMap<String,List<String>>();
				List<String> arrEdosAux=null;
				String[] arrAux=null;

				while((linea = buff.readLine()) != null) {
					arrAux=linea.split("=>");
					arrEdosAux=Arrays.asList(arrAux[1].split(","));
					tablaTransicion.put(arrAux[0],arrEdosAux);
				}

				FuncionTransicion tablaCompleta=new FuncionTransicion(tablaTransicion);
				Automata automata=new Automata(estados,estadosFinales,estadoInicial,alfabeto,tablaCompleta);

				boolean flag=true;
				do{
					System.out.println("Ingrese la cadena a evaluar:");
					String cadena=s.nextLine();

					System.out.println(automata.evaluarCadena(cadena));

					boolean menu_opc=true;

					do{
						System.out.println("Seleccione una opción:\n1. Otra cadena \n2. Otro autómata \n3. Salir");
						String opc=s.nextLine();
						switch(opc){
						case "1":
							menu_opc=false;
							break;
						case "2":
							menu_opc=false;
							flag=false;
							break;
						case "3":
							System.out.println("¡Hasta luego!");
							menu_opc=false;
							flag=false;
							otroAutomata=false;
							break;
						default:
							System.out.println("Opción no encontrada...");
							break;
						}
					}while(menu_opc);

				}while(flag);

				buff.close();

			} catch (FileNotFoundException e) {
				System.out.println("El archivo no fue encontrado...");			    
			} catch (IOException e) {
				System.out.println("Error en la lectura...");
			}
		}
		s.close();
	}	
}