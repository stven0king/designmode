package com.tzx.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanzhenxing on 17-9-5.
 */
public class JiSuanJi implements Handler {
    private Handler han;
    private List<Integer> list;
    public JiSuanJi(){
        list=new ArrayList<Integer>();
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
    }
    @Override
    public void Search(int id) {
        if(list.contains(id)){
            System.out.println("恭喜你，此书记在计算机类");
        }else{
            if(han!=null){
                han.Search(id);
            }
        }
    }

    @Override
    public void setNexHandler(Handler handler) {
        this.han = handler;
    }
}
