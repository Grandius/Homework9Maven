import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class KnightChessTest {

    @Mock
    KnightMoveConverter converterMock = mock(KnightMoveConverter.class);
    @InjectMocks
    KnightChess knightChess = new KnightChess(converterMock);

    @Test
    public void whenMovingFigureIsSuccessful() {

        //verify(converterMock).convertKnightMove(knightChess.setInitialPosition(Mockito.anyString()).getInitialPosition(),Mockito.anyString());

        //assertThat(converterMock.convertKnightMove(knightChess.setInitialPosition(Mockito.anyString()).getInitialPosition(),Mockito.anyString()));
        //verify(knightChess, atLeastOnce()).moveFigure(anyString());

    }
}
