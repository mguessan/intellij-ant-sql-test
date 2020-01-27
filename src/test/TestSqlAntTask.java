package test;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

import javax.sql.DataSource;
import java.sql.SQLException;

public class TestSqlAntTask extends Task {

    public void setProperty(String property) {

    }

   /* private void check() {
        try {
            DataSource datasource = new FakeDataSource();
            //Connection connection = (Connection) datasource.getConnection();

            if (false) {
                throw new SQLException("test");
            }
        } catch (SQLException e) {
            throw new BuildException("ERROR : " + e.getMessage(), e);
        }

    }*/


}
