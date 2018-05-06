/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogapp;

import java.util.ArrayList;
import java.util.Date;
import resources.CatalogCard;
import resources.Database;
/**
 *
 * @author student
 */
public class CatalogApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String title = "Java Programming for Dummies";
        String author = "Ethan Ray Mosqueda";
        int year = 2018;
        Date added = new Date();
        CatalogCard cat = new CatalogCard(Database.assignId(), title, author,
            year, added, added);
        Database.addToActiveCards(cat);
        
        title = "Python For Fun";
        author = "Josie Rizal";
        year = 2008;
        added = new Date();
        cat = new CatalogCard(Database.assignId(), title, author,
            year, added, added);
        Database.addToActiveCards(cat);
        
        title = "Django Bongos";
        author = "Josie Rizal";
        year = 2018;
        added = new Date();
        cat = new CatalogCard(Database.assignId(), title, author,
            year, added, added);
        Database.addToActiveCards(cat);
        
        ArrayList<CatalogCard> active = Database.getActiveCardsYearPublishedSorted();
        ArrayList<Integer> years = new ArrayList<>();
        for(int i=0; i < active.size(); i++){
            int yr = active.get(i).getYearPublished();
            if(!years.contains(yr)){
                years.add(yr);
            }
        }
        
        for(int i=0; i < years.size(); i++){
            System.out.println(years.get(i));
            for(int j=0; j < active.size(); j++){
            int yr = active.get(j).getYearPublished();
                if(yr == years.get(i)){
                    System.out.print(active.get(j).getCardId() + ". ");
                    System.out.println(active.get(j).getBookTitle());
                }
            }
        }
        
        boolean result = Database.removeFromActiveCardsWhereIdIs(1);
        if(result == true){
            System.out.println("\n\nRemoved Python For Fun.\n\n");
            System.out.println("Showing you the Active Catalog Cards:");
            active = Database.getActiveCardsCardIdSorted();
            for(int i=0; i < active.size(); i++){
                System.out.print(active.get(i).getCardId() + ". ");
                System.out.println(active.get(i).getBookTitle());
            }
            System.out.println("Showing you the Archives:");
            ArrayList<CatalogCard> archive = Database.getArchivedCardsYearPublishedSorted();
            for(int i=0; i < archive.size(); i++){
                System.out.print(archive.get(i).getCardId() + ". ");
                System.out.println(archive.get(i).getBookTitle());
            }
        }else{
            System.out.println("Card was not found active");
        }
        
//        CatalogCard cat2 = new CatalogCard(Database.assignId(), title, author,
//            year, added, added);
//        Database.addToActiveCards(cat2);
        
    }
    
}
