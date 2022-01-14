package com.example.ltcviewer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NetworkInfoData {

    @JsonProperty("blocks")
    Integer blocks;

    public NetworkInfoData() {
    }

    public Integer getBlocks() {
        return blocks;
    }

    public void setBlocks(Integer blocks) {
        this.blocks = blocks;
    }
}
