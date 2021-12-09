package dhondt.dao;

import dhondt.vo.PoliticalPartyListResultVo;

public interface IPoliticalPartyResultWriter {

	void write(PoliticalPartyListResultVo aggregatedResult);

}
