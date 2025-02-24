package com.bbva.wikj.lib.r555;

import java.util.Map;

public interface WIKJR555 {

	Map<String, Object> executeSelect(String nuip);
	int executeInsert(Map<String, Object> args);
}
