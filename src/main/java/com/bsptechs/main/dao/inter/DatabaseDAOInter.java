package com.bsptechs.main.dao.inter;

import com.bsptechs.main.bean.DatabaseName;
import com.bsptechs.main.bean.NConnection;
import com.bsptechs.main.bean.TableName;
import com.bsptechs.main.bean.table.TableData;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author sarkhanrasullu
 */
public interface DatabaseDAOInter {

    List<DatabaseName> getAllDatabases(NConnection connection);

    List<TableName> getAllTables(DatabaseName database);

    boolean emptyTable(DatabaseName db, String tblName);

    boolean truncateTable(DatabaseName DBName, String tblName);

    boolean dublicateTable(DatabaseName DBName, String tbLName);

    boolean pasteTable(String information, DatabaseName DBName, String tbLName);

    boolean renameTable(TableName table, String newTblName);

    public TableData runQuery(String query, NConnection connection, DatabaseName database) throws ClassNotFoundException, SQLException;

}
