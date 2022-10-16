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
import com.cloudmersive.client.ntv.model.AgeDetectionResult;
import com.cloudmersive.client.ntv.model.FaceCompareResponse;
import com.cloudmersive.client.ntv.model.FaceLocateResponse;
import com.cloudmersive.client.ntv.model.FaceLocateWithLandmarksResponse;
import java.io.File;
import com.cloudmersive.client.ntv.model.GenderDetectionResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for FaceApi
 */
@Ignore
public class FaceApiTest {

    private final FaceApi api = new FaceApi();

    
    /**
     * Compare and match faces
     *
     * Find the faces in an input image, and compare against a reference image to determine if there is a match against the face in the reference image.  The reference image (second parameter) should contain exactly one face.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void faceCompareTest() throws ApiException {
        File inputImage = null;
        File matchFace = null;
        FaceCompareResponse response = 
        api.faceCompare(inputImage, matchFace);
        
        // TODO: test validations
    }
    
    /**
     * Crop image to face with square crop
     *
     * Crop an image to the face (rectangular crop).  If there is more than one face present, choose the first one.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void faceCropFirstTest() throws ApiException {
        File imageFile = null;
        byte[] response = 
        api.faceCropFirst(imageFile);
        
        // TODO: test validations
    }
    
    /**
     * Crop image to face with round crop
     *
     * Crop an image to the face (circular/round crop).  If there is more than one face present, choose the first one.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void faceCropFirstRoundTest() throws ApiException {
        File imageFile = null;
        byte[] response = 
        api.faceCropFirstRound(imageFile);
        
        // TODO: test validations
    }
    
    /**
     * Detect the age of people in an image
     *
     * Identify the age, position, and size of human faces in an image, along with a recognition confidence level.  People in the image do NOT need to be facing the camera; they can be facing away, edge-on, etc.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void faceDetectAgeTest() throws ApiException {
        File imageFile = null;
        AgeDetectionResult response = 
        api.faceDetectAge(imageFile);
        
        // TODO: test validations
    }
    
    /**
     * Detect the gender of people in an image
     *
     * Identify the gender, position, and size of human faces in an image, along with a recognition confidence level.  People in the image should be facing the camera.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void faceDetectGenderTest() throws ApiException {
        File imageFile = null;
        GenderDetectionResult response = 
        api.faceDetectGender(imageFile);
        
        // TODO: test validations
    }
    
    /**
     * Detect and find faces in an image
     *
     * Locate the positions of all faces in an image
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void faceLocateTest() throws ApiException {
        File imageFile = null;
        FaceLocateResponse response = 
        api.faceLocate(imageFile);
        
        // TODO: test validations
    }
    
    /**
     * Detect and find faces and landmarks eyes and nose and mouth in image
     *
     * Locate the positions of all faces in an image, along with the eyes, eye brows, nose and mouth components of each
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void faceLocateWithLandmarksTest() throws ApiException {
        File imageFile = null;
        FaceLocateWithLandmarksResponse response = 
        api.faceLocateWithLandmarks(imageFile);
        
        // TODO: test validations
    }
    
}