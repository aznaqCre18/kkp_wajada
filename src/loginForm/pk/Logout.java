/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginForm.pk;

import javax.swing.JFrame;
import loginForm.pk.LoginSession;

/**
 *
 * @author Aziz Nur Abdul Qodir
 */
public class Logout {
    public static void logOut(JFrame context, LoginForm loginScreen) {
        LoginSession.isLoggedIn = false;
        context.setVisible(false);
        loginScreen.setVisible(true);
    }
}
