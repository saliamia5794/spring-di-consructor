package di.constructor.example;

import java.util.ArrayList;
import java.util.List;

public class JapaneseFood implements Food {


    @Override
    public List<String> getListPlates() {

        List<String> JapaneseFoodList=new ArrayList<>();
        JapaneseFoodList.add("sushi");
        JapaneseFoodList.add("makki");
        JapaneseFoodList.add("soup");

        return JapaneseFoodList;
    }

    @Override
    public boolean isHealthyFood() {

        return true;
    }
}
