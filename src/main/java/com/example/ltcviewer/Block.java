package com.example.ltcviewer;

public class Block extends Status {

    BlockData data;

    public Block() {
        super();
    }

    public BlockData getData() {
        return data;
    }

    public void setData(BlockData data) {
        this.data = data;
    }
}
