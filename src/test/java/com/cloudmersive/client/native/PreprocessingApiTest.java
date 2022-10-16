/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
import com.cloudmersive.client.native.model.GetPageAngleResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for PreprocessingApi
 */
@Ignore
public class PreprocessingApiTest {

    private final PreprocessingApi api = new PreprocessingApi();

    
    /**
     * Convert an image of text into a binarized (light and dark) view
     *
     * Perform an adaptive binarization algorithm on the input image to prepare it for further OCR operations.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void preprocessingBinarizeTest() throws ApiException {
        File imageFile = null;
        byte[] response = 
        api.preprocessingBinarize(imageFile);
        
        // TODO: test validations
    }
    
    /**
     * Convert an image of text into a binary (light and dark) view with ML
     *
     * Perform an advanced adaptive, Deep Learning-based binarization algorithm on the input image to prepare it for further OCR operations.  Provides enhanced accuracy than adaptive binarization.  Image will be upsampled to 300 DPI if it has a DPI below 300.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void preprocessingBinarizeAdvancedTest() throws ApiException {
        File imageFile = null;
        byte[] response = 
        api.preprocessingBinarizeAdvanced(imageFile);
        
        // TODO: test validations
    }
    
    /**
     * Get the angle of the page / document / receipt
     *
     * Analyzes a photo or image of a document and identifies the rotation angle of the page.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void preprocessingGetPageAngleTest() throws ApiException {
        File imageFile = null;
        GetPageAngleResult response = 
        api.preprocessingGetPageAngle(imageFile);
        
        // TODO: test validations
    }
    
    /**
     * Detect and unrotate a document image
     *
     * Detect and unrotate an image of a document (e.g. that was scanned at an angle).  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void preprocessingUnrotateTest() throws ApiException {
        File imageFile = null;
        byte[] response = 
        api.preprocessingUnrotate(imageFile);
        
        // TODO: test validations
    }
    
    /**
     * Detect and unrotate a document image (advanced)
     *
     * Detect and unrotate an image of a document (e.g. that was scanned at an angle) using deep learning.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void preprocessingUnrotateAdvancedTest() throws ApiException {
        File imageFile = null;
        byte[] response = 
        api.preprocessingUnrotateAdvanced(imageFile);
        
        // TODO: test validations
    }
    
    /**
     * Detect and unskew a photo of a document
     *
     * Detect and unskew a photo of a document (e.g. taken on a cell phone) into a perfectly square image.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void preprocessingUnskewTest() throws ApiException {
        File imageFile = null;
        byte[] response = 
        api.preprocessingUnskew(imageFile);
        
        // TODO: test validations
    }
    
}
