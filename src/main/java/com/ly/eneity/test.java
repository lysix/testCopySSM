package com.ly.eneity;

public class test {

    public static void main(String[] args) {

        status[] statuses = status.values();

        for (status s : statuses){
            System.out.println(s.toString());

        }

        status.update("成功","success");
        status.update("失败","fail");

        status[] statusess = status.values();
        for (status s : statuses){
            System.out.println(s.toString());
        }

       /* status s = status.judgeStatus("成功");
        if (s!=null){
            System.out.println(s.toString());
        }else if (s==null){
            System.out.println("error");
        }*/
    }
}
