package virtual_world.organisms.animals;

import virtual_world.Config;
import virtual_world.Coordinates;
import virtual_world.Species;
import virtual_world.organisms.Organism;

public class Sheep extends Animal {
    public Sheep() {
        super(Config.SHEEP_STRENGTH, Config.SHEEP_INITIATIVE, new Coordinates(0, 0), Species.SHEEP);
    }

    public Sheep(Coordinates coordinates) {
        super(Config.SHEEP_STRENGTH, Config.SHEEP_INITIATIVE, coordinates, Species.SHEEP);
    }

    @Override
    public void draw() {
    }

    @Override
    public Organism clone() {
        return new Sheep();
    }
}
