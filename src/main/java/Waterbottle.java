public class Waterbottle {

    private int volume;

    public Waterbottle(int volume){
        this.volume = volume;
    }

    public int drink(){
        if(this.volume >= 10){
            return this.volume - 10;}
        else{
            return 0;
        }
    }

    public int emptyWater(){
        return this.volume = 0;
    }

    public int fillWater(){
        return this.volume = 100;
    }



}
