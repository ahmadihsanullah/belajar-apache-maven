package programmer.zaman.now.maven;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Person person = new Person("Ahmad Ihsanullah Rabbani");

        Gson gson = new Gson();
        String name = gson.toJson(person);

        System.out.println(name);

    }
}
