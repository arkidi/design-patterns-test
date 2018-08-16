package builder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NutritionFactsTestDrive {

    @Test
    @DisplayName("Nothing Test")
    public void nothing() {

    }

    @Test
    @DisplayName("static inner class로 구현한 Builder 패턴 테스트")
    public void should_NutritionFacts_builder() {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(5, 12)
                .calories(4)
                .fat(2)
                .sodium(12)
                .carbohydrate(32)
                .build();

        System.out.println(nutritionFacts.toString());
        //NutritionFacts{servingSize=5, servings=12, calories=4, fat=2, sodium=12, carbohydrate=32}
    }

}
