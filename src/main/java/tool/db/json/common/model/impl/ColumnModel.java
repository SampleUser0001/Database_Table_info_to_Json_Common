package tool.db.json.common.model.impl;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import tool.db.json.common.model.AbstractModel;

/**
 * カラム情報を扱う。
 */
@Data
@JsonIgnoreProperties({
    "physicalName", 
    "logicalName",
    "type",
    "length",
    "primaryKey",
    "isNullable",
    "quote"
})
@JsonTypeInfo(use=JsonTypeInfo.Id.NONE)
public class ColumnModel extends AbstractModel {
    /** 物理名 */
    private String physicalName = "";
    /** 論理名 */
    private String logicalName = "";
    /** 属性 */
    private String type = "";
    /** 長さ */
    private int length = 0;
    /** 主キーかどうか */
    private boolean primaryKey = false;
    /** nullを許可するか */
    private boolean isNullable = true;
    /** SQLで使用するとき、シングルクォーテーションが必要かどうか。 */
    private boolean quote = false;
}