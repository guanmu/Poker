package test.com.guanmu;

import junit.framework.Assert;

import org.junit.Test;

import com.guanmu.resouses.Message;

public class TestMessage {

	@Test
	public void test() {
		String str = Message.getString("test");
		
		Assert.assertEquals(str, Message.DEFUALT);
	}

}
