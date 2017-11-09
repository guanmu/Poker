package com.guanmu.exceptin;

/**
 * 数字卡牌（非王牌）数值非法异常
 * @author wangquan
 *
 */
public class IllegalValueCardException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2606231138199022835L;
	
	private int illgalValue;
	
	public IllegalValueCardException(int illegalValue) {
		this.illgalValue = illegalValue;
	}
	
	@Override
	public String getMessage() {
		return "the card vlaue is illgal.[" + illgalValue + "]";
	}
}
