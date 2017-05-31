package com.tzx.State.eg;

/**
 * Created by tanzhenxing on 17-5-31.
 */
public class BlackVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("进去黑名单，将静止登陆和使用本系统");
    }
}
