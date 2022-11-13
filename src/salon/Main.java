
package salon;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        int opcion,indice;
       ///ALUMNO
       int codigo;
       String nombre;
       //Notas
       int nota1,nota2,nota3;
       
        Alumno alumno[]=new Alumno[100];
        int contadorA=0;
        Notas nota[]=new Notas[100];
        int contadorN=0;
        
        do {
            System.out.println("\tBienvenido al Menu");
            System.out.println("1-Agregar Alumno");
            System.out.println("2-Modificar nota de un alumno");
            System.out.println("3-Mostrar los alumnos y notas ");
            System.out.println("4-Salir:");
            System.out.print("Ingrese la opcion: ");
            opcion=entrada.nextInt();
            System.out.println("");
            
            switch(opcion){
                
                case 1://Agregar alumno
                    System.out.println("\tIngrese los datos del alumno");
                    System.out.print("Ingrese el codigo del Alumno: ");
                    codigo=entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Ingrese el nombre del alumno: ");
                    nombre=entrada.nextLine();
                    System.out.print("Ingrese la nota1: ");
                    nota1=entrada.nextInt();
                    System.out.print("Ingrese la nota2: ");
                    nota2=entrada.nextInt();
                    System.out.print("Ingrese la nota3: ");
                    nota3=entrada.nextInt();
                    nota[contadorN]=new Notas(codigo, nota1, nota2, nota3);
                    
                    
                    alumno[contadorA]=new Alumno(codigo, nombre, nota[contadorN]);
                    contadorA++;
                    contadorN++;
                    
                    
                    break;
                    
                case 2://Modificar notas de un alumno: 
                    System.out.println("");
                       System.out.print("Ingrese el codigo del alumno: ");
                       codigo=entrada.nextInt();
                       indice=buscarAl(alumno,codigo,contadorA);
                       if (indice==-1) {
                           System.out.println("El codigo ingresado no existe ");  
                       }
                       else{
                           System.out.println("");
                           System.out.print("Ingrese la nota1: ");
                           nota1=entrada.nextInt();
                           System.out.print("Ingrese la nota2: ");
                           nota2=entrada.nextInt();
                           System.out.print("Ingrese la nota3: ");
                           nota3=entrada.nextInt();
                           alumno[indice].modificarNotas(nota1, nota2, nota3);
                           alumno[indice].datosYnotas();
                       }
                 break;
                 
                case 3://Mostar alumnos y sus notas 
                    
                    for (int i = 0; i <contadorA; i++) {
                       alumno[i].datosYnotas();
                    }
                    
                 break;
                 
                case 4: System.out.println("Gracias por usar el programa");
                    
                break;
                default :System.out.println("opcion incorrrecta");
                break;
            }
            
            
        } while (opcion!=4);
        
    }
    
   
    public static int buscarAl(Alumno al[],int cod,int cont){
           
          int indice=-1;
          
          for (int i = 0; i <cont; i++) {
              if (al[i].getCodigo()==cod) {
                  indice=i;
              }
        }
        
       return indice;
          
          
    }
}
