package Experiment6;

public class RealSearcher extends Searcher{
    @Override
    public String doSearcher(String userId,String keyword){
        String searcherMessage = "用户：     "+userId+" 查询 "+keyword+ "的相关信息";
        System.out.println(searcherMessage);
        return searcherMessage;
    }
}
