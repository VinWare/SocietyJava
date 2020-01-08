package org.vvar.societyhub.util;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class ToJson {
	private final Gson gson;
	
	public ToJson() {
		gson = new Gson();
	}
	
	public String toJsonList(Object data, String name) {
		JsonArray jsonArray = gson.toJsonTree(data).getAsJsonArray();
		return jsonArray.toString();
	}
}
