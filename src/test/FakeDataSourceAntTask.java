package test;

import org.apache.tools.ant.BuildException;

import javax.sql.DataSource;
import java.sql.SQLException;

public class FakeDataSourceAntTask {
    public void setProperty(String property) {

    }

    private void check() {
        try {
            DataSource datasource = new FakeDataSource();

            if (false) {
                throw new SQLException("test");
            }
        } catch (SQLException e) {
            throw new BuildException("ERROR : " + e.getMessage(), e);
        }

    }
}
