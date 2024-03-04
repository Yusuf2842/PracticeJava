package test.atmProject;
import main.atmProject.atmClass.*;

public class atmTest {
    public static void main(String[] args) {
        //TODO: Figure out how to use the atmClass method
        atmAccount myAccount = new atmAccount();

        myAccount.test();
        myAccount.deposit(100);
        myAccount.test();
    }
}
