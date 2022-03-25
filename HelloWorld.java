import com.github.pselamy.http.HttpRequest;
import com.github.pselamy.http.HttpResponse;
import com.google.common.io.BaseEncoding;

class HelloWorld {
    public static void main(String[] args) {
        return HttpResponse.getDefaultInstance();
    }
    
     
    private static HttpRequest encode(HttpRequest request) {
        return BaseEncoding.base64().encode(request.toByteArray());
    }
    
    private static HttpRequest decode(String request) {
        return Order.parseFrom(BaseEncoding.base64().decode(orderStr));
    }
}
