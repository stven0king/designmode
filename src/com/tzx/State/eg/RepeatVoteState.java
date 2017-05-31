package com.tzx.State.eg;

/**
 * Created by tanzhenxing on 17-5-31.
 */
public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("请不要重复投票");
    }
}
