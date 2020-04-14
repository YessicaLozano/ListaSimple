package laboratoriolistassimples;

import java.util.Scanner;

public class AplicacionLista {
    
    private Lista lst;
    private String menuOpciones;
    private String opcion;
    private int numero;
    private int dato;
    private int datoInicio;
    private Scanner input;
  
    public AplicacionLista(){
        this.lst=new Lista ();
        this.menuOpciones="Listas Enlazadas Simples\n" + "=========================\n"+ "1. Crear lista\n2. Imprimir lista" +
        "\n3. Anexar nodos Inicio \n4. Anexar nodos final\n5. Buscar nodos\n6. Borrar nodo inicio" +"\n7. Borrar nodo final\n8. Salir";
        this.opcion="";
        this.dato=0;
        this.numero=0;
        this.datoInicio=0;
        this.input = new Scanner(System.in);
    }
    
    public void leerMenu(){  
    do{ 
        listarMenu(menuOpciones);
        numero=input.nextInt();
        switch (numero){
            case 1: crearLista(); break;
            case 2: listar(); break;
            case 3: anexarNodoInicio(); break;
            case 4: anexarNodoFinal(); break;
            case 5: buscarNodo(); break;
            case 6: borrarDatoInicio(); break;
            case 7: borrarDatoFinal(); break;
            }
        }while(numero !=8);
    }

    public void listarMenu(String menu){ //Metodo que imprime el menu de opciones de la aplicacion
        System.out.println(menu);
    }

    public void crearLista() {
        lst = new Lista(); 
        for (int i=1; i<=10; i++){
            lst.anexarFinalLista(i);
            this.dato=dato;
        }
    listar();
    }

    public void anexarNodoInicio() { //Se anexa un nodo al inicio de la lista
        lst.anexarInicioLista(datoInicio);
        --datoInicio;
        listar();
    }

    public void anexarNodoFinal() { //Se anexa un nodo al final de la lista
        dato++;
        lst.anexarFinalLista(dato);
        listar();
    }

    public void listar() {
        String laLista=lst.imprimirLista();
        System.out.println(laLista);
    }

    public void buscarNodo(){
        int num=0;
        System.out.println("digite el numero a buscar");
        num=input.nextInt();
        if(lst.buscarNodo(num)){
            System.out.println("valor encontrado");
        } else{
            System.out.println("valor no encontrado");
        }
        listar();
    }

    public void borrarDatoInicio(){
        if(lst.borrarNodoInicio()){
            System.out.println("nodo borrado");
        }else{
            System.out.println("valor no borrado");
        }
        listar();
    }

    public void borrarDatoFinal(){
        if(lst.borrarNodoFinal()){
            System.out.println("nodo borrado");
        }else{
            System.out.println("valor no borrado");
        }
        listar();
    }

    public static void main(String []args) {
        AplicacionLista lista = new AplicacionLista();
        lista.leerMenu();
    }
    
  
}
