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
public class SchemaModel extends AbstractModel {
    private String name = "";
    private List<TableModel> tableList = new ArrayList<TableModel>();

    public void addTableModel(TableModel model) {
        this.tableList.add(model);
    }
}