package game;
//package game;

/**

 * Базовый класс "Корабль"

 * Координаты клеток пока задаются двухсимвольными строками, например "a0".."j9" или "00".."99"

 * Не забудь сделать класс Cell, в котором есть координаты int x и y, может ему еще ID прикрутить?.. пометка для себя

 */

public class Ship {

    private String kindShip = "Undefined" ; // вид корабля. Будет определяться в потомках

    private int sizeShip = 0; // размер корабля в клетках (1..4)

    private String[] locationCells; // расположение корабля на игровом поле (массив координат клеток размерностью sizeShip)

    private boolean[] destroyCells; // "разрушенные клетки корабля" - признаки "Попадание" для клеток locationCells (массив размерностью sizeShip).

// Если все элементы destroyCells == true, то корабль потоплен

// два перегруженных конструктора:

// конструктор №1 - задается размер корабля

    public Ship(int sizeS) {

        setSizeShip(sizeS);

    }

// конструктор №2 - задается расположение корабля

    public Ship(String[] locC) {

// Ship(locC..length); // вызываем конструктор №1 (можно было бы setSizeShip(locC.length) )

        setSizeShip(locC.length);

// locationCells = Arrays.copyOf(locC, sizeShip);

        locationCells = locC;

    }

    /**

     * Определение размера корабля. Вызывается из конструктора.

     */

    public void setSizeShip(int sS) {

        sizeShip = sS;

        locationCells = new String[sizeShip];

        destroyCells = new boolean[sizeShip];

        for (int i = 0; i < sizeShip; i++) {

            locationCells[i] = " "; // расположение корабля не определено

            destroyCells[i] = false; // все клетки корабля целы

        }

    }

    /**

     * Проверка выстрела на предмет попадания в корабль. Выстрел (shot) - это координата клетки, в которую произошло попадание.

     * Результат проверки - число 0..2: 0 - "мимо", 1 - "попал", 2 - "потоплен"

     */

    public int checkShot(String shot) {

        for (int i = 0; i < sizeShip; i++) {

            if (shot == locationCells[i])

            {

                destroyCells[i] = true;

                if (getIsSunk() == true)

                { // "потоплен"

                    return 2;

                }

                else

                { // "попал"

                    return 1;

                }

            }

        }

// "мимо"

        return 0;

    }

    /**

     * Возвращает признак "Корабль потоплен"

     */

    public boolean getIsSunk() {

        for (int i = 0; i < sizeShip; i++) {

            if (destroyCells[i] == false)

            { // неразрушенная клетка -> корабль не потоплен

                return false;

            }

        }

// все клетки разрушены -> клрабль потоплен

        return true;

    }

    /**

     * Вывод информации о корабле в консоль

     */

    public void printInfo() {

        System.out.print("\n\n loationCells: {");

        for (int i = 0; i <sizeShip; i++) {

            System.out.print(locationCells[i]+" ");

        }

        System.out.println("}");

    }

}