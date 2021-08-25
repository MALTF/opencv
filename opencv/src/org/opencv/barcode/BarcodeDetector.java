//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.barcode;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.utils.Converters;

// C++: class BarcodeDetector

public class BarcodeDetector {

    protected final long nativeObj;
    protected BarcodeDetector(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static BarcodeDetector __fromPtr__(long addr) { return new BarcodeDetector(addr); }

    //
    // C++:   cv::barcode::BarcodeDetector::BarcodeDetector(string prototxt_path = "", string model_path = "")
    //

    /**
     * Initialize the BarcodeDetector.
     * @param prototxt_path prototxt file path for the super resolution model
     * @param model_path model file path for the super resolution model
     */
    public BarcodeDetector(String prototxt_path, String model_path) {
        nativeObj = BarcodeDetector_0(prototxt_path, model_path);
    }

    /**
     * Initialize the BarcodeDetector.
     * @param prototxt_path prototxt file path for the super resolution model
     */
    public BarcodeDetector(String prototxt_path) {
        nativeObj = BarcodeDetector_1(prototxt_path);
    }

    /**
     * Initialize the BarcodeDetector.
     */
    public BarcodeDetector() {
        nativeObj = BarcodeDetector_2();
    }


    //
    // C++:  bool cv::barcode::BarcodeDetector::detect(Mat img, Mat& points)
    //

    /**
     * Detects Barcode in image and returns the rectangle(s) containing the code.
     *
     * @param img grayscale or color (BGR) image containing (or not) Barcode.
     * @param points Output vector of vector of vertices of the minimum-area rotated rectangle containing the codes.
     * For N detected barcodes, the dimensions of this array should be [N][4].
     * Order of four points in vector&lt; Point2f&gt; is bottomLeft, topLeft, topRight, bottomRight.
     * @return automatically generated
     */
    public boolean detect(Mat img, Mat points) {
        return detect_0(nativeObj, img.nativeObj, points.nativeObj);
    }


    //
    // C++:  bool cv::barcode::BarcodeDetector::decode(Mat img, Mat points, vector_string& decoded_info, vector_BarcodeType& decoded_type)
    //

    /**
     * Decodes barcode in image once it's found by the detect() method.
     *
     * @param img grayscale or color (BGR) image containing bar code.
     * @param points vector of rotated rectangle vertices found by detect() method (or some other algorithm).
     * For N detected barcodes, the dimensions of this array should be [N][4].
     * Order of four points in vector&lt;Point2f&gt; is bottomLeft, topLeft, topRight, bottomRight.
     * @param decoded_info UTF8-encoded output vector of string or empty vector of string if the codes cannot be decoded.
     * @param decoded_type vector of BarcodeType, specifies the type of these barcodes
     * @return automatically generated
     */
    public boolean decode(Mat img, Mat points, List<String> decoded_info, List<Integer> decoded_type) {
        return decode_0(nativeObj, img.nativeObj, points.nativeObj, decoded_info, decoded_type);
    }


    //
    // C++:  bool cv::barcode::BarcodeDetector::detectAndDecode(Mat img, vector_string& decoded_info, vector_BarcodeType& decoded_type, Mat& points = Mat())
    //

    /**
     * Both detects and decodes barcode
     *
     * @param img grayscale or color (BGR) image containing barcode.
     * @param decoded_info UTF8-encoded output vector of string(s) or empty vector of string if the codes cannot be decoded.
     * @param decoded_type vector of BarcodeType, specifies the type of these barcodes
     * @param points optional output vector of vertices of the found  barcode rectangle. Will be empty if not found.
     * @return automatically generated
     */
    public boolean detectAndDecode(Mat img, List<String> decoded_info, List<Integer> decoded_type, Mat points) {
        return detectAndDecode_0(nativeObj, img.nativeObj, decoded_info, decoded_type, points.nativeObj);
    }

    /**
     * Both detects and decodes barcode
     *
     * @param img grayscale or color (BGR) image containing barcode.
     * @param decoded_info UTF8-encoded output vector of string(s) or empty vector of string if the codes cannot be decoded.
     * @param decoded_type vector of BarcodeType, specifies the type of these barcodes
     * @return automatically generated
     */
    public boolean detectAndDecode(Mat img, List<String> decoded_info, List<Integer> decoded_type) {
        return detectAndDecode_1(nativeObj, img.nativeObj, decoded_info, decoded_type);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:   cv::barcode::BarcodeDetector::BarcodeDetector(string prototxt_path = "", string model_path = "")
    private static native long BarcodeDetector_0(String prototxt_path, String model_path);
    private static native long BarcodeDetector_1(String prototxt_path);
    private static native long BarcodeDetector_2();

    // C++:  bool cv::barcode::BarcodeDetector::detect(Mat img, Mat& points)
    private static native boolean detect_0(long nativeObj, long img_nativeObj, long points_nativeObj);

    // C++:  bool cv::barcode::BarcodeDetector::decode(Mat img, Mat points, vector_string& decoded_info, vector_BarcodeType& decoded_type)
    private static native boolean decode_0(long nativeObj, long img_nativeObj, long points_nativeObj, List<String> decoded_info, List<Integer> decoded_type);

    // C++:  bool cv::barcode::BarcodeDetector::detectAndDecode(Mat img, vector_string& decoded_info, vector_BarcodeType& decoded_type, Mat& points = Mat())
    private static native boolean detectAndDecode_0(long nativeObj, long img_nativeObj, List<String> decoded_info, List<Integer> decoded_type, long points_nativeObj);
    private static native boolean detectAndDecode_1(long nativeObj, long img_nativeObj, List<String> decoded_info, List<Integer> decoded_type);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
