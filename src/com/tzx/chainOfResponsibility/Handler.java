package com.tzx.chainOfResponsibility;

/**
 * Created by tanzhenxing on 17-9-5.
 * 处理接口
 */
public interface Handler {
    //根据书的ID进行检索
    public abstract void Search(int id);
    //下一个处理者
    public abstract void setNexHandler(Handler handler);
}
