package tool.db.json.common.model.impl;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import tool.db.json.common.model.AbstractModel;

@Data
@JsonIgnoreProperties({
    "physicalName", 
    "logicalName",
    "type",
    "length",
    "privamyKey",
    "isNullable",
    "quote"
})
@JsonTypeInfo(use=JsonTypeInfo.Id.NONE)
public class ColumnModel extends AbstractModel {
    private String physicalName = "";
    private String logicalName = "";
    private String type = "";
    private int length = 0;
    private boolean primaryKey = false;
    private boolean isNullable = true;
    private boolean quote = false;
}