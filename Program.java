package nl.tudelft.tbm.pvr.data;

/**
 * @author [Kai Vaessen; 4360680]
 */
public class Program implements ProgramInterface {
	 
	public String title, subtitle, description, category, startTime, endTime;
 
    public Program(String title, String subtitle, String description, String category, String startTime, String endTime) {
    	this.title = title;
		this.subtitle = subtitle;
		this.description = description;
		this.category = category;
		this.startTime = startTime;
		this.endTime = endTime;
    }
 
 
    public String getTitle() {
        return title;
    }
 
    public String getSubtitle() {
        return subtitle;
    }
 
    public String getDescription() {
        return description;
    }
 
    public String getCategory() {
        return category;
    }
 
    public String getStartTime() {
        return startTime;
    }
 
    public String getEndTime() {
        return endTime;
    }
}