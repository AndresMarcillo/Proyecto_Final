/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amarcillo.controlador;

import com.amarcillo.vista.BookInter;
import com.amarcillo.vista.MagazineInter;
import com.amarcillo.vista.MovieInter;
import com.amarcillo.vista.SeriesInter;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import sun.tools.jar.resources.jar;

/**
 *
 * @author Andres
 */
public class Coordinador {
    BookInter bookInter = new BookInter(this);
    MagazineInter magazineInter = new MagazineInter(this);
    MovieInter movieInter = new MovieInter(this);
    SeriesInter serieInter = new SeriesInter(this);
    
    public void showMenu(){
        int response;
        do { 
            // leer la respuesta del ususario
            response=Integer.parseInt(JOptionPane.showInputDialog("Bienvenidos a Netflix viewer"
                               +"Selecciona una opcion: \n"
                               +"1.- Books \n"
                               +"2.- Magazine \n"
                               +"3.- Movies \n"
                               +"4.- Series \n"
                               +"\n ---------------------\n"
                               +"5.- Report \n"
                               +"6.- Report today \n"
                               +"0.- Exit"));
            switch(response){
                case 0:
                    //salir
                    break;
                case 1:
                    showBooks();
                    break;
                case 2: 
                    showMagazine();
                    break;
                case 3:
                    showMovies();
                    break;
                case 4: 
                    showSeries();
                    break;
                case 5: 
                    makeReport();
                    break;        
                case 6: 
//                    Date date = new Date();
                    makeReport(new Date());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, ".....¡Selecciona una opcion......!");
                    break; 
            }
        } while (response !=0);
    }
    
    private void showMovies(){
//        int exit =0;
//        do { 
//            System.out.println("");
//            System.out.println("::MOVIES ::");
//            System.out.println("");
//            
//        } while (exit !=0);
        movieInter.setVisible(true);
    }
    
    private void showSeries(){
//        int exit =0;
//        do { 
//            System.out.println("");
//            System.out.println("::SERIES ::");
//            System.out.println("");        
//        } while (exit !=0);
        serieInter.setVisible(true);
    }
    
    private static void showChapter(){
        int exit =0;
        do { 
            System.out.println("");
            System.out.println("::CHAPTER ::");
            System.out.println("");
        } while (exit !=0);
    }
    
    private void showBooks(){
//            System.out.println("");
//            System.out.println("::BOOKS ::");
//            System.out.println("");
        bookInter.setVisible(true);
    }
    
    private void showMagazine(){
//        int exit =0;
//        do { 
//            System.out.println("");
//            System.out.println("::MAGAZINE ::");
//            System.out.println("");
//        } while (exit !=0);
        magazineInter.setVisible(true);
    }
    
    private static void makeReport(){
        
    }
    
    private static void makeReport(Date date){
            
    }
}
