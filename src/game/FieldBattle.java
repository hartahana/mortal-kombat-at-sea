package game;

/**
 * Игровое поле.
 */
public class FieldBattle {
    public Object printCoord;
    private String[][] field;
    private int sizeField = 10;
    private int setCoord = 11;

    public FieldBattle() {
        field = new String[sizeField][sizeField];
        setWawe();
    }


    /**
     * Заполнение поля 'волнами'.
     */
    private void setWawe() {
        field[0][0] = " ";
        for (int x = 0; x < sizeField; x++) {
            for (int y = 0; y < sizeField; y++) {
                field[x][y] = "~ ";
            }
        }
    }

    /**
     * Вывод поля в консоль.
     */
    public void printCoord() {
        System.out.print("  ");

        for (int z = 1; z < 11; z++) {
            System.out.print(z + " ");
        }
        System.out.print("\n");
    }

    public void printField() {

        char[] m = new char[10];
        for (int i = 0; i < 10; )

            for (int x = 0; x < sizeField; x++) {

            {
                m[i] = (char) ('a' + i);

                for (int y = 0; y < sizeField; y++) {
                    if (y == 0) {
                        System.out.print(m[i] + " " + field[x][y]);
                        i++;
                    }

                    else
                    {
                        System.out.print(field[x][y]);
                    }

                }
                System.out.print("\n");
            }
            System.out.print("");
        }


    }
}
