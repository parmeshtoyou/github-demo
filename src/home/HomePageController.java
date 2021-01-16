package home;

import search.SearchController;

public class HomePageController {
    public void homeController() {
        System.out.println("Welcome to the home page");
        new SearchController("dummy text");
    }

    public void getItemList() {
        System.out.println("Getting item list");
    }
}
