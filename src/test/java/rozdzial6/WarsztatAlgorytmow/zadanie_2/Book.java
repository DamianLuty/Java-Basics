package rozdzial6.WarsztatAlgorytmow.zadanie_2;

public class Book {

    private String title;
    private String author;
    private String publisher;
    private int copiesSold;

    // a. - napisz konstruktor tej klasy - powinien przyjmowac argumenty odpowiadajace kazdemu poli

    public Book (String tit, String aut, String pub, int cop)
    {
        title = tit;
        author = aut;
        publisher = pub;
        copiesSold = cop;
    }

    // b. napisz akcesor i mutator dla kazdego pola

    public void setTitle(String tit)
    {
        title = tit;
    }

    public void setAuthor(String aut)
    {
        author = aut;
    }

    public void setPublisher(String pub)
    {
        publisher = pub;
    }

    public void setCopiesSold(int cop)
    {
        copiesSold = cop;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public int getCopiesSold()
    {
        return copiesSold;
    }
}
