package structural.flyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class ParticleType {
    private String texture, shape, color;
    private static Map<String, ParticleType> typeCache = new HashMap<>();

    public ParticleType(String texture, String shape, String color) {
        this.texture = texture;
        this.shape = shape;
        this.color = color;
    }

    public static ParticleType getParticleType(String texture, String shape, String color) {
        if (!typeCache.containsKey(texture + shape + color)) {
            typeCache.put(texture + shape + color, new ParticleType(texture, shape, color));
        }

        return typeCache.get(texture + shape + color);
    }

    public String getTexture() {
        return texture;
    }

    public String getShape() {
        return shape;
    }

    public String getColor() {
        return color;
    }

}
