package com.example.ltcviewer;

public class NetworkInfo extends Status {

    NetworkInfoData data;

    public NetworkInfo() {
        super();
    }

    public NetworkInfoData getData() {
        return data;
    }

    public void setData(NetworkInfoData data) {
        this.data = data;
    }
}
