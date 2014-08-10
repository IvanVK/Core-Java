package exam1Logger;

public class Logger {
	
	protected int level;
	
	public Logger(){
		this.level = 3;
	}
	
	public Logger(int level){
		if(level <1)
			throw new NumberFormatException("Integer must be >= 1");
		this.level = level;
	}
	
    public void setLevel(int newLevel) {
        if (newLevel < 1) {
            throw new NumberFormatException("Integer must be >= 1");
        }
        this.level = newLevel;
    }
    
	public int getLevel(){
		return level;
	}
	
	public void log(int level, String message){
		if(level < 1)
			throw new NumberFormatException("Integer must be >=1");
		else{
			if(level <= this.level)
				System.out.println(message);
		}
	}
}
