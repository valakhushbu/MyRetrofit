# MyRetrofit
retrofit , get , json ,android ,frgament

public class ApiClient{
    private static final String BASE_URL = "https://api.myjson.com/";
    private static Retrofit retrofit = null;

    public static Retrofit getApiClient()
    {
        if(retrofit==null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
    }
    
    public interface ApiInterface {

    @GET("bins/fdypk")
   // Call<JsonResponce> getData();
    Call<Example> getData_();

}
