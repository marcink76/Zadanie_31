public class Main {

    public static void main(String[] args){

        TvSet tvSet = new TvSet();

        tvSet.statusInfo(tvSet);

        tvSet.turnOn();

        tvSet.statusInfo(tvSet);
        tvSet.turnOff();

        tvSet.statusInfo(tvSet);



    }
}
