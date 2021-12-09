package dhondt.service;

import dhondt.vo.PoliticalPartyListResultVo;
import dhondt.vo.PoliticalPartyListVo;

public class PoliticalPartyListService {

	private PoliticalPartyListResultVo result;

	public PoliticalPartyListService(PoliticalPartyListVo vo) {
		this.result = aggregateByDhondt(vo);
	}

	/**
	 * ÀÛ‚ÌWŒvˆ—‚ğÀs‚·‚é
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
