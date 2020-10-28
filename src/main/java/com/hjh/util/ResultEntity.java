package com.hjh.util;/*
 *
 *   @date 2020/10/28 11:23
 *
 */

public class ResultEntity<T> {
    private static final String SUCCESS = "SUCCESS";
    private static final String FAILED = "FAILED";

    private String result;//当前请求处理的结果失败还是成功

    private String message;//处理失败时返回的错误消息

    private T data;//要返回的数据

    /**
     * 请求处理成功且不需要返回数据时使用的方法
     * @param <Type>
     * @return
     */
    public static <Type> ResultEntity<Type> successWithoutData(){
        return  new ResultEntity<Type>(SUCCESS,null,null);
    }

    /**
     * 请求处理成功且需要返回数据时使用的方法
     * @param data 要返回的数据
     * @param <Type>
     * @return
     */
    public static <Type> ResultEntity<Type> successWithData(Type data){
        return  new ResultEntity<Type>(SUCCESS,null,data);
    }

    /**
     * 请求处理失败
     * @param message 失败的错误消息
     * @param <Type>
     * @return
     */
    public static <Type> ResultEntity<Type> failed(String message){
        return  new ResultEntity<Type>(FAILED,message,null);
    }

    public ResultEntity() {
    }

    public ResultEntity(String result, String message, T data) {
        this.result = result;
        this.message = message;
        this.data = data;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
