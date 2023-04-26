package Experiment6;

import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Searcher proxySearcher = new ProxySearcher();

        System.out.println("请输入用户Id");
        String userId  = scanner.next();
        System.out.println("请输入查询关键字");
        String keyword = scanner.next();

        proxySearcher.doSearcher(userId,keyword);
    }
}
