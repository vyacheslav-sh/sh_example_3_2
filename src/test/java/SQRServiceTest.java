import static org.junit.jupiter.api.Assertions.*;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        SQRService sqrservice = new SQRService();

        // подготавливаем данные:
        int start = 200;
        int finish = 300;
        int expected = 3;

        // вызываем целевой метод:
        int actual = sqrservice.sqrrange(start, finish);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
