public class Program {
    public static void main(String argv[]) {
        char pixels[][] =
                {
                        { 'O', 'X', 'X', 'X', 'X' },
                        { 'X', 'O', 'O', 'O', 'X' },
                        { 'X', 'O', '#', 'O', 'X' },
                        { 'X', 'O', 'O', 'O', 'X' },
                        { 'X', 'X', 'X', 'X', 'X' },
                        { 'X', 'X', 'X', '#', '#' },
                        { 'X', 'X', 'X', 'X', 'X' }
                };
        FillColor fillColor = new FillColor(pixels);
        fillColor.fill(0, 0, '*'); //O -> *
        fillColor.fill(1, 0, 'T'); //X -> T
        fillColor.fill(5, 3, '@'); //# -> @
        fillColor.inspect();
    }
}