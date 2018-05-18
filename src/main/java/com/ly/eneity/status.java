package com.ly.eneity;
import java.lang.Enum;

public enum status implements enumfunction{

    SUCCESS("成功","1"),FAIL("失败","2");

    private String name;
    private String code;


    status(String name, String code) {
        this.name = name;
        this.code = code;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    @Override
    public String toString() {
        status.values();
        return code+"---"+name;
    }

    //通过code来找一个status 如果存在则返回 具体的status ，否则返回null
    public static status judgeStatus(String code){
        status s = null;

        for (status stat:status.values()){
            if (stat.getName().equals(code)){
                s = stat;
                break;
            }
        }

        return s;
    }

    @Override
    public void add() {

    }

    public static boolean update(String name,String newname){
        status s;
        if ((s =judgeStatus(name))!=null){
            s.setName(newname);
            return  true;
        }

        return false;
    }
}
