package Experiment6;

import java.util.ArrayList;
import java.util.List;

public class AccessValidator {
    private List<String> userList = new ArrayList<String>(){{add("userId01");add("userId02");}};

    public boolean validate(String userId){

        return userList.contains(userId) ;
    }
}
