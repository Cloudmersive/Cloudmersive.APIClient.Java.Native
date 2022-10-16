/*
 * barcodeapi
 * Barcode APIs let you generate barcode images, and recognize values from images of barcodes.
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
import com.cloudmersive.client.native.model.BarcodeLookupResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for BarcodeLookupApi
 */
@Ignore
public class BarcodeLookupApiTest {

    private final BarcodeLookupApi api = new BarcodeLookupApi();

    
    /**
     * Lookup EAN barcode value, return product data
     *
     * Lookup an input EAN barcode and return key details about the product
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void barcodeLookupEanLookupTest() throws ApiException {
        String value = null;
        BarcodeLookupResponse response = 
        api.barcodeLookupEanLookup(value);
        
        // TODO: test validations
    }
    
}
