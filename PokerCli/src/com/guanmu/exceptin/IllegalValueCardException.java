package com.guanmu.exceptin;

/**
 * ���ֿ��ƣ������ƣ���ֵ�Ƿ��쳣
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
