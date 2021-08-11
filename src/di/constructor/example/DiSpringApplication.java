package di.constructor.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DiSpringApplication {
    public static void main(String... args) {


        //the first step is to load te application context.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //get the bean ready to use (the bean is already instantiated by spring
        FastFood fastFood = context.getBean("idFastFood", FastFood.class);
        List<String> fastFoodList=fastFood.getListPlates();
        boolean isHealthyFastFood = fastFood.isHealthyFood();
        List<String> tacosIngredient=fastFood.getIngredientList();

        System.out.println("Here is the list of my best fastFood: " + fastFoodList + " is a healthy food ? " + isHealthyFastFood);

        System.out.println("Here is the list of the tacos ingredients: " + tacosIngredient);


    }


}
