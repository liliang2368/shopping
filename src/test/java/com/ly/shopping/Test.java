package com.ly.shopping;

public class Test {
    public static void main(String[] args) {
        String sql="@table/main.sql@seq/main.sql";
        String [] str=sql.split("@");
        for(String i :str){
                System.out.println(i.split("/")[0]);
        }

    }
}
