package tv.nosy.cli.models.utilities;

public class LoginInfo {
    private String uname;
    private String pass;

    public LoginInfo(){
        
    }

    public LoginInfo(String uname, String pass) {
        this.uname = uname;
        this.pass = pass;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
