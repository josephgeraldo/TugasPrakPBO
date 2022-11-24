
package model;

public class SingletonUser {
    
    private static SingletonUser instance;
    private user User = null;
    
    private SingletonUser(){
        
    }

    public static SingletonUser getInstance() {
        if(instance==null){
            instance=new SingletonUser();
        }
        return instance;
    }
    
    public void reset(){
        this.User = null;
    }
    
    public user getUser() {
        return User;
    }

    public void setUser(user User) {
        this.User = User;
    }

}
