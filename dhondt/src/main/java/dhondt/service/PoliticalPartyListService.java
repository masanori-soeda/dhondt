package dhondt.service;

import dhondt.vo.PoliticalPartyListResultVo;
import dhondt.vo.PoliticalPartyListVo;

public class PoliticalPartyListService {

	private PoliticalPartyListResultVo result;

	public PoliticalPartyListService(PoliticalPartyListVo vo) {
		this.result = aggregateByDhondt(vo);
	}

	/**
	 * 実際の集計処理を実行する
	 *
	 * @param vo
	 * @return
	 */
	private PoliticalPartyListResultVo aggregateByDhondt(PoliticalPartyListVo vo) {
		return null;
	}

	public PoliticalPartyListResultVo getResult() {
		return result;
	}

}
