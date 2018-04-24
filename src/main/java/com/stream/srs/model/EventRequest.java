package com.stream.srs.model;

import java.io.Serializable;

public class EventRequest implements Serializable{
    private static final long serialVersionUID = 6133547843421390137L;


//    {
//      "action": "on_publish",
//      "client_id": 1985,
//      "ip": "192.168.1.10",
//      "vhost": "video.test.com",
//      "app": "live",
//      "stream": "livestream"
//     }


    private String action;
    private int clientId;
    private String ip;
    private String vhost;
    private String app;
    private String stream;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getVhost() {
        return vhost;
    }

    public void setVhost(String vhost) {
        this.vhost = vhost;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }
}
