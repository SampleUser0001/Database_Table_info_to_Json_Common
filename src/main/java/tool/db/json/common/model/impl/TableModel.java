package tool.db.json.common.model.impl;

import lombok.Data;
import java.util.List;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import tool.db.json.common.model.AbstractModel;
import tool.db.json.common.model.impl.ColumnModel;

@Data
@JsonIgnoreProperties({
    "physicalName", 
    "logicalName",
    "columns"
})
@JsonTypeInfo(use=JsonTypeInfo.Id.NONE)
public class TableModel extends AbstractModel {
    private String physicalName = "";
    private String logicalName = "";
    private List<ColumnModel> columnList = new ArrayList<ColumnModel>();

    public void addColumnModel(ColumnModel model) {
        this.columnList.add(model);
    }
}