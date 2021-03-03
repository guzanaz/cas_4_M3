/**
 * 
 */
package lista_funciones;
import java.util.Scanner;

/**
 * El programa lista_funciones implementa una aplicación 
 * para almacenar los apellidos del alumnado de clases y
 * gestionarlos en una lista a través de distintas funciones
 *  
 * @author Daniela Gallardo Reyes
 * @version 1.0
 * @since   01-03-2021
*/

public class lista_funciones {
	/**
	 * Este es el método main que utiliza;
	 	* función menú,
	 	* función inserir,
	 	* función localitzar,
	 	* función 
	 	* función 
	 	* función 
	 	* función imprimir y
	 	* función sortir
	 * @param args Unused.
	 * @return nada.
	 */
	public static void main(String[] args) { 
		
	//QUÉ NECESITAREMOS?
	 	//una variable para guardarnos el nro. elem. del array llista_classe (contador) 
	 	int num_elements = 11;	 	
	 	
	 	//array lista de clase (con 11 elementos de tipo string) 
	 	String[] llista_classe =new String[11];
	 	llista_classe[0]="El Khattabi";
	 	llista_classe[1]="Girbes";
	 	llista_classe[2]="Montealegre";
	 	llista_classe[3]="Samper";
	 	llista_classe[4]="García";
	 	llista_classe[5]="Pasalamar";
	 	llista_classe[6]="Queralt";
	 	llista_classe[7]="Román";
	 	llista_classe[8]="Rkouni";
	 	llista_classe[9]="Gallardo";
	 	llista_classe[10]="Masana";

	 	
		
		// 1. Declarar array con opcions del menú fuera de la función
				String[]opcions= new String[11];
				opcions[0]="[a]inserir";
				opcions[1]="[b]localitzar";
				opcions[2]="[c]recuperar";
				opcions[3]="[d]suprimir";
				opcions[4]="[e]suprimirDada";
				opcions[5]="[f]anul_la";
				opcions[6]="[g]primerDarrer";
				opcions[7]="[h]imprimir";
				opcions[8]="[i]ordenar";
				opcions[9]="[j]localitzarEnOrdenada";
				opcions[10]="[k]sortir";
		
				//var para salir del programa
				boolean sortir=false;
				
				do{ 
					//var para guardar lo que retorna la f menu
					char opcio;
					// llamamos a la f imprimir menú + guardar su return
					opcio=menu(opcions);
					
					//switch para las distintas opciones
						switch (opcio) {         
							case 'a':// Inserir
								System.out.println("------ FUNCIÓ: [a]INSERIR ------\n");
								//llamamos a la función inserir
						   		num_elements=inserir(num_elements, llista_classe);
						   		//llamamos a la función imprimir
						   		imprimir(num_elements, llista_classe);			
							break;
							
							case 'b':// localitzar
								System.out.println("------ FUNCIÓ: [b]Localitzar ------\n");
								//llamamos a la función localitzar
								localitzar(num_elements,llista_classe);							
							break;
							
							case 'c':// recuperar
								System.out.println("------ FUNCIÓ: [c]Recuperar ------\n");
								//llamamos a la función recuperar
								recuperar(num_elements,llista_classe);	
							break;
							
							case 'd':// suprimir
								
							break;
							
							case 'e':// suprimirDada
								
							break;
							
							case 'f':// anul_la
								
							break;
			
							case 'g':// primer_Darrer
								
							break;
							
							case 'h':// imprimir
								System.out.println("------ FUNCIÓ: [h]IMPRIMIR ------\n");
								imprimir(num_elements,llista_classe);

							break;
					
							case 'k'://sortir
							System.out.println("Has salido del programa");
							sortir=true;	
							break;
						}
				}while(sortir!=true); 				
	}

	
	//------------------------------------------------------------------------//
	//                               Funciones                                //
	//------------------------------------------------------------------------//
		/**
		 * Función menú. 
		 * Despliega el menú principal en pantalla 
		 * y pide ingresar una tarea para ejecutar
		 * @param array tipo String opcions (que almacena las opciones)
		 * @return variable tipo char que retorna la opción seleccionada
		 */
			  public static char menu(String[] opcions){
			  		//Encabezado menú
					System.out.println("-------------");
					System.out.println("OPCIONS MENU");
					System.out.println("-------------");
				
		   		    for (int i = 0; i < opcions.length; i++) {
		            System.out.println(opcions[i]);
		        }
		   		//Preguntamos qué opción selecionarán
		   		System.out.println("-----------------------");
		   		System.out.println("---- QUÉ VOLS FER? ----");
		   		System.out.println("  [ingressa una opció] ");
		   		System.out.println("-----------------------");
		   		//entrada por teclado
				Scanner sc = new Scanner(System.in);
				//guardamos la entrada en opcio
				char opcio1=sc.next().charAt(0);
				//retornamos opcio al main				
		        return opcio1;
		  }
		 
		/**
		 * Función inserir.
		 * Inserta un elemento nuevo en llista_classe en una posición determinada
		 * con el paso de valores por referencia (num_elements=n y llista_classe=llista) 
		 * @param n:Es el contador de elementos que hay en el array llista_clase
		 * @param llista: es el array inicial en el que se insertará el nuevo elemento 
		 * @return n: es el nuevo valor que retorna la función cuando se inserta un nuevo
		 * elemento en el array llista
		 */
			  
		  public static int inserir(int n, String[] llista) {
			  int posicio = 0;
			  String nombre;
			 //activar el scanner por teclado
			 Scanner sc1 = new Scanner(System.in);
			  if(n==0) {
		   			System.out.println("[ingressa un nom a la llista]  ");
		   			nombre=sc1.next();
		   			llista[0]=nombre; 
		   			n++;
		   		}else if(n>0&&n<llista.length) {
		   			System.out.println("tens hasta la posició " + n +" ocupada");
		   			System.out.println("El següent registre pot ocupar desde la posició 1 hasta la posició "+(n+1));
		   			System.out.println("¿En quina posició vols guardar el següent nom?");
		   			posicio=sc1.nextInt();
		   				if(posicio<=0 || posicio>(n+1)||posicio==12){
		   					System.out.println("debe ser un número válido entre"+" 1 y "+ (n+1));
		   					System.out.println("[De vuelta al menú]");
		   					System.out.println("--------------------");
		   					System.out.println("imprimiendo lista...");
		   					System.out.println("--------------------");
		   					return n;
		   				}else{
		   					posicio=posicio-1;
		   				};
		   				
		   				System.out.println("Ingressa un nom");
		   				nombre = sc1.next();                      
		   				for (int i = n; i > posicio; i--) {
		   				llista[i] = llista[i - 1];
		   				}
		   				llista[posicio] = nombre;
		   				n++;
			  
		   		}else if(n>0&&n==llista.length){
		   			System.out.println("LLista plena, de vuelta al menú principal");
		   		};
		   return n;
		  }
		  
		/**
		 * Función Localitzar.
		 * Encuentra un elemento de tipo String dentro del array llista_classe y nos dice su posición
		 * con el paso de valores por referencia (num_elements=n y llista_classe=llista) 
		 * si el elemento no está también lo informa. Es case sensitive. 
		 * @param n: contador de las posiciones de los elementos dentro del array llista
		 * @param llista: array que contiene los elementos de tipo String
		 * @return void
		 */
		  public static void localitzar(int n,String[]llista) {
			 int posicio;
			 
			 if(n==0) {
				 System.out.println("llistabuida");
				 return;
			 }else {
				 Scanner sc=new Scanner(System.in);
				 System.out.println("Escriu el que nom vols localitzar?");
				 String x=sc.next();
			     	for (posicio=0;posicio<n;posicio++) {
			     		if(x.equals(llista[posicio])){
			     			System.out.println("la posició de nom " +x+" es "+ (posicio+1));
			     			
			     		}else if(posicio=n&&!x.equals(llista[posicio])) {
			     			System.out.println("el nombre no está en la lista");
			     			
			     		}
			     	}
			 	}
			 
			  return; 
		  }
		  

		  /**
			 * Función Recuperar.
			 * Encuentra un elemento de tipo int dentro del array llista_classe y nos dice su valor
			 * con el paso de valores por referencia (num_elements=n y llista_classe=llista) 
			 * si el elemento no está también lo informa. Es case sensitive. 
			 * @param n: contador de las posiciones de los elementos dentro del array llista
			 * @param llista: array que contiene los elementos de tipo String
			 * @return void
			 */
			  @SuppressWarnings("unused")
			public static void recuperar(int n,String[]llista) {
				  Scanner sc=new Scanner(System.in);
				  int p=0;  
				  if (n == 0) {
                        //advertencia
                        System.out.println("\n");
                        System.out.println("──────────────────────────────────────────────");
                        System.out.println("   Lista vacía ¡Nada que podamos recuperar!   ");
                        System.out.println("──────────────────────────────────────────────");
                        System.out.println("\n");
                    } else {
                        System.out.println("Escribe la posición que desees recuperar");
                        p = sc.nextInt();
                        p = p - 1;

                        while (p < 0 || p > n) {
                            System.out.println("Posición incorrecta. Ha de ser entre 1 i " + n);
                            System.out.println("Escribe la posición que desees recuperar");
                            p = sc.nextInt();
                            p = p - 1;
                            
                            for (int i = 0; i <= n;i++) {
                                if (p == i) {
                                    System.out.print("El apellido en la posición " + (p + 1) + " es " + llista[i] + "\n");
                               
                                }
                            }

                        
                            return;
                        }
                    }
				  
				  return;
			  }
		  
		  
		  
		 /**
		  * Función imprimir.
		  * Imprime por pantalla los elementos del array llista_classe.
		  * @param n: contador de las posiciones de los elementos dentro del array llista
		  * @param llista: array que contiene los elementos de tipo String.
		  * @return void. Sólo ejecuta una tarea, no retorna nuevos valores.
		  */
		 public static void imprimir (int n, String[] llista) {
					  for(int ink=0;ink<n;ink++){
						  System.out.println("posició "+ (ink+1)+ ". " + llista[ink]);
				} 
		  }
		 
		 
}//fin del programa