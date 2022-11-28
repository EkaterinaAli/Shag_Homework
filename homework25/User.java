package homework25;

import java.util.Objects;

public class User {

    private int password;
    private String userName;

    public User (){}
    public User (int password){this.password = password;}
    public User (String userName){this.userName = userName;}
    public User (String userName, int password){
        this.userName = userName;
        this.password = password;}

    public String toString (){return "Login " + userName + " " + "password  " + password +"\n";}
    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getPassword() == user.getPassword() && Objects.equals(getUserName(), user.getUserName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getPassword(), getUserName());
    }
}
