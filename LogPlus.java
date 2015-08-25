import android.util.Log

import java.lang.Long;
import java.lang.Double;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

/**
 * Class created to extend the functionality of the android.util.Log class.
 *
 * Created by Omkar Moghe on 8/18/15
 */
public class LogPlus {
    public LogPlus () {}
    
    public static int d (String tag, int i) {
        return Log.d(tag, Integer.toString(i));
    }
    
    public static int d (String tag, double d) {
        return Log.d(tag, Double.toString(d));
    }
    
    public static int d (String tag, float f) {
        return Log.d(tag, Float.toString(f));
    }
    
    public static int d (String tag, long l) {
        return Log.d(tag, Long.toString(l));
    }

    /**
     * Prints a string representation of the object to the LogCat.
     * Relies on the object's toString() method.
     * @param tag
     * @param o any java.lang.Object
     * @return
     */
    public static int d (String tag, Object o) {
        return Log.d(tag, o.toString());
    }

    /**
     * Prints a string representation of the object T to the LogCat.
     * Relies on the object's toString() method.
     * @param tag
     * @param o any type T
     * @return
     */
    public static <T> int d (String tag, T t) {
        return Log.d(tag, t.toString());
    }
        
    public static int d (String tag, int[] array) {
        String msg = "[";
        for (int i = 0; i < array.length; ++i) {
            msg += array[i];
            if (i == array.length - 1) msg += "]";
            else msg += ", ";
        }

        return Log.d(tag, msg);
    }

    public static int d (String tag, double[] array) {
        String msg = "[";
        for (int i = 0; i < array.length; ++i) {
            msg += array[i];
            if (i == array.length - 1) msg += "]";
            else msg += ", ";
        }

        return Log.d(tag, msg);
    }

    public static int d (String tag, float[] array) {
        String msg = "[";
        for (int i = 0; i < array.length; ++i) {
            msg += array[i];
            if (i == array.length - 1) msg += "]";
            else msg += ", ";
        }

        return Log.d(tag, msg);
    }

    public static int d (String tag, long[] array) {
        String msg = "[";
        for (int i = 0; i < array.length; ++i) {
            msg += array[i];
            if (i == array.length - 1) msg += "]";
            else msg += ", ";
        }

        return Log.d(tag, msg);
    }

    public static int d (String tag, String[] array) {
        String msg = "[";
        for (int i = 0; i < array.length; ++i) {
            msg += array[i];
            if (i == array.length - 1) msg += "]";
            else msg += ", ";
        }

        return Log.d(tag, msg);
    }

    public static int d (String tag, ArrayList<Integer> array) {
        String msg = "{";
        for (int i = 0; i < array.size(); ++i) {
            msg += array.get(i);
            if (i == array.size() - 1) msg += "}";
            else msg += ", ";
        }

        return Log.d(tag, msg);
    }

    public static int d (String tag, ArrayList<Double> array) {
        String msg = "{";
        for (int i = 0; i < array.size(); ++i) {
            msg += array.get(i);
            if (i == array.size() - 1) msg += "}";
            else msg += ", ";
        }

        return Log.d(tag, msg);
    }

    public static int d (String tag, ArrayList<Float> array) {
        String msg = "{";
        for (int i = 0; i < array.size(); ++i) {
            msg += array.get(i);
            if (i == array.size() - 1) msg += "}";
            else msg += ", ";
        }

        return Log.d(tag, msg);
    }

    public static int d (String tag, ArrayList<Long> array) {
        String msg = "{";
        for (int i = 0; i < array.size(); ++i) {
            msg += array.get(i);
            if (i == array.size() - 1) msg += "}";
            else msg += ", ";
        }

        return Log.d(tag, msg);
    }

    public static int d (String tag, ArrayList<String> array) {
        String msg = "{";
        for (int i = 0; i < array.size(); ++i) {
            msg += array.get(i);
            if (i == array.size() - 1) msg += "}";
            else msg += ", ";
        }

        return Log.d(tag, msg);
    }

    /**
     * Prints the collection of T Objects using the object's toString() method.
     * NOT ALWAYS GUARANTEED TO WORK
     * Relies on the toString() method of Object T.
     * @param tag
     * @param array ArrayList of T objects
     * @param <T> Object
     * @return
     */
    public static <T> int d (String tag, ArrayList<T> array) {
        String msg = "{";
        for (int i = 0; i < array.size(); ++i) {
            msg += array.get(i).toString();
            if (i == array.size() - 1) msg += "}";
            else msg += ", ";
        }

        return Log.d(tag, msg);
    }
}
