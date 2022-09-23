import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {


    @Test
    void shouldCalculateSquaresValidRangeLimits() {

        SQRService service = new SQRService();

        int rangeStart = 200;
        int rangeEnd = 300;
        int expected = 3;

        int actual = service.calcSQR(rangeStart, rangeEnd);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateSquaresBelowLowerLimitRange() {

        SQRService service = new SQRService();

        int rangeStart = 1;
        int rangeEnd = 15;
        int expected = 0;

        int actual = service.calcSQR(rangeStart, rangeEnd);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateSquaresAboveUpperLimitRange() {

        SQRService service = new SQRService();

        int rangeStart = 10_000;
        int rangeEnd = 20_000;
        int expected = 0;

        int actual = service.calcSQR(rangeStart, rangeEnd);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateSquaresNegativeLowerLimitRange() {

        SQRService service = new SQRService();

        int rangeStart = -2_500;
        int rangeEnd = 99;
        int expected = 0;

        int actual = service.calcSQR(rangeStart, rangeEnd);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateSquaresZeroLimitRange() {

        SQRService service = new SQRService();

        int rangeStart = 0;
        int rangeEnd = 0;
        int expected = 0;

        int actual = service.calcSQR(rangeStart, rangeEnd);

        Assertions.assertEquals(expected, actual);

    }


//
//
//
//
//    shouldCalculateSquaresZeroLimitRange


}
