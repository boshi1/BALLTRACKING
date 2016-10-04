import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.highgui.VideoCapture;

public class hello
{
   public static void main( String[] args )
   {
	  
      System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
      Mat mat = Mat.eye( 3, 3, CvType.CV_8UC1 );
      //System.out.println( "mat = " + mat.dump() );
     // System.out.println( "mat = " + mat );
      VideoCapture capture =new VideoCapture(0); 
       
      Mat webcam_image=new Mat();  
      
      while(true)
      {
      capture.read(webcam_image);
      
      System.out.println( "mat = " + webcam_image.dump());
      }
   }
}