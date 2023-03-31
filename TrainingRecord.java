// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;


import java.util.*;


public class TrainingRecord {
    private List<Entry> tr;
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } //constructor
    
    // add a record to the list
   public void addEntry(Entry e){
       
       if (tr.contains(e)) {
           System.out.println("Duplicate Entry");
       }
       else {
           tr.add(e);
       }
            
   } 
// addClass
   
   // look up the entry of a given day and month
   public String lookupEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "No entries found";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
             result = current.getEntry();
            }
       return result;
   } // lookupEntry
   
   public String findAllByDate (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "";
       while (iter.hasNext()) {
           Entry current = iter.next();
           if (current.getDay()==d && current.getMonth()==m && current.getYear()==y)
               result = result + current.getEntry();
       }
       if (result == "") { result = "No entries found"; }
       return result;
   }
   
   // Count the number of entries
   public int getNumberOfEntries(){
       return tr.size();
   }
   // Clear all entries
   public void clearAllEntries(){
       tr.clear();
   }
   // below added
   public String lookupEntries(int d, int m, int y) {
	// TODO Auto-generated method stub
        List<String> Entries = new ArrayList<>();
   ListIterator<Entry> iter = tr.listIterator();
   while (iter.hasNext()) {
      Entry current = iter.next();
      if (current.getDay() == d && current.getMonth() == m && current.getYear() == y) {
         Entries.add(current.getEntry());
      }
   }
   if (Entries.isEmpty()) {
      return "No Entries Detected";
   } else {
      return String.join("\n", Entries);
   }
   }
   public void removeEntry(String n, int d, int m, int y) {
        ListIterator<Entry> ITR = tr.listIterator();
        boolean removed = false;
        while (ITR.hasNext()) {
            Entry current = ITR.next();
            if (current.getName().equals(n) && current.getDay() == d && current.getMonth() == m && current.getYear() == y)
            {
                ITR.remove();
                System.out.println("Entry-Removed");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Entry-Not-Found");
        }
   }   



import java.util.*;


public class TrainingRecord {
    private List<Entry> tr;
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } //constructor
    
    // add a record to the list
   public void addEntry(Entry e){
       tr.add(e);    
   } // addClass
   
   // look up the entry of a given day and month
   public String lookupEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "No entries found";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
             result = current.getEntry();
            }
       return result;
   } // lookupEntry
   
   // Count the number of entries
   public int getNumberOfEntries(){
       return tr.size();
   }
   // Clear all entries
   public void clearAllEntries(){
       tr.clear();
   }
   
} // TrainingRecord