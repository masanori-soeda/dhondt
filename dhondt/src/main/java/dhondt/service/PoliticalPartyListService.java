package dhondt.service;

import dhondt.vo.PoliticalPartyListResultVo;
import dhondt.vo.PoliticalPartyListVo;

public class PoliticalPartyListService {

	private PoliticalPartyListResultVo result;

	public PoliticalPartyListService(PoliticalPartyListVo vo) {
		this.result = aggregateByDhondt(vo);
	}

	/**
	 * ���ۂ̏W�v���������s����
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
