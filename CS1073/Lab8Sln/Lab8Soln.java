public class Lab8Soln
{
    public static void main(String[] args)
    {
        Book book1 = new Book();
        Book book2 = new Book("Intro to Java Programming", "Liang","978-0-13-213079-0",730);
        Book book3 = new Book("Lord of the Rings", "J.R. Tolkein", "978-0-61-851765-7", 700);

        System.out.println("Details of book 1  "+ book1);
        System.out.println("Details of book 2  "+ book2);
        System.out.println("Details of book 3  "+ book3);
    }
}