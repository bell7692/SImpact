import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class temp {

    //requires library: org.apache.httpcomponents.httpclient

    public static void main(String[] args) {

        String baseUrl = "https://hackicims.com:8080/api/companies/72";
        String auth = "Bearer f2db6c4321cea9e3d1fa4aa3d68c0b4adf6c317cdaa852500f63c50657c78e30fd7bac056a9dff6cc7035377f7015220fbfd6c368f6eb4fa6833c677c32a3e08\n";

        //GET request to get company information
        HttpResponse companyResponse = get(baseUrl+"/", auth);

        //POST request to add a new job called HackHers
        String payload = "{\"title\":\"Artist\"}";
        HttpResponse jobResponse = post(baseUrl+"/jobs", auth, payload);
        String payload2 = "{\"email\":\"info@google.com\"}";
        HttpResponse personResponse = post(baseUrl+"/people", auth, payload2);
    }



    public static HttpResponse get(String url, String auth) {

        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet get = new HttpGet(url); //create GET request
            get.addHeader("Authorization", auth); //add authorization header
            get.addHeader("Content-Type", "application/json");

            HttpResponse response = client.execute(get); //execute the GET request
            return response;

        } catch(Exception e) {
            System.out.println("exception: " + e);
        }
        return null;
    }

    public static HttpResponse post(String url, String auth, String payload) {

        try{
            HttpClient client = HttpClientBuilder.create().build();
            HttpPost post; //create POST request
            post = new HttpPost(url);
            post.addHeader("Authorization", auth); //add authorization header
            post.addHeader("Content-Type", "application/json");
            post.setEntity(new StringEntity(payload, ContentType.create("application/json"))); //add payload

            HttpResponse response = client.execute(post); //execute the POST request
            return response;

        } catch(Exception e) {
            System.out.println("exception: " + e);
        }
        return null;
    }

}
