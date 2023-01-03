package main;


import com.google.gson.Gson;
import marketObjects.EventLog;
import marketObjects.LoggedLog;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import java.net.URI;

public class ApiRequests {

    public int postAlert(String jsonAlert){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.marketalertum.com/Alert")
                .addHeader("Content-Type", "application/json")
                .post(RequestBody.create( MediaType.parse("application/json ; charset=utf-8"), jsonAlert))
                .build();
        try {
            Response response = client.newCall(request).execute();
            return response.code();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int deleteAlerts(){
    	OkHttpClient client = new OkHttpClient();
    	Request request = new Request.Builder()
                .url("https://api.marketalertum.com/Alert?userId=afdda8c8-1fd0-4d95-bbab-22d6dc3dc5b4")
                .addHeader("Content-Type", "application/json")
                .delete()
                .build();
        try {
        	Response response = client.newCall(request).execute();
            return response.code();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public EventLog[] getEventLog(){
    	OkHttpClient client = new OkHttpClient();
    	Request request = new Request.Builder()
                .url("https://api.marketalertum.com/EventsLog/afdda8c8-1fd0-4d95-bbab-22d6dc3dc5b4")
                .header("accept", "application/json")
                .get()
                .build();
        try {
        	Response response = client.newCall(request).execute();
            EventLog[] eventLogs = new Gson().fromJson(response.body().toString(), EventLog[].class);

            return eventLogs;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public LoggedLog getLog(){
    	OkHttpClient client = new OkHttpClient();
    	Request request = new Request.Builder()
                .url("https://api.marketalertum.com/EventsLog/afdda8c8-1fd0-4d95-bbab-22d6dc3dc5b4/login-status")
                .header("Content-Type", "application/json")
                .get()
                .build();
        try {
        	Response response = client.newCall(request).execute();
            LoggedLog log = new Gson().fromJson(response.body().toString(), LoggedLog.class);

            return log;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
