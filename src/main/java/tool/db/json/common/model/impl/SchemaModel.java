package tool.db.json.common.model.impl;

import lombok.Data;
import java.util.List;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import tool.db.json.common.model.AbstractModel;
import tool.db.json.common.model.impl.TableModel;

@Data
@JsonIgnoreProperties({
    "schema", 
    "tables"
})
@JsonTypeInfo(use=JsonTypeInfo.Id.NONE)
/**
 * スキーマ名/DB名を扱う。
 */
public class SchemaModel extends AbstractModel {
    /** スキーマ/DB名 */
    private String name = "";
    /** テーブル情報のList */
    private List<TableModel> tableList = new ArrayList<TableModel>();

    /**
     * テーブル情報のListにテーブル情報を追加する。
     * @param model テーブル情報
     */
    public void addTableModel(TableModel model) {
        this.tableList.add(model);
    }
}