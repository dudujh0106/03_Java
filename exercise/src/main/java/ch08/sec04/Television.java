package ch08.sec04;

public class Television implements RemoteControl {
    private int volume;

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        if (volume < MIN_VOLUME) {
            this.volume = MIN_VOLUME;
        }
        else if (volume > MAX_VOLUME) {
            this.volume = MAX_VOLUME;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
}
