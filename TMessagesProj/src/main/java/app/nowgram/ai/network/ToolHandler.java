package app.nowgram.ai.network;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

import app.nowgram.ai.data.Message;

public interface ToolHandler {

    JSONArray definitions();

    String call(String name, JSONObject arguments);

    String describe(String name, JSONObject arguments);

    List<Message> fallback();
}
