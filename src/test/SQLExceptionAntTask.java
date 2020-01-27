package test;

import org.apache.tools.ant.BuildException;

import java.sql.SQLException;

public class SQLExceptionAntTask {
    public void setProperty(String property) {

    }

    private void check() {
        try {


            if (false) {
                throw new SQLException("test");
            }
        } catch (SQLException e) {
            throw new BuildException("ERROR : " + e.getMessage(), e);
        }

    }
}
