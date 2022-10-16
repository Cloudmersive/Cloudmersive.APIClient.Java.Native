/*
 * nlpapiv2
 * The powerful Natural Language Processing APIs (v2) let you perform part of speech tagging, entity identification, sentence parsing, and much more to help you understand the meaning of unstructured text.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client.native;

import com.cloudmersive.client.native.invoker.ApiException;
import com.cloudmersive.client.native.model.LanguageDetectionRequest;
import com.cloudmersive.client.native.model.LanguageDetectionResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for LanguageDetectionApi
 */
@Ignore
public class LanguageDetectionApiTest {

    private final LanguageDetectionApi api = new LanguageDetectionApi();

    
    /**
     * Detect language of text
     *
     * Automatically determine which language a text string is written in.  Supports Danish (DAN), German (DEU), English (ENG), French (FRA), Italian (ITA), Japanese (JPN), Korean (KOR), Dutch (NLD), Norwegian (NOR), Portuguese (POR), Russian (RUS), Spanish (SPA), Swedish (SWE), Chinese (ZHO).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void languageDetectionGetLanguageTest() throws ApiException {
        LanguageDetectionRequest input = null;
        LanguageDetectionResponse response = 
        api.languageDetectionGetLanguage(input);
        
        // TODO: test validations
    }
    
}
