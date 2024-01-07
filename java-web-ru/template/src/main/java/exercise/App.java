package exercise;

import io.javalin.Javalin;

import java.util.List;

import io.javalin.http.NotFoundResponse;
import exercise.model.User;
import exercise.dto.users.UserPage;
import exercise.dto.users.UsersPage;

import java.util.Collections;

public final class App {

    private static final List<User> USERS = Data.getUsers();

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        // BEGIN
        app.get("/users", ctx -> {
            var header = "Users";
            var page = new UsersPage(USERS, header);
            ctx.render("users/index.jte", Collections.singletonMap("page", page));
        });

        app.get("/users/{id}", ctx -> {
            var id = ctx.pathParam("id");
            var page = new UserPage(USERS.stream()
                    .filter(user -> String.valueOf(user.getId()).equals(id))
                    .findFirst()
                    .orElseThrow(() -> new NotFoundResponse("User not found")));
            ctx.render("users/show.jte", Collections.singletonMap("page", page));
        });
        // END

        app.get("/", ctx -> {
            ctx.render("index.jte");
        });

        return app;
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
