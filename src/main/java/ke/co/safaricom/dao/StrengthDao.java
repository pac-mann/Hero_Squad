package ke.co.safaricom.dao;

import ke.co.safaricom.config.DatabaseConfig;
import ke.co.safaricom.models.Strength;
import org.sql2o.Connection;
import org.sql2o.Sql2o;


public class StrengthDao {
    private static final Sql2o sql2o =DatabaseConfig.getDatabase();
    // Create Strength

    public static void create(Strength strength) {
        try(Connection connection = sql2o.open()) {
            String query = "INSERT INTO strengths (name, score) VALUES (:name, :score);";
            connection.createQuery(query)
                    .addParameter("name", strength.getName())
            .addParameter("score", strength.getName())
            .executeUpdate();

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
