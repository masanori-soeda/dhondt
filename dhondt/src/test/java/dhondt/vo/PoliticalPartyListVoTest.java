package dhondt.vo;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PoliticalPartyListVoTest {

	private PoliticalPartyListVo it;

	@BeforeEach
	void setup() {
		String[][] politicalPartys = { { "©–¯“}", "10000" } };
		it = new PoliticalPartyListVo(politicalPartys);
	}

	@Test
	@DisplayName("­“}–¼‚ªæ“¾‚Å‚«‚é")
	void testGetName() {
		List<PoliticalPartyVo> actual = it.getList();
		assertThat(actual.get(0).getName(), is("©–¯“}"));
	}

	@Test
	@DisplayName("“Š•[”‚ªæ“¾‚Å‚«‚é")
	void testGetVotes() {
		List<PoliticalPartyVo> actual = it.getList();
		assertThat(actual.get(0).getVotes(), is(10000L));
	}
}
