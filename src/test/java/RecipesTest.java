import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecipesTest {
    //TODO Before doing Task 2 remove "/*" and "*/" (Shortcut: Ctrl + Shift + /).


    @Test
    public void testAdd() {
        Recipes recipes = new Recipes();

        assertEquals(0, recipes.recipes.size());

        recipes.add("Tükörtojás", """
                1. Az olajat egy serpenyőben kellőképp felforrósítjuk és óvatosan beleütjük a tojásokat.\r
                2. Keverés nélkül készre sütjük, míg a tojásfehérje megsül, de a sárgája folyós marad.\r
                3. Hogy jobban átsüljön, a tojásfehérjét egy villa segítségével óvatosan megmozgathatjuk.""");

        assertEquals(1, recipes.recipes.size());
    }

    @Test
    public void testDelete() {
        Recipes recipes = new Recipes();

        String name = "Tükörtojás";

        recipes.add(name, """
                1. Az olajat egy serpenyőben kellőképp felforrósítjuk és óvatosan beleütjük a tojásokat.\r
                2. Keverés nélkül készre sütjük, míg a tojásfehérje megsül, de a sárgája folyós marad.\r
                3. Hogy jobban átsüljön, a tojásfehérjét egy villa segítségével óvatosan megmozgathatjuk.""");

        assertEquals(1, recipes.recipes.size());

        recipes.delete(name);

        assertEquals(0, recipes.recipes.size());
    }

    @Test
    public void testGetItems() {
        Recipes recipes = new Recipes();

        String name = "Tükörtojás";
        String description = """
                1. Az olajat egy serpenyőben kellőképp felforrósítjuk és óvatosan beleütjük a tojásokat.\r
                2. Keverés nélkül készre sütjük, míg a tojásfehérje megsül, de a sárgája folyós marad.\r
                3. Hogy jobban átsüljön, a tojásfehérjét egy villa segítségével óvatosan megmozgathatjuk.""";

        recipes.add(name, description);

        assertEquals(1, recipes.getItems().size());
        assertEquals(name, recipes.getItems().get(0)[0]);
        assertEquals(description, recipes.getItems().get(0)[1]);
    }

}
