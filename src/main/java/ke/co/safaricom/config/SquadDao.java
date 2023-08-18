package ke.co.safaricom.config;

import ke.co.safaricom.models.Squad;
import ke.co.safaricom.models.Strength;
import org.apache.hadoop.classification.InterfaceAudience;
import org.sql2o.Connection;
import org.sql2o.Sql2o;


public class SquadDao {
    private static final Sql2o sql2o =DatabaseConfig.getDatabase();


    public static void create(Squad squad) {
        try(Connection connection = sql2o.open()) {
            String query = "INSERT INTO squads (name, max_size, cause) VALUES (:name, :max_size, :cause);";
            connection.createQuery(query)
                    .addParameter("name", squad.getName())
            .addParameter("max_Size", squad.getMax_size())
                    .addParameter("cause", squad.getCause())
            .executeUpdate();

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static Object findSquadById(int squadId) {

            try (Connection connection = sql2o.open()) {
                String query = "SELECT * FROM squads WHERE NOT deleted AND id = :squadId";
                Squad squad = connection.createQuery(query)
                        .addParameter( "squadId", squadId)
                .executeAndFetchFirst(Squad.class);

                System.out.println(squad);
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
            return squadId;
        }
    }