package uk.co.jakestanley.minrpg.world;

import org.newdawn.slick.Graphics;
import uk.co.jakestanley.minrpg.Main;
import uk.co.jakestanley.minrpg.tiles.Tile;
import uk.co.jakestanley.minrpg.tiles.TileMap;

/**
 * Created by stanners on 12/04/2015.
 */
public class Chunk {

    private int x, y; // the chunk position relative to other chunks
    private int offsetX, offsetY;
    private TileMap tiles;

    public Chunk(int x, int y){ // TODO many constructors depending on use case
        this.tiles = new TileMap();
        this.x = x;
        this.y = y;
        this.offsetX = 0; // TODO make sure this gets changed soon
        this.offsetY = 0;
    }

    public Chunk(String data){
        // load chunk from data file // TODO much, much later...
    }

    public void setOffsetX(int offsetX){
        this.offsetX = offsetX;
    }

    public void setOffsetY(int offsetY){
        this.offsetY = offsetY;
    }

    public void render(Graphics graphics){
        tiles.render(0 + offsetX, Main.display.getSkyHeight() + offsetY, graphics); // TODO remove a lot of the bullshit extra code rather than having everything super complex
    }

    // TODO CONSIDER that chunk borders will be tricky, if I want to make everything seamless.

}
