import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertTrue;

public class KnightMoveConverterTest {

    @Mock
    private KnightMoveConverter converterMock = Mockito.mock(KnightMoveConverter.class);

    @Test
    public void convertKnightMove_check_values() {

        converterMock = converterMock.convertKnightMove(Mockito.anyString(),Mockito.anyString());
        assertTrue(converterMock.getIndex1()<=2&&converterMock.getIndex2()<=2);

    }

}
