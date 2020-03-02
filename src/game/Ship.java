package game;

import java.util.Random;

//��������� ����� �������
public class Ship{
    int x;
    int y;
    int size;
    String ShipClass;
    boolean FreeField;
    int id;

    //���������� ��������� ���������� �������
    public void GetShip(int x, int y) {
        Random rand = new Random();
        x = rand.nextInt(10);
        y = rand.nextInt(10);
    }

    //������ ����������� �������

    public Ship(int x, int y, int size, String ShipClass){
        this.x = x; //��������� ���������� �
        this.y = y; //��������� ���������� �
        this.size = size; //������ �������
        this.ShipClass = ShipClass; //����� �������
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
