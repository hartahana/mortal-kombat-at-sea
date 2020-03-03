package game;

import java.util.Random;

public class Ship {
    int x;
    int y;

    boolean FreeField;

    private String kindShip = "NoName"; //неизвестный корабль, определится в дочернем классе
    private int sizeShip = 0; //размер корабля от 1 до 4 клетов
    private String[] SCells; //площадь корабля
    private boolean[] FreeCells; //свободные клетки вокруг корабля

    //Задается размер корабля
    public Ship(int sizeS) {
        setSizeShip(sizeS);
    }

    public void setSizeShip(int sS) {

        sizeShip = sS;

        SCells = new String[sizeShip];

        destroyCells = new boolean[sizeShip];

        for (int i = 0; i < sizeShip; i++) {

            locationCells[i] = " "; // расположение корабля не определено

            destroyCells[i] = false; // все клетки корабля целы

        }


    //определить начальные координаты отсчета
    public void GetShip(int x, int y) {
        Random rand = new Random();
        x = rand.nextInt(10);
        y = rand.nextInt(10);
    }

    //Проверяем, пустое ли поле рядом с кораблем


    public class Linkor extends Ship {

        public Linkor(int sizeS) {
            super(sizeS);
        }
    }


    }

    public class Submarine extends Ship {

        public Submarine(int sizeS) {
            super(sizeS);
        }
    }
}