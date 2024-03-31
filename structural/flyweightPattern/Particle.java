package structural.flyweightPattern;

public class Particle {
    private ParticleType type;
    private double x, y, velocityX, velocityY;
    private int lifespane;

    public Particle(ParticleType type, double x, double y, double velocityX, double velocityY, int lifespane) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.lifespane = lifespane;
    }

    public void update() {
        x = x + velocityX;
        y = y + velocityY;
        lifespane = lifespane - 1;
    }

    public void draw() {
        System.out.println(String.format("Drawing the particle at (%s, %s) with texture %s", x, y, type.getTexture()));
    }

}
