package ca.book.store;

/**
 * Represents a Novel
 *
 * @author Markus Serban
 *
 * @version 1.0
 */
public class Novel implements Comparable<Novel>
{
    private final String title;
    private final String authorName;
    private final int publishYear;

    /**
     * Constructs a novel.
     *
     * @param title to be set
     * @param authorName to be set
     * @param publishYear to be set
     */
    public Novel(final String title,
                 final String authorName,
                 final int publishYear)
    {
        this.title = title;
        this.authorName = authorName;
        this.publishYear = publishYear;
    }

    /**
     * gets novels title.
     *
     * @return title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * gets novels author name.
     *
     * @return author name
     */
    public String getAuthorName()
    {
        return authorName;
    }

    /**
     * gets novels publish year.
     *
     * @return publish year
     */
    public int getYearPublished()
    {
        return publishYear;
    }

    @Override
    public int compareTo(Novel other)
    {
        return this.title.compareToIgnoreCase(other.title);
    }

    /**
     * Returns a formatted string representation of the novel.
     *
     * @return formatted novel information
     */
    @Override
    public String toString()
    {
        return "Title: " + title + ", Author: " + authorName + ", Year: " + publishYear;
    }
}
