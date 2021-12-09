package dhondt;

import dhondt.dao.IPoliticalPartyResultLoader;
import dhondt.dao.IPoliticalPartyResultWriter;
import dhondt.dao.PoliticalPartyResultLoader;
import dhondt.dao.PoliticalPartyResultWriter;

/**
 * Execute D’Hondt rule
 *
 * @author msoep
 *
 */
public class DhondtMain {

	public static void main(String[] args) {
		// loaderのインスタンス生成
		IPoliticalPartyResultLoader loader = new PoliticalPartyResultLoader();
		// Writerのインスタンス生成
		IPoliticalPartyResultWriter writer = new PoliticalPartyResultWriter();
		// 実処理
		DhondtController controller = new DhondtController(loader, writer);
		controller.execut();

	}

}
