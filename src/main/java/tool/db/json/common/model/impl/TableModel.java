package tool.db.json.common.model.impl;

import lombok.Data;
import java.util.List;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import tool.db.json.common.model.AbstractModel;
import tool.db.json.common.model.impl.ColumnModel;

/**
 * テーブル情報を扱う。
 */
@Data
@JsonTypeInfo(use=JsonTypeInfo.Id.NONE)
public class TableModel extends AbstractModel {
    /** 物理名 */
    private String physicalName = "";
    /** 論理名 */
    private String logicalName = "";
    /** カラム情報のList */
    private List<ColumnModel> columnList = new ArrayList<ColumnModel>();

    /**
     * カラム情報のListに絡む情報を追加する。
     * @param model カラム情報
     */
    public void addColumnModel(ColumnModel model) {
        this.columnList.add(model);
    }
}