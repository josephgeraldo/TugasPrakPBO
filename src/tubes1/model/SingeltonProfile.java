/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes1.model;

/**
 *
 * @author user
 */
public class SingeltonProfile {
    
    private static SingeltonProfile instance;
    private user User = null;
    
    private SingeltonProfile(){
        
    }

    public static SingeltonProfile getInstance() {
        if(instance==null){
            instance=new SingeltonProfile();
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
