import org.assertj.swing.fixture.FrameFixture;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class BoxGUITest {

    private BoxGUI boxGUI;
    private Box box;

    public void setUp() {
        box = new Box(2,5,7);
        boxGUI = new BoxGUI(box);
    }

    @Test
    public void testCalculateVolumeButton() {
        box = new Box(2, 5, 7);
        boxGUI = new BoxGUI(box);

        boxGUI.getLengthField().setText("2");
        boxGUI.getWidthField().setText("5");
        boxGUI.getHeightField().setText("7");


        assertEquals(boxGUI.getCalculateVolumeButton(), 70);
    }

}