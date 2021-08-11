package di.constructor.example;

import java.util.ArrayList;
import java.util.List;

public class TacosIngredientService implements IngredientService {


    @Override
    public List<String> getIngredient() {

        List<String> ingredients=new ArrayList<>();
        ingredients.add("meat");
        ingredients.add("cheese");
        ingredients.add("potatoes");
        return ingredients;
    }
}
