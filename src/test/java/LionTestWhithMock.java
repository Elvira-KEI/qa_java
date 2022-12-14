import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
@RunWith(MockitoJUnitRunner.class)
public class LionTestWhithMock {
    private  int kittensCount = 1;
    @Mock
    Feline feline;
    @Test
    public void getFoodTest() throws Exception {
            Lion lion = new Lion("Самец", feline);
            Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
         }
    @Test
    public void getKittensTest() throws Exception {
            Lion lion = new Lion("Самец", feline);
            Mockito.when(feline.getKittens()).thenReturn(kittensCount);
            Assert.assertEquals(1, lion.getKittens());
    }
}
