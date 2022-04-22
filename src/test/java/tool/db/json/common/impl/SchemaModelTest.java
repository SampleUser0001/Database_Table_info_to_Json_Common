package tool.db.json.common.impl;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import tool.db.json.common.model.impl.SchemaModel;
import tool.db.json.common.model.impl.TableModel;
import tool.db.json.common.model.impl.ColumnModel;

public class SchemaModelTest {

    private static String SCHEMA_NAME = "Sample";

    private static String TABLE_PHYSICAL_NAME = "SampleTable";
    private static String TABLE_LOGICAL_NAME = "サンプルテーブル";

    private static String COLUMN_PHYSICAL_NAME = "id";
    private static String COLUMN_LOGICAL_NAME = "キー（ID）";
    private static String COLUMN_TYPE = "INTEGER";
    private static int COLUMN_LENGTH = 0;
    private static boolean COLUMN_PRIMARY_KEY = true;
    private static boolean COLUMN_IS_NULLABLE = false;
    private static boolean COLUMN_QUOTE = false;

    private SchemaModel schema;
    
    private List<ColumnModel> columnList = new ArrayList<ColumnModel>();
    
    @Before
    public void setup() {
        schema = new SchemaModel();

        ColumnModel column01 = new ColumnModel();
        column01.setPhysicalName(COLUMN_PHYSICAL_NAME);
        column01.setLogicalName(COLUMN_LOGICAL_NAME);
        column01.setType(COLUMN_TYPE);
        column01.setLength(COLUMN_LENGTH);
        column01.setPrimaryKey(COLUMN_PRIMARY_KEY);
        column01.setNullable(COLUMN_IS_NULLABLE);
        column01.setQuote(COLUMN_QUOTE);
        columnList.add(column01);
    }
    
    @Test
    public void schemaNameTest() {
        schema.setName(SCHEMA_NAME);

        String actual = String.format("{\"name\":\"%s\",\"tableList\":[]}", SCHEMA_NAME);
        String json = schema.toJson();
        System.out.println(json);
        
        assertThat(json, is(equalTo(actual)));
    }
    

}
