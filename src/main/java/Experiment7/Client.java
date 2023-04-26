package Experiment7;

public class Client {
    public static void main(String[] args){
        Command createCommand,openCommand,editeCommand;
        MenuItem menuItemA,menuItemB,menuItemC;
        BoardScrean boardScrean =  new BoardScrean();
        Menu menu = new Menu();

        createCommand = new CreateCommand(boardScrean);
        editeCommand = new EditeCommand(boardScrean);
        openCommand = new OpenCommand(boardScrean);

        menuItemA = new MenuItem("创建",createCommand);
        menuItemB = new MenuItem("打开",openCommand);
        menuItemC = new MenuItem("编辑",editeCommand);

        menu.addMenuItem(menuItemA);
        menu.addMenuItem(menuItemB);
        menu.addMenuItem(menuItemC);

        menu.getMenuItem("创建").click();
        menu.getMenuItem("打开").click();
        menu.getMenuItem("编辑").click();

    }
}
