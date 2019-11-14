package substance;

public class ActorPrize {
    private String actorPrizeId;

    private String acatorId;

    private String prize;

    public String getActorPrizeId() {
        return actorPrizeId;
    }

    public void setActorPrizeId(String actorPrizeId) {
        this.actorPrizeId = actorPrizeId == null ? null : actorPrizeId.trim();
    }

    public String getAcatorId() {
        return acatorId;
    }

    public void setAcatorId(String acatorId) {
        this.acatorId = acatorId == null ? null : acatorId.trim();
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize == null ? null : prize.trim();
    }
}