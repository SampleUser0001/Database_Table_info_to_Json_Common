package tool.db.json.common.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Modelにjson文字列に変換するメソッドを追加する。
 */
public abstract class AbstractModel {
    /**
     * 自分自身のModelをjson形式の文字列に変換する。
     * @return json形式の文字列
     */
    public String toJson() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "{}";
        }

    }
}