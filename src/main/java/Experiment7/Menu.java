package Experiment7;

import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItemArrayList = new ArrayList<MenuItem>();

    public void addMenuItem(MenuItem menuItem){
        this.menuItemArrayList.add(menuItem);
    }

    public MenuItem getMenuItem(String itemName){
        for(int i = 0;i<menuItemArrayList.size();i++){
            if(menuItemArrayList.get(i).getItemName().equals(itemName)){
                return menuItemArrayList.get(i);
            }
        }
        return null;
    }
}
