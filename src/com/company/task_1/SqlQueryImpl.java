package com.company.task_1;

/**
 * Разработайте программу формирующую инструкцию SQL, которая
 * вставляет строки в таблицу T_GroupSelected <id_Student,
 * firstName, lastName, id_Group> из таблицы
 * T_Student<id_Student, firstName, lastName, id_Group,
 * dolgCount > тех студентов, которые относятся к некоторой группе
 * (строковый параметр) и количество долгов (целочисленный параметр)
 * которых превышает заданное значение.
 * <p>
 * INSERT INTO table2 (column1, column2, column3, ...)
 * SELECT column1, column2, column3, ...
 * FROM table1
 * WHERE condition;
 */
public class SqlQueryImpl implements SqlQuery {
    private String dolgCount;
    private String id_Group;

    public SqlQueryImpl(String id_Group,int dolgCount ) {
        this.dolgCount = String.valueOf(dolgCount);
        this.id_Group = id_Group;
    }

    @Override
    public String toString() {
        return String.format("INSERT INTO T_GroupSelected (id_Student, firstName, lastName, id_Group)\n" +
                "SELECT id_Student, firstName, lastName, id_Group\n" +
                "FROM T_Student\n" +
                "WHERE id_Group = \'%s\' AND dolgCount = %s", id_Group, dolgCount);
    }
}
