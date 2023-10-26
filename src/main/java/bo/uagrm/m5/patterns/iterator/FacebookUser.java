package bo.uagrm.m5.patterns.iterator;

public class FacebookUser {

    private String fbName;
    private String fbUrl;

    public FacebookUser(String fbName, String fbUrl) {
        this.fbName = fbName;
        this.fbUrl = fbUrl;
    }

    public String getFbName() {
        return fbName;
    }

    public void setFbName(String fbName) {
        this.fbName = fbName;
    }

    public String getFbUrl() {
        return fbUrl;
    }

    public void setFbUrl(String fbUrl) {
        this.fbUrl = fbUrl;
    }

}
