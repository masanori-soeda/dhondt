package dhondt;

import dhondt.dao.IPoliticalPartyResultLoader;
import dhondt.dao.IPoliticalPartyResultWriter;
import dhondt.dao.PoliticalPartyResultLoader;
import dhondt.dao.PoliticalPartyResultWriter;

/**
 * Execute D�fHondt rule
 *
 * @author msoep
 *
 */
public class DhondtMain {

	public static void main(String[] args) {
		// loader�̃C���X�^���X����
		IPoliticalPartyResultLoader loader = new PoliticalPartyResultLoader();
		// Writer�̃C���X�^���X����
		IPoliticalPartyResultWriter writer = new PoliticalPartyResultWriter();
		// ������
		DhondtController controller = new DhondtController(loader, writer);
		controller.execut();

	}

}
