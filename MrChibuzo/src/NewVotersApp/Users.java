package NewVotersApp;

public class Users{
    private int userId;
    private String name;
    private String password;

    public Users(int userId, String name, String password) {
        this.userId = userId;
        this.name = name;
        this.password = password;
    }
    public int getUserId(){
       return userId;
    }
    public String getName(){
       return name;
    }
    public String getPassword(){
       return password;
    }
}
