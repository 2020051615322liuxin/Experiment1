package Experiment7;

public class MenuItem {

    private Command command;
    private String itemName;

    public MenuItem(String itemName,Command command){
        this.itemName=itemName;
        this.command=command;
    }

    public void click(){
        System.out.println("MenuItem中的【"+itemName+"】执行");
        command.excute();
    }

    public Command getCommand(){
        return command;
    }

    public void setCommand(Command command){
        this.command=command;
    }

    public String getItemName(){
        return itemName;
    }

    public void setItemName(String itemName){
        this.itemName=itemName;
    }
}
