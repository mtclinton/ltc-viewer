package com.example.ltcviewer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BlockData {

    @JsonProperty("block_no")
    Integer blockNumber;

    @JsonProperty("blockhash")
    String blockhash;

    @JsonProperty("mining_difficulty")
    Double miningDifficulty;

    @JsonProperty("confirmations")
    Integer confirmations;

    public BlockData() {
    }

    public Integer getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(Integer blockNumber) {
        this.blockNumber = blockNumber;
    }

    public String getBlockhash() {
        return blockhash;
    }

    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
    }

    public Double getMiningDifficulty() {
        return miningDifficulty;
    }

    public void setMiningDifficulty(Double miningDifficulty) {
        this.miningDifficulty = miningDifficulty;
    }

    public Integer getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(Integer confirmations) {
        this.confirmations = confirmations;
    }
}
