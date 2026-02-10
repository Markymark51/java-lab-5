package ca.book.store;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookStore
{
    private static final int DECADE_LENGTH = 10;
    private static final int INITIALIZE_ZERO = 0;
    private static final int FIRST_LIST_INDEX = 0;
    private static final int ZERO = 0;
    private static final double PERCENTAGE_MULTIPLIER = 100.0;

    private final String bookStoreName;
    private final List<Novel> novelList;

    public BookStore(final String bookStoreName)
    {
        this.bookStoreName = bookStoreName;

        this.novelList = new ArrayList<Novel>();

        novelList.add(new Novel("The Adventures of Augie March", "Saul Bellow", 1953));
        novelList.add(new Novel("All the King’s Men", "Robert Penn Warren", 1946));
        novelList.add(new Novel("American Pastoral", "Philip Roth", 1997));
        novelList.add(new Novel("An American Tragedy", "Theodore Dreiser", 1925));
        novelList.add(new Novel("Animal Farm", "George Orwell", 1946));
        novelList.add(new Novel("Appointment in Samarra", "John O'Hara", 1934));
        novelList.add(new Novel("Are You There God? It's Me, Margaret.", "Judy Blume", 1970));
        novelList.add(new Novel("The Assistant", "Bernard Malamud", 1957));
        novelList.add(new Novel("At Swim-Two-Birds", "Flann O'Brien", 1938));
        novelList.add(new Novel("Atonement", "Ian McEwan", 2002));
        novelList.add(new Novel("Beloved", "Toni Morrison", 1987));
        novelList.add(new Novel("The Berlin Stories", "Christopher Isherwood", 1946));
        novelList.add(new Novel("The Big Sleep", "Raymond Chandler", 1939));
        novelList.add(new Novel("The Blind Assassin", "Margaret Atwood", 2000));
        novelList.add(new Novel("Blood Meridian", "Cormac McCarthy", 1986));
        novelList.add(new Novel("Brideshead Revisited", "Evelyn Waugh", 1946));
        novelList.add(new Novel("The Bridge of San Luis Rey", "Thornton Wilder", 1927));
        novelList.add(new Novel("Call It Sleep", "Henry Roth", 1935));
        novelList.add(new Novel("Catch-22", "Joseph Heller", 1961));
        novelList.add(new Novel("The Catcher in the Rye", "J.D. Salinger", 1951));
        novelList.add(new Novel("A Clockwork Orange", "Anthony Burgess", 1963));
        novelList.add(new Novel("The Confessions of Nat Turner", "William Styron", 1967));
        novelList.add(new Novel("The Corrections", "Jonathan Franzen", 2001));
        novelList.add(new Novel("The Crying of Lot 49", "Thomas Pynchon", 1966));
        novelList.add(new Novel("A Dance to the Music of Time", "Anthony Powell", 1951));
        novelList.add(new Novel("The Day of the Locust", "Nathanael West", 1939));
        novelList.add(new Novel("Death Comes for the Archbishop", "Willa Cather", 1927));
        novelList.add(new Novel("A Death in the Family", "James Agee", 1958));
        novelList.add(new Novel("The Death of the Heart", "Elizabeth Bowen", 1958));
        novelList.add(new Novel("Deliverance", "James Dickey", 1970));
        novelList.add(new Novel("Dog Soldiers", "Robert Stone", 1974));
        novelList.add(new Novel("Falconer", "John Cheever", 1977));
        novelList.add(new Novel("The French Lieutenant's Woman", "John Fowles", 1969));
        novelList.add(new Novel("The Golden Notebook", "Doris Lessing", 1962));
        novelList.add(new Novel("Go Tell It on the Mountain", "James Baldwin", 1953));
        novelList.add(new Novel("Gone with the Wind", "Margaret Mitchell", 1936));
        novelList.add(new Novel("The Grapes of Wrath", "John Steinbeck", 1939));
        novelList.add(new Novel("Gravity's Rainbow", "Thomas Pynchon", 1973));
        novelList.add(new Novel("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        novelList.add(new Novel("A Handful of Dust", "Evelyn Waugh", 1934));
        novelList.add(new Novel("The Heart Is a Lonely Hunter", "Carson McCullers", 1940));
        novelList.add(new Novel("The Heart of the Matter", "Graham Greene", 1948));
        novelList.add(new Novel("Herzog", "Saul Bellow", 1964));
        novelList.add(new Novel("Housekeeping", "Marilynne Robinson", 1981));
        novelList.add(new Novel("A House for Mr. Biswas", "V.S. Naipaul", 1962));
        novelList.add(new Novel("I, Claudius", "Robert Graves", 1934));
        novelList.add(new Novel("Infinite Jest", "David Foster Wallace", 1996));
        novelList.add(new Novel("Invisible Man", "Ralph Ellison", 1952));
        novelList.add(new Novel("Light in August", "William Faulkner", 1932));
        novelList.add(new Novel("The Lion, The Witch and the Wardrobe", "C.S. Lewis", 1950));
        novelList.add(new Novel("Lolita", "Vladimir Nabokov", 1955));
        novelList.add(new Novel("Lord of the Flies", "William Golding", 1954));
        novelList.add(new Novel("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        novelList.add(new Novel("Loving", "Henry Green", 1945));
        novelList.add(new Novel("Lucky Jim", "Kingsley Amis", 1954));
        novelList.add(new Novel("The Man Who Loved Children", "Christina Stead", 1940));
        novelList.add(new Novel("Midnight's Children", "Salman Rushdie", 1981));
        novelList.add(new Novel("Money", "Martin Amis", 1984));
        novelList.add(new Novel("The Moviegoer", "Walker Percy", 1961));
        novelList.add(new Novel("Mrs. Dalloway", "Virginia Woolf", 1925));
        novelList.add(new Novel("Naked Lunch", "William Burroughs", 1959));
        novelList.add(new Novel("Native Son", "Richard Wright", 1940));
        novelList.add(new Novel("Neuromancer", "William Gibson", 1984));
        novelList.add(new Novel("Never Let Me Go", "Kazuo Ishiguro", 2005));
        novelList.add(new Novel("1984", "George Orwell", 1948));
        novelList.add(new Novel("On the Road", "Jack Kerouac", 1957));
        novelList.add(new Novel("One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962));
        novelList.add(new Novel("The Painted Bird", "Jerzy Kosinski", 1965));
        novelList.add(new Novel("Pale Fire", "Vladimir Nabokov", 1962));
        novelList.add(new Novel("A Passage to India", "E.M. Forster", 1924));
        novelList.add(new Novel("Play It as It Lays", "Joan Didion", 1970));
        novelList.add(new Novel("Portnoy's Complaint", "Philip Roth", 1969));
        novelList.add(new Novel("Possession", "A.S. Byatt", 1990));
        novelList.add(new Novel("The Power and the Glory", "Graham Greene", 1939));
        novelList.add(new Novel("The Prime of Miss Jean Brodie", "Muriel Spark", 1961));
        novelList.add(new Novel("Rabbit, Run", "John Updike", 1960));
        novelList.add(new Novel("Ragtime", "E.L. Doctorow", 1975));
        novelList.add(new Novel("The Recognitions", "William Gaddis", 1955));
        novelList.add(new Novel("Red Harvest", "Dashiell Hammett", 1929));
        novelList.add(new Novel("Revolutionary Road", "Richard Yates", 1961));
        novelList.add(new Novel("The Sheltering Sky", "Paul Bowles", 1949));
        novelList.add(new Novel("Slaughterhouse-Five", "Kurt Vonnegut", 1969));
        novelList.add(new Novel("Snow Crash", "Neal Stephenson", 1992));
        novelList.add(new Novel("The Sot-Weed Factor", "John Barth", 1960));
        novelList.add(new Novel("The Sound and the Fury", "William Faulkner", 1929));
        novelList.add(new Novel("The Sportswriter", "Richard Ford", 1986));
        novelList.add(new Novel("The Spy Who Came in from the Cold", "John le Carré", 1964));
        novelList.add(new Novel("The Sun Also Rises", "Ernest Hemingway", 1926));
        novelList.add(new Novel("Their Eyes Were Watching God", "Zora Neale Hurston", 1937));
        novelList.add(new Novel("Things Fall Apart", "Chinua Achebe", 1959));
        novelList.add(new Novel("To Kill a Mockingbird", "Harper Lee", 1960));
        novelList.add(new Novel("To the Lighthouse", "Virginia Woolf", 1929));
        novelList.add(new Novel("Tropic of Cancer", "Henry Miller", 1934));
        novelList.add(new Novel("Ubik", "Philip K. Dick", 1969));
        novelList.add(new Novel("Under the Net", "Iris Murdoch", 1954));
        novelList.add(new Novel("Under the Volcano", "Malcolm Lowry", 1947));
        novelList.add(new Novel("Watchmen", "Alan Moore and Dave Gibbons", 1986));
        novelList.add(new Novel("White Noise", "Don DeLillo", 1985));
        novelList.add(new Novel("White Teeth", "Zadie Smith", 2000));
        novelList.add(new Novel("Wide Sargasso Sea", "Jean Rhys", 1966));
    }

    /**
     * Prints out all titles in the bookstore
     */
    public void printAllTitles()
    {
        for(final Novel novel : novelList)
        {
            System.out.println(novel.getTitle().toUpperCase());
        }
    }

    /**
     * Prints all titles that contain the inputted string.
     *
     * @param title to check titles
     */
    public void printBookTitle(final String title)
    {
        for(final Novel currentNovel : novelList)
        {
            final String currentTitle = currentNovel.getTitle();

            if(currentTitle.contains(title))
            {
                System.out.println(currentTitle);
            }
        }
    }

    /**
     * Prints all titles in alphabetical order.
     */
    public void printTitlesInAlphaOrder()
    {
        List<Novel> sorted = new ArrayList<>(novelList);

        Collections.sort(sorted);

        for (Novel n : sorted)
        {
            System.out.println(n.getTitle());
        }
    }

    /**
     * Prints out all titles that are within the decade that the inputted year is in.
     *
     * @param decade inputted decade
     */
    public void printGroupByDecade(final int decade)
    {
        for(final Novel currentNovel : novelList)
        {
            if(currentNovel.getYearPublished() >= decade &&
               currentNovel.getYearPublished() < decade + DECADE_LENGTH)
            {
                System.out.println(currentNovel.getTitle());
            }
        }
    }

    /**
     * Prints the longest title.
     */
    public void getLongest()
    {
        String longestTitle = novelList.get(FIRST_LIST_INDEX).getTitle();

        for(final Novel currentNovel : novelList)
        {
            if(currentNovel.getTitle().length() > longestTitle.length())
            {
                longestTitle = currentNovel.getTitle();
            }
        }

        System.out.println(longestTitle);
    }

    /**
     * Checks if there are any novels written in the inputted year.
     *
     * @param year to check
     *
     * @return is there or is there not a novel written in the year
     */
    public boolean isThereABookWrittenIn(final int year)
    {
        for(final Novel currentNovel : novelList)
        {
            if(currentNovel.getYearPublished() == year)
            {
                return true;
            }
        }

        return false;
    }

    /**
     * Checks how many books contain the inputted word
     *
     * @param word to check
     *
     * @return number of books that contain inputted word
     */
    public int howManyBooksContain(final String word)
    {
        int amountContain = INITIALIZE_ZERO;

        for (final Novel currentNovel : novelList)
        {
            final String currentTitle = currentNovel.getTitle();

            if (currentTitle.toLowerCase().contains(word.toLowerCase()))
            {
                amountContain++;
            }
        }

        return amountContain;
    }

    /**
     * Checks the percentage of books published between the inputted years.
     *
     * @param first to be checked with
     * @param last to be checked with
     *
     * @return percentage of books published between the inputted years
     */
    public int whichPercentWrittenBetween(final int first, final int last)
    {
        int numberOfBooks = novelList.size();
        int numberOfBooksBetween = INITIALIZE_ZERO;

        for (final Novel currentNovel : novelList)
        {
            int year = currentNovel.getYearPublished();

            if (year >= first && year <= last)
            {
                numberOfBooksBetween++;
            }
        }

        if (numberOfBooks == ZERO)
        {
            return ZERO;
        }

        return (int) ((numberOfBooksBetween * PERCENTAGE_MULTIPLIER) / numberOfBooks);
    }

    /**
     * Gets the book with the oldest publishing date.
     *
     * @return oldest book
     */
    public Novel getOldestBook()
    {
        Novel oldestBook = novelList.getFirst();

        for (final Novel currentNovel : novelList)
        {
            if(currentNovel.getYearPublished() < oldestBook.getYearPublished())
            {
                oldestBook = currentNovel;
            }
        }

        return oldestBook;
    }

    /**
     * Gets all novels that have a title length equal to the inputted amount.
     *
     * @param titleLength to check with
     *
     * @return list of books
     */
    public List<Novel> getBooksThisLength(final int titleLength)
    {
        List<Novel> booksWithRightTitleLength;

        booksWithRightTitleLength = new ArrayList<>();

        for (final Novel currentNovel : novelList)
        {
            if(currentNovel.getTitle().length() == titleLength)
            {
                booksWithRightTitleLength.add(currentNovel);
            }
        }

        return booksWithRightTitleLength;
    }

    /**
     * Tests program.
     *
     * @param args unused.
     */
    public static void main(final String[] args)
    {
        final BookStore bookstore;
        final Novel oldest;
        final List<Novel> fifteenCharTitles;

        bookstore = new BookStore("Classic Novels Collection");

        System.out.println("All Titles in UPPERCASE:");
        bookstore.printAllTitles();

        System.out.println("\nBook Titles Containing 'the':");
        bookstore.printBookTitle("the");

        System.out.println("\nAll Titles in Alphabetical Order:");
        bookstore.printTitlesInAlphaOrder();

        System.out.println("\nBooks from the 2000s:");
        bookstore.printGroupByDecade(2000);

        System.out.println("\nLongest Book Title:");
        bookstore.getLongest();

        System.out.println("\nIs there a book written in 1950?");
        System.out.println(bookstore.isThereABookWrittenIn(1950));

        System.out.println("\nHow many books contain 'heart'?");
        System.out.println(bookstore.howManyBooksContain("heart"));

        System.out.println("\nPercentage of books written between 1940 and 1950:");
        System.out.println(bookstore.whichPercentWrittenBetween(1940, 1950) + "%");

        System.out.println("\nOldest book:");
        oldest = bookstore.getOldestBook();
        System.out.println(oldest.getTitle() + " by " + oldest.getAuthorName() + ", " +
                oldest.getYearPublished());

        System.out.println("\nBooks with titles 15 characters long:");
        fifteenCharTitles = bookstore.getBooksThisLength(15);
        fifteenCharTitles.forEach(novel -> System.out.println(novel.getTitle()));
    }


}
