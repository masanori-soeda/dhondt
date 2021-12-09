package dhondt;

import dhondt.dao.IPoliticalPartyResultLoader;
import dhondt.dao.IPoliticalPartyResultWriter;
import dhondt.service.PoliticalPartyListService;
import dhondt.vo.PoliticalPartyListResultVo;
import dhondt.vo.PoliticalPartyListVo;

/**
 * ���ۂ̏����N���X
 *
 * @author soepy
 *
 */
public class DhondtController {

	private IPoliticalPartyResultLoader loader;
	private IPoliticalPartyResultWriter writer;

	DhondtController(IPoliticalPartyResultLoader loader, IPoliticalPartyResultWriter writer) {
		this.loader = loader;
		this.writer = writer;
	}

	void execut() {
		// ���}�Ɠ��[�����擾���Ă���
		PoliticalPartyListVo vo = loader.load();
		// �h���g�����W�v
		PoliticalPartyListResultVo aggregatedResult = new PoliticalPartyListService(vo).getResult();
		// �f�[�^���A�E�g�v�b�g
		writer.write(aggregatedResult);
	}

}
