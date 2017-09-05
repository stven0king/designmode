package com.tzx.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanzhenxing on 17-9-5.
 * 文学类
 */
public class WenXue implements Handler{
    //下一个处理者
    private Handler handler;
    //书籍编号内容
    private List<Integer> list;

    public WenXue() {
        list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

    }

    @Override
    public void Search(int id) {
        if (list.contains(id)) {
            //检索list中是否存在此ID的书籍，如果存在则打印
            System.out.println("恭喜您，您检索的书籍是文学类的");
        } else {
            //如果没有此书籍则交给下一个处理者进行处理
            if (handler != null) {
                handler.Search(id);
            }
        }
    }

    @Override
    public void setNexHandler(Handler handler) {

    }
}
