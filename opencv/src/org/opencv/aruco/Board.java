//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.aruco;

import java.util.ArrayList;
import java.util.List;
import org.opencv.aruco.Board;
import org.opencv.aruco.Dictionary;
import org.opencv.core.Mat;
import org.opencv.core.MatOfInt;
import org.opencv.core.MatOfPoint3f;
import org.opencv.utils.Converters;

// C++: class Board
/**
 * Board of markers
 *
 * A board is a set of markers in the 3D space with a common coordinate system.
 * The common form of a board of marker is a planar (2D) board, however any 3D layout can be used.
 * A Board object is composed by:
 * - The object points of the marker corners, i.e. their coordinates respect to the board system.
 * - The dictionary which indicates the type of markers of the board
 * - The identifier of all the markers in the board.
 */
public class Board {

    protected final long nativeObj;
    protected Board(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static Board __fromPtr__(long addr) { return new Board(addr); }

    //
    // C++: static Ptr_Board cv::aruco::Board::create(vector_Mat objPoints, Ptr_Dictionary dictionary, Mat ids)
    //

    /**
     * Provide way to create Board by passing necessary data. Specially needed in Python.
     *
     * @param objPoints array of object points of all the marker corners in the board
     * @param dictionary the dictionary of markers employed for this board
     * @param ids vector of the identifiers of the markers in the board
     *
     * @return automatically generated
     */
    public static Board create(List<Mat> objPoints, Dictionary dictionary, Mat ids) {
        Mat objPoints_mat = Converters.vector_Mat_to_Mat(objPoints);
        return Board.__fromPtr__(create_0(objPoints_mat.nativeObj, dictionary.getNativeObjAddr(), ids.nativeObj));
    }


    //
    // C++:  void cv::aruco::Board::setIds(Mat ids)
    //

    /**
     * Set ids vector
     *
     * @param ids vector of the identifiers of the markers in the board (should be the same size
     * as objPoints)
     *
     * Recommended way to set ids vector, which will fail if the size of ids does not match size
     * of objPoints.
     */
    public void setIds(Mat ids) {
        setIds_0(nativeObj, ids.nativeObj);
    }


    //
    // C++: vector_vector_Point3f Board::objPoints
    //

    public List<MatOfPoint3f> get_objPoints() {
        List<MatOfPoint3f> retVal = new ArrayList<MatOfPoint3f>();
        Mat retValMat = new Mat(get_objPoints_0(nativeObj));
        Converters.Mat_to_vector_vector_Point3f(retValMat, retVal);
        return retVal;
    }


    //
    // C++: Ptr_Dictionary Board::dictionary
    //

    public Dictionary get_dictionary() {
        return Dictionary.__fromPtr__(get_dictionary_0(nativeObj));
    }


    //
    // C++: vector_int Board::ids
    //

    public MatOfInt get_ids() {
        return MatOfInt.fromNativeAddr(get_ids_0(nativeObj));
    }


    //
    // C++: void Board::ids
    //

    public void set_ids(MatOfInt ids) {
        Mat ids_mat = ids;
        set_ids_0(nativeObj, ids_mat.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_Board cv::aruco::Board::create(vector_Mat objPoints, Ptr_Dictionary dictionary, Mat ids)
    private static native long create_0(long objPoints_mat_nativeObj, long dictionary_nativeObj, long ids_nativeObj);

    // C++:  void cv::aruco::Board::setIds(Mat ids)
    private static native void setIds_0(long nativeObj, long ids_nativeObj);

    // C++: vector_vector_Point3f Board::objPoints
    private static native long get_objPoints_0(long nativeObj);

    // C++: Ptr_Dictionary Board::dictionary
    private static native long get_dictionary_0(long nativeObj);

    // C++: vector_int Board::ids
    private static native long get_ids_0(long nativeObj);

    // C++: void Board::ids
    private static native void set_ids_0(long nativeObj, long ids_mat_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
