package day49_Polymorphism.WarmUp;

public final class Nokia extends Phone1 implements AndroidApps {

    @Override
    public void download() {
        System.out.println("Nokia is downloadind");
    }

    @Override
    public void texting(long phoneNumber) {

    }

    @Override
    public void calling(long phoneNumber) {

    }
}
