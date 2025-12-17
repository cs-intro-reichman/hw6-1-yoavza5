import java.awt.Color;

/**
 * Demonstrates the scaling (resizing) operation featured by Runigram.java. 
 * The program recieves three command-line arguments: a string representing the name
 * of the PPM file of a source image, and two integers that specify the width and the
 * height of the scaled, output image. For example, to scale/resize ironman.ppm to a width
 * of 100 pixels and a height of 900 pixels, use: java Editor2 ironman.ppm 100 900
 */
public class Editor2 {

	public static void main (String[] args){
		// 1. קריאת הארגומנטים משורת הפקודה
        // הארגומנט הראשון הוא שם הקובץ
        String fileName = args[0];
        // הארגומנט השני הוא הרוחב החדש (צריך להמיר אותו ממחרוזת למספר)
        int width = Integer.parseInt(args[1]);
        // הארגומנט השלישי הוא הגובה החדש
        int height = Integer.parseInt(args[2]);

        // 2. קריאת תמונת המקור מהקובץ
        Color[][] imageIn = Runigram.read(fileName);

        // 3. יצירת התמונה החדשה והמוקטנת/מוגדלת
        Color[][] imageOut = Runigram.scaled(imageIn, width, height);

        // 4. הצגת התמונה החדשה
        // הערה: חובה לקרוא ל-setCanvas לפני display כדי שהחלון ייפתח בגודל הנכון
        Runigram.setCanvas(imageOut);
        Runigram.display(imageOut);	
	}
}
