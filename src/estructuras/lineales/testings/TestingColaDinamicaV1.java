/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.lineales.testings;

import estructuras.lineales.dinamicas.Cola;

/**
 *
 * @author Dantesito
 */
public class TestingColaDinamicaV1 {

    public static void main(String[] args) {
        Cola n1 = new Cola();
        Cola n2 = new Cola();
        Cola n3 = new Cola();
        Cola n4 = new Cola();
        System.out.println("Apilar 1 "+n1.poner(1));
        System.out.println("Apilar 2 "+n1.poner(2));
        System.out.println("Apilar 3 "+n1.poner(3));
        System.out.println("Cola n1 es vacia?"+n1.esVacia());
        System.out.println("Probar Clone ");
        n2=n1.clone();
        System.out.println(n1.toString());
        System.out.println("Sacar "+n1.sacar());
        System.out.println(n1.toString());
        System.out.println("Sacar "+n1.sacar());
        System.out.println(n1.toString());
        System.out.println("Sacar "+n1.sacar());
        System.out.println(n1.obtenerFrente());
        System.out.println("Sacar "+n1.sacar());
        System.out.println("Probar Cola n1 "+n1.toString());
        System.out.println("Cola n1 es vacia? "+n1.esVacia());
        System.out.println("Probar Cola n2 "+n2.toString());
        System.out.println("Vaciar cola n2 ");
        n2.vaciar();
        System.out.println("Cola n2 es vacia?"+n2.esVacia());
        System.out.println("Cola n2 tiene elementos? "+n2.toString());
        
    }

}
