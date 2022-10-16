/*
 * nlpapiv2
 * The powerful Natural Language Processing APIs (v2) let you perform part of speech tagging, entity identification, sentence parsing, and much more to help you understand the meaning of unstructured text.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client;

import com.cloudmersive.client.model.LanguageDetectionRequest;
import com.cloudmersive.client.model.LanguageDetectionResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void languageDetectionGetLanguageTest() throws Exception {
        LanguageDetectionRequest input = null;
        LanguageDetectionResponse response = api.languageDetectionGetLanguage(input);

        // TODO: test validations
    }
    
}
