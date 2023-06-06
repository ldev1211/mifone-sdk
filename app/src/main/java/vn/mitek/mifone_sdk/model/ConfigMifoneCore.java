package vn.mitek.mifone_sdk.model;

public class ConfigMifoneCore {
    private long expire;
    private String accessToken;
    private String secret;
    com.example.mifonelibproj.model.other.ConfigMifoneCore configMifoneCore;

    public ConfigMifoneCore(long expire, String accessToken, String secret) {
        this.expire = expire;
        this.accessToken = accessToken;
        this.secret = secret;
        configMifoneCore = new com.example.mifonelibproj.model.other.ConfigMifoneCore(expire,accessToken,secret);
    }

    public long getExpire() {
        return expire;
    }

    public com.example.mifonelibproj.model.other.ConfigMifoneCore getConfigMifoneCore() {
        return configMifoneCore;
    }

    public void setConfigMifoneCore(com.example.mifonelibproj.model.other.ConfigMifoneCore configMifoneCore) {
        this.configMifoneCore = configMifoneCore;
    }

    public void setExpire(long expire) {
        this.expire = expire;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
