public class Pyramid {
    public static void main(String[] args) {
        int line = 5;
        String space = "";

        for (int currentLine = 0; currentLine < line; currentLine++) {
            for (int i = 0; i < (line - currentLine); i++) {
                space += " ";
            }
            System.out.print(space + "*");

            for (int i = 0; i < currentLine; i++) {
                System.out.print(" *");
            }

            space = "";
            System.out.println();
        }
    }
}
