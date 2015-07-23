package ba.bitcamp.hajrudin.test;

public class HistoricalArtifact extends Eksponat implements searchable{
	private static final int KLASIKA = 0;
	private static final int SREDNJI_VIJEK = 1;
	private static final int MODERNO_DOBA = 2;

	private String source;
	private int period;

	public HistoricalArtifact(String name, String about, String source,
			int period) {
		super(name, about);
		this.source = source;
		this.period = period;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getPeriod() {
		switch (this.period) {
		case 0:
			return "Klasika";
		case 1:
			return "Srednji vijek";
		case 2:
			return "Moderno doba";
		default:
			return "Other";
		}
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HistoricalArtifact other = (HistoricalArtifact) obj;
		if (period != other.period)
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HistoricalArtifact [source=" + source + ", period="
				+ this.getPeriod() + "\n";
	}

	@Override
	public boolean fiitsSearch(String s) {
		if(s.equals(source)){
			return true;
		}else if(s.equals(getPeriod())){
			return true;
		}
		return false;
	}

}
