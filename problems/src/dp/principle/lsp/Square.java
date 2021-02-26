package dp.principle.lsp;

import java.io.Reader;

public class Square extends Rectangle {
    int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int getHigh() {
        return super.getHigh();
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public void setHigh(int high) {
        super.setHigh(high);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
    }
}
