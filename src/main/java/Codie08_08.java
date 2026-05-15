abstract class Rabbit4 {
    int xPos;
    int yPos;

    void main(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }

    abstract  void sleep();
}

class HouseRabbit3 extends Rabbit4 {
    @Override
    void main(int x, int y) {
        super.main(x, y);
    }
    void sleep() {
        System.out.println("집토끼가 우리에서 잠자고 있습니다.");
    }
}

class  MountainRabbit3 extends Rabbit4 {
    @Override
    void main(int x, int y) {
        super.main(x, y);
    }

    void sleep() {
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}

public class Codie08_08 {
    public static void main(String[] args) {
        HouseRabbit3 hRabbit = new HouseRabbit3();
        MountainRabbit3 mRabbit = new MountainRabbit3();

        hRabbit.sleep();
        mRabbit.sleep();
    }
}