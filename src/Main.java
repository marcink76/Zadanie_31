public class Main {

    public static void main(String[] args){

        TvSet tvSet = new TvSet();

        tvSet.statusInfo(tvSet);

        tvSet.setPowerOn(true);
        tvSet.statusInfo(tvSet);

        tvSet.setPowerOn(false);
        tvSet.statusInfo(tvSet);



    }
}
