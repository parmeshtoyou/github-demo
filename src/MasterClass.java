import home.HomePageController;
import login.LoginController;

public class MasterClass {
    public static void main(String[] args) {
        System.out.println("I am from master branch first commit");

        LoginController loginController = new LoginController();
        loginController.doLogin();

        HomePageController homePageController = new HomePageController();
        homePageController.homeController();
        homePageController.getItemList();

        loginController.doLogout();
    }
}
