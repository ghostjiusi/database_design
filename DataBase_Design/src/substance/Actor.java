package substance;

public class Actor {
    private String actorId;

	private String actorName;

	public String getActorId() {
		return actorId;
	}

	public void setActorId(String actorId) {
		this.actorId = actorId == null ? null : actorId.trim();
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName == null ? null : actorName.trim();
	}

	
}