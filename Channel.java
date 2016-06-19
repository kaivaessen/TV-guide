package nl.tudelft.tbm.pvr.data;

import java.util.ArrayList;

/**
 * @author [Kai Vaessen; 4360680]
 */
public class Channel implements ChannelInterface {
	private String name;
	private ArrayList<Program> programs;
	

    public String getName() {
    	return name;    //vergeet het return type niet
    }

    public ArrayList<Program> getPrograms() {
        return programs;
    }
    public void addProgram(Program program) {
    	this.programs.add(program);
    }
}
