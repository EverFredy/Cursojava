/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

/**
 *
 * @author Administrador
 */
public class Arreglos {

    public static void main(String[] args){
       // Definir arreglos en 2 lineas
       String[] apellidos;
       apellidos = new String[5];
       //definir arreglos en 1 linea
       String [] nombre = new String[5];
       //asignar valor a los arreglos
       apellidos[0]="Cordova";
       apellidos[1]="Ramires";
       apellidos[2]="Leon";
       apellidos[3]="Peres";
       apellidos[4]="Sanchez";
       //definir arreglos con valor por defecto
    
       String[] departamentos ={"lima","piura","puno","cuzco","Loreto"};
       System.out.print("tamaño de arreglo departamentos:"+departamentos.length);
       System.out.print("tamaño de arreglo apellidos:"+apellidos.length);
     
       
       departamentos[0] ="arequipa"; //modificar de lima a arequipa
       //obtener el valor del indice 1
       System.out.println("valor Departamento indice 1= " +departamentos[1]);
       //recorrer arreglos valor por valor
       for (int i = 0; 1<departamentos.length;i++){
           System.out.println("el valor en la posicion"+1+"=>"+departamentos[1]);
           
       }
       
       double []notas ={11.5,15,18,11,13};
              
    double notaMayor = 0;
    for (int i=0;1<notas.length;i++){
        if(notas[i] > notaMayor)
            notaMayor = notas[1];
        
        
    }
       
            System.out.println("la nota mayor es ="+ notaMayor);
      
    }
    
}
