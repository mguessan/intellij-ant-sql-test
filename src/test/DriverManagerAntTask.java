package test;

import org.apache.tools.ant.BuildException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverManagerAntTask {
    public void setProperty(String property) {

    }

    private void check() {
        try (Connection con = DriverManager.getConnection("test")){
            // empty


        } catch (SQLException e) {
            throw new BuildException("ERROR : " + e.getMessage(), e);
        }

    }

}
