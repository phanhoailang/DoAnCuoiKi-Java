package Cotroller;

import DAO.AccountDAO;
import Model.Account;
import View.LoginFrame;
import View.MenuJFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class LoginController implements ActionListener{
    private LoginFrame login;

    public LoginController(LoginFrame login) {
        this.login = login;
    }
    public void actionOfLogin() {
        
        String userName = login.gettFUser().getText();
        Account acc = AccountDAO.getInstance().findAccount(new Account(userName, null));
        System.out.println("Hello");
        char[] pass = login.getpFPassword().getPassword();
        String password = new String(pass);
        if(acc == null) {
            JOptionPane.showMessageDialog(login, "User name Wrong");
        } else if(acc.getPassWord().equalsIgnoreCase(password) != true) {
            JOptionPane.showMessageDialog(login, "Wrong password");
        } else {
            JOptionPane.showMessageDialog(login, "Login succesful");
            login.setVisible(false);
            login.dispose();
            MenuJFrame  menu = new MenuJFrame();
        }
    }  
    @Override
    public void actionPerformed(ActionEvent e) {
        actionOfLogin();
    }
    
}
