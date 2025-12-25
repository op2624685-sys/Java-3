package projects.Library;

public class LibraryItem {
    private int itemID;
    private String title;
    private String author;

    public void  checkout () {
        System.out.println("checkout time :- ");
    }

    public void returnItem () {
        System.out.println("returning item time :- ");
    }
}
