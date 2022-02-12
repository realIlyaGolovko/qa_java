package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock Feline feline;

    @Test
    public void getKittensWithOneCountShowsOne() throws Exception {
    Lion lion=new Lion("Самец",feline);
    Mockito.when(feline.getKittens()).thenReturn(1);
    int expectedResult=1;
    int actualResult=lion.getKittens();
    assertEquals("Ожидали число 1",expectedResult,actualResult);
    }
    @Test
    public void getFoodShowsListOfPredatorFoods() throws Exception {
    Lion lion=new Lion("Самец",feline);
    List<String> expectedResult=List.of("Животные", "Птицы", "Рыба");
    Mockito.when(feline.getFood("Хищник")).thenReturn(expectedResult);
    List<String> actualResult=lion.getFood();
    assertEquals("Ожидали другой список слов",expectedResult,actualResult);
    }
}
