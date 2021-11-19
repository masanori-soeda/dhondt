package dhondt.vo;

import java.util.ArrayList;
import java.util.List;

public class PoliticalPartyListVo {

	private List<PoliticalPartyVo> list = new ArrayList<>();

	public List<PoliticalPartyVo> getList() {
		return list;
	}

	/**
	 * 配列を受け取り、リストに変換してセットする
	 */
	public PoliticalPartyListVo(String[][] politicalPartys) {
		for (String[] politicalParty : politicalPartys) {
			this.list.add(new PoliticalPartyVo(politicalParty[0], Integer.valueOf(politicalParty[1])));
		}
	}

}
