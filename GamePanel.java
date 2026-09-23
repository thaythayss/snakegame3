import javax.swing*;
import java.awt.*;

public class GamePanel extends Panel {

    private final Board board = new Board();

    public GamePanel() {
        setPreferredSize(new Dimension(GameConstants.WIDTH, GameConstants.HEIGHT));

    }

    @Override 
    protected void  paintComponent(Graphics g) {
        super.paintComponents(g);

        Graphics2D g2 = (Graphics2D) g;
        board.draw(g2);
    }
}