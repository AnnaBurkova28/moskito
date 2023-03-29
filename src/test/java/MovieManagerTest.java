import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    @Test
    public void testAdd() {
        MovieManager manager = new MovieManager();
        manager.add("Film a");
        manager.add("Film b");
        manager.add("Film c");
        String[] expected = {"Film a", "Film b", "Film c"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void testEmpty() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testAddOne() {
        MovieManager manager = new MovieManager();

        manager.add("Film b");

        String[] expected = {"Film b"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLast() {
        MovieManager manager = new MovieManager();
        manager.add("Film a");
        manager.add("Film b");
        manager.add("Film c");
        String[] expected = {"Film c", "Film b", "Film a"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testFindLastFilm() {
        MovieManager manager = new MovieManager();
        manager.add("Film a");
        manager.add("Film b");
        manager.add("Film c");
        manager.add("Film d");
        manager.add("Film e");
        manager.add("Film f");
        manager.add("Film g");
        manager.add("Film h");
        manager.add("Film i");
        manager.add("Film j");
        String[] expected = {"Film j", "Film i", "Film h", "Film g", "Film f", "Film e", "Film d", "Film c", "Film b", "Film a"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testFindLastFilmLimit() {
        MovieManager manager = new MovieManager();
        manager.add("Film a");
        manager.add("Film b");
        manager.add("Film c");
        manager.add("Film d");
        manager.add("Film e");
        manager.add("Film f");
        manager.add("Film g");
        manager.add("Film h");
        manager.add("Film i");
        manager.add("Film j");
        manager.add("Film k");
        String[] expected = {"Film k", "Film j", "Film i", "Film h", "Film g", "Film f", "Film e", "Film d", "Film c", "Film b"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testNotFindLastFilm() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindLastFilmLimited() {
        MovieManager manager = new MovieManager(5);
        manager.add("Film a");
        manager.add("Film b");
        manager.add("Film c");
        manager.add("Film d");
        manager.add("Film e");
        manager.add("Film f");
        manager.add("Film g");
        manager.add("Film h");
        manager.add("Film i");
        manager.add("Film j");
        manager.add("Film k");
        String[] expected = {"Film k", "Film j", "Film i", "Film h", "Film g"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindLastFilmLimitedLimit() {
        MovieManager manager = new MovieManager(5);


        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
