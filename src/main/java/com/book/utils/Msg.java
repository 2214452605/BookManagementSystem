package com.book.utils;

import java.util.HashMap;
import java.util.Map;

public class Msg {
    //状态码  1--成功   0--失败
    private Integer code;
    //提示信息
    private String msg;
    //用户返回给浏览器的数据
    private Map<String,Object> map=new HashMap<>();

    public  static Msg success(){
        Msg result=new Msg();
        result.setCode(1);
        result.setMsg("处理成功!");
        return result;
    }

    public  static Msg fail(){
        Msg result=new Msg();
        result.setCode(0);
        result.setMsg("处理失败!");
        return result;
    }

    public  Msg add(String key,Object value){
        this.getMap().put(key,value);
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", map=" + map +
                '}';
    }
}
