package bin;

public interface Capture<T>{

    void captureHero(T hero1, T hero2);

    void captureUsedSupport(T support, boolean canRevive);
}