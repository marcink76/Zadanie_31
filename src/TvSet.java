import static java.lang.System.out;

public class TvSet {

    private boolean powerOn = false; // fase = wyłączony

    public TvSet(){
        this.powerOn = powerOn;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }
    public void turnOn(){
        setPowerOn(true);
    }
    public void turnOff(){
        setPowerOn(false);
    }

    public void statusInfo(TvSet tvSet){
        if (tvSet.isPowerOn()){
            out.println("Telewizor jest włączony");

        }else if(!tvSet.isPowerOn()){
            out.println("Telewizor jest wyłaczony");
        }
    }
}
