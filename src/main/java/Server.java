import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class Server {


    public static void main(String[] args) {

        String baseUrl = "http://localhost:80/hackathon2018/";

        System.out.println("Starting simpac server!!! :)!");

        HttpResponse companyResponse = get(baseUrl+"/");

        String payload = "{\"name\"}";
        HttpResponse response = null;
        try{
            response = post(baseUrl, payload);
        }catch(Exception e){

        }

        while(response == null){
            try{
                response = post(baseUrl, payload);
            }catch(Exception e){
                System.out.println("cant connect...to " + baseUrl);
            }
            System.out.println("Looking for response..");

        }
        System.out.println(response.toString()+ "--RESPONSE...");
    }
    public static HttpResponse get(String url) {

        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet get = new HttpGet(url); //create GET request

            get.addHeader("Content-Type", "application/json");

            HttpResponse response = client.execute(get); //execute the GET request
            return response;
        } catch(Exception e) {
            //System.out.println("exception: " + e);
        }
        return null;
    }
    public static HttpResponse post(String url,String payload) {
        try{
            HttpClient client = HttpClientBuilder.create().build();
            HttpPost post = new HttpPost(url); //create POST request

            post.addHeader("Content-Type", "application/json");
            post.setEntity(new StringEntity(payload, ContentType.create("application/json"))); //add payload
            HttpResponse response = client.execute(post); //execute the POST request
            return response;
        } catch(Exception e) {
            //System.out.println("exception: " + e);
        }
        return null;
    }

}
