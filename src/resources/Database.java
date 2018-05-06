/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author student
 */
class SortByCardID implements Comparator<CatalogCard>
{
    // Used for sorting in ascending order of
    // roll number
    @Override
    public int compare(CatalogCard a, CatalogCard b)
    {
        return a.getCardId() - b.getCardId();
    }
}

class SortByYearPublished implements Comparator<CatalogCard>
{
    // Used for sorting in ascending order of
    // roll number
    @Override
    public int compare(CatalogCard a, CatalogCard b)
    {
        return a.getYearPublished() - b.getYearPublished();
    }
}

class SortByDateAdded implements Comparator<CatalogCard>
{
    // Used for sorting in ascending order of
    // roll number
    @Override
    public int compare(CatalogCard a, CatalogCard b)
    {
        return a.getDateAdded().compareTo(b.getDateAdded());
    }
}

public class Database {
    private static int id = 0;
    private static ArrayList<CatalogCard> active = new ArrayList<CatalogCard>();
    private static ArrayList<CatalogCard> archive = new ArrayList<CatalogCard>();
    
    public static int assignId(){
        return id++;
    }
    
    public static void addToActiveCards(CatalogCard card){
        
        active.add(card);
        Collections.sort(active, new SortByCardID());
    }
    
    public static void addToArchivedCards(CatalogCard card){
        archive.add(card);
        Collections.sort(archive, new SortByCardID());
    }
    
    public static boolean removeFromActiveCardsWhereIdIs(int id){
        int i=0;
        for(; i < active.size(); i++){
            if(active.get(i).getCardId() == id){
                break;
            }
        }
        if(i != active.size()){
            CatalogCard card = active.get(i);
            addToArchivedCards(card);
            active.remove(card);
            return true;
        }else{
            return false;
        }
    }
    
    public static CatalogCard getFromActiveCardsWhereIdIs(int id){
        int i=0;
        for(; i < active.size(); i++){
            if(active.get(i).getCardId() == id){
                break;
            }
        }
        if(i != active.size()){
            return active.get(id);
        }else{
            return null;
        }
    }
    
    public static CatalogCard getFromArchivedCardsWhereIdIs(int id){
        int i=0;
        for(; i < archive.size(); i++){
            if(archive.get(i).getCardId() == id){
                break;
            }
        }
        if(i != archive.size()){
            return archive.get(id);
        }else{
            return null;
        }
    }
    
    public static ArrayList<CatalogCard> getActiveCardsCardIdSorted(){
        return Database.active;
    }
    
    public static ArrayList<CatalogCard> getArchivedCardsCardIdSorted(){
        return Database.archive;
    }
    
    public static ArrayList<CatalogCard> getActiveCardsYearPublishedSorted(){
        Collections.sort(active, new SortByYearPublished());
        return Database.active;
    }
    
    public static ArrayList<CatalogCard> getArchivedCardsYearPublishedSorted(){
        Collections.sort(archive, new SortByYearPublished());
        return Database.archive;
    }
    
    public static ArrayList<CatalogCard> getActiveCardsDateAddedSorted(){
        Collections.sort(active, new SortByDateAdded());
        return Database.active;
    }
    
    public static ArrayList<CatalogCard> getArchiveCardsDateAddedSorted(){
        Collections.sort(archive, new SortByDateAdded());
        return Database.archive;
    }
    
    public static boolean editActiveCardWhereIdIs(CatalogCard newCard){
        int i=0;
        for(; i < active.size(); i++){
            if(active.get(i).getCardId() == newCard.getCardId()){
                break;
            }
        }
        if(i != active.size()){
            active.set(id, newCard);
            return true;
        }else{
            return false;
        }
    }
    
}
