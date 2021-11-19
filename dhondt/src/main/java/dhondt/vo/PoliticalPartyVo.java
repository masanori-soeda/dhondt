package dhondt.vo;

public class PoliticalPartyVo {

	private String name;
	private long votes;

	PoliticalPartyVo(String name, long votes) {
		this.name = name;
		this.votes = votes;
	}

	public String getName() {
		return name;
	}

	public long getVotes() {
		return votes;
	}

}
