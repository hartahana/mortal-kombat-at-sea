package game;

import java.util.Random;

//объявляем класс корабль
public class Ship{
    int x;
    int y;
    int size;
    String ShipClass;
    boolean FreeField;
    int id;

    //определить начальные координаты отсчета
    public void GetShip(int x, int y) {
        Random rand = new Random();
        x = rand.nextInt(10);
        y = rand.nextInt(10);
    }

    //задаем конструктор корабля

    public Ship(int x, int y, int size, String ShipClass){
        this.x = x; //начальные координаты х
        this.y = y; //начальные координаты у
        this.size = size; //размер корабля
        this.ShipClass = ShipClass; //класс корабля
    }


    public class Linkor extends Ship {
        public Linkor(int x, int y, int size, String ShipClass) {
            super(x, y, size, ShipClass);
        }


    }

    public class Submarine extends Ship {
        public Submarine(int x, int y, int size, String ShipClass) {
            super(x, y, size, ShipClass);
        }
    }
}
