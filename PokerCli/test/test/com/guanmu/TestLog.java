package test.com.guanmu;

import static org.junit.Assert.*;

import org.junit.Test;

import com.guanmu.log.CardLoggers;
import com.guanmu.utils.CardUtils;

public class TestLog {

	@Test
	public void test() {
		
		CardLoggers.getLogEx().error("error");
		
		CardLoggers.getLog(CardUtils.class.getName()).debug("CardUtils");
	}

}
