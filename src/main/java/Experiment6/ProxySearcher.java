package Experiment6;

public class ProxySearcher extends Searcher{
    private RealSearcher realSearcher = new RealSearcher();
    private AccessValidator validator = new AccessValidator();
    private Logger logger = new Logger();

    @Override
    public String doSearcher(String userId, String keyword) {
        if(validate(userId)){
            log(userId);
            return realSearcher.doSearcher(userId,keyword);
        }
        String errorMessage = "用户身份验证失败";
        System.out.println(errorMessage);
        return errorMessage;
    }

    public boolean validate(String userId){
        return validator.validate(userId);
    }

    public void log(String userId){
        logger.log(userId);
    }

}
