package structural.flyweightPattern;

public class Main {
    public static void main(String[] args) {
        ParticleSystem ps = new ParticleSystem();
        ps.addParticle(0, 0, 1, 1, 60, "SmokeTexture", "Circle", "Gray");
        ps.addParticle(10, 10, 2, 2, 60, "SmokeTexture", "Circle", "Gray");

        ps.simulate();
    }
}
