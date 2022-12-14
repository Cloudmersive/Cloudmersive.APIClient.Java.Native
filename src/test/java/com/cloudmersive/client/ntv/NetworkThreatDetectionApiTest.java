/*
 * securityapi
 * The security APIs help you detect and block security threats.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client.ntv;

import com.cloudmersive.client.ntv.invoker.ApiException;
import com.cloudmersive.client.ntv.model.IPThreatDetectionResponse;
import com.cloudmersive.client.ntv.model.ThreatDetectionBotCheckResponse;
import com.cloudmersive.client.ntv.model.ThreatDetectionTorNodeResponse;
import com.cloudmersive.client.ntv.model.UrlSsrfThreatDetectionRequestFull;
import com.cloudmersive.client.ntv.model.UrlSsrfThreatDetectionResponseFull;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for NetworkThreatDetectionApi
 */
@Ignore
public class NetworkThreatDetectionApiTest {

    private final NetworkThreatDetectionApi api = new NetworkThreatDetectionApi();

    
    /**
     * Check a URL for Server-side Request Forgery (SSRF) threats
     *
     * Checks if an input URL is at risk of being an SSRF (Server-side request forgery) threat or attack.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void networkThreatDetectionDetectSsrfUrlTest() throws ApiException {
        UrlSsrfThreatDetectionRequestFull request = null;
        UrlSsrfThreatDetectionResponseFull response = 
        api.networkThreatDetectionDetectSsrfUrl(request);
        
        // TODO: test validations
    }
    
    /**
     * Check if IP address is a Bot client threat
     *
     * Check if the input IP address is a Bot, robot, or otherwise a non-user entity.  Leverages real-time signals to check against known high-probability bots..
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void networkThreatDetectionIsBotTest() throws ApiException {
        String value = null;
        ThreatDetectionBotCheckResponse response = 
        api.networkThreatDetectionIsBot(value);
        
        // TODO: test validations
    }
    
    /**
     * Check if IP address is a known threat
     *
     * Check if the input IP address is a known threat IP address.  Checks against known bad IPs, botnets, compromised servers, and other lists of threats.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void networkThreatDetectionIsThreatTest() throws ApiException {
        String value = null;
        IPThreatDetectionResponse response = 
        api.networkThreatDetectionIsThreat(value);
        
        // TODO: test validations
    }
    
    /**
     * Check if IP address is a Tor node server
     *
     * Check if the input IP address is a Tor exit node server.  Tor servers are a type of privacy-preserving technology that can hide the original IP address who makes a request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void networkThreatDetectionIsTorNodeTest() throws ApiException {
        String value = null;
        ThreatDetectionTorNodeResponse response = 
        api.networkThreatDetectionIsTorNode(value);
        
        // TODO: test validations
    }
    
}
