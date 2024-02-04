package com.codingninja.practise.leetcode.solutions.array;

import java.util.ArrayList;
import java.util.List;  
//Packing interface for tablets
interface Packing {  
            public String pack();  
            public int price();  
}  
//Tablet class - abstract
abstract class Tablet implements Packing{  
public abstract String pack();  
}

class ManaClass extends  Tablet{

    @Override
    public String pack() {
        return null;
    }

    @Override
    public int price() {
        return 0;
    }
}
 
//company - extends Tablet
abstract class Company extends Tablet{  
   public abstract int price();  
} 
//Lenovo tablet
class Lenovo extends Company{ 
    @Override 
        public int price(){   
                        return 541;  
      }  
    @Override 
    public String pack(){  
             return "Lenovo Yoga";  
        }         
}
//Micromax tablet
class MicroMax extends Company {  
    @Override 
        public int price(){   
                        return 338;  
    }  
    @Override 
    public String pack(){  
             return "MicroMax";  
        }         
}
 //Tablet type
class TabType {  
             private List<Packing> items=new ArrayList<Packing>();
             //add items
             public void addItem(Packing packs) {    
                    items.add(packs);  
             }  
         //retrieve cost
             public void getCost(){  
              for (Packing packs : items) {  
                        packs.price();  
              }   
             }  
             //show all items
             public void showItems(){  
              for (Packing packing : items){  
             System.out.print("Tablet name : "+packing.pack());  
             System.out.println(", Price(in U.S.Dollars) : "+packing.price());  
          }       
            }     
}
//builder class for tablets order
class TabBuilder {  
                  public TabType buildLenovoTab(){   
                     TabType lenovo =new TabType();  
                     lenovo.addItem(new Lenovo());  
                     return lenovo;  
              }  
              public TabType buildMicroMaxTab(){  
             TabType mmx=new TabType();  
             mmx.addItem(new MicroMax());  
             return mmx;  
              }  
}
public class Main{  
 public static void main(String args[]){  
   //build the tablets order and display the order
   TabBuilder tabBuilder=new TabBuilder();  
   TabType tabtype1=tabBuilder.buildLenovoTab();  
   tabtype1.showItems();  
   
   TabType tabtype2=tabBuilder.buildMicroMaxTab();  
   tabtype2.showItems();  
 }  
}