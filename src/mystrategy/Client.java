/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystrategy;

import data.DataGenerator;
import java.util.Scanner;
import sort.methods.Bubblesort;
import sort.methods.Insertionsort;
import sort.methods.Quicksort;
import sort.methods.Selectionsort;
import sort.strategy.Context;
import sort.strategy.ISortStrategy;

/**
 *
 * @author LeopardProMK
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Algorytmy sortowania */
        // http://www.algorytm.org/algorytmy-sortowania/
        
        double[] Nieposortowane = DataGenerator.generate(100000);
       // double[] Nieposortowane = {1,6,8,9,3,4,2};
       /* Wzorzec Stratega */
        //...
        Context bubble = new Context(new Bubblesort());
        long bstart = System.currentTimeMillis();
	double[] tab = bubble.ContextSortuj(Nieposortowane);
	long bstop = System.currentTimeMillis();
	System.out.println("Bubblesort: " + (bstart - bstop) + " ms");
        //for (int i = 0; i < tab.length; i++) {
        //    System.out.print(tab[i]+" ");
        //}
         System.out.println();
        System.out.println("------------------------------");
        
//        
        Context insert = new Context(new Insertionsort());
        long istart = System.currentTimeMillis();
	double[] tab2 = insert.ContextSortuj(Nieposortowane);
	long istop = System.currentTimeMillis();
	System.out.println("Insertsort: " + (istart - istop) + " ms");
        //for (int i = 0; i < tab2.length; i++) {
         //   System.out.print(tab2[i]+" ");
        //}
         System.out.println();
        System.out.println("------------------------------");
//        


          Context quick = new Context(new Quicksort());
        long qstart = System.currentTimeMillis();
	double[] tab3 = quick.ContextSortuj(Nieposortowane);
	long qstop = System.currentTimeMillis();
	System.out.println("Quicksort: " + (qstart - qstop) + " ms");
        //for (int i = 0; i < tab3.length; i++) {
         //   System.out.print(tab3[i]+" ");
        //}
         System.out.println();
        System.out.println("------------------------------");

        
           Context selection = new Context(new Selectionsort());
        long sstart = System.currentTimeMillis();
	double[] tab4 = selection.ContextSortuj(Nieposortowane);
	long sstop = System.currentTimeMillis();
	System.out.println("Selectionsort: " + (sstart - sstop) + " ms");
        //for (int i = 0; i < tab4.length; i++) {
         //   System.out.print(tab4[i]+" ");
        //}
         System.out.println();
        System.out.println("------------------------------");
//       

//Pytania:
/*//1.	Proszę o podanie głównego celu zastosowania wzorca strategii.*/
//Wzorzec pozwala na rozszerzanie funkcjonalności aplikacji poprzez możliwość 
//zmiany realizacji algorytmu poprzez obiekty klasy. Program powinien zachowywać 
//się w zależności od sytuacji. Pozwala to na unikanie nadmiernego stosowanie 
//np. „ifów”. 

/*//2.	Czy istnieje możliwość zmiany algorytmu w czasie działania programu?*/
//Tak, umożliwia modyfikację. W przypadku stworzenia aplikacji jest możliwe 
//stworzenie programu tak, aby było możliwe wybranie jakiego sortowania używamy, 
//czyli jaką implementacje sortowania użyjemy. Możemy wybierać dzięki klasie 
//Context. Klasa Context zależnie od zastanego warunku, inicjalizuje jedną z 
//klas strategii. 

/*//3.	 W jaki sposób wzorzec enkapsuluje poszczególne algorytmy?*/
//Enkapsulacja jest zastosowana poprzez implementacje interfejsu ISortStrategy. 
//Wyodrębnienie interfejsu, powoduje, że ukrywamy przed użytkownikiem kod klas 
//wewnętrznych

/*//4.	Kiedy stosować wzorzec strategii?*/
//Używamy strategii wtedy, kiedy w kodzie wybieramy sposób wykonania jakiegoś 
//algorytmu. Kiedy w zależności od danych/kontekstu wykorzystać odpowiedni 
//proces z puli algorytmów (połączonych poprzez interfejs)
//
//       
    }
}
