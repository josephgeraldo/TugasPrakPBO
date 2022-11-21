/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author user
 */
class Hasher {
    public static String password (String pass) {
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(pass.getBytes());
            byte[] bytes = m.digest();
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            pass = s.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return pass;
    }
}
