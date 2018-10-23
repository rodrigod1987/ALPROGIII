public class FillColor {
    private char[][] pixels;

    public FillColor(char[][] pixels) {
        this.pixels = pixels;
    }

    public void fill(int x, int y, char newColor) {
        fill(x, y, newColor, pixels[x][y]);
    }

    private void fill(int x, int y, char newColor, char oldColor) {
        if (x < 0) return;
        if (y < 0) return;
        if (x >= pixels.length) return;
        if (y >= pixels[x].length) return;

        char color = pixels[x][y];

        if (newColor == color) return;
        if (oldColor != color) return;

        pixels[x][y] = newColor;

        fill(x - 1, y, newColor, oldColor);
        fill(x + 1, y, newColor, oldColor);
        fill(x, y - 1, newColor, oldColor);
        fill(x, y + 1, newColor, oldColor);
    }

    public void inspect() {
        for (int y = 0; y < pixels.length; y++) {
            for (int x = 0; x < pixels[y].length; x++) {
                System.out.print(pixels[y][x]);
            }
            System.out.print("\n");
        }
    }
}
