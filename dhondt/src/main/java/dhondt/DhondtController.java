package dhondt;

import dhondt.dao.IPoliticalPartyResultLoader;
import dhondt.dao.IPoliticalPartyResultWriter;
import dhondt.service.PoliticalPartyListService;
import dhondt.vo.PoliticalPartyListResultVo;
import dhondt.vo.PoliticalPartyListVo;

/**
 * 実際の処理クラス
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
		// 政党と得票数を取得してくる
		PoliticalPartyListVo vo = loader.load();
		// ドント方式集計
		PoliticalPartyListResultVo aggregatedResult = new PoliticalPartyListService(vo).getResult();
		// データをアウトプット
		writer.write(aggregatedResult);
	}

}
