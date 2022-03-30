import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UpdateRecipesTest {
    //TODO Before doing Task 3 remove "/*" and "*/" (Shortcut: Ctrl + Shift + /).


    @Test
    public void testUpdate() {
        UpdateRecipes updateRecipes = new UpdateRecipes();

        String name = "Tükörtojás";
        String description = """
                1. Az olajat egy serpenyőben kellőképp felforrósítjuk és beleütjük a tojásokat.\r
                2. Keverés nélkül készre sütjük, míg a tojásfehérje megsül.\r
                3. Hogy jobban átsüljön, a tojásfehérjét egy villa segítségével óvatosan megmozgathatjuk.""";

        updateRecipes.add(name, """
                1. Az olajat egy serpenyőben kellőképp felforrósítjuk és óvatosan beleütjük a tojásokat.\r
                2. Keverés nélkül készre sütjük, míg a tojásfehérje megsül, de a sárgája folyós marad.\r
                3. Hogy jobban átsüljön, a tojásfehérjét egy villa segítségével óvatosan megmozgathatjuk.""");

        updateRecipes.update(name, description);

        assertEquals(1, updateRecipes.getItems().size());
        assertEquals(description, updateRecipes.getItems().get(0)[1]);
    }

}
