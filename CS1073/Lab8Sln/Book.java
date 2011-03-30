public class Book
{
    private String title;
    private String author;
    private String ISBN;
    private int nbPages;

    public Book()
    {
        setTitle("No Title");
        setAuthor("No Author");
        setISBN("00-00-00-00");
        setnbPages(0);
    }

    public Book(String t, String a, String i, int p)
    {
        setTitle(t);
        setAuthor(a);
        setISBN(i);
        setnbPages(p);
    }

    public void  setTitle(String t)
    {
        title = t;
    }

    public String getTitle()
    {
        return title;
    }

    public void  setAuthor(String a)
    {
        author = a;
    }

    public String getAuthor()
    {
        return author;
    }
    public void  setISBN(String i)
    {
        ISBN = i;
    }

    public String getISBN()
    {
        return ISBN;
    }
    public void  setnbPages(int p)
    {
        nbPages = p;
    }

    public int  getnbPages()
    {
        return nbPages;
    }

    public String toString()
    {
        return "\nTitle: " + title+"\nAuthor: "+ author+"\nISBN: "+ ISBN+"\nPages: "+nbPages+"\n";
    }
}