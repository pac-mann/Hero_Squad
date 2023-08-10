package ke.co.safaricom;

import ke.co.safaricom.dao.StrengthDao;
import ke.co.safaricom.models.Strength;
import ke.co.safaricom.utils.SharedUtils;

import java.util.HashMap;

import static spark.Spark.*;
public class Main {
    public static void main(String[] args) {

        get("/",(req, res)->{
            return SharedUtils.render(new HashMap<>(),  "index.hbs");
        });

        get("/strength/add",(req, res)->{
            return SharedUtils.render(new HashMap<>(),  "create-strength.hbs");
        });

        post("/create-strength", (req, res)->{
            String name = req.queryParams("name");
            int score = Integer.parseInt(req.queryParams("score"));


            Strength strength = new Strength();
            strength.setScore(score);
            strength.setName(name);

            StrengthDao.create(strength);

            res.redirect("/");
            return null;
        });


        }
    }
