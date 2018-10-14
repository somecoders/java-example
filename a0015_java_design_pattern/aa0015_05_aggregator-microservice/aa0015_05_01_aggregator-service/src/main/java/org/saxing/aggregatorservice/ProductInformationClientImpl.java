package org.saxing.aggregatorservice;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * productinformation client impl
 * 
 * @author saxing  2018/10/10 20:53 
 */
@Component
public class ProductInformationClientImpl implements ProductInformationClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductInformationClientImpl.class);

    @Override
    public String getProductTitle() {
        String response = null;
        try(CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet("http://localhost:51515/information");
            try (CloseableHttpResponse httpResponse = httpClient.execute(httpGet)) {
                response = EntityUtils.toString(httpResponse.getEntity());
            }
        }catch (IOException e){
            LOGGER.error("exception caught : {}", e);
        }
        return response;
    }
}