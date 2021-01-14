package search;

public class SearchController {

    SearchApi searchApi = new SearchApi();

    public SearchController(String searchText) {
        searchApi.searchItem("123");
        System.out.println("This is the search text " + searchText);
    }
}
