package lesson5.task1;

/** Задача 1
 *   Условие:
 *Новости выводятся по 10 на страницу. Написать метод, определяющий коли-чество страниц для вывода N новостей.
 *   Решение (1 метод):
 */
public class PrintNews {

    /**  method is used only for testing the method getNumberOfPagesForNews(long n)*/
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("No news (zero news), pages are not required");
        getNumberOfPagesForNews(0);

        System.out.println("---------------------");
        System.out.println("expecting result - 1 pages:");
        getNumberOfPagesForNews(1);
        getNumberOfPagesForNews(9);
        getNumberOfPagesForNews(10);

        System.out.println("---------------------");
        System.out.println("expecting result - 2 pages:");
        getNumberOfPagesForNews(11);
        getNumberOfPagesForNews(19);
        getNumberOfPagesForNews(20);
        System.out.println("---------------------");

        System.out.println("expecting result - 3 pages ");
        getNumberOfPagesForNews(21);
        getNumberOfPagesForNews(29);

    }
    /**
     * Prints into console required number of pages for posting <b>n</b> news*
     * @param   n  number of news, which are needed to post on the pages;
     */
    public static void getNumberOfPagesForNews(long n) {
        final int NUMBER_OF_NEWS_PER_PAGE = 10;
        long result;

        if (n==0) {
            System.out.println("No news (zero news), pages are not required");
            return;
        } else  if (n%10 == 0) {
            result = n / NUMBER_OF_NEWS_PER_PAGE;
        } else {
            result = (n / NUMBER_OF_NEWS_PER_PAGE)+ 1;
        }

        if (result == 1)  System.out.println(result + " page is required for posting news");
        else System.out.println(result + " pages are required for posting news");

    }
}
