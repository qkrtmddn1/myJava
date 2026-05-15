class Rabbit3 {
    int xPos;
    int yPos;

    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }
}

class HouseRabbit2 extends Rabbit3 {
    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;

        if (this.xPos > 100)
            this.xPos = 100;
        if (this.yPos > 100)
            this.yPos = 100;
    }
}

class MountainRabbit2 extends Rabbit3 {

    @Override
    void move(int x, int y) {
        super.move(x, y);
    }
}

public class Code08_06 {
    public static void main(String[] args) {
        HouseRabbit2 hRabbit = new HouseRabbit2();
        MountainRabbit2 mRabbit = new MountainRabbit2();

        hRabbit.move(500, 500);
        mRabbit.move(500, 500);

        System.out.printf("집토끼 위치 : (%d, %d) \n", hRabbit.xPos, hRabbit.yPos);
        System.out.printf("산토끼 위치 : (%d, %d) \n", mRabbit.xPos, mRabbit.yPos);
    }
}