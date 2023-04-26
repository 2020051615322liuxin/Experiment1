package Experiment3;

public class Multiton {
    private static final int Max_Instance = 2;
    private static int instanceCount = 0;
    private static Multiton[] instanceS = new Multiton[Max_Instance];

    private Multiton(){}

    public static synchronized Multiton getInstance(){
        if(instanceCount<Max_Instance){
            if(instanceS[instanceCount] == null){
                instanceS[instanceCount] = new Multiton();
                System.out.println("创建了一个新的实例: "+instanceS[instanceCount]);
            }
            return instanceS[instanceCount++];
        }else {
            System.out.println("设置的最大实例上限为："+Max_Instance+"   已达到设置的最大实例上限");
            return null;
        }
    }

}
