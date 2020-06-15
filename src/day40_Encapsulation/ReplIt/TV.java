package day40_Encapsulation.ReplIt;

public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;
    String brand = "undefined";

    public TV() {
        System.out.println("Creating TV object using no Args- constructor");
    }

    public TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using no Args- constructor");
    }

    public int getChannel() {
        return channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public String getBrand() {
        return brand;
    }

    public void setChannel(int channel) {
        if (on) {
            if (channel < 0 || channel > 120) {
                System.out.println("ERROR: TV is either OFF or invalid Channel");
            } else {
                this.channel = channel;
            }
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }


    }

    public void setVolumeLevel(int volumeLevel) {
        if (on) {
            if (volumeLevel >= 1 && volumeLevel <= 7) {
                this.volumeLevel = volumeLevel;
            } else {
                System.out.println("ERROR: TV is either OFF or invalid Volume level");
            }
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channelUp() {
        channel += 1;
    }

    public void channelDown() {
        channel -= 1;
    }

    public void volumeUp() {
        volumeLevel += 1;
    }

    public void volumeDown() {
        volumeLevel -= 1;
    }

    public boolean isOn() {
        if (on) {
            return true;
        } else {
            return false;
        }

    }

    public void turnOn() {
        if (on) {
            System.out.println("TV is already ON");
        } else {
            on =true;
        }
    }
    public void turnOff() {
        if (!on) {
            System.out.println("TV is already OFF");
        } else {
            on =false;
        }
    }

    public static void main(String[] args) {
        TV obj=new TV();
        obj.channel=2;
        System.out.println(obj.channel);
        obj.setChannel(3);
        System.out.println(obj.getChannel());
        obj.channelUp();
        System.out.println(obj.getChannel());


    }
}
/*

If tv is already on, no need to turn it on again, display message: "TV is already ON".
If tv is already off, then no need to turn it off again, display message: "TV is already OFF".
Value of a variable channel cannot be negative or zero, and cannot be higher than 120.
If user will try to set invalid channel, display message: "ERROR: TV is either OFF or invalid Channel".
Volume can be only in the range between 1 and 7. You may change volume only if TV is on.
Otherwise, display message: "ERROR: TV is either OFF or invalid Volume level".
Create isOn() method that will check tv status.
 */