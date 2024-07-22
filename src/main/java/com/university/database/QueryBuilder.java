package com.university.database;

public class QueryBuilder {

	public String createSelect(String[] columns, String table) {
		// String builder
        StringBuffer sb = new StringBuffer();
        sb.append("Select");
        // for column in columns => sb.append(column+",")
        //sb.append(column);
        sb.append("FROM");
        sb.append(table);
        //....
        return sb.toString();
        
        /**
         * 
        // Using + to join the strings
        String table = "students";
        String column = "name";
        String selectQueryTable = "SELECT name FROM" + table + "WHERE name='Alex'";
         * */
	}
}
