import static com.google.common.io.BaseEncoding.base64;

import com.github.pselamy.http.HttpRequest;
import com.github.pselamy.http.HttpResponse;
import com.google.common.io.BaseEncoding;

class HelloWorld {
    public static void main(String[] args) {
        String requestStr = args[0];
        HttpRequest request = HttpRequest.parseFrom(base64().decode(requestStr));
        HttpResponse response = HttpResponse.newBuilder().setBody(request.getBody()).build();
        System.out.writeln(base64().encode(response.toByteArray()));
    }
}
