import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

public class KnightChessTest {

    @Mock
    KnightMoveConverter converterMock;
    @InjectMocks
    KnightChess unit = new KnightChess(converterMock);

    @Test
    public void moveFigure_nominal() {


    }
}
