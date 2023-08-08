package get_requests;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RequestResponse {

    /*
    1- Manuel API testi için Postman kullanıyoruz.
    2- API otomasyon testi için REST Assured kütüphanesini kullanıyoruz.
    3- Otomasyon kodlarının yazımı için şu adımları izleriz:
        A- Gereksinimleri anlama
        B- Test senaryosu yazma
            a- Test senaryosu yazmak içi Gherkin dilini kullanıyoruz.
                - Given: Endpoint, body ...
                - When: get, put, post gibi işlemler
                - Then: Assertion, Close ...
                - And: Çoklu işlemlerin art arda yapıldığı zaman kullanılır.
        C- Otomasyon kodlarını yazarken şu adımları izleriz:
            1- Set the URL = URL'i tanımla
            2- Set the expected data = Beklenen dataları ayarla
            3- Send the request and get the response = İsteği gönder ve cevabı al
            4- Do assertion = Doğrulama yap
 */

    public static void main(String[] args) {

        //Get testi nasil yapilir?
        String url = "https://petstore.swagger.io/v2/pet/666";
       Response response = given().when().get(url);
        System.out.println("Response = " + response);
        response.prettyPrint();

        //System.out.println("********************");

        // Status Code nasil yazdirilir?
        System.out.println("Status Code = " + response.statusCode());

        //Content Type nasil yazdirilir?
        System.out.println("Content Type = " + response.contentType());

        //Status Line nasil yazdirilir?
        System.out.println("Status Line = " + response.statusLine());

        //Header'daki veriler nasil yazdirilir?
        System.out.println("Header | Server = " + response.header("Server"));

        //Header'daki veriler nasil yazdirilir?
        System.out.println("Header | Connection = " + response.header("Connection"));

        //Time nasil yazdirilir?
        System.out.println("Time = " + response.time());


    }
}
