package game;

import java.util.Random;

/**
 * Игровое поле.
 */
public class FieldBattle {
    private String[][] field;
    private int sizeField = 10;

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

    public void printField() {
//рисуем верх с цифрами
        for (int x = 0; x < 11; x++) {
            if (x == 0)
            {
                System.out.print("  ");
            }
            else {
                System.out.print(x + " ");
            }

        }

        System.out.print("\n");
//рисуем вертикаль с буквами
        char[] m = new char[10];
        for (int i = 0; i < 10; )
//для х от 0 до 10
            for (int x = 0; x < sizeField; x++) {

//это нужно для того, чтобы получилась буква, а не нечитаемый символ, но почему - разобраться, пометка для меня
                {
                    m[i] = (char) ('a' + i);
//для у от 0 до 10
                    for (int y = 0; y < sizeField; y++) {
                        if (y == 0) {
                            System.out.print(m[i] + " " + field[x][y]); //если у == 0 ставим букву
                            i++;
                        }

                        else
                        {
                            System.out.print(field[x][y]); //иначе рисуем волну
                        }

                    }
                    System.out.print("\n");
                }
                System.out.print("");
            }


    }
}
