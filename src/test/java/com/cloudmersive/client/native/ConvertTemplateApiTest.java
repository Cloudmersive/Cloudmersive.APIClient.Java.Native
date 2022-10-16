/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
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
import java.io.File;
import com.cloudmersive.client.native.model.HtmlTemplateApplicationRequest;
import com.cloudmersive.client.native.model.HtmlTemplateApplicationResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for ConvertTemplateApi
 */
@Ignore
public class ConvertTemplateApiTest {

    private final ConvertTemplateApi api = new ConvertTemplateApi();

    
    /**
     * Apply Word DOCX template
     *
     * Apply operations to fill in a Word DOCX template by replacing target template/placeholder strings in the DOCX with values, generating a final Word DOCX result.  For example, you could create a Word Document invoice containing strings such as \&quot;{FirstName}\&quot; and \&quot;{LastName}\&quot; and then replace these values with \&quot;John\&quot; and \&quot;Smith\&quot;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertTemplateApplyDocxTemplateTest() throws ApiException {
        File inputFile = null;
        Object templateDefinition = null;
        byte[] response = 
        api.convertTemplateApplyDocxTemplate(inputFile, templateDefinition);
        
        // TODO: test validations
    }
    
    /**
     * Apply HTML template
     *
     * Apply operations to fill in an HTML template, generating a final HTML result
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertTemplateApplyHtmlTemplateTest() throws ApiException {
        HtmlTemplateApplicationRequest value = null;
        HtmlTemplateApplicationResponse response = 
        api.convertTemplateApplyHtmlTemplate(value);
        
        // TODO: test validations
    }
    
}
