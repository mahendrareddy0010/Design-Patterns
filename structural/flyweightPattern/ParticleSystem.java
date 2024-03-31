package structural.flyweightPattern;

import java.util.ArrayList;
import java.util.List;

public class ParticleSystem {
    private List<Particle> particleList = new ArrayList<>();
    
    public void addParticle(double x, double y, double velocityX, double velocityY, int lifespane, String texture, String shape, String color) {
        ParticleType type = ParticleType.getParticleType(texture, shape, color);
        Particle particle = new Particle(type, x, y, velocityX, velocityY, lifespane);
        particleList.add(particle);
    }

    public void simulate() {
        for (Particle particle : particleList) {
            particle.update();
            particle.draw();
        }
    }
}
