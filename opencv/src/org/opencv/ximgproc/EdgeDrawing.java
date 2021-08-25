//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.utils.Converters;
import org.opencv.ximgproc.EdgeDrawing_Params;

// C++: class EdgeDrawing
/**
 * Class implementing the ED (EdgeDrawing) CITE: topal2012edge, EDLines CITE: akinlar2011edlines, EDPF CITE: akinlar2012edpf and EDCircles CITE: akinlar2013edcircles algorithms
 */
public class EdgeDrawing extends Algorithm {

    protected EdgeDrawing(long addr) { super(addr); }

    // internal usage only
    public static EdgeDrawing __fromPtr__(long addr) { return new EdgeDrawing(addr); }

    // C++: enum GradientOperator (cv.ximgproc.EdgeDrawing.GradientOperator)
    public static final int
            PREWITT = 0,
            SOBEL = 1,
            SCHARR = 2,
            LSD = 3;


    //
    // C++:  void cv::ximgproc::EdgeDrawing::detectEdges(Mat src)
    //

    /**
     * Detects edges and prepares them to detect lines and ellipses.
     *
     *     @param src input image
     */
    public void detectEdges(Mat src) {
        detectEdges_0(nativeObj, src.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::EdgeDrawing::getEdgeImage(Mat& dst)
    //

    public void getEdgeImage(Mat dst) {
        getEdgeImage_0(nativeObj, dst.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::EdgeDrawing::getGradientImage(Mat& dst)
    //

    public void getGradientImage(Mat dst) {
        getGradientImage_0(nativeObj, dst.nativeObj);
    }


    //
    // C++:  vector_vector_Point cv::ximgproc::EdgeDrawing::getSegments()
    //

    public List<MatOfPoint> getSegments() {
        List<MatOfPoint> retVal = new ArrayList<MatOfPoint>();
        Mat retValMat = new Mat(getSegments_0(nativeObj));
        Converters.Mat_to_vector_vector_Point(retValMat, retVal);
        return retVal;
    }


    //
    // C++:  void cv::ximgproc::EdgeDrawing::detectLines(Mat& lines)
    //

    /**
     * Detects lines.
     *
     *     @param lines  output Vec&lt;4f&gt; contains start point and end point of detected lines.
     *     <b>Note:</b> you should call detectEdges() method before call this.
     */
    public void detectLines(Mat lines) {
        detectLines_0(nativeObj, lines.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::EdgeDrawing::detectEllipses(Mat& ellipses)
    //

    /**
     * Detects circles and ellipses.
     *
     *     @param ellipses  output Vec&lt;6d&gt; contains center point and perimeter for circles.
     *     <b>Note:</b> you should call detectEdges() method before call this.
     */
    public void detectEllipses(Mat ellipses) {
        detectEllipses_0(nativeObj, ellipses.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::EdgeDrawing::setParams(EdgeDrawing_Params parameters)
    //

    /**
     * sets parameters.
     *
     *     this function is meant to be used for parameter setting in other languages than c++.
     * @param parameters automatically generated
     */
    public void setParams(EdgeDrawing_Params parameters) {
        setParams_0(nativeObj, parameters.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void cv::ximgproc::EdgeDrawing::detectEdges(Mat src)
    private static native void detectEdges_0(long nativeObj, long src_nativeObj);

    // C++:  void cv::ximgproc::EdgeDrawing::getEdgeImage(Mat& dst)
    private static native void getEdgeImage_0(long nativeObj, long dst_nativeObj);

    // C++:  void cv::ximgproc::EdgeDrawing::getGradientImage(Mat& dst)
    private static native void getGradientImage_0(long nativeObj, long dst_nativeObj);

    // C++:  vector_vector_Point cv::ximgproc::EdgeDrawing::getSegments()
    private static native long getSegments_0(long nativeObj);

    // C++:  void cv::ximgproc::EdgeDrawing::detectLines(Mat& lines)
    private static native void detectLines_0(long nativeObj, long lines_nativeObj);

    // C++:  void cv::ximgproc::EdgeDrawing::detectEllipses(Mat& ellipses)
    private static native void detectEllipses_0(long nativeObj, long ellipses_nativeObj);

    // C++:  void cv::ximgproc::EdgeDrawing::setParams(EdgeDrawing_Params parameters)
    private static native void setParams_0(long nativeObj, long parameters_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
