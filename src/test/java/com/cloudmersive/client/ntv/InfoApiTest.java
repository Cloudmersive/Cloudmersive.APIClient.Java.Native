/*
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
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
import com.cloudmersive.client.ntv.model.DominantColorResult;
import java.io.File;
import com.cloudmersive.client.ntv.model.ImageMetadata;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for InfoApi
 */
@Ignore
public class InfoApiTest {

    private final InfoApi api = new InfoApi();

    
    /**
     * Returns the dominant colors of the image
     *
     * Uses advanced image processing to extract the top 5 dominant colors in the image, returned in the order of dominance with the most-dominant color first.  These are the primary perceptual colors used in the image as perceived by a viewer.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void infoGetDominantColorTest() throws ApiException {
        File imageFile = null;
        DominantColorResult response = 
        api.infoGetDominantColor(imageFile);
        
        // TODO: test validations
    }
    
    /**
     * Returns the image metadata including EXIF and resolution
     *
     * Returns the metadata information on the image, including file type, EXIF (if available), and resolution.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void infoGetMetadataTest() throws ApiException {
        File imageFile = null;
        ImageMetadata response = 
        api.infoGetMetadata(imageFile);
        
        // TODO: test validations
    }
    
}
