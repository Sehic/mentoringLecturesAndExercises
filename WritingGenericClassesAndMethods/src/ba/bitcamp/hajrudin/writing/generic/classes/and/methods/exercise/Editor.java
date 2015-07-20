package ba.bitcamp.hajrudin.writing.generic.classes.and.methods.exercise;

public class Editor extends Application{
	private static final int TEXT = 0;
	private static final int PHOTO = 1;
	private static final int VIDEO = 2;
	
	private int type;
	private boolean isFreeware;
	
	public Editor(String name, int year, int ver, int size, int type,
			boolean isFreeware) {
		super(name, year, ver, size);
		this.type = type;
		this.isFreeware = isFreeware;
	}

	public String getType() {
		switch(this.type){
		case 0: return "Text";
		case 1: return "Photo";
		case 2: return "Video";
		}
		return null;
	}

	public void setType(int type) {
		this.type = type;
	}

	public boolean isFreeware() {
		return isFreeware;
	}

	public void setFreeware(boolean isFreeware) {
		this.isFreeware = isFreeware;
	}

	@Override
	public String toString() {
		String s = "";
		s = super.toString();
		s+= "Editor [type=" + this.getType() + ", isFreeware=" + isFreeware + "\n";
		return s;
	}
	
	
	
	
}
