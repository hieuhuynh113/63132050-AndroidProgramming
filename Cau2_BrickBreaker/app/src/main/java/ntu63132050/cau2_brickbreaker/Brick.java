package ntu63132050.cau2_brickbreaker;

public class Brick {
    private boolean isVisible;
    public int row, column, width, height;

    public Brick(int row, int column, int width, int height) {
        isVisible = true;
        this.row = row;
        this.column = column;
        this.width = width;
        this.height = height;
    }

    public void setVisible() {
        isVisible = false;
    }

    public boolean getVisibility() {
        return isVisible;
    }
}
