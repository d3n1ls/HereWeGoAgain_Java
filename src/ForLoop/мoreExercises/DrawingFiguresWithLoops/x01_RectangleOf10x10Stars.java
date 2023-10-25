package ForLoop.мoreExercises.DrawingFiguresWithLoops;

public class x01_RectangleOf10x10Stars {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sb.append('*');
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
