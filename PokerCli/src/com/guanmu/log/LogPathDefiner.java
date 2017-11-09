package com.guanmu.log;

import com.guanmu.config.CardConfig;
import com.guanmu.config.Config;
import com.guanmu.utils.Utils;

import ch.qos.logback.core.PropertyDefinerBase;

/**
 * 日志路径自定义类
 * @author wangquan
 *
 */
public class LogPathDefiner extends PropertyDefinerBase {

	@Override
	public String getPropertyValue() {
	
		if (Utils.isWindows()) {
			return Config.WINDOW_LOG_PATH + CardConfig.LOG_PARENT;
		}
		
		if (Utils.isLinux()) {
			return Config.LINUX_LOG_PATH + CardConfig.LOG_PARENT;
		}
			
		return CardConfig.LOG_PARENT;
	}

}
