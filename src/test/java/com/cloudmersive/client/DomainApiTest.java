/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client;

import com.cloudmersive.client.model.CheckResponse;
import com.cloudmersive.client.model.DomainQualityResponse;
import com.cloudmersive.client.model.IsAdminPathResponse;
import com.cloudmersive.client.model.PhishingCheckRequest;
import com.cloudmersive.client.model.PhishingCheckResponse;
import com.cloudmersive.client.model.UrlHtmlSsrfRequestFull;
import com.cloudmersive.client.model.UrlHtmlSsrfResponseFull;
import com.cloudmersive.client.model.UrlSafetyCheckRequestFull;
import com.cloudmersive.client.model.UrlSafetyCheckResponseFull;
import com.cloudmersive.client.model.UrlSsrfRequestBatch;
import com.cloudmersive.client.model.UrlSsrfRequestFull;
import com.cloudmersive.client.model.UrlSsrfResponseBatch;
import com.cloudmersive.client.model.UrlSsrfResponseFull;
import com.cloudmersive.client.model.ValidateUrlRequestFull;
import com.cloudmersive.client.model.ValidateUrlRequestSyntaxOnly;
import com.cloudmersive.client.model.ValidateUrlResponseFull;
import com.cloudmersive.client.model.ValidateUrlResponseSyntaxOnly;
import com.cloudmersive.client.model.WhoisResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DomainApi
 */
@Ignore
public class DomainApiTest {

    private final DomainApi api = new DomainApi();

    
    /**
     * Validate a domain name
     *
     * Check whether a domain name is valid or not.  API performs a live validation by contacting DNS services to validate the existence of the domain name.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void domainCheckTest() throws Exception {
        String domain = null;
        CheckResponse response = api.domainCheck(domain);

        // TODO: test validations
    }
    
    /**
     * Get top-level domain name from URL
     *
     * Gets the top-level domain name from a URL, such as mydomain.com.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void domainGetTopLevelDomainFromUrlTest() throws Exception {
        ValidateUrlRequestSyntaxOnly request = null;
        ValidateUrlResponseSyntaxOnly response = api.domainGetTopLevelDomainFromUrl(request);

        // TODO: test validations
    }
    
    /**
     * Check if path is a high-risk or vulnerable server administration path
     *
     * Check if the input URL or relative path is a server Administration Path, and therefore a risk or vulnerability for remote access.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void domainIsAdminPathTest() throws Exception {
        String value = null;
        IsAdminPathResponse response = api.domainIsAdminPath(value);

        // TODO: test validations
    }
    
    /**
     * Check a URL for Phishing threats
     *
     * Checks if an input URL is at risk of being an Phishing (fake login page, or other page designed to collect information via social engineering) threat or attack.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void domainPhishingCheckTest() throws Exception {
        PhishingCheckRequest request = null;
        PhishingCheckResponse response = api.domainPhishingCheck(request);

        // TODO: test validations
    }
    
    /**
     * Get WHOIS information for a domain
     *
     * Validate whether a domain name exists, and also return the full WHOIS record for that domain name.  WHOIS records include all the registration details of the domain name, such as information about the domain&#39;s owners.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void domainPostTest() throws Exception {
        String domain = null;
        WhoisResponse response = api.domainPost(domain);

        // TODO: test validations
    }
    
    /**
     * Validate a domain name&#39;s quality score
     *
     * Check the quality of a domain name.  Supports over 9 million domain names.  Higher quality scores indicate more trust and authority in the domain name, with values ranging from 0.0 (low quality) to 10.0 (maximum quality).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void domainQualityScoreTest() throws Exception {
        String domain = null;
        DomainQualityResponse response = api.domainQualityScore(domain);

        // TODO: test validations
    }
    
    /**
     * Check a URL for safety threats
     *
     * Checks if an input URL is at risk of being a safety threat through malware, unwanted software, or social engineering threats.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void domainSafetyCheckTest() throws Exception {
        UrlSafetyCheckRequestFull request = null;
        UrlSafetyCheckResponseFull response = api.domainSafetyCheck(request);

        // TODO: test validations
    }
    
    /**
     * Check a URL for SSRF threats
     *
     * Checks if an input URL is at risk of being an SSRF (Server-side request forgery) threat or attack.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void domainSsrfCheckTest() throws Exception {
        UrlSsrfRequestFull request = null;
        UrlSsrfResponseFull response = api.domainSsrfCheck(request);

        // TODO: test validations
    }
    
    /**
     * Check a URL for SSRF threats in batches
     *
     * Batch-checks if input URLs are at risk of being an SSRF (Server-side request forgery) threat or attack.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void domainSsrfCheckBatchTest() throws Exception {
        UrlSsrfRequestBatch request = null;
        UrlSsrfResponseBatch response = api.domainSsrfCheckBatch(request);

        // TODO: test validations
    }
    
    /**
     * Validate a URL fully
     *
     * Validate whether a URL is syntactically valid (does not check endpoint for validity), whether it exists, and whether the endpoint is up and passes virus scan checks.  Accepts various types of input and produces a well-formed URL as output.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void domainUrlFullTest() throws Exception {
        ValidateUrlRequestFull request = null;
        ValidateUrlResponseFull response = api.domainUrlFull(request);

        // TODO: test validations
    }
    
    /**
     * Check a URL for HTML embedded SSRF threats
     *
     * Checks if an input URL HTML is at risk of containing one or more embedded SSRF (Server-side request forgery) threats or attacks.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void domainUrlHtmlSsrfCheckTest() throws Exception {
        UrlHtmlSsrfRequestFull request = null;
        UrlHtmlSsrfResponseFull response = api.domainUrlHtmlSsrfCheck(request);

        // TODO: test validations
    }
    
    /**
     * Validate a URL syntactically
     *
     * Validate whether a URL is syntactically valid (does not check endpoint for validity).  Accepts various types of input and produces a well-formed URL as output.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void domainUrlSyntaxOnlyTest() throws Exception {
        ValidateUrlRequestSyntaxOnly request = null;
        ValidateUrlResponseSyntaxOnly response = api.domainUrlSyntaxOnly(request);

        // TODO: test validations
    }
    
}