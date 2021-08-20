package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridworldRunner {
public static void main(String[] args) {	
World world = new World();
Random ran = new Random();
Location loc =  new Location(4,6);
Location area = new Location(4,7);
Location site = new Location(4,5);
Location place = new Location(ran.nextInt(10), ran.nextInt(10));
Flower sam = new Flower();
for (int rows = 0; rows < 10; rows++) {
	sam = new Flower();
	if (rows%2==0) {
		sam.setColor(Color.RED);
	}
	else {
		sam.setColor(Color.WHITE);
	}
for (int cols = 0; cols < 10; cols++) {
	Location l = new Location(rows,cols);
	world.add(l, sam);
}	
}
Flower flow = new Flower();
Flower Rose = new Flower();
world.add(area, flow);
world.add(site, Rose);
Bug bug = new Bug();
Bug Flick = new Bug();
world.show();
Flick.setColor(Color.BLUE);
world.add(loc, bug);
world.add(place, Flick);	
for (int i = 0; i < 2; i++) {	
Flick.turn();
}	 
}
}
//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