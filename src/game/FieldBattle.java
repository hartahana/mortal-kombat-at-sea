package game;

/**
 * Игровое поле.
 */
public class FieldBattle {
    public Object printCoord;
    private String[][] field;
    private int sizeField = 10;
    char[] m = {'a','b','c','d','e','f','g','h','i','j'};
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
        for (int y = 0; y < sizeField; y++) {


        for (int x = 0; x < sizeField; x++)
                   {
                       if (x == 0; y==0) {
                           System.out.print("a b");
                       }
                    {
                        System.out.print(field[x][0]);

                    }

                }

                System.out.println("");
        }
        }
    }