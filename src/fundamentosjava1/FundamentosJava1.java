/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosjava1;

/**
 *
 * @author frett
 */
public class FundamentosJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear 3 variables una para la edad, el nombre y el salario
        System.out.println("VARIABLES");
        int edad;
        String nombre = "Nico";
        double salario = 200;
        
        edad = 38;
        //mostrar por pantalla Soy <nombre> tengo <edad> y mi sueldo es de <salario>
        System.out.println(" Soy " + nombre + " tengo " + edad + " años y mi sueldo es de " + salario);
       
        //seguidos
        System.out.println("nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        
        System.out.println("----------------------------");
        
        System.out.println(" ESTRUCTURA DE CONTROL - CONDICIONALES");
        
        edad = 38;
        if (edad >=18) {
            System.out.println("Es mayor de 18");
        }
        if(edad >=38){
            System.out.println("No esta en el rango de edad");
        }
        else {
            System.out.println("Es menor de 18");
        }
         
        System.out.println("BUCLE FOR");
        //el bucle FOR se utiliza cuando ya sabemos de antemano cuantas veces 
        //queremos que se ejecute un bloque de codigos
        /*
        fot (inicializacion; condicion; actualizacion)
         BLOQUE DE CODIGO
        }
        */
      for (int i = 0; i < 10; i++)  {
          System.out.println("Numero: " + i);
      }
     //crear un bucle  que inicie en 1 y me muestre hasta el numero 5
     for (int i = 1; i <= 5; i++)
            System.out.println("Numero: " + i);
     
    //Estudiar estructura de un arreglo, como acceder, como agregar y borrar en JAVA 
        System.out.println("---------------------");
        int [] numeros = {1,2,3,4,5};
        for (int j = 0; j <numeros.length; j++) {
            System.out.println("Elemento " + j +": " + numeros [j]);
    }  
        System.out.println("---------------");
        System.out.println("BUCLE WHILE");
        /* El bucle while se utiliza cuando no sabemos de antemano cuantas veces 
        debe ejecutarse el bloque de codigo; depende de una condicion para detenerse
    */
    /*
        while(condicion) {
        BLOQUE DE CODIGO
        }
        */
        int contador = 1;
        while(contador <= 5) {
            System.out.println("Numero: " + contador);
            contador++;
        }
            
        }
}
