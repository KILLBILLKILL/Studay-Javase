public class PlayBasketball {
    Crossover crossover;
    JumpShot jumpShot;
    Dunk dunk;

    public PlayBasketball(Crossover crossover) {
        this.crossover = crossover;
    }
    void start()
    {
        crossover.paly();
        jumpShot.play();
    }
}
class Crossover{


    void paly()
    {
        System.out.println("他正在变向过人");
    }


}
class JumpShot{

    void play(){

        System.out.println("他正在跳投");
    }


}
class Dunk{

    void play()
    {
        System.out.println("他正在扣篮");
    }
}