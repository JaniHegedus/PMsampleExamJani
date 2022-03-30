import java.util.Objects;

public class UpdateRecipes extends Recipes
{
    public void update(String name, String description)
    {
        for (String[] recipe : recipes) {
            if (Objects.equals(recipe[0], name)) {
                recipe[1] = description;
            }
        }
    }
}
