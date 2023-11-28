package org.example.serviec.api;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

public interface APIService {
        APIGatewayProxyResponseEvent handle(String output, )
}
